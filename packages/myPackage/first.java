// unqualified way od using : java package

import java.util.Date;

class A {
    public static void main(String st[]){
     Date d = new Date();
     System.out.println( "Today's date is : " + d.getDate());   
     System.out.println( "Current Month is : "+  d.getMonth() + 1);   
     System.out.print( "Current year is : " );   
     System.out.print( d.getYear() + 1900 );   
    }
}