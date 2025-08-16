interface class_A {
	
void display1();	

}

interface class_B {

void display2();

} 


interface class_C extends class_A, class_B {

void display3();

} 



class b  implements class_C {


public void display1(){
System.out.println("display 1");

}

public void display2(){
System.out.println("display 2");

}

public void display3(){
System.out.println("display 3");

}


}

class c  {



public static void main(String at[]){
	
b obj = new b();

//obj.disp();	

class_A a1;
class_B b1;
class_C c1;



a1 = obj; // here c1 is refrence object of class_c;

b1 = obj;

a1.display1();

//a1.display2(); // a1 cant call display 1.

//b1.display1();

b1.display2();

//obj.display1(); //

//obj.display2();

//obj.display3();	
}

}