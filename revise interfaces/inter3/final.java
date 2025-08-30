// final keyword

 class A {
    final int a = 0;
    final void display(){
        
    }
}

class b extends A {

    void display(){
        System.out.println("A valeue : " + a);
    }

    public static void main(String st[]){
        b obj = new b();
        obj.display();
    }
}

