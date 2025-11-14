/*
class A {

void display(){
System.out.println("using objects ");

}

public static void main(String st[]){

A obj = new A();
obj.display();

final int a = 100;

System.out.println(" the value of a is " + a );

//a = 200;

System.out.println(" the value of a updated " + a );

}

}

/* 
Notes: 

Java me teen types ke variables hote hain:

Local variable

Instance variable

Static variable

*/


class Person {
    final String COUNTRY = "India";  // constant

    int age;           // instance variable
    String name;

    // Constructor overloading
    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method overloading
    void info() {
        System.out.println(name + " (" + age + ")");
    }

    void info(String msg) {
        System.out.println(msg + ": " + name + " (" + age + ")");
    }

    public static void main(String[] args) {

        // Variables + data types + expression
        int x = 10, y = 20;
        int sum = x + y;

        // Control structure
        if(sum > 20) {
            System.out.println("Big Number");
        }

        // Object 1
        Person p1 = new Person();
        p1.info();

        // Object 2
        Person p2 = new Person("Rishi", 21);
        p2.info("Student");

        // Request garbage collection
        System.gc();
    }
}
