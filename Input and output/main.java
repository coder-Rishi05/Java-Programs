import java.io.IOException;

public class main {
    public static void main(String st[]) {
        try {
            System.out.println("enter the character");
            int x = System.in.read();
            System.out.println((char) x - 48);
            System.out.println("enter the character");
            int y = System.in.read();
            System.out.println((char) y - 48);

            

        } catch (IOException e) {

        }

    }
}
