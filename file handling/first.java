import java.io.*;
import java.util.Scanner;

class Myclass {
    public static void main(String[] args) {
        try {
            // System.out.println("File handling ");
            File file = new File("abc.txt");
            Scanner Reader = new Scanner(file);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }

            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}