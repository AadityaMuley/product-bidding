import java.util.ArrayList;

public class OfferingIterator implements ListIterator {

    public boolean hasNext() {
        return(true);
    }

    public void moveToHead() {}

    public void add(String offering) {
        OfferingList.offerings.add(offering);
    }

    public void remove(String offering) {
        OfferingList.offerings.remove(offering);
    }
    
    public ArrayList<String> getList() {
        return(OfferingList.offerings);
    }

    public void displayOfferings() {
        for(int i=0; i<OfferingList.offerings.size(); i++) {
            System.out.println((i+1) + ". " + OfferingList.offerings.get(i));
        }
    }
}
