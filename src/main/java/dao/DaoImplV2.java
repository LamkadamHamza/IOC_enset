package dao;

import org.springframework.stereotype.Component;

@Component("V2")
public class DaoImplV2 implements IDao{
    @Override
    public double getDate() {
        System.out.println("vesrion de web service");
        double date= 10;
        return date;
    }
}
