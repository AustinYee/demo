import os

x = {}

x[1] = "123"
x[2] = "456"


def test():
  print(lib.a)


def getRootPath():
  rootPath = os.path.dirname(os.path.abspath(__file__))
  return rootPath


if __name__ == '__main__':
  print(test())
  print(type(x))

  set = x.keys()

  print(set)
  print(getRootPath())
