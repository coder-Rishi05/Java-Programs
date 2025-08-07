// copy constructor

class n {

    int x;

    n(int t) {
        x = t;
        System.out.println(x); // this x belongs to obj2 as obj2 is calling the function.;
    }

}

class p {

    public static void main(String ar[]) {
        n obj1 = new n();
        obj1.x = 120;
        n obj2 = new n(obj1.x);

    }
}