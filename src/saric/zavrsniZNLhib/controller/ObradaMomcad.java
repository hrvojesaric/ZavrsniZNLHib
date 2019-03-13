/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;

import java.util.List;
import saric.zavrsniZNLhib.model.Momcad;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ObradaSucelje;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaMomcad extends Obrada<Momcad> implements ObradaSucelje<Momcad> {
    
    public ObradaMomcad (){
        super();
    }

    @Override
    public List<Momcad> getLista() {
        return HibernateUtil.getSession().createQuery("from Momcad").list();
    }

    @Override
    public Momcad spremi(Momcad mo) throws ZavrsniZNLhibException {
        kontrola(mo);
        return dao.save(mo);
    }

    @Override
    public void obrisi(Momcad mo) throws ZavrsniZNLhibException {
        if(!mo.getUtakmiceDomaci().isEmpty() && !mo.getUtakmiceGosti().isEmpty()){
            throw new ZavrsniZNLhibException("Momčad se ne može obrisati jer je sudjelovala na utakmicama");
        }
        if(!mo.getIgraci().isEmpty()){
            throw new ZavrsniZNLhibException("Momčad se ne može obrisati jer sadrži igrače");
        }
        dao.delete(mo);
    }

    @Override
    public void kontrola(Momcad mo) throws ZavrsniZNLhibException {
       
        if(mo.getNaziv()==null){
            throw new ZavrsniZNLhibException("Momčad nije definirana");
        }
        if(mo.getNaziv().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Momčad nije unesena");
        }
    }
    
}
