package singleton_aop;

/**
 *
 * @author joanm
 */
public aspect SingletonAspect {

    private static DatabaseConnectionManager instance =
            new DatabaseConnectionManager();

    pointcut constructorCall() :
        call(DatabaseConnectionManager.new(..));

    before() : constructorCall() {
        throw new IllegalStateException(
            "No se puede crear más de una instancia. Use getInstance()."
        );
    }

    public static DatabaseConnectionManager DatabaseConnectionManager.getInstance() {
        return instance;
    }
}