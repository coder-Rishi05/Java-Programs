class cla {

    public static void main(String st[]) {
        // sum of arguments

        System.out.println("sum of two values : " + st[0] + st[1]);
        // output : sum of two values : 1213 Here it will concate the arguments as both
        // are string. to fix it we can use.

        int x = java.lang.Integer.parseInt(st[0]);
        int y = java.lang.Integer.parseInt(st[1]);
        System.out.println("sum of two arguments : " + (x + y));

    }

}
