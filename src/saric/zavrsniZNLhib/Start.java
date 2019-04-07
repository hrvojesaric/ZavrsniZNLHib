package saric.zavrsniZNLhib;

// domaća zadaća:
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import saric.zavrsniZNLhib.controller.ObradaIgrac;
import saric.zavrsniZNLhib.controller.ObradaOperater;
import saric.zavrsniZNLhib.controller.ObradaSudac;
import saric.zavrsniZNLhib.model.Igrac;
import saric.zavrsniZNLhib.model.Operater;
import saric.zavrsniZNLhib.model.Sudac;
import saric.zavrsniZNLhib.pomocno.BCrypt;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;
import saric.zavrsniZNLhib.view.Login;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        new Login().setVisible(true);
//        HibernateUtil.getSession();

//                ObradaIgrac os = new ObradaIgrac();
//
//        Igr s = null;
//        List<Sudac> lista = new ArrayList<>();
//        Faker f = new Faker();
//        GregorianCalendar v = new GregorianCalendar(1993, 10, 10);
//        Date d = new Date();
//        d.setTime(v.getTimeInMillis());
//        s.setDatumrodenja(d);
//        for (int i = 0; i < 100; i++) {
//
//            s = new Sudac();
//            s.setIme(f.name().firstName());
//            s.setPrezime(f.name().lastName());
//            s.setBroj_licence("321312");
//            s.setDatumrodenja(d);
//                           
//            lista.add(s);
//           
//        }
//        
//         try {
//                os.spremi(lista);
//            } catch (ZavrsniZNLhibException ex) {
//                ex.printStackTrace();
//            }
//        }
//        ObradaIgrac oi = new ObradaIgrac();
//
//        Igrac ig;
//        List<Igrac> lista = new ArrayList<>();
//        Faker f = new Faker();
//        GregorianCalendar v = new GregorianCalendar(1993, 10, 10);
//        Date d = new Date();
//        d.setTime(v.getTimeInMillis());
//      
//        for (int i = 0; i < 300; i++) {
//
//            ig = new Igrac();
//            ig.setIme(f.name().firstName());
//            ig.setPrezime(f.name().lastName());
//            ig.setBroj_licence("321312");
//            ig.setDatumrodenja(d);
//                           
//            lista.add(ig);
//           
//        }

//        try {
//            oi.spremi(lista);
//        } catch (ZavrsniZNLhibException e) {
//            e.printStackTrace();
//        }


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
    }}


