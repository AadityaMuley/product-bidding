// Visitor pattern
// Locks a bid by user

public class Trading {

    int selectedBid;
    Facade facade;

    // Visitor pattern
    public void accept(NodeVisitor visitor) {
        visitor.visitFacade(facade);
    }
    
    public void tradingMain(Facade facade) {
        this.facade = facade;
        NodeVisitor visitor = new RemindVisitor();
        accept(visitor);
    }
}
