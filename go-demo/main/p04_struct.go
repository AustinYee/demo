package main

import "fmt"

type Node struct{
	value string
	next *Node
}

func main() {

	var node1 = Node{"1", nil}
	var node2 = Node{"2", &node1}
	fmt.Print(node2.next.value)
}