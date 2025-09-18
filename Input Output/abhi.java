public class abhi {
    public static void main(String st[]) {
        // taking input from user
        int a1, b, c;

        try {
            System.out.println("Enter a number");
            a1 = System.in.read();
            System.out.println("Enter a number");
            b = System.in.read();
            System.out.println("Enter a number");
            c = System.in.read();
            System.out.println("Entered numbers are : " + (char) a1 + "  " + (char) b + " " + (char) c);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}