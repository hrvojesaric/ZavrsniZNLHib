/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Hrvoje-PC
 */
@Entity
@Table
public class KorisnickiPodaci extends Entitet implements Serializable {
    
    private String korisnicko_ime;
    private String lozinka;
    private int uloga;

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public int getUloga() {
        return uloga;
    }

    public void setUloga(int uloga) {
        this.uloga = uloga;
    }
    
}
