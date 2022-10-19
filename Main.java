import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    
    Facade facade = new Facade();
    public static void main(String[] args) throws FileNotFoundException{
        Facade facade = new Facade();
        facade.login();
    }
}
