/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokobuku.login;

import com.mycompany.tokobuku.view.FormBuku;
import com.mycompany.tokobuku.view.FormPenerbit;
import com.mycompany.tokobuku.view.PetugasForm;

/**
 *
 * @author acer
 */
public class menuSupervisor extends javax.swing.JFrame {

    /**
     * Creates new form menuSupervisor
     */
    public menuSupervisor() {
        initComponents();
         this.setTitle("Menu Supervisor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnstaf = new javax.swing.JButton();
        btnbuk = new javax.swing.JButton();
        btnpenerbit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnstaf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnstaf.setText("Management");
        btnstaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstafActionPerformed(evt);
            }
        });

        btnbuk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbuk.setText("Buku");
        btnbuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbukActionPerformed(evt);
            }
        });

        btnpenerbit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnpenerbit.setText("Penerbit");
        btnpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenerbitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang");

        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlogout.setText("Log Out");
        btnlogout.setMaximumSize(new java.awt.Dimension(61, 25));
        btnlogout.setMinimumSize(new java.awt.Dimension(61, 25));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TOKOBUKU.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnstaf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuk)
                        .addGap(18, 18, 18)
                        .addComponent(btnpenerbit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstaf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbukActionPerformed
        // TODO add your handling code here:
        FormBuku buku = new FormBuku();
        buku.setVisible(true);
        this.setVisible(false);
        buku.btnback1.setVisible(true);
        buku.btnback2.setVisible(false);
    }//GEN-LAST:event_btnbukActionPerformed

    private void btnstafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstafActionPerformed
        // TODO add your handling code here:
        PetugasForm petugas = new PetugasForm();
        petugas.setVisible(true);
        this.setVisible(false);
        
       
    }//GEN-LAST:event_btnstafActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        loginFrame login  = new loginFrame();
        login.setVisible(true);
        this.setVisible(false);
       
        
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenerbitActionPerformed
        // TODO add your handling code here:
        FormPenerbit penerbit = new FormPenerbit();
        penerbit.setVisible(true);
        this.setVisible(false);
        penerbit.btnback1.setVisible(true);
       penerbit.btnback2.setVisible(false);
    }//GEN-LAST:event_btnpenerbitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuk;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnpenerbit;
    private javax.swing.JButton btnstaf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label4;
    // End of variables declaration//GEN-END:variables
}
