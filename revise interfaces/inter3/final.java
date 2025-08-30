// final keyword

 class A {
    final int a = 0;
    final void display1(){
        System.out.println("Final function can be used but cant be changed");
    }
}

class b extends A {

    void display(){
        System.out.println("A valeue : " + a);
        display();
    }

    public static void main(String st[]){
        b obj = new b();
        obj.display1();
    }
}

