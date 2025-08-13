// method overriding


class a {

int x;
void display () {

 System.out.print("A class Function. ");
 }

}


class b extends a {
 void display(){

System.out.println("B class Function. " + x);
System.out.println("B class Function. ");
System.out.println(
super.x= 123);

}
 
public static void main(String arg[]) {

b obj = new b();
obj.display();

}

}

class c {

public static void main (String st[]){

//dynamic memory dispatch

a obj;

obj = new b();

obj.display();

}

}

// we cant directly call the super class function using b class object if we are using the concept of method overriding.
 