/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;

import java.util.List;
import saric.zavrsniZNLhib.model.KorisnickiPodaci;
import saric.zavrsniZNLhib.model.Sudac;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaKorisnickiPodaci extends Obrada<KorisnickiPodaci>{
    
    public ObradaKorisnickiPodaci (){
        super();
    }

    public List<KorisnickiPodaci> getLista() {
        return HibernateUtil.getSession().createQuery("from KorisnickiPodaci").list();
    }
    
    

}
