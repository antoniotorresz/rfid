package SI403_CBarras;

import java.io.IOException;

/**
 *
 * @author simon
 */
public class testCBarras {
    public static void main(String[] args) throws IOException {
        CodigoBarras miCB=new CodigoBarras();
        miCB.crear128("17001523");
    }
}
