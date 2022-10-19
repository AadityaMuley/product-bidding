import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {

    Scanner sc;
    
    public boolean buyerLogin(String buyerCredentials) throws FileNotFoundException {

        boolean buyerAuthentication = false;

        File buyerFile = new File("data/BuyerInfo.txt");
        sc = new Scanner(buyerFile);

        String currCredential = sc.nextLine();
        while(currCredential != null) {
            if(currCredential.equalsIgnoreCase(buyerCredentials)) {
                buyerAuthentication = true;
                System.out.println("Buyer authentication successful!");
                break;
            }
            currCredential = sc.nextLine();
        }

        return(buyerAuthentication);
    }

    public boolean sellerLogin(String sellerCredentials) throws FileNotFoundException {

        boolean sellerAuthentication = false;

        File sellerFile = new File("data/SellerInfo.txt");
        sc = new Scanner(sellerFile);

        String currCredential = sc.nextLine();
        while(currCredential != null) {
            if(currCredential.equalsIgnoreCase(sellerCredentials)) {
                sellerAuthentication = true;
                System.out.println("Seller authentication successful!");
                break;
            }
            currCredential = sc.nextLine();
        }

        return(sellerAuthentication);
    }
}
