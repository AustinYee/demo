package main

import "fmt"

type Person interface {
	sex() string
}

type Man struct {
	name string
	age  int
	data interface{}
}

func (man Man) sex() string {
	return "test man"
}

func main() {
	person := new(Man)
	str := person.sex()
	fmt.Print(str)
}
