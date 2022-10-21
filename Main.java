// Facade pattern
// The main class to instantiate the application
// This class calls the Facade class and thus implements the Facade pattern

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{

        System.out.println("Select your choice: "); //User input
        System.out.println("1. Buyer Login");
        System.out.println("2. Seller Login");
        System.out.println("3. Create New User");
        System.out.println("99. Exit application");
        int userType = sc.nextInt() - 1;

        Facade facade = new Facade();
        String username, password;

        switch(userType) {
            
            case 0:

            case 1:
            System.out.println();
            System.out.println("Enter your username: ");
            username = sc.next();
            System.out.println("Enter your password: ");
            password = sc.next();
            facade.login(userType, username, password);
            break;

            case 2:
            System.out.println();
            System.out.println("Enter 0 if you want to create account for Buyer or 1 for Seller: ");
            int choice = sc.nextInt();
            facade.createUser(choice);
            break;

            case 99:
            System.exit(0);
        }
    }
}
