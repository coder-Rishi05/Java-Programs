class A {

}


class b extends A {

void display(){
    System.out.println("This belongs to b ");
}

public static void main(String st[]){
    b obj = new b();
    obj.display();
}

}