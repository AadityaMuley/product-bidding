import java.io.FileNotFoundException;
import java.io.IOException;

public interface Product {
    
    public void showMenu() throws FileNotFoundException;

    public void createProduct() throws IOException;
}
