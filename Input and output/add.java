class add {
    public static void main(String[] args) {
        java.io.InputStreamReader ip = new java.io.InputStreamReader(System.in);
        java.io.BufferedInputStream br = new java.io.BufferedInputStream(ip);

        System.out.println("Enter the number");

        String st = br.readLine();
        String st1 = br.readLine();
        int a = Integer.parseInt(st);
        int a1 = Integer.parseInt(st1);
        System.out.println("Sum " + a + a1);

    }
}