class A {
    int x;
}

class B extends A {
        int x;
        void display(){
            x = 34;
            System.out.println("x : "+x);
            // System.out.println("x : "+x);
            super.x = 120;

            System.out.println("x Super keyword : "+ Super.x);

        }
}

class C {
public static void main(String st[]){
        B obj = new B();
        // System.out.println();
        obj.display();
    }
}