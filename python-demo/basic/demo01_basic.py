import collections

Student = collections.namedtuple('Student', ['name', 'age'])


class Demo:
    @staticmethod
    def __len__(self):
        print("hello world")
        return 3


def main():
    student = Student(name="test", age=21)
    print(student)
    demo = Demo()


if __name__ == '__main__':
    main()
