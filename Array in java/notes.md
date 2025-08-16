### 2D Array

public class array {
public static void main(String st[]) {
// int x [][] = new int [3][];
int x[][];
x = new int[3][]; // In 2d array we need to tell the rows dynamically but columns are not
// necessary declare.

        x[0] = new int[5];
        x[1] = new int[5];
        x[2] = new int[5];

        x[0][0] = 100;

        System.out.println(x[0][0]);

    }

}

x = 0 1 2

0 = 0,1
1 = 0,1,2
2 = 0,1,2,3

### Jagged Array

when we have diffrent column size in each row of array, not same numbers of columns in row called jagged array.

x = 0 1 2

0 = 0,1
1 = 0,1,2
2 = 0,1,2,3
