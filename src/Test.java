import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file = new File("./src/Price.txt");
        double price;

        try {
            Scanner scanner = new Scanner(file);

            //now read the file line by line...
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                System.out.println("in loop");
                String line = scanner.nextLine();
                lineNum++;
                if(line.substring(0,4).equalsIgnoreCase("soda")) {
                    price=Double.parseDouble(line.substring(line.length()-4));
                    System.out.println(price);
                }
            }
        } catch(FileNotFoundException e) {
            System.err.println("ERROR");
        }
    }
}
