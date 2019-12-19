import threading

def test(str):
    print(str)

threading
if __name__ == '__main__':
    thread1 = threading.Thread(test("hello"), ("Thread-1", 2, ))
    thread1 = threading.Thread(test("hello"), ("Thread-2", 4, ))
