// Bridge and Factory Method pattern
// Abstract class to structure Meat and Produce and acts as a polymorphic bridge between Persons and Products

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Product {
    
    public void showMenu() throws FileNotFoundException;

    public void createProduct() throws IOException;
}
