package main

import "time"

func main() {
	done := make(chan struct{})
	c := make(chan int)
	go func() {
		defer close(done)

		for x := range c{
			println(x)
		}
	}()

	for x:=0;x<10;x++{
		c <- x
		time.Sleep(1 * 1e9)
		if(x == 5){
			close(c)
		}
	}

}
