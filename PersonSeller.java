import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PersonSeller extends Person {
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

    public void sellerMain() throws IOException {

        boolean loop = true;
        while(loop == true) {
            System.out.println("What would you like to do:");
            System.out.println("1. View menu");
            System.out.println("2. Add your listing");
            System.out.println("99. Exit");
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

                case 99:
                System.out.println("Bye!");
                loop = false;
                break;
            }
        }
        
    }
}
