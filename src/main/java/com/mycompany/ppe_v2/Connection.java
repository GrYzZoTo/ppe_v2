/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ppe_v2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theop_e0sot23
 */
public class Connection extends javax.swing.JFrame {
    
    public Connection() {
        initComponents();
    }

    public static int connecte;
    public static String nom;
    public static int idP;

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Connection.nom = nom;
    }

    public static int getIdP() {
        return idP;
    }

    public static void setIdP(int idP) {
        Connection.idP = idP;
    }


    
    
    /**
     * Creates new form Connection
     */


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConnect = new javax.swing.JButton();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConnect.setText("Entrer");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConnect)
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        try {
            Admin admin = new Admin();
            Agent agent = new Agent();
            ResultSet lesTuples = DaoSIO.getInstance().requeteSelection("select * from personel where prenom = '" + jTextFieldUser.getText() + "' and mdp = '" + jPasswordFieldPass.getText() +"'" );
            ResultSet verifAdmin = DaoSIO.getInstance().requeteSelection("select * from personel where idProfil = 1");
            ResultSet verifAgent = DaoSIO.getInstance().requeteSelection("select * from personel where idProfil = 2");
            
            if(lesTuples.next()){
                String nom = lesTuples.getString("nom");
                int idP = lesTuples.getInt("idPersonnel");
                if(verifAdmin.next()){
                    admin.setVisible(true);
                    agent.setVisible(false);
                    admin.setTitle("Vous êtes connecté en tant qu'admin " + nom);
                    jTextFieldUser.disable();
                    jPasswordFieldPass.disable();
                    admin.setSize(500, 300);
                    connecte = 1;
                }else if(verifAgent.next()){
                    agent.setVisible(true);
                    admin.setVisible(false);
                    agent.setTitle("Vous êtes connecté en tant qu'agent " + nom);
                    jTextFieldUser.disable();
                    jPasswordFieldPass.disable();
                    agent.setSize(500, 300);
                    connecte = 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed

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
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
