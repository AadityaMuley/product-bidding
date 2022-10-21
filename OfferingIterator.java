import java.util.ArrayList;

public class OfferingIterator implements ListIterator {
    
    OfferingList offeringList = new OfferingList();

    public boolean hasNext() {
        return(true);
    }

    public void moveToHead() {}

    public void add(String offering) {
        offeringList.offerings.add(offering);
    }

    public void remove(String offering) {
        offeringList.offerings.remove(offering);
    }
    
    public ArrayList<String> getList() {
        return(offeringList.offerings);
    }
}
