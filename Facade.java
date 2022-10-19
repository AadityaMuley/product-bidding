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
        }
        else {
            authenticationStatus = login.sellerLogin(credentials);
        }
    }

    
}
