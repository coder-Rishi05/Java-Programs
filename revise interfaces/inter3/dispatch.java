// dynamic method dispatch

class A {
    void display(){
        System.out.println("This belongs to A");
        
    }
}
class B extends A {
    void display(){
        System.out.println("This belongs to B");
        // return 0;

    }

    
    public static void main(String st[]){
        A obj = new B(); // dynamic method dispatch
        obj.display();
    }
}



class c {


    public static void main(String st[]){
        A obj = new B(); // dynamic method dispatch
        obj.display();
    }
}











// class A {

// // void display(){
// //     System.out.println("This does not belongs to A ");
// // }

// }


// class b extends A {

// void display(){
//     System.out.println("This belongs to b ");
// }

// public static void main(String st[]){
//     A obj = new b();
//     obj.display();
// }

// }