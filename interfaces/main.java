abstract class a {

    abstract void disp();

    void display() {
        System.out.println("Hello");
    }

}

abstract class b extends a {

    void display() {
        System.out.println("display");
    }

}

class main {
    public static void main(String st[]) {
        a obj1 = new main();
        obj1.disp();
        obj1.display();

        b obj = new main();
        obj.disp();
        obj.display();

    }

}
