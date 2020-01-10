package dao

import "database/sql"

func main() {
	db, _ := sql.Open("mysql",  "root:Ycq980518@yechangqing.com:3306/test_db");
	stmt, _ := db.Prepare("insert into test (id, name) values ('?', '?')");
	stmt.Exec(2, "test");
}
