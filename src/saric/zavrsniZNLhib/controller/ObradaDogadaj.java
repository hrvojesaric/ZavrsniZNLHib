/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import saric.zavrsniZNLhib.model.Dogadaj;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ObradaSucelje;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaDogadaj extends Obrada<Dogadaj> implements ObradaSucelje<Dogadaj>{
    
    public ObradaDogadaj (){
        super ();
    }

    @Override
    public List<Dogadaj> getLista() {
        return HibernateUtil.getSession().createQuery("from Dogadaj").list();    }

    @Override
    public Dogadaj spremi(Dogadaj d) throws ZavrsniZNLhibException {
        kontrola(d);
        return dao.save(d);

    }

    @Override
    public void obrisi(Dogadaj d) throws ZavrsniZNLhibException {
        if(d==null){
            throw new ZavrsniZNLhibException("Prvo morate odabrati događaj");
        }
        
        dao.delete(d);
    }

    @Override
    public void kontrola(Dogadaj d) throws ZavrsniZNLhibException {
        
        if(d.getMomcad()==null){
           throw new ZavrsniZNLhibException("Niste odabrali momčad");
        }
        if(d.getUtakmica()==null){
            throw new ZavrsniZNLhibException("Niste odabrali utakmicu");
        }
                
        if(d.getOpis()==null){
            throw new ZavrsniZNLhibException("Opis nije definiran");
        }
        if(d.getOpis().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Opis nije unesen");
        }
        if(d.getVrijeme()==null){
            throw new ZavrsniZNLhibException("Vrijeme događaja nije definirano");
        }
        if(d.getVrijeme().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Vrijeme događaja nije uneseno");
        }
        
        if(!StringUtils.isNumeric(d.getVrijeme().replaceAll("\\.", "").replaceAll("\\,", "")))
                {
            throw new ZavrsniZNLhibException("Unos vremena događaja nije valjan");
            
        }
        
        int min = Integer.parseInt(d.getVrijeme().replaceAll("\\.", "").replaceAll("\\,", ""));
        if(min<0 || min>130){
            throw new ZavrsniZNLhibException("Vrijeme nije u rasponu između 0 i 130");
        }
        
        
    }
    
}
