public class array {
    public static void main(String st[]) {
        // int x [][] = new int [3][];
        int x[][];
        x = new int[3][]; // In 2d array we need to tell the rows dynamically but columns are not
                          // necessary declare.

        x[0] = new int[2];
        x[1] = new int[3];
        x[2] = new int[4];

        x[2][3] = 190;

        System.out.println(x[2][3]);

    }
}
