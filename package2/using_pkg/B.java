package pack2;

// Qualified way of using package using objects.

class B { 

public static void main(String st[]){

System.out.println("Qualified way of using package using objects");

pack1.A obj = new pack1.A();
obj.display();
}


}