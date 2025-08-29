class A {
    int x;
}

class B extends A {
        void display(){
            x = 34;
            System.out.println("x : "+x);
        }
}

class C {
public static void main(String st[]){
        B obj = new B();
        // System.out.println();
        obj.display();
    }
}