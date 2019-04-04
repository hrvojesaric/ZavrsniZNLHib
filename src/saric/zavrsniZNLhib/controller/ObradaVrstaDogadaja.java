/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;
import java.util.List;
import saric.zavrsniZNLhib.model.VrstaDogadaja;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ObradaSucelje;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaVrstaDogadaja extends Obrada<VrstaDogadaja> implements ObradaSucelje<VrstaDogadaja>{
    
    public ObradaVrstaDogadaja () {
        super();
    }

    @Override
    public List<VrstaDogadaja> getLista() {
        return HibernateUtil.getSession().createQuery("from VrstaDogadaja").list();    }

    @Override
    public VrstaDogadaja spremi(VrstaDogadaja vd) throws ZavrsniZNLhibException {
        kontrola(vd);
        return dao.save(vd);    
    }

    @Override
    public void obrisi(VrstaDogadaja vd) throws ZavrsniZNLhibException {
        if(!vd.getDogadaji().isEmpty()){
            throw new ZavrsniZNLhibException("Ne možete obrisati vrstu događaja jer se koristi u zapisniku");
        }
        dao.delete(vd);
    }

    @Override
    public void kontrola(VrstaDogadaja vd) throws ZavrsniZNLhibException {
       if(vd.getNaziv()==null){
            throw new ZavrsniZNLhibException("Vrsta događaja nije definirana");
        }
        if(vd.getNaziv().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Vrsta događaja nije unesena"); 
        }
    
    }
}