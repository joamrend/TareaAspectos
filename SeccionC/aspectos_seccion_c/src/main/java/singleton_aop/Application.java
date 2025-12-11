package singleton_aop;

/**
 *
 * @author joanm
 */
public class Application {
    public static void main(String[] args) {

        DatabaseConnectionManager manager =
                DatabaseConnectionManager.getInstance();

        manager.connect();
    }
}
