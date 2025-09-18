class A {
    public static void main(String st[]) {
        
        try {
            System.out.println(st[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}