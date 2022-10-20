import java.io.FileNotFoundException;


public class Facade {

    int userType;
    String credentials;
    boolean authenticationStatus;
    
    int productType;

    public void login(int user, String username, String password) throws FileNotFoundException {

        userType = user;
        credentials = username + ":" + password;

        Login login = new Login();
        if(userType == 0) {
            authenticationStatus = login.buyerLogin(credentials);

            if(authenticationStatus == true) {
                PersonBuyer personBuyer = new PersonBuyer();
                personBuyer.buyerMain();
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

    
}
