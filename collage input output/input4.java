class Main
{
public static void main(String st[]) throws java.io.IOException
{
try
{
String x,y;
java.io.InputStreamReader ip=new java.io.InputStreamReader(System.in);
java.io.BufferedReader br=new java.io.BufferedReader(ip);
System.out.print("enter the first number: ");
x=br.readLine();
System.out.print("enter the second number: ");
y=br.readLine();
//int num=Integer.parseInt("12");
System.out.println(Integer.parseInt(x)+Integer.parseInt(y));
}
catch(ArrayIndexOutOfBoundsException e){
System.out.print("integer only");
}
finally
{
System.out.println("Thank You");
}

}
}

