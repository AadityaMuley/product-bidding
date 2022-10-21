import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductMeat implements Product {

    boolean start = true;
	ProductIterator productIterator = new ProductIterator();
	ArrayList<String> products = new ArrayList<String>();

    public void showMenu() throws FileNotFoundException {

        if(this.start == true){
            File productInfo = new File("data/ProductInfo.txt");
        	Scanner sc = new Scanner(productInfo);

        	String currProduct = sc.nextLine();
        	while(sc.hasNextLine()) {
            	if(currProduct.contains("Meat")) {
                	System.out.println(currProduct);
					productIterator.add(currProduct);
            	}
            	currProduct = sc.nextLine();
        	}

			this.start = false;
        }
		else {
			products = productIterator.getList();
			for(int i=0; i<products.size(); i++) {
				System.out.println(products.get(i));
			}
		}

        System.out.println();
    }
    
    public void createProduct() throws IOException {

        File productInfo = new File("data/ProductInfo.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of meat:");
        String meat = sc.next();
		meat = "Meat:" + meat;
		productIterator.add(meat);
        meat = "\n" + meat;
        
        FileWriter fr = new FileWriter(productInfo, true);
        fr.append(meat);
        fr.flush();
        fr.close();
    }
}
