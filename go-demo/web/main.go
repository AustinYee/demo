package main

import (
	"fmt"
	"html"
	"io/ioutil"
	"log"
	"net/http"
)

type httpServer struct {
}

func (server httpServer) ServeHTTP(w http.ResponseWriter, r *http.Request) {
	w.Write([]byte(r.URL.Path))
}

func main() {
	res, _ := http.Get("https://csm.service.gllue.net/actuator")
	defer res.Body.Close()
	body, _ := ioutil.ReadAll(res.Body)
	fmt.Print(string(body))

	var server httpServer
	http.Handle("/foo", server)
	http.Handle("/test", controller.testHTTP)
	http.HandleFunc("/bar", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, "Hello, %q", html.EscapeString(r.URL.Path))
	})
	log.Fatal(http.ListenAndServe(":8080", nil))
}
