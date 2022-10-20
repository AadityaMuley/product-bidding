import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Person {
    Product product;

    public abstract void showMenu() throws FileNotFoundException;

    public abstract void createProduct() throws IOException;
}
