import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductProduce implements Product {
    
    public void showMenu() throws FileNotFoundException {

        File productInfo = new File("data/ProductInfo.txt");
        Scanner sc = new Scanner(productInfo);

        String currProduct = sc.nextLine();
        while(sc.hasNextLine()) {
            if(currProduct.contains("Produce")) {
                System.out.println(currProduct);
            }
            currProduct = sc.nextLine();
        }
        System.out.println();
    }

    public void createProduct() throws IOException {

        File productInfo = new File("data/ProductInfo.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of produce:");
        String produce = sc.next();
        produce = "\nProduce:" + produce;
        
        FileWriter fr = new FileWriter(productInfo, true);
        fr.append(produce);
        fr.flush();
        fr.close();
    }
}
