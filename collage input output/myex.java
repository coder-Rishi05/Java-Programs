// user defined error

class myexcep extends Throwable {
    public String getMessage() {
        return "Number is negative ! Enter the positive number";
    }
}

class excep3 {
    public static void main(String[] st) {

        // myexcep my = new myexcep();

        try {
            if (Integer.parseInt(st[0]) < 0)
                System.out.println(st[0]);
            // for using user defined exceptions then to generate user defined exception i
            // need throw keyword in try block
            // throw my; // object of user defined class.
            throw new myexcep(); // using unnamed object.
        } catch (myexcep e) {
            System.out.println(e.getMessage());

        }
    }

}

// if my code is right then it will give null.