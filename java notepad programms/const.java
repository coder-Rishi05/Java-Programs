// defualt constructor

class acds {

    acds() {

        System.out.println("default constructor is called  : ");

    }

    public static void main(String args[]) {

        acds obj1 = new acds();
        acds obj2 = new acds();
        acds obj3 = new acds();

    }

}

// parameterised constructor

class para {

    int data1;

    para() {

        System.out.println(data1);

        // System.out.println("default constructor is called : ");

    }

    para(int x) {

        data1 = x;

        // System.out.println("parametirised constructor is called : ");
        System.out.println(data1);

    }

    public static void main(String as[]) {

        para obj1 = new para();
        para obj2 = new para(10);
        para obj3 = new para();

        // System.out.println(obj3.data1);

    }

}

// refrence object

class ref {

    int x;

    public static void main(String s[]) {

        System.out.println("---------- refernce object ----------");

        ref obj1 = new ref();

        System.out.println(obj1.x);

        ref obj2 = obj1;

        System.out.println(obj2.x);

        obj2.x = 1234;

        System.out.println(obj2.x);

        System.out.println(obj1.x);

    }

}

// copy constructor

class copy {
    int data;

    copy() { // default constructor.
        data = 90;
        System.out.println("Default constructor : ");
    }

    public static void main(String arr[]) {
        copy obj1 = new copy(), obj2 = new copy();
        obj1.data = 12; // user enter the value.

        System.out.println("\nreference of obj1 : " + obj1);// it will print its address
        System.out.println("reference of obj2 : " + obj2);// it will print its address

        obj2 = obj1;

        System.out.println("\nreference of obj1 : " + obj1);// it will print its address
        System.out.println("reference of obj2 : " + obj2);// it will print address of first obj1, as both have same
                                                          // address.

    }

}

// if reference object have some reference and that reference have some address
// then it act like a pointer. both will have same address.

// public static void main(String arr[]) {
// copy1 obj1 = new copy1();
// copy1 obj2 = new copy1();

// }

// void copy() {
// // obj2.data = obj1.data; : here the scope of object is not reachable.
// }

class copy1 {

    int data;

    void display(int temp) {
        data = temp;
        System.out.println(data);
    }

}

class copy2 {
    public static void main(String a[]) {
        copy1 obj1 = new copy1(); // both objects are of copy1() class objects.
        copy1 obj2 = new copy1(); // both objects are of copy1() class objects.
        obj1.display(40);
        obj2.display(20);
    }
}

/*
 * to which object this data belong ?
 * 
 * when an object call its member function then the datamember present in the
 * body of that function body belongs to the object who calls the function.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

// creating copy function in a class

class j {

    int x;

    void copy(int t) {
        x = t;
        System.out.println(x); // this x belongs to obj2 as obj2 is calling the function.;
    }

}

class k {

    public static void main(String ar[]) {
        j obj1 = new j();
        j obj2 = new j();

        obj1.x = 123;

        obj2.copy(obj1.x); // it sending its reference to that variable.
    }
}

// copy constructor

class n {

    int x;

    n(int t) {
        x = t;
        System.out.println(x); // this x belongs to obj2 as obj2 is calling the function.;
    }

}

class p {

    public static void main(String ar[]) {
        n obj1 = new n();
        
        n obj2 = new n(obj1.x);

    }
}