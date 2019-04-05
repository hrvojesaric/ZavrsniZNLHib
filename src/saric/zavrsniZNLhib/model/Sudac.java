/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Polaznik
 */
@Entity
@Table
public class Sudac extends Entitet implements Serializable {
    
    private String prezime;
    private String ime;
    private String broj_licence;
    @Temporal(TemporalType.DATE)
    private Date datumrodenja;

    @OneToMany(mappedBy = "glavni_sudac")
    private List<Utakmica> utakmiceglavni=new ArrayList<>();

    public List<Utakmica> getUtakmiceGlavni() {
        return utakmiceglavni;
    }

    public void setUtakmiceGlavni (List<Utakmica> utakmiceglavni) {
        this.utakmiceglavni = utakmiceglavni;
    }
    
    @OneToMany(mappedBy = "prvi_pomocni")
    private List<Utakmica> utakmiceprvipomocni=new ArrayList<>();

    public List<Utakmica> getUtakmicePrviPomocni() {
        return utakmiceprvipomocni;
    }

    public void setUtakmicePrviPomocni (List<Utakmica> utakmiceprvipomocni) {
        this.utakmiceprvipomocni = utakmiceprvipomocni;
    }
    
    @OneToMany(mappedBy = "drugi_pomocni")
    private List<Utakmica> utakmicedrugipomocni=new ArrayList<>();

    public List<Utakmica> getUtakmiceDrugiPomocni() {
        return utakmicedrugipomocni;
    }

    public void setUtakmiceDrugiPomocni (List<Utakmica> utakmicedrugipomocni) {
        this.utakmicedrugipomocni = utakmicedrugipomocni;
    }
    
    
    
    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getBroj_licence() {
        return broj_licence;
    }

    public void setBroj_licence(String broj_licence) {
        this.broj_licence = broj_licence;
    }

    public Date getDatumrodenja() {
        return datumrodenja;
    }

    public void setDatumrodenja(Date datumrodenja) {
        this.datumrodenja = datumrodenja;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
    
    
    
    
    
}
