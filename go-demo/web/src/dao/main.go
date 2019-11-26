package dao

import "database/sql"

func init() {
	db, _ := sql.Open("mysql",  "root:gllue123@127.0.0.1:3306/test");
	stmt, _ := db.Prepare("insert into test (name) values ('?')");
	stmt.Exec("test");
}
