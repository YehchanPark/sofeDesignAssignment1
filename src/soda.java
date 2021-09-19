import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class soda implements bottle {

    double price;
    String productName;
    public soda(String productName){
        this.productName=productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice() {
        File file = new File("./src/Price.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.substring(0,productName.length()).equalsIgnoreCase(productName)) {
                    price=Double.parseDouble(line.substring(line.length()-4));
                }
            }
        } catch(FileNotFoundException e) {
            System.err.println("ERROR");
        }
    }
}
