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
    return HibernateUtil.getSession().createQuery("from Urakmica").list();
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
        if(ut.getRezultat()==null){
            throw new ZavrsniZNLhibException("Rezultat nije definiran");
        }
        if(ut.getRezultat().trim().isEmpty()){
            throw new ZavrsniZNLhibException("Rezultat nije unesen");
        }

    }
    
}
