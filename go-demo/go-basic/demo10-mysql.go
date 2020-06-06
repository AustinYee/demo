package main

import (
	_ "com.github/go-sql-driver/mysql"
)

func main() {
	db, err := mysql.Open("mysql", "root:gllue123@tcp(localhost:3306)/test")
}
