class A {


public static void main(String ar[]){

int arr[];

arr = new int [20];
arr[0] = 1;
arr[1] = 11;
arr[2] =21;
arr[3] = 31;
arr[4] = 41;

System.out.println(arr[2+2]); // have reference of the array.

for(int i = 0; i < 5; i++){
System.out.println(arr[i]);
}

}

}