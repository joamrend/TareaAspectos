package adapter_aop;

/**
 *
 * @author joanm
 */
public class Client {
    public static void clientCode(Printer printer) {
        printer.print();
    }
    
    public static void main(String[] args) {
        LegacyPrinter legacy = new LegacyPrinter();
            clientCode(legacy);
    }
}
