package presentation;

import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws  Exception {
        //injection dynamique
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();


        String metieClassName = sc.nextLine();
        Class cMetie =Class.forName(metieClassName);
        IMetier metier=(IMetier) cMetie.getConstructor().newInstance();


        Method setDao=cMetie.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);

        System.out.println("Res"+ metier.calcul());

    }
}
