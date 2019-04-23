/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import saric.zavrsniZNLhib.model.Igrac;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ObradaSucelje;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaIgrac extends Obrada<Igrac> implements ObradaSucelje<Igrac> {
    
    public ObradaIgrac (){
        super();
    }

    @Override
    public List<Igrac> getLista() {
    return HibernateUtil.getSession().createQuery("from Igrac").list();

    }
    
    
    public List<Igrac> getLista(String uvjet,boolean isSelected){
         
          Query query = HibernateUtil.getSession().createQuery("from Igrac a "
                 + " where concat(a.ime,' ',a.prezime) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(50);
         }
         
         return query.list();
     }


    @Override
    public Igrac spremi(Igrac ig) throws ZavrsniZNLhibException {
        kontrola(ig);
        return dao.save(ig);
    }
    public List<Igrac> spremi(List<Igrac> igraci) throws ZavrsniZNLhibException {

        for (Igrac s : igraci) {
            
        }

        return dao.save(igraci);
    }

    @Override
    public void obrisi(Igrac ig) throws ZavrsniZNLhibException {
        
     dao.delete(ig);
    }
    
    @Override
    public void kontrola(Igrac ig) throws ZavrsniZNLhibException {
        if(ig.getIme()==null){
            throw new ZavrsniZNLhibException("Ime nije uneseno");
        }
        if(ig.getIme().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Ime nije uneseno");
        }
        
        if(ig.getPrezime()==null){
            throw new ZavrsniZNLhibException("Prezime nije uneseno");
        }
        if(ig.getPrezime().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Prezime nije uneseno");
        }
        if(ig.getBroj_licence()==null){
            throw new ZavrsniZNLhibException("Broj licence nije unesen");
        }
        if(!StringUtils.isNumeric(ig.getBroj_licence())){
            throw new ZavrsniZNLhibException("Broj licence mora biti broj");
        }
        if(ig.getBroj_licence().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Broj licence nije unesen");
        }
        
        if(ig.getMomcad().toString().equals("Odaberite momčad")){
        throw new ZavrsniZNLhibException("Prvo morate odabrati momčad");
        }
        if(ig.getDatumrodenja()==null){
            throw new ZavrsniZNLhibException("Datum rođenja nije definiran");
        }
        if(ig.getDatumrodenja().toString().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Datum rođenja nije unesen");
        }
    }
    
}
