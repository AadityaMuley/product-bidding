// Iterator pattern
// Functions on the bid offerings placed by buyers and locked by sellers

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class OfferingIterator implements ListIterator {

    public boolean hasNext() {
        return(true);
    }

    public void moveToHead() {}

    // Adds a bid offering by a buyer
    public void add(String offering) {
        OfferingList.offerings.add(offering);
    }

    // Adds a locked bid by Seller to UserProduct.txt and then deletes it from the ArrayList offerings
    public void remove(String offering) {

        try {
            File userProduct = new File("data/UserProduct.txt");
            FileWriter fw = new FileWriter(userProduct, true);
            fw.append("\n" + OfferingList.offerings.get((Integer.parseInt(offering) - 1)));
            fw.flush();
            fw.close();
        } 
        catch (Exception e) {
            System.err.println(e);
        }

        OfferingList.offerings.remove((Integer.parseInt(offering) - 1));
    }
    
    // Returns the current offerings list
    public ArrayList<String> getList() {
        return(OfferingList.offerings);
    }

    // Displays the current offerings list
    public void displayOfferings() {
        for(int i=0; i<OfferingList.offerings.size(); i++) {
            System.out.println((i+1) + ". " + OfferingList.offerings.get(i));
        }
    }
}
