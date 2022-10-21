// Bridge, Factory Method, Iterator, Visitor, Facade Method pattern
// Main class for all Seller operations

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PersonSeller extends Person {

    Facade facade = new Facade();
    Scanner sc = new Scanner(System.in);

    // Factory Method and Bridge pattern to show specific Product to specific Person (in this case the Seller)
    public void showMenu() throws FileNotFoundException {
        
        System.out.println("1. View Meat menu");
        System.out.println("2. View Produce menu");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
            product = new ProductMeat();
            product.showMenu();
            break;

            case 2:
            product = new ProductProduce();
            product.showMenu();
        }
    }

    // Factory Method and Bridge used to add a new product for sale
    public void createProduct() throws IOException {

        System.out.println("1. Add a Meat item");
        System.out.println("2. Add a Produce item");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
            product = new ProductMeat();
            product.createProduct();
            break;

            case 2:
            product = new ProductProduce();
            product.createProduct();
        }
    }

    // Iterator pattern to view all current bids of all users on all products
    public void viewBids() {
        facade.displayBids();
    }

    // Visitor pattern used to lock a bid
    public void lockTrade() {
        Trading trading = new Trading();
        trading.tradingMain(facade);
    }

    public void sellerMain() throws IOException {

        while(true) {
            System.out.println("What would you like to do:");
            System.out.println("1. View menu");
            System.out.println("2. Add new product");
            System.out.println("3. View all bids");
            System.out.println("4. Lock a trade");
            System.out.println("99. Logout");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                System.out.println();
                showMenu();
                break;

                case 2:
                System.out.println();
                createProduct();
                break;

                case 3:
                System.out.println();
                viewBids();
                break;

                case 4:
                System.out.println();
                lockTrade();
                break;

                case 99:
                System.out.println();
                System.out.println("Bye!");
                System.out.println();
                Main.main(null);
                break;
            }
        }
        
    }
}
