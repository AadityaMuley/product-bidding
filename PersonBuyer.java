import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PersonBuyer extends Person {

    Scanner sc = new Scanner(System.in);
    String username;

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

    public void placeBid() {
        Facade facade = new Facade();

        System.out.println("1. Place bid on meat item");
        System.out.println("2. Place bid on produce item");
        int choice = sc.nextInt();
        String bid;

        switch(choice) {
            case 1:
            System.out.println();
            System.out.println("Enter name from existing list of meats:");
            bid = sc.next();
            bid = username + ":" + bid;
            facade.addOffering(bid);
            break;

            case 2:
            System.out.println();
            System.out.println("Enter name from existing list of produce:");
            bid = sc.next();
            bid = username + ":" + bid;
            facade.addOffering(bid);
            break;
        }
    }

    public void buyerMain(String username) throws IOException {

        this.username = username;

        while(true) {
            System.out.println("What would you like to do:");
            System.out.println("1. View menu");
            System.out.println("2. Place Bid");
            System.out.println("99. Logout");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                System.out.println();
                showMenu();
                break;

                case 2:
                System.out.println();
                placeBid();
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
