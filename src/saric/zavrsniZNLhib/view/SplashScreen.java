/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.view;

import javax.swing.JOptionPane;
import saric.zavrsniZNLhib.controller.ObradaIgrac;
import saric.zavrsniZNLhib.controller.ObradaMomcad;
import saric.zavrsniZNLhib.controller.ObradaOperater;
import saric.zavrsniZNLhib.model.Operater;

/**
 *
 * @author Profesor
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();

        ProvjeriSpajanjeNaBazu p = new ProvjeriSpajanjeNaBazu();
        p.start();
        
        

    }

    private class ProvjeriSpajanjeNaBazu extends Thread {

       
        

        @Override
        public void run() {

            lblPoruka.setText("Inicijaliziram....");
            for (int i = 1; i < 50; i++) {
                jProgressBar1.setValue(i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                }
            }

            lblPoruka.setText("Spajam se na bazu...");
            if (new ObradaMomcad().getLista().size() > 0) {
                lblPoruka.setText("Uspješno, startam program..");
                for (int i = 50; i <= 100; i++) {
                    jProgressBar1.setValue(i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                    }
                }
                //idi dalje
                new Login().setVisible(true);
                dispose();
            } else {
                //javi da nešto ne valja
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        lblPoruka = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saric/zavrsniZNLhib/view/slika_za_splash.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblPoruka;
    // End of variables declaration//GEN-END:variables
}
