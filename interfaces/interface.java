interface class_A {
	
void disp();	

}

interface class_B {

void display();

} 

class b implements class_A, class_B {

public void disp(){
	
System.out.println("This function is of interface class_A ");

}

public void display(){
System.out.println("This function is of interface class_B ");

}

}

class c {

public static void main(String at[]){
	
b obj = new b();

obj.disp();	


obj.display();	
}

}