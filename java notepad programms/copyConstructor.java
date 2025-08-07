// copy constructor

class a{

    int x;
	
	a(int x){
	System.out.println(x );
	}

    a(a temp) {  // temp = obj1
       x = temp.x;
       System.out.println(x); // this x belongs to obj2 as obj2 is calling the function.;
    }

}

class b {

    public static void main(String ar[]) {
       a obj1 = new a(12); // default const.
	 obj1.x = 120;
	a obj2 = new a(obj1); //copy const.
    }
}



// it is also call by reference.

//class a {
//int x;
//void copy (a temp) // temp = obj1
//{
//System.out.println(x);  // this x is belong to x.
//x = temp.x;
//System.out.print(x); // 123
//}
//}

//class b {

//public static void main(String s[]){
//a obj1 = new a();
//a obj2 = new a();
//obj1.x = 123;
//System.out.print(obj1);
//obj2.copy(obj1);
//}


//}

// function overloading.

class over {

void display() {
System.out.println("This is without argument : ");
}

void display(int x) {
System.out.println("This is with argument : " + x);

}


public static void main(String s[]) {
	over obj1 = new over();

	obj1.display();
	obj1.display(20);
}

}




