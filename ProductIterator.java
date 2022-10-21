import java.util.ArrayList;

public class ProductIterator implements ListIterator {
    
    public boolean hasNext() {
        return(true);
    }

    public void moveToHead() {}

    public void add(String product) {
        ProductList.products.add(product);
    }

    public void remove(String product) {
        ProductList.products.remove(product);
    }
    
    public ArrayList<String> getList() {
        return(ProductList.products);
    }
}
