/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;

import java.util.List;
import saric.zavrsniZNLhib.model.Utakmica;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ObradaSucelje;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaUtakmica extends Obrada<Utakmica> implements ObradaSucelje<Utakmica> {
    
    public ObradaUtakmica (){
        super();
    }

    @Override
    public List<Utakmica> getLista() {
    return HibernateUtil.getSession().createQuery("from Utakmica").list();
    }

    @Override
    public Utakmica spremi(Utakmica ut) throws ZavrsniZNLhibException {
        kontrola(ut);
        return dao.save(ut);
    }

    @Override
    public void obrisi(Utakmica ut) throws ZavrsniZNLhibException {
        if(!ut.getDogadajiUtakmica().isEmpty()){
            throw new ZavrsniZNLhibException("Ne možete obrisati utakmicu jer su se na njoj događali događaji");
        }
        
        dao.delete(ut);
    }

    @Override
    public void kontrola(Utakmica ut) throws ZavrsniZNLhibException {
        if(ut.getDomaci().toString().equals("Odaberite momčad") || ut.getGosti().toString().equals("Odaberite momčad")){
            throw new ZavrsniZNLhibException("Morate odabrati momčadi");
        }
        
        if(ut.getDomaci().toString().equals(ut.getGosti().toString())){
            throw new ZavrsniZNLhibException("Momčadi moraju biti različite");
        }
        
        
        if(ut.getRezultat()==null){
            throw new ZavrsniZNLhibException("Rezultat nije definiran");
        }
        if(ut.getRezultat().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Rezultat nije unesen");
        }
       
        
        
        if(ut.getGlavni_sudac()==null){
            throw new ZavrsniZNLhibException("Glavni sudac nije postavljen");
        }
       
        if(ut.getPrvi_pomocni()==null){
            throw new ZavrsniZNLhibException("1. pomoćni sudac nije postavljen");
        }
        
        
        if(ut.getDrugi_pomocni()==null){
            throw new ZavrsniZNLhibException("2. pomoćni sudac nije postavljen");
        }
        
        if(ut.getGlavni_sudac().toString().equals(ut.getPrvi_pomocni().toString()) ||
                ut.getGlavni_sudac().toString().equals(ut.getDrugi_pomocni().toString()) ||
                ut.getGlavni_sudac().toString().equals(ut.getPrvi_pomocni().toString())){
            throw new ZavrsniZNLhibException("Suci moraju biti različiti");
        }
        
        if(ut.getPocetak()==null){
            throw new ZavrsniZNLhibException("Datum početka nije definiran");
        }
        if(ut.getPocetak().toString().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Datum početka nije unesen");
        }
        
        
        
        

    }
    
}
