import collections

Student = collections.namedtuple('Student', ['name', 'age'])


class Demo:
    @staticmethod
    def __test__(self):
        print("hello world")
        return 3




def main():
    student = Student(name="test", age=21)
    print(student)
    if student is not None:
        print(student)
    demo = Demo()


if __name__ == '__main__':
    main()
