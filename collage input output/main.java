// inputStream is our abstract function therefore we can't create its object.
// the system.in.read takes my buffer character.
// to fixed the problem of buffered character we use buffred.
// so we need to find a function which takes string
// 

class inp {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the first number");
            int x = System.in.read();
            System.out.println(x);
            System.out.println("Enter the second number");
            int c = System.in.read();
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        } finally {

            System.out.println("Thank you");
        }

    }
}