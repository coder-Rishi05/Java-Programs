interface inter1
{
int x=10;
void display();
}
interface inter2
{
void get();
}

class A implements inter1,inter2
{
public void display()
{
System.out.println("hello");
}
public void get()
{
System.out.println("get");

}
}
class Main
{
public static void main(String st[])
{
inter1 obj=new A();
inter2 obj1=new A();
obj1.get();
obj.display();
}
}