/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.view;

import javax.swing.JOptionPane;
import saric.zavrsniZNLhib.controller.ObradaOperater;
import saric.zavrsniZNLhib.model.Operater;

/**
 *
 * @author Hrvoje-PC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtKorisnickoIme = new javax.swing.JTextField();
        pwdLozinka = new javax.swing.JPasswordField();
        btnPrijava = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblOpis = new javax.swing.JLabel();
        lblOpis2 = new javax.swing.JLabel();
        lblRegistracija = new javax.swing.JLabel();
        btnRegistracija = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2. ŽNL Požeško - slavonska");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(480, 217));
        setPreferredSize(new java.awt.Dimension(490, 355));

        jPanel1.setMinimumSize(new java.awt.Dimension(480, 317));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 317));
        jPanel1.setLayout(null);

        txtKorisnickoIme.setForeground(new java.awt.Color(102, 102, 102));
        txtKorisnickoIme.setText("korisnickoime@email.com");
        txtKorisnickoIme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKorisnickoImeMouseClicked(evt);
            }
        });
        jPanel1.add(txtKorisnickoIme);
        txtKorisnickoIme.setBounds(300, 60, 160, 20);

        pwdLozinka.setForeground(new java.awt.Color(102, 102, 102));
        pwdLozinka.setText("unesitelozinku");
        pwdLozinka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdLozinkaMouseClicked(evt);
            }
        });
        jPanel1.add(pwdLozinka);
        pwdLozinka.setBounds(300, 90, 160, 20);

        btnPrijava.setText("Prijavi se");
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrijava);
        btnPrijava.setBounds(360, 130, 100, 23);

        lblLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Dobro došli !");
        jPanel1.add(lblLogin);
        lblLogin.setBounds(80, 10, 160, 40);

        lblOpis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOpis.setForeground(new java.awt.Color(255, 255, 255));
        lblOpis.setText("Koristite aplikaciju za praćenje 2. ŽNL");
        jPanel1.add(lblOpis);
        lblOpis.setBounds(30, 140, 290, 30);

        lblOpis2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblOpis2.setForeground(new java.awt.Color(255, 255, 255));
        lblOpis2.setText("Požeško - slavonske županije");
        jPanel1.add(lblOpis2);
        lblOpis2.setBounds(30, 160, 280, 40);

        lblRegistracija.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblRegistracija.setForeground(new java.awt.Color(153, 204, 255));
        lblRegistracija.setText("Nemaš korisničke podatke? ");
        jPanel1.add(lblRegistracija);
        lblRegistracija.setBounds(150, 260, 190, 40);

        btnRegistracija.setText("Registriraj se");
        btnRegistracija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistracijaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistracija);
        btnRegistracija.setBounds(340, 270, 130, 20);

        lblPoruka.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPoruka.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lblPoruka);
        lblPoruka.setBounds(284, 170, 180, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saric/zavrsniZNLhib/view/50261747_10218473344087494_4561425864452997120_n.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        ObradaOperater oo = new ObradaOperater();
        Operater o = oo.autoriziraj(txtKorisnickoIme.getText(), String.valueOf(pwdLozinka.getPassword()));
        if (o != null) {
            new Izbornik(o).setVisible(true);
            dispose();
        } else {
            lblPoruka.setText("Neispravan email ili lozinka");
            txtKorisnickoIme.setText("korisnickoime@email.com");
            pwdLozinka.setText("..........");

        }

    }//GEN-LAST:event_btnPrijavaActionPerformed

    private void txtKorisnickoImeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKorisnickoImeMouseClicked
        txtKorisnickoIme.setText("");
    }//GEN-LAST:event_txtKorisnickoImeMouseClicked

    private void pwdLozinkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwdLozinkaMouseClicked
        pwdLozinka.setText("");
    }//GEN-LAST:event_pwdLozinkaMouseClicked

    private void btnRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistracijaActionPerformed
        new Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistracijaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrijava;
    private javax.swing.JButton btnRegistracija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblOpis;
    private javax.swing.JLabel lblOpis2;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JLabel lblRegistracija;
    private javax.swing.JPasswordField pwdLozinka;
    private javax.swing.JTextField txtKorisnickoIme;
    // End of variables declaration//GEN-END:variables
}
