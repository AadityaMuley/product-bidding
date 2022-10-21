// Facade, Iterator, Visitor pattern
// This class is the main class for Facade pattern

import java.io.IOException;

public class Facade {

    int userType; // 0 for Buyer and 1 for Seller
    String credentials;
    boolean authenticationStatus;

    OfferingIterator offeringIterator = new OfferingIterator(); // Object of the OfferingIterator class
                                                                // which is used mainly for Iterator pattern
                                                                // but also used partly for Visitor pattern

    // Function to login the user - Facade pattern
    public void login(int user, String username, String password) throws IOException {

        userType = user;
        credentials = username + ":" + password;

        Login login = new Login();
        if(userType == 0) {
            authenticationStatus = login.buyerLogin(credentials);

            if(authenticationStatus == true) {
                PersonBuyer personBuyer = new PersonBuyer();
                personBuyer.buyerMain(username);
            }
        }
        else {
            authenticationStatus = login.sellerLogin(credentials);
            
            if(authenticationStatus == true) {
                PersonSeller personSeller = new PersonSeller();
                personSeller.sellerMain();
            }
        }
    }

    //Funtion to create a new user - Facade pattern
    public void createUser(int user) throws IOException {

        CreateUser createUser = new CreateUser();

        if(user == 0) {
            createUser.createBuyer();
            System.out.println("New Buyer created! Log in to continue.");
            System.out.println();
        }
        else {
            createUser.createSeller();
            System.out.println("New Seller created! Log in to continue.");
            System.out.println();
        }
        Main.main(null);
    }

    // Iterator pattern - adds the buyer's bid for a specific product to the offerings ArrayList
    public void addOffering(String bid) {
        offeringIterator.add(bid);
        System.out.println("Bid placed successfully!");
        System.out.println();
    }

    // Visitor pattern - seller locks a bid from a buyer and it is removed from the offerings ArrayList
    public void removeOffering(int selectedBid) {
        offeringIterator.remove(Integer.toString(selectedBid));
        System.out.println("Trade locked successfully! Entry is added to UserProduct.txt");
        System.out.println();
    }

    // Iterator pattern + Facade pattern - displays the all the current bids on all the products
    public void displayBids() {
        offeringIterator.displayOfferings();
        System.out.println();
    }
}
