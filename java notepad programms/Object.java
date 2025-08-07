// creating object and accessing class members using refrence object.

class AB {


int a ;

int display() {
System.out.println("hey !");
return 0;
} 

public static void main (String ar[]) {

AB obj1;
obj1 = new AB(); // creating an object using constructor and new keyword.

obj1.a = 12;


System.out.println(obj1.display());
System.out.print(obj1.a);

}


}


class ABC {


int a ; 

public static void main (String ar[]) {

ABC obj1;

obj1 = new ABC(); // creating an object using constructor and new keyword.

System.out.println("Named object : ");

obj1.display();

System.out.println(obj1.a);

}

void display() 
{

a = 123;

}

}


class D {

int x ;

public static void main(String m[]){

System.out.println("---- Unnamed object ----");

new D().display();
new D().display();
}

void display(){
x = 500;
System.out.println(x);
}

}



// anonymus object or unnamed object is used when we want to call any functoin one time only.
// to create an anonymus object : new D(); keyword constructor();
// to used anonymus object : new D().display(); this can be done only one time.
// if i write it again a new memory will be created, and that new memory's x will be created and that new memory display() will be called.








