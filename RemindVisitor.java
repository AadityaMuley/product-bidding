// Visitor pattern
// Concrete visitor sub-class

import java.util.Scanner;

public class RemindVisitor extends NodeVisitor {

    Scanner sc = new Scanner(System.in);
    
    // visits Facade class to remove a locked bid
    public void visitFacade(Facade facade) {
        System.out.println("Enter the seriel number of the bid you wish to lock the trade:");
        selectedBid = sc.nextInt();
        facade.removeOffering(selectedBid);
    }

    public void visitProduct(Product product) {}

    public void visitTrading(Trading trading) {}
}
