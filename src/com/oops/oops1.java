package com.oops;

public class oops1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sandeep", 21);

        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student random = new Student(s1);

        System.out.println(random.rollno);
        System.out.println(random.name);
        System.out.println(random.age);

        Student random2 = new Student();

        System.out.println(random2.rollno);
        System.out.println(random2.name);
        System.out.println(random2.age);

        Student one = new Student();
        Student two = one;

        one.name = "something";
        System.out.println(two.name);

        System.out.println(two.raise);
        // we can't do something like this because rasie is declared as final
        // which can't be modified
        // two.raise = 5;

    }
}

class Student {
    int rollno;
    String name;
    int age;

    /** final is a keyword in JAVA which are used where we can't modified the data
     */
    final double raise = 5.0f;

    /**
        Constructors:
        we need  a way to add the values of the above properties object by object
        we need one word to access every object
    */

    Student (int rno, String name, int age) {
        this.rollno = rno;
        this.name = name;
        this.age = age;
    }

    /**
        Constructor overloading:
        passing an object to a constructor
     */

    Student (Student other) {
        this.rollno = other.rollno;
        this.name = other.name;
        this.age = other.age;
    }

    /**
        constructor inside a constructor
     */

    Student () {
        // internally this is what happens
        // new Student(0, "name", 0);
        this (0, "name", 0);
    }

    /**
        Garbage collection:
        Acts as a destroyer and removes the object from the memory
    */

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
