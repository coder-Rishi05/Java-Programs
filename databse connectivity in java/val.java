import java.io.*;

class a {

    public int roll;
    public String name;

}

class b {
    public static void main(String[] args) {
        a obj = new a();

        System.out.println("Enter you value to add as roll no in the database.");
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String st = br.readLine();
            int x = Integer.parseInt(st);
            String name = br.readLine();

            obj.roll = x;
            obj.name = name;
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("The roll is : " + obj.roll);
        System.out.println("The name is : " + obj.name);
    }

}