import java.io.InputStreamReader;

public class a {

    public static void main(String st[]) throws java.io.IOException

    {
        java.io.InputStreamReader isr = new InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);

        String str = br.readLine();
        System.out.println("User entered the string " + str);
        String str1 = br.readLine();
        System.out.println("User entered the string " + str1);
        System.out.println("sum : ");

    }

}