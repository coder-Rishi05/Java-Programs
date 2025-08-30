// it a completed abstract class. all functions are by default abstracted.

interface inter1 
{
    void display1(); // it is by default abstract and public.
}

interface inter2 {
    void display2();
}

interface inter3 extends inter1,inter2 { //
    void display3();
}

class a implements inter3 {
  public  void display1(){ 
        System.out.println("display 1");
    }
  public  void display2(){ 
        System.out.println("display 2");
    }
  public  void display3(){ 
        System.out.println("display 3");
    }

}

class c {

    public static void main(String st[]){
    a obj = new a();

    // obj.display1();
    // obj.display2();
    // obj.display3();

    // obj.get();

    inter1 obj1;
    inter2 obj2;
    inter3 obj3;
    // obj1 = obj;
    // obj2 = obj;
    obj3 = obj;
    obj2 = obj;
    obj1 = obj;

// obj 3 can access all the display's
    // obj3.display3();
    // obj3.display2();
    // obj3.display1();

// obj 2 can access all the display's

    // obj2.display3();
    obj2.display2();
    // obj2.display3();
    //  = new a();

    // obj1.display3();
    // obj1.display2();
    obj1.display1();

    }

}

// we have refrence variable of the interface.