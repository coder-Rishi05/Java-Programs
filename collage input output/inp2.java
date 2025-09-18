import java.io.*;

class a {
    public static void main(String[] args) {
        System.out.println("String class.");
        // Reader read1 =new InputStreamReader(); // character class.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // passesed the reference object of Reader class.
        try {
            System.out.println("Enter a cahcacreter");
            String st = br.readLine();
            String st1 = br.readLine();
            System.out.println(st + st1);
            int x = Integer.parseInt(st);
            int x1 = Integer.parseInt(st1);
            System.out.println(x + x1);
        } catch (IOException e) {
            System.out.println(e);

        } finally {
            System.out.println("Finally");

        }

    }
}

// byte java.io : inputStream
// character java.io : Reader/Write
//