package saric.zavrsniZNLhib;

// domaća zadaća:

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import saric.zavrsniZNLhib.controller.ObradaIgrac;
import saric.zavrsniZNLhib.controller.ObradaOperater;
import saric.zavrsniZNLhib.model.Igrac;
import saric.zavrsniZNLhib.model.Operater;
import saric.zavrsniZNLhib.pomocno.BCrypt;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;
import saric.zavrsniZNLhib.view.Login;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        new Login().setVisible(true);
        HibernateUtil.getSession();
       
//        Operater o = new Operater();
//      o.setEmail("hrvoje.saric93@gmail.com");
//      o.setLozinka(BCrypt.hashpw("h", BCrypt.gensalt()));
//        System.out.println(o.getLozinka());
//      o.setIme("Hrvoje");
//      o.setPrezime("Šarić");
//      
//        ObradaOperater oo = new ObradaOperater();
//        try {
//            oo.spremi(o);
//        } catch (ZavrsniZNLhibException ex) {
//           ex.printStackTrace();
//        }
        
    }
    
}
