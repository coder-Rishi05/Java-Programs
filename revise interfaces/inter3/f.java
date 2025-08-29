class A {
    int x;

    A(int s){
        x = s;
    }

}

class B extends A {
    int y ; 
    char c;

    B(int a){

    }

    void display(){
        System.out.println(x);
    }
}


class c {
    public static void main(String st[]){
        B obj = new B(10);
        obj.display();
    }
}

// 