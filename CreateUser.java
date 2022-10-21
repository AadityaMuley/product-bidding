// Facade pattern
// Class to create new user

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateUser {

    Scanner sc = new Scanner(System.in);
    
    // Creates a new buyer
    public void createBuyer() {

        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();

        String credential = "\n" + username + ":" + password;

        try {
            File buyerInfo = new File("data/BuyerInfo.txt");
            FileWriter fw = new FileWriter(buyerInfo, true);
            fw.append(credential);
            fw.flush();
            fw.close();
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }

    // Creates a new Seller
    public void createSeller() {

        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();

        String credential = "\n" + username + ":" + password;

        try {
            File buyerInfo = new File("data/SellerInfo.txt");
            FileWriter fw = new FileWriter(buyerInfo, true);
            fw.append(credential);
            fw.flush();
            fw.close();
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
