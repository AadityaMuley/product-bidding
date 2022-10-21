import java.io.IOException;


public class Facade {

    int userType;
    String credentials;
    boolean authenticationStatus;
    
    int productType;

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

    public void addOffering(String bid) {

        OfferingIterator offeringIterator = new OfferingIterator();
        offeringIterator.add(bid);
        System.out.println("Bid placed successfully!");
        System.out.println();
    }

    public void displayBids() {
        OfferingIterator offeringIterator = new OfferingIterator();
        offeringIterator.displayOfferings();
        System.out.println();
    }
}
