/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import saric.zavrsniZNLhib.model.Igrac;
import saric.zavrsniZNLhib.controller.ObradaIgrac;
import saric.zavrsniZNLhib.controller.ObradaMomcad;
import saric.zavrsniZNLhib.model.Momcad;
import saric.zavrsniZNLhib.pomocno.Pomocno;
import saric.zavrsniZNLhib.pomocno.ZavrsniZNLhibException;

/**
 *
 * @author Profesor
 */
public class Igraci extends javax.swing.JFrame {

    private ObradaIgrac obradaEntitet;
    private static DefaultComboBoxModel<Momcad> modelMomcad;
    private static final String NEMA_SLIKU=Pomocno.getPutanjaAplikacije() + 
                "slike" + File.separator + "nemaSlike.jpg";

    /**
     * Creates new form Polaznici
     */
    public Igraci() {
        initComponents();
        obradaEntitet = new ObradaIgrac();
        // ucitajEntitete();
        
        ucitajSlikuPolaznika(NEMA_SLIKU);

        DefaultComboBoxModel<Momcad> ms = new DefaultComboBoxModel<>();
        Momcad sm = new Momcad();
        sm.setSifra(0);
        sm.setNaziv("Odaberite momčad");
        ms.addElement(sm);
        new ObradaMomcad().getLista().forEach((s) -> {
            ms.addElement(s);
        });
        cmbMomcadi.setModel(ms);
        ucitajEntitete();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrojregistracije = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBrisanje = new javax.swing.JButton();
        txtIme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        dpcDatumRodenja = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        cmbMomcadi = new javax.swing.JComboBox<>();
        btnOcistiPolja = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblSlika = new javax.swing.JLabel();
        btnDodajFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Igrači");

        jLabel2.setText("Prezime");

        txtPrezime.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setText("Broj registracije");

        txtBrojregistracije.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

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

        jLabel1.setText("Ime");

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        jLabel5.setText("Datum rođenja");

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        chbLimitator.setSelected(true);
        chbLimitator.setText("Limit 50");
        chbLimitator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbLimitatorActionPerformed(evt);
            }
        });

        jLabel6.setText("Momčad");

        cmbMomcadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMomcadiActionPerformed(evt);
            }
        });

        btnOcistiPolja.setText("Očisti polja");
        btnOcistiPolja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPoljaActionPerformed(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(120, 180));

        lblSlika.setMaximumSize(new java.awt.Dimension(120, 180));
        lblSlika.setPreferredSize(new java.awt.Dimension(120, 180));
        lblSlika.setRequestFocusEnabled(false);

        btnDodajFoto.setText("Dodaj foto");
        btnDodajFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDodajFoto))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDodajFoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbLimitator))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromjena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBrisanje))
                            .addComponent(btnOcistiPolja))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrezime)
                                .addComponent(txtBrojregistracije)
                                .addComponent(cmbMomcadi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dpcDatumRodenja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)
                                .addComponent(txtIme))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbLimitator))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojregistracije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMomcadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dpcDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnOcistiPolja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPromjena)
                            .addComponent(btnDodaj)
                            .addComponent(btnBrisanje))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Igrac entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }

        modelMomcad = (DefaultComboBoxModel<Momcad>) cmbMomcadi.getModel();
        for (int i = 0; i < modelMomcad.getSize(); i++) {
            if (modelMomcad.getElementAt(i).getSifra() == entitet.getMomcad().getSifra()) {
                cmbMomcadi.setSelectedIndex(i);
                break;
            }
        }

        Date input = new Date();
        input.setTime(entitet.getDatumrodenja().getTime());
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        dpcDatumRodenja.setDate(date);
        txtIme.setText(entitet.getIme());
        txtPrezime.setText(entitet.getPrezime());
        txtBrojregistracije.setText(entitet.getBroj_licence());
        String putanja=Pomocno.getPutanjaAplikacije()+"slike"+File.separator+entitet.getSifra()+".png";
        if(new File(putanja).exists()){
            ucitajSlikuPolaznika(putanja);
        }else{
            ucitajSlikuPolaznika(NEMA_SLIKU);
        }


    }//GEN-LAST:event_lstEntitetiValueChanged

     private void ucitajSlikuPolaznika(String putanja){
          try {
           Image i = ImageIO.read(new File(putanja));
   // Image i = ImageIO.read(new URL("https://result.issf-sports.info/get_image.php?issfid=SHIRLM2710197001&width=1500"));
        lblSlika.setIcon(new ImageIcon(i.getScaledInstance(120, 180, Image.SCALE_DEFAULT)));
        
        } catch (Exception e) {
        }
    }
    private void ocistiPolja() {
       
        dpcDatumRodenja.setDate(null);
        txtIme.setText("");
        txtPrezime.setText("");
        txtBrojregistracije.setText("");
        cmbMomcadi.setSelectedIndex(0);
        ucitajSlikuPolaznika(NEMA_SLIKU);

    }

    private void preuzmiVrijednosti(Igrac entitet) {
        try {
            Date date = Date.from(dpcDatumRodenja.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            entitet.setDatumrodenja(date);
        } catch (Exception e) {
            entitet.setDatumrodenja(null);
        }

        entitet.setIme(txtIme.getText());
        entitet.setPrezime(txtPrezime.getText());
        entitet.setBroj_licence(txtBrojregistracije.getText());
        entitet.setMomcad((Momcad) cmbMomcadi.getSelectedItem());
         

    }

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Igrac entitet = new Igrac();
        
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

    private void ucitajEntitete() {
        if (chbLimitator.isSelected()) {
            DefaultListModel<Igrac> m = new DefaultListModel<>();
            for (Igrac s : obradaEntitet.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                m.addElement(s);
            }
            lstEntiteti.setModel(m);
        } else {
            DefaultListModel<Igrac> m = new DefaultListModel<>();
            Igrac p = new Igrac();
            p.setIme("Molim");
            p.setPrezime("pričekati");
            m.addElement(p);
            lstEntiteti.setModel(m);
            DuzeUcitanjeEntiteta d = new DuzeUcitanjeEntiteta();
            d.start();
        }

    }

    private class DuzeUcitanjeEntiteta extends Thread {

        @Override
        public void run() {
            DefaultListModel<Igrac> m = new DefaultListModel<>();
            for (Igrac ig : obradaEntitet.getLista(txtUvjet.getText().trim(), chbLimitator.isSelected())) {
                m.addElement(ig);
            }
            lstEntiteti.setModel(m);
        }

    }

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Igrac entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite igrača");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (ZavrsniZNLhibException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistiPolja();

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Igrac entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite igrača");
        }

        try {
            obradaEntitet.obrisi(entitet);
            ucitajEntitete();
            ocistiPolja();
        } catch (ZavrsniZNLhibException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
            
        }

    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        //if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        ucitajEntitete();
        // }
    }//GEN-LAST:event_txtUvjetKeyReleased

    private void chbLimitatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbLimitatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbLimitatorActionPerformed

    private void btnOcistiPoljaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPoljaActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_btnOcistiPoljaActionPerformed

    private void cmbMomcadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMomcadiActionPerformed
        
    }//GEN-LAST:event_cmbMomcadiActionPerformed

    private void btnDodajFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajFotoActionPerformed
         Igrac ig = lstEntiteti.getSelectedValue();
        if(ig==null){
            JOptionPane.showMessageDialog(null,"Prvo odaberi polaznika");
            return;
        }
        
        JFileChooser odaberiSliku = new JFileChooser(System.getProperty("user.home"));
        
        odaberiSliku.setFileFilter(new FileNameExtensionFilter("Slike", "jpg", "png", "gif", "bmp"));
     

        
        if(odaberiSliku.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                Image i = ImageIO.read(odaberiSliku.getSelectedFile());
                
                String putanja = Pomocno.getPutanjaAplikacije()+"slike"+
                        File.separator + ig.getSifra() + ".png";
                
                ImageIO.write((BufferedImage)i, "png", new File(putanja));
                
                ucitajSlikuPolaznika(putanja);
                
            } catch (Exception e) {
            }
            
            
        }
        
      
    }//GEN-LAST:event_btnDodajFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajFoto;
    private javax.swing.JButton btnOcistiPolja;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JComboBox<Momcad> cmbMomcadi;
    private com.github.lgooddatepicker.components.DatePicker dpcDatumRodenja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JList<Igrac> lstEntiteti;
    private javax.swing.JTextField txtBrojregistracije;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
