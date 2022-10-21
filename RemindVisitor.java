import java.util.Scanner;

public class RemindVisitor extends NodeVisitor {

    Scanner sc = new Scanner(System.in);
    
    public void visitFacade(Facade facade) {
        System.out.println("Enter the seriel number of the bid you wish to lock the trade:");
        selectedBid = sc.nextInt();
        facade.removeOffering(selectedBid);
    }
}
