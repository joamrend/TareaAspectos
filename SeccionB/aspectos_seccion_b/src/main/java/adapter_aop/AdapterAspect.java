package adapter_aop;

/**
 *
 * @author joanm
 */
public class AdapterAspect {
    declare parents: LegacyPrinter implements Printer;
    
    public void LegacyPrinter.print() {
        this.printDocument();
    }
}
