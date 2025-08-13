// constructor in class inheritance

class A {

A(int s){
int x;
}
}


class B extends A {

int x;

B(int a){

super(10); // should be the first line 
}

void disp(){

System.out.print(x);

}


}

class c{


public static void main(String []a) {

B obj = new B();

obj.disp();
}


}