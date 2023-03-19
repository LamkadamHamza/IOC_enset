package metier;

import dao.HDMI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdaptateurImpl implements Iadapteteur{

    @Autowired
    private HDMI hdmi;


    @Override
    public String adapter() {

        return null;
    }
}
