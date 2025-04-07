import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println("Name=" + name);
        System.out.println("age=" + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student std = new Student("sneha", 20);
        std.display();
    }
}
