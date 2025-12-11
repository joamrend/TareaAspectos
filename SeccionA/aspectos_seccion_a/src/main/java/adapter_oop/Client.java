package adapter_oop;

/**
 *
 * @author joanm
 */
// Client Code
public class Client {
    public static void clientCode(Printer printer) {
        printer.print();
    }

    public static void main(String[] args) {
        // Using the Adapter
        PrinterAdapter adapter = new PrinterAdapter();
        clientCode(adapter);
    }
}
