/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import saric.zavrsniZNLhib.controller.ObradaMomcad;
import saric.zavrsniZNLhib.controller.ObradaSudac;
import saric.zavrsniZNLhib.controller.ObradaUtakmica;
import saric.zavrsniZNLhib.model.Entitet;
import saric.zavrsniZNLhib.model.Momcad;
import saric.zavrsniZNLhib.model.Sudac;
import saric.zavrsniZNLhib.model.Utakmica;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Hrvoje-PC
 */
public class Utakmice extends javax.swing.JFrame {

    private final ObradaUtakmica obradaEntitet;
    private final ObradaSudac obradaSudac;
    private static DefaultComboBoxModel<Momcad> modelDomacin;
    private static DefaultComboBoxModel<Momcad> modelGost;
    private static DefaultComboBoxModel<Sudac> modelGlavni;
    private static DefaultComboBoxModel<Sudac> modelPPomocni;
    private static DefaultComboBoxModel<Sudac> modelDPomocni;
    private static Integer glSuSif = -400;
    private static Integer ppSuSif = -400;
    private static Integer dpSuSif = -400;

    /**
     * Creates new form UtakmiceNovi
     */
    public Utakmice() {
        initComponents();

        obradaEntitet = new ObradaUtakmica();
        obradaSudac = new ObradaSudac();

        ucitajEntitete();
        txtRezultat.setText("0 : 0");
        DefaultComboBoxModel<Momcad> md = new DefaultComboBoxModel<>();
        Momcad smd = new Momcad();
        smd.setSifra(0);
        smd.setNaziv("Odaberite momčad");
        md.addElement(smd);
        new ObradaMomcad().getLista().forEach((s) -> {
            md.addElement(s);
        });
        cmbDomacin.setModel(md);

        DefaultComboBoxModel<Momcad> mg = new DefaultComboBoxModel<>();
        Momcad smg = new Momcad();
        smg.setSifra(0);
        smg.setNaziv("Odaberite momčad");
        mg.addElement(smg);
        new ObradaMomcad().getLista().forEach((s) -> {
            mg.addElement(s);
        });
        cmbGost.setModel(mg);

        DefaultListModel<Sudac> m = new DefaultListModel<>();
        for (Sudac s : obradaSudac.getLista()) {
            m.addElement(s);
        }
        lstSuci.setModel(m);

    }

    private void ucitajPodatke() {
        DefaultListModel<Utakmica> m = new DefaultListModel<>();
        obradaEntitet.getLista().forEach((g) -> {
            m.addElement(g);
        });
        lstEntiteti.setModel(m);
    }

    private void preuzmiVrijednosti(Utakmica u) {
        try {
            Date date = Date.from(dpDatumOdigravanja.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            u.setPocetak(date);
        } catch (Exception e) {
            u.setPocetak(null);
        }

        u.setNaziv(cmbDomacin.getSelectedItem().toString() + " - " + cmbGost.getSelectedItem().toString()
                + " ( " + txtRezultat.getText() + " )");
        u.setDomaci((Momcad) cmbDomacin.getSelectedItem());
        u.setGosti((Momcad) cmbGost.getSelectedItem());
        u.setGlavni_sudac(postaviGlSuca());
        u.setPrvi_pomocni(postaviPPSuca());
        u.setDrugi_pomocni(postaviDPSuca());
        u.setRezultat(txtRezultat.getText());

    }

    private void ocistiPolja() {
        dpDatumOdigravanja.setDate(null);
        txtRezultat.setText("0 : 0");

        txtUvjet.setText("---->Pronađi suca<----");
        cmbDomacin.setSelectedIndex(0);
        cmbGost.setSelectedIndex(0);
        txtGSudac.setText("");
        txtPPomocni.setText("");
        txtDPomocni.setText("");
        lblStadion.setText("Stadion :");
        lstEntiteti.setSelectedValue(null, false);
        lstSuci.setSelectedValue(null, false);
    }

    private void ucitajEntitete() {

        DefaultListModel<Utakmica> u = new DefaultListModel<>();
        for (Utakmica s : obradaEntitet.getLista()) {
            u.addElement(s);
        }
        lstEntiteti.setModel(u);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblStadion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        lblGlavni = new javax.swing.JLabel();
        lblPPomocni = new javax.swing.JLabel();
        lblDPomocni = new javax.swing.JLabel();
        cmbDomacin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbGost = new javax.swing.JComboBox<>();
        txtRezultat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        btnDogadaj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        dpDatumOdigravanja = new com.github.lgooddatepicker.components.DatePicker();
        txtGSudac = new javax.swing.JTextField();
        txtPPomocni = new javax.swing.JTextField();
        txtDPomocni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSuci = new javax.swing.JList<>();
        btnPostaviGlavni = new javax.swing.JButton();
        btnPostaviPPomocni = new javax.swing.JButton();
        btnPostaviDPomocni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Popis utakmica");

        lblStadion.setText("Stadion:");
        lblStadion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setText("Datum odigravanja :");

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstEntiteti);

        lblGlavni.setText("Glavni sudac : ");

        lblPPomocni.setText("1. Pomoćni sudac :");

        lblDPomocni.setText("2. Pomoćni sudac :");

        cmbDomacin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDomacinActionPerformed(evt);
            }
        });

        jLabel7.setText("Domaćin");

        jLabel8.setText("Gost");

        txtRezultat.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setText("Rezultat");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        btnDogadaj.setText("Pogledaj događaje");
        btnDogadaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDogadajActionPerformed(evt);
            }
        });

        txtUvjet.setText("---->Pronađi suca<----");
        txtUvjet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUvjetMouseClicked(evt);
            }
        });
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        jButton1.setText("Očisti Polja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lstSuci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstSuci);

        btnPostaviGlavni.setText("Postavi suca");
        btnPostaviGlavni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostaviGlavniActionPerformed(evt);
            }
        });

        btnPostaviPPomocni.setText("Postavi suca");
        btnPostaviPPomocni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostaviPPomocniActionPerformed(evt);
            }
        });

        btnPostaviDPomocni.setText("Postavi suca");
        btnPostaviDPomocni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostaviDPomocniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBrisanje)
                        .addGap(50, 50, 50)
                        .addComponent(btnDogadaj))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel7)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel10)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDomacin, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cmbGost, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGlavni, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPPomocni, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPPomocni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPostaviPPomocni))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblDPomocni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDPomocni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPostaviDPomocni))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtGSudac, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPostaviGlavni)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStadion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(dpDatumOdigravanja, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDomacin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbGost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUvjet)
                            .addComponent(lblGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGSudac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPostaviGlavni))
                                .addGap(10, 10, 10)
                                .addComponent(lblPPomocni)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPPomocni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPostaviPPomocni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDPomocni)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDPomocni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPostaviDPomocni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpDatumOdigravanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStadion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDogadaj)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPromjena)
                                    .addComponent(btnBrisanje)
                                    .addComponent(btnDodaj))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUvjetMouseClicked
        txtUvjet.setText("");
    }//GEN-LAST:event_txtUvjetMouseClicked

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        DefaultListModel<Sudac> m = new DefaultListModel<>();
        for (Sudac s : obradaSudac.getLista(txtUvjet.getText().trim())) {
            m.addElement(s);
        }
        lstSuci.setModel(m);
    }//GEN-LAST:event_txtUvjetKeyReleased

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Utakmica entitet = new Utakmica();

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (ZavrsniZNLhibException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistiPolja();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Utakmica entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite utakmicu");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (ZavrsniZNLhibException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Utakmica entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite utakmicu");
        }

        try {
            obradaEntitet.obrisi(entitet);
            ucitajEntitete();
            ocistiPolja();
        } catch (ZavrsniZNLhibException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }
    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged

        Utakmica entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }

        modelDomacin = (DefaultComboBoxModel<Momcad>) cmbDomacin.getModel();
        for (int i = 0; i < modelDomacin.getSize(); i++) {
            if (modelDomacin.getElementAt(i).getSifra() == entitet.getDomaci().getSifra()) {
                cmbDomacin.setSelectedIndex(i);
                break;
            }
        }

        modelGost = (DefaultComboBoxModel<Momcad>) cmbGost.getModel();
        for (int i = 0; i < modelGost.getSize(); i++) {
            if (modelGost.getElementAt(i).getSifra() == entitet.getGosti().getSifra()) {
                cmbGost.setSelectedIndex(i);
                break;
            }
        }
        Date input = new Date();
        input.setTime(entitet.getPocetak().getTime());
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        dpDatumOdigravanja.setDate(date);

        txtRezultat.setText(entitet.getRezultat());
        txtGSudac.setText(entitet.getGlavni_sudac().getIme() + " " + entitet.getGlavni_sudac().getPrezime());
        glSuSif=entitet.getGlavni_sudac().getSifra();
        txtPPomocni.setText(entitet.getPrvi_pomocni().getIme() + " " + entitet.getPrvi_pomocni().getPrezime());
        ppSuSif=entitet.getPrvi_pomocni().getSifra();
        txtDPomocni.setText(entitet.getDrugi_pomocni().getIme() + " " + entitet.getDrugi_pomocni().getPrezime());
        dpSuSif=entitet.getDrugi_pomocni().getSifra();
        lblStadion.setText("Stadion :       " + entitet.getDomaci().getStadion());

    }//GEN-LAST:event_lstEntitetiValueChanged

    private void cmbDomacinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDomacinActionPerformed
        ObradaMomcad obradaMomcad = new ObradaMomcad();
        DefaultListModel<Momcad> m = new DefaultListModel<>();
        for (Momcad mo : obradaMomcad.getLista()) {
            if (cmbDomacin.getSelectedItem().toString().equals(mo.toString())) {

                lblStadion.setText("Stadion : " + mo.getStadion());
            }
        }
    }//GEN-LAST:event_cmbDomacinActionPerformed

    private void btnDogadajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDogadajActionPerformed
        new Dogadaji().setVisible(true);
    }//GEN-LAST:event_btnDogadajActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPostaviGlavniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostaviGlavniActionPerformed
        if (lstSuci.getSelectedValue() != null) {
            txtGSudac.setText(lstSuci.getSelectedValue().toString());
            glSuSif = lstSuci.getSelectedValue().getSifra();
        }

    }//GEN-LAST:event_btnPostaviGlavniActionPerformed

    private void btnPostaviPPomocniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostaviPPomocniActionPerformed
        if (lstSuci.getSelectedValue() != null) {
            txtPPomocni.setText(lstSuci.getSelectedValue().toString());
            ppSuSif = lstSuci.getSelectedValue().getSifra();
        }
    }//GEN-LAST:event_btnPostaviPPomocniActionPerformed

    private void btnPostaviDPomocniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostaviDPomocniActionPerformed
        if (lstSuci.getSelectedValue() != null) {
            txtDPomocni.setText(lstSuci.getSelectedValue().toString());
            dpSuSif = lstSuci.getSelectedValue().getSifra();
        }
    }//GEN-LAST:event_btnPostaviDPomocniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDogadaj;
    private javax.swing.JButton btnPostaviDPomocni;
    private javax.swing.JButton btnPostaviGlavni;
    private javax.swing.JButton btnPostaviPPomocni;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JComboBox<Momcad> cmbDomacin;
    private javax.swing.JComboBox<Momcad> cmbGost;
    private com.github.lgooddatepicker.components.DatePicker dpDatumOdigravanja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDPomocni;
    private javax.swing.JLabel lblGlavni;
    private javax.swing.JLabel lblPPomocni;
    private javax.swing.JLabel lblStadion;
    private javax.swing.JList<Utakmica> lstEntiteti;
    private javax.swing.JList<Sudac> lstSuci;
    private javax.swing.JTextField txtDPomocni;
    private javax.swing.JTextField txtGSudac;
    private javax.swing.JTextField txtPPomocni;
    private javax.swing.JTextField txtRezultat;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private Sudac postaviGlSuca() {
        Sudac glSudac = new Sudac();

        DefaultListModel<Sudac> m = new DefaultListModel<>();
        for (Sudac gs : obradaSudac.getLista()) {
            if (glSuSif == gs.getSifra()) {
                glSudac = gs;
                return glSudac;
            }

        }
        return null;
    }

    private Sudac postaviPPSuca() {
        Sudac pPSudac = new Sudac();

        DefaultListModel<Sudac> m = new DefaultListModel<>();
        for (Sudac pps : obradaSudac.getLista()) {
            if (ppSuSif == pps.getSifra()) {
                pPSudac = pps;
                return pPSudac;
            }
        }
        return null;

    }

    private Sudac postaviDPSuca() {
        Sudac dPSudac = new Sudac();

        DefaultListModel<Sudac> m = new DefaultListModel<>();
        for (Sudac dps : obradaSudac.getLista()) {
            if (dpSuSif == dps.getSifra()) {
                dPSudac = dps;
                return dPSudac;
            }
        }
        return null;

    }

}
