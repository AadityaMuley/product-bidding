import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Person {
    Product product;

    public abstract void showMenu() throws FileNotFoundException;

    public void createProduct() throws IOException {}

    public void placeBid() {}

    public void viewBids() {}
}
