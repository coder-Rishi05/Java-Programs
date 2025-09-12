### Command line arguments.

Command line arguments means when we write commands on dos amd through we pass some argument these argument goes to main function.

The argument which goes to main function are called command line arguments.

- Ex :

class cla {

    public static void main(String st[]) {
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);

        }
    }

}

dos arguments.

javac .\cla.java
java cla 1 2 3 4 5

output :

1
2
3
4
5

---

Here the type of arguments of command line could be any thing.

But if there are no arguments then i can get an exception

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at cla.main(cla.java:4)
```

### String exception handling

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


Here a string should be a proper integer we cant have this : 345we. 

### keyboard inputes

the keyboard input are defined in System.in class which take input as character.
in java we have two ways to input data byte and character.

character line by line
character string by string
character word by word

every input from keyboard will be came in System.in class


### Input stream reader

byte oriented character oriented

byte
java.io.InputStream   // reader
java.io.OutputStream // reader

character

java.io.reader() // input // writer
java.io.Write() / output // writer


- the only way of taking input from the user.
        System.in()



// Buffer Reader => this is also a whole class which have diffrent functions for taking input.

1. readline() -> 