// it a completed abstract class. all functions are by default abstracted.

interface inter1 
{
    void display(); // it is by default abstract and public.
}

interface inter2 {
    void display();
}

class a implements inter1,inter2 {
  public  void display(){ // because it came from interface class i need to write public here.
        System.out.println("display function");
    }
//   public  void get(){ // because it came from interface class i need to write public here.
//         System.out.println("get function");
//     }
}

class c {

    public static void main(String st[]){
    a obj = new a();
    obj.display();
    // obj.get();

    }

}

