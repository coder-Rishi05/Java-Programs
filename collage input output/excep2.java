class Main
{
public static void main(String st[])
{
try
{
System.out.println(st[5]+(12/0));
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("index error"+e);

}
catch(ArithmeticException e)
{
System.out.println("divide error "+e);

}
catch(Throwable e)
{
System.out.println(e.getMessage());

}

}
}