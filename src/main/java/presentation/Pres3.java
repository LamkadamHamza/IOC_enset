package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3 {
    public static void main(String[] args) {
        ApplicationContext context=new  ClassPathXmlApplicationContext("Config.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("res"+metier.calcul());
    }
}
