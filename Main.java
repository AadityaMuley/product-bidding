import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);
    
    Facade facade = new Facade();
    public static void main(String[] args) throws FileNotFoundException{

        System.out.println("Enter 0 for Buyer and 1 for Seller");
        int userType = sc.nextInt();

        System.out.println("Enter your username: ");
        String username = sc.next();

        System.out.println("Enter your password: ");
        String password = sc.next();

        Facade facade = new Facade();
        facade.login(userType, username, password);
    }
}
