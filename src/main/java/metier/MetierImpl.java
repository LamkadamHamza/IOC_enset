package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements  IMetier{

    @Autowired
    @Qualifier("V1")
    private IDao dao;
    @Override
    public double calcul() {
        double date=dao.getDate();
        double res =date*33.4;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
