class A {
    int x;

    A(int s){
        x = s;
    }

}

class B extends A {
    int y ; 
    char c;

    B(int c){
        super(10);
        System.out.println("B's class constructor.");
    }

    void display(){
        System.out.println(x);
    }
}


class c {
    public static void main(String st[]){
        A obj;
        obj = new B(1);
        obj.display();
    }
}

// 