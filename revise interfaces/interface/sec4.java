interface a {
    int x = 110; // default static and final
}

class b implements a {

}

class c {
    public static void main(String st[]){
        System.out.println(b.x);
    }
}