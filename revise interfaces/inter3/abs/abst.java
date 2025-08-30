abstract class A {
    int x;
    int y;
 void display(){};

 void shoow(){}
}


 class B extends A {
    // A obj = new A();
// void shoow(){}

//  void display(){

//  };


}

class c {
    public static void main(String st[]){
        B obj = new B();
        // obj.shoow();
        // obj.display();
    }
}


/**
 * If i make my function abstract then my class should be abstract.
 * an abstract is an incomplete class.
 * we cant make object of an abstract class.
 * But we can crate a refrence object of the abstract class.
 * 
 * 
 * Benefit of abstract class.
 * 
 * why should i create an abstract class? What is the use of it.
 * I will write all the features as prototype, which body i dont know. So when my class is inherited now it the compulsion  of the child class to make body for my abstract classes.
 * my function prototype should not be change.
 * 
 * abstract methods can not have a body 
 * ex:   
 * abstract void shoow(){

}
 * my abstract class can have function with body which are not abstract. 
 * 
 * to use abstract class functions i need to create a b class which will inherit 
 * 
 * if in my class i have abstract function then it will also inherit to the subclass which will make the sub class an abstract also and then i cant create it object.
 * 
 * 
 */