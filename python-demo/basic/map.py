from lib import pylib
x = {}

x[1] = "123"
x[2] = "456"

def test():
    print(pylib.a)

if __name__ == '__main__':
    print(test())
    print(type(x))

    set = x.keys()

    print(set)
