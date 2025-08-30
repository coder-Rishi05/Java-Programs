class A {
    void display(){
        System.out.println("This belongs to A");
        
    }
}
class B extends A {
  public  void display(){
        System.out.println("This belongs to B");
        // return 0;

    }

    public static void main(String st[]){
        B obj = new B();
        obj.display();
    }
}

// super have higher access specifir, and lower have higher then it will give error. 