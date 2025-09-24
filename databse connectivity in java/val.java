import java.io.*;

class a {
    public static void main(String[] args) {
        System.out.println("Enter you value to add as roll no in the database.");
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String st = br.readLine();
            System.out.println("User input is : " + st);
            int x = Integer.parseInt(st);
            System.out.println(x);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
