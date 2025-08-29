class A {
int num1 , res;

A()
{
    System.out.println("This is a's constructor");
}

}



class b extends A { 

int x;
int y;
int z;
b()
{
  System.out.println("This is b's constructor");
}

void display(){
    System.out.println(num1);
}

}

class c extends b {
    c(){
  System.out.println("This is c's constructor");

    }
    public static void main(String st[]){
        c obj = new c();
        // System.out.println();
        obj.display();
    }
}
    
// who will allocate memory to sub class member.
// the constructor of b class will alocate memory to its data members, also it will call the super class default constructor and the superclass default constructor will now allocate memory to the super class data members.
// and then the super class constructor will allocate the memory to super class members amd its functions. it does not matter what is the type of the constructor.
// first a constructor
// then b constructor
// the functions