import java.io.FileNotFoundException;

public class Facade {

    int userType;
    int productType;

    public void login() throws FileNotFoundException {
        Login login = new Login();
        boolean check = login.buyerLogin("tutu:1111");
        check = login.sellerLogin("pepe:3333");
    }

    
}
