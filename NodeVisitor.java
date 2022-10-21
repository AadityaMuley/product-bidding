// Visitor pattern
// Abstract class of visitor

public abstract class NodeVisitor {

    int selectedBid;

    public abstract void visitProduct(Product product);

    public abstract void visitTrading(Trading trading);

    public abstract void visitFacade(Facade facade);
}
