package main

import (
	"fmt"
	"net/http"
)

func testHttp(w http.ResponseWriter, req *http.Request) {
	w.Write([]byte("hello"))
	form :=	req.ParseForm()
	fmt.Print(form)
}

func main() {
	http.HandleFunc("/test", testHttp)
	http.ListenAndServe(":8080", nil)
}