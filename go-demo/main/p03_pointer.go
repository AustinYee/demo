package main

func swap1(a int, b int){
	var tem int
	tem = a;
	a = b;
	b= tem;
}

func swap2(a *int, b *int){
	var tem int
	tem = *a
	*a = *b
	*b = tem
}

func main() {
	var a = 3
	var b = 4

	swap1(a, b)
	println(a, b)

	swap2(&a, &b)
	println(a, b)
}