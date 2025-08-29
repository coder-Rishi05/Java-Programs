class A {
    int a;
    void display(){
        System.out.println("This a one function");
    }
    int display(int a){

        System.out.println("This a one function with overload : " + a);
        return 12;
        // so by this means the a datamember.
    }

    public static void main(String st[]){
        A obj = new A();
        obj.display();
        obj.display(12);
        // int a;
        // System.out.println("This a one  : " + a);
    }
}

// so in my function overloading even if my function return type is diffrent it will still work the same.