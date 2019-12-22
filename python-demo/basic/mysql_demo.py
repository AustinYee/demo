import pymysql.cursors

if __name__ == '__main__':
    conn = pymysql.connect(host='localhost',
                           user='root',
                           password='gllue123',
                           db='test_db')
    try:
        with conn.cursor() as cursor:
            sql = "select * from `user`"



    finally:
        conn.close()

