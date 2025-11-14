// array

// --enable-preview

class a {


public static void main(String st[]){

/*
	
int[] arr = new int[5]; // declaring array with length 5;

int val = arr.length;

arr[0] = 20;

int[] arr1 = {10,20,30,40,59};

for(int i = 0;i < val; i++){
System.out.println(arr1[i]);
}
System.out.println(val);
}

*/

 int[][] matrix = new int[3][3];

        // Step 2: Assign values
        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3;
        matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 8; matrix[2][2] = 9;

        // Step 3: Print values
        System.out.println("Matrix values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
}
}