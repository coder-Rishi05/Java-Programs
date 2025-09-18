package p1;

import java.io.*;

public class myExcp {

    public static int checkFunction(int a) {
        if (a < 0) {
            System.out.println("Error : Can't take -ve numbers" + a);
        } else if (a == 0) {
            System.out.println("Error : Can't take 0 as values " + a);

        } else if (a % 2 != 0) {

            System.out.println("Error : Can't take odd as values " + a);
        }
        return a;
    }

    public static void main(String[] args)
            throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String st = br.readLine();

        int x = Integer.parseInt(st);

        checkFunction(x);

    }
}
