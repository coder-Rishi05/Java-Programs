// static functions and static members.

class SD {

static void display()
{
System.out.println("display function : ");
}

public static void main(String arg[])

{

//display();

new SD().disp();

}
void disp()
{
display();
}



}

class b {


public static void main(String st[]){
SD.display();
}


}