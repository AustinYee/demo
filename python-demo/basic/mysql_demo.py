import pymysql.cursors

if __name__ == '__main__':
    conn = pymysql.connect(host='yechangqing.com',
                           user='root',
                           password='Ycq980518',
                           db='test_db')
    try:
        with conn.cursor() as cursor:
            sql = "select * from `user`"
            cursor.execute(sql)
            result = cursor.fetchone()
            print(result)
    finally:
        conn.close()

