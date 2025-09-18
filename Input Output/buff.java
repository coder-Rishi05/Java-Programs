class Main {
    public static void main(String st[]) {
        String x; // declare string variable
        java.io.InputStreamReader ip = new java.io.InputStreamReader(System.in);
        // the InputStreamReader read character from the keyboard.

        java.io.BufferedReader br = new java.io.BufferedReader(ip);
        try {
            System.out.print("enter the string: ");

            x = br.readLine();
            System.out.println(x);
        } catch (java.io.IOException e) {
            System.out.print(e);
        }
    }
}