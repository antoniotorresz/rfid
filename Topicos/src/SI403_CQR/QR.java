/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI403_CQR;
import com.barcodelib.barcode.QRCode;
import java.io.File;

/**
 *
 * @author REDONDO
 */
public class QR {
    
    QRCode rubs = new QRCode();
    
    public void crearQR(String c, String n) throws Exception{
        rubs.setData(c); //metemos lo que va a tener el qr, como la direccion o algo así
        rubs.setDataMode(QRCode.MODE_BYTE); // el modo de datos que contendrá en QR
        rubs.setUOM(0); //la unidad de medida que vamos a utilizar
        rubs.setLeftMargin(5);
        rubs.setResolution(0);
        rubs.setRightMargin(5);
        rubs.setTopMargin(5);
        rubs.setBottomMargin(5);
        
        rubs.setRotate(0);
        rubs.setModuleSize(8);
        
        File a = new File("./src/SI403_CBarras/" + n + ".gif");
        rubs.renderBarcode("./src/SI403_CBarras/" + n + ".gif");
        
    }
    
}
