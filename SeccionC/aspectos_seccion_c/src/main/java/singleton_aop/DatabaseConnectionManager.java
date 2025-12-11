package singleton_aop;

/**
 *
 * @author joanm
 */
public class DatabaseConnectionManager {

    public DatabaseConnectionManager() {
        // No es privado; AOP se encarga de impedir múltiples instancias.
    }

    public void connect() {
        System.out.println("Conectado a la base de datos.");
    }
}