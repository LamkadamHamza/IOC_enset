package dao;

import org.springframework.stereotype.Component;

@Component("V1")
public class DaoImplV1 implements IDao{
    @Override
    public double getDate() {
        System.out.println("version base de donner ......");
        double date= 34;
        return date;
    }
}
