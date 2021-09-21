package Assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class water implements bottle{
    double price;
    String productName;
    public water(String productName){
        this.productName=productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice() {
        File file = new File("./src/Assign1/Price.txt");

        try {
            Scanner scanner = new Scanner(file);
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if(line.substring(0,productName.length()).equalsIgnoreCase(productName)) {
                    price=Double.parseDouble(line.substring(line.length()-4));
                }
            }
        } catch(FileNotFoundException e) {
            System.err.println("ERROR");
        }



    }
}
