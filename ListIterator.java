// Iterator pattern
// interface for parsing through products and bid offerings

import java.util.ArrayList;

public interface ListIterator {
    
    public boolean hasNext();

    public void moveToHead();

    public void add(String product);

    public void remove(String product);

    public ArrayList<String> getList();
    
}
