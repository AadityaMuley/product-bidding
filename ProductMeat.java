import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductMeat implements Product {

    public void showMenu() throws FileNotFoundException {

        File productInfo = new File("data/ProductInfo.txt");
        Scanner sc = new Scanner(productInfo);

        String currProduct = sc.nextLine();
        while(sc.hasNextLine()) {
            if(currProduct.contains("Meat")) {
                System.out.println(currProduct);
            }
            currProduct = sc.nextLine();
        }
        System.out.println();

        sc.close();
    }
    
}
