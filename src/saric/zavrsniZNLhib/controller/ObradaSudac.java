/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import saric.zavrsniZNLhib.model.Sudac;
import saric.zavrsniZNLhib.pomocno.HibernateUtil;
import saric.zavrsniZNLhib.pomocno.ObradaSucelje;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class ObradaSudac extends Obrada<Sudac> implements ObradaSucelje<Sudac> {

    public ObradaSudac() {
        super();
    }

    @Override
    public List<Sudac> getLista() {
        return HibernateUtil.getSession().createQuery("from Sudac").list();
    }

    public List<Sudac> getListaU(String uvjet) {

        Query query = HibernateUtil.getSession().createQuery("from Sudac a "
                + " where concat(a.ime,' ',a.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%");

        query.setMaxResults(10);

        return query.list();
    }

    public List<Sudac> getLista(String uvjet) {

        Query query = HibernateUtil.getSession().createQuery("from Sudac a "
                + " where concat(a.ime,' ',a.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%");

        return query.list();
    }

    @Override
    public Sudac spremi(Sudac su) throws ZavrsniZNLhibException {
        kontrola(su);
        return dao.save(su);
    }

    public List<Sudac> spremi(List<Sudac> suci) throws ZavrsniZNLhibException {

        for (Sudac s : suci) {

        }

        return dao.save(suci);
    }

    @Override
    public void obrisi(Sudac su) throws ZavrsniZNLhibException {
        if (!su.getUtakmiceDrugiPomocni().isEmpty() && !su.getUtakmiceGlavni().isEmpty() && !su.getUtakmicePrviPomocni().isEmpty()) {
            throw new ZavrsniZNLhibException("Sudac se ne može obrisati jer je sudio na utakmicama.");

        }
        dao.delete(su);
    }

    @Override
    public void kontrola(Sudac su) throws ZavrsniZNLhibException {

        if (su.getIme() == null) {
            throw new ZavrsniZNLhibException("Ime nije uneseno");
        }
        if (su.getIme().trim().isEmpty()) {
            throw new ZavrsniZNLhibException("Ime nije uneseno");
        }

        if (su.getPrezime() == null) {
            throw new ZavrsniZNLhibException("Prezime nije uneseno");
        }
        if (su.getPrezime().trim().isEmpty()) {
            throw new ZavrsniZNLhibException("Prezime nije uneseno");
        }
        if (su.getBroj_licence() == null) {
            throw new ZavrsniZNLhibException("Broj licence nije unesen");
        }
        if (!StringUtils.isNumeric(su.getBroj_licence())) {
            throw new ZavrsniZNLhibException("Broj licence mora biti broj");
        }
        if (su.getBroj_licence().trim().isEmpty()) {
            throw new ZavrsniZNLhibException("Broj licence nije unesen");
        }

        if (su.getDatumrodenja() == null) {
            throw new ZavrsniZNLhibException("Datum rođenja nije definiran");
        }
        if (su.getDatumrodenja().toString().trim().isEmpty()) {
            throw new ZavrsniZNLhibException("Datum rođenja nije unesen");
        }
    }

}
