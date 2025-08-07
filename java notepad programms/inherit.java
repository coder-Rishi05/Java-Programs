// inheritance.

class a { // super class

int x;
int y;
String str;

}


class b extends a{ // here now class b has also data members x,y and str.

int q;
int x;
void display() {
x = 12;
super.x = 34;
System.out.println(x + " " + super.x );
}

}

class c extends b { // multilevel inheritance.

public static void main (String s[]){
	b obj = new b();
	obj.display();
	
	a obj1 = new a();
	System.out.println(obj.x);
	
}

}

