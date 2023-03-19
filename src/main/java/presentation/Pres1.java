package presentation;

import dao.DaoImplV1;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {

        //injection statique
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier= new MetierImpl();
        metier.setDao(dao);
        System.out.println("res ="+ metier.calcul());
    }
}
