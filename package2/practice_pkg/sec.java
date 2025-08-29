
// inheritance : cant inherit the private and default datamembers from outside the package.

class B extends p2.A  {

void display(){
int x = 1;
int y = 2;
int z = 3;
int a = 4;
}

public static void main(String st[]){

   B obj = new B();
    // obj.display();
    System.out.println(obj.x);
    System.out.println(obj.y);
    System.out.println(obj.z);
    System.out.println(obj.a);

}

}

