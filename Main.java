import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);
    
    Facade facade = new Facade();
    public static void main(String[] args) throws IOException{

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
