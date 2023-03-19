package metier;

import dao.HDMI;
import dao.USB;
import dao.VGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniteCentrel implements IuniterCentrale {

    @Autowired
    private HDMI hdmi;
   @Autowired
    private USB usb;
   @Autowired
    private VGA vga;



    @Override
    public int readData() {
        usb.read();
        int a =3;
        System.out.println("red data");
        return 3;
    }

    @Override
    public String printData(String data) {
        String prit=vga.print("pring daata");
        return prit;
    }
}
