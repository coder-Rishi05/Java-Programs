class Main {
    public static void main(String st[]) {
        try {
            get();
        } catch (java.io.IOException e) {
        } catch (NumberFormatException e) {
            System.out.print("enter the integer only");
        }
    }

    static void get() throws java.io.IOException {
        String x, y;
        java.io.InputStreamReader ip = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(ip);
        System.out.print("enter the first number: ");
        x = br.readLine();
        System.out.print("enter the second number: ");
        y = br.readLine();
        // int num=Integer.parseInt("12");
        System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
    }
}