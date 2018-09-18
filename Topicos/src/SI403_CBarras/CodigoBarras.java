package SI403_CBarras;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Code128;
import net.sourceforge.jbarcodebean.model.Code39;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import javax.imageio.ImageIO;
/**
 *
 * @author REDONDO
 */
public class CodigoBarras {

    JBarcodeBean cb=new JBarcodeBean();
    
    public void crear128(String c) throws IOException{
        cb.setCodeType(new Code128());
        cb.setCode(c);
        cb.setCheckDigit(true);
        
        BufferedImage bi=cb.draw(new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB));
        
        File f=new File("./src/SI403_CBarras/"+c+".png");
        ImageIO.write(bi,"png", f);
        
//        Desktop d=Desktop.getDesktop();
//        d.open(f);
    }
    
    public void crear39(String c) throws IOException{
        cb.setCodeType(new Code39());
        cb.setCode(c);
        cb.setCheckDigit(false);
        
        BufferedImage bi=cb.draw(new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB));
        
        File f=new File("./src/SI403_CBarras/"+c+".jpg");
        ImageIO.write(bi,"jpg", f);
        
//        Desktop d=Desktop.getDesktop();
//        d.open(f);
    }
    
    
    
    
}
