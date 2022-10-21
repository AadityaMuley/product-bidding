import java.util.ArrayList;

public class ProductIterator implements ListIterator {

    ProductList productList = new ProductList();
    
    public boolean hasNext() {
        return(true);
    }

    public void moveToHead() {}

    public void add(String product) {
        productList.products.add(product);
    }

    public void remove(String product) {
        productList.products.remove(product);
    }
    
    public ArrayList<String> getList() {
        return(productList.products);
    }
}
