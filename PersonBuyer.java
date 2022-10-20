import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonBuyer extends Person {

    Scanner sc = new Scanner(System.in);

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

    public void buyerMain() throws FileNotFoundException {

        boolean loop = true;
        while(loop == true) {
            System.out.println("What would you like to do:");
            System.out.println("1. View menu");
            System.out.println("99. Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                System.out.println();
                showMenu();
                break;

                case 99:
                System.out.println("Bye!");
                loop = false;
                break;
            }
        }
        
    }
    
}
