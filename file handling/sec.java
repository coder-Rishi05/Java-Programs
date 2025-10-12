import java.io.*;
import java.util.Scanner;

class a {
    public static void main(String[] args) {
        try {

            File file = new File("abc.txt");

            // if (file.createNewFile()) {
            //     System.out.println("File created: " + file.getName());
            // } else {
            //     System.out.println("File already exist: ");
            // }

            Scanner Reader = new Scanner(file);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println("data : "+data);
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