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
import javax.swing.DefaultComboBoxModel;

import javax.swing.DefaultListModel;

/**
 *
 * @author theop_e0sot23
 */
public class Profils extends javax.swing.JPanel {

    /**
     * Creates new form Profils
     */
    public Profils() {
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

        jDialogAjoutProfil = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNomProfil = new javax.swing.JTextField();
        jTextFieldTelProfil = new javax.swing.JTextField();
        jTextFieldPrenomProfil = new javax.swing.JTextField();
        jTextFieldMdp = new javax.swing.JTextField();
        jTextFieldMailProfil = new javax.swing.JTextField();
        jButtonAddPersonnel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCatAddP = new javax.swing.JComboBox<>();
        jButtonAdmin = new javax.swing.JButton();
        jButtonAddProfils = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProfils = new javax.swing.JList<>();
        jButtonAgent = new javax.swing.JButton();

        jLabel5.setText("Categorie");

        jTextFieldNomProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomProfilActionPerformed(evt);
            }
        });

        jButtonAddPersonnel.setText("Ajouter");
        jButtonAddPersonnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPersonnelActionPerformed(evt);
            }
        });

        jLabel6.setText("mail");

        jLabel1.setText("Nom");

        jLabel2.setText("Prenom");

        jLabel3.setText("Mot de passe");

        jLabel4.setText("Tel");

        jComboBoxCatAddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCatAddPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogAjoutProfilLayout = new javax.swing.GroupLayout(jDialogAjoutProfil.getContentPane());
        jDialogAjoutProfil.getContentPane().setLayout(jDialogAjoutProfilLayout);
        jDialogAjoutProfilLayout.setHorizontalGroup(
            jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAjoutProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogAjoutProfilLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCatAddP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogAjoutProfilLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMailProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogAjoutProfilLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMdp))
                    .addGroup(jDialogAjoutProfilLayout.createSequentialGroup()
                        .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTelProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrenomProfil)
                            .addComponent(jTextFieldNomProfil))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jDialogAjoutProfilLayout.setVerticalGroup(
            jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogAjoutProfilLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrenomProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMailProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogAjoutProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCatAddP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddPersonnel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButtonAdmin.setText("Admins");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        jButtonAddProfils.setText("Ajouter");
        jButtonAddProfils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProfilsActionPerformed(evt);
            }
        });

        jListProfils.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jListProfils);

        jButtonAgent.setText("Agents");
        jButtonAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddProfils)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdmin)
                    .addComponent(jButtonAgent)
                    .addComponent(jButtonAddProfils))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void init(){
        profilBDD();
    }
    
    /**
     * Recupere les type de profils dispo
     */
    public void profilBDD(){
        DefaultComboBoxModel cat = (DefaultComboBoxModel) jComboBoxCatAddP.getModel();
        ResultSet requete = DaoSIO.getInstance().requeteSelection("select * from profil");
        try{
            while(requete.next()){
                CategorieCombo cc = new CategorieCombo(requete.getString("idProfil"), requete.getString("libelle"));
                cat.addElement(cc);
            }
        } catch(SQLException ex) {
            Logger.getLogger(ProduitList.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }
    
    /**
     * Affiche les admins enregistré dans la base de donnée
     * @param evt 
     */
    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        DefaultListModel produit = (DefaultListModel) jListProfils.getModel();
        produit.clear();
        if(Connection.connecte != 0){
            try {
                ResultSet lesDonnees = DaoSIO.getInstance().requeteSelection("select * from personel where idProfil = 1");
                while(lesDonnees.next()){
                    StringBuilder sb = new StringBuilder();
                    sb.append(lesDonnees.getString("idPersonnel")).append(", Nom : ");
                    sb.append(lesDonnees.getString("nom")).append(", Prenom : ");
                    sb.append(lesDonnees.getString("prenom")).append(", Tel : ");
                    sb.append(lesDonnees.getInt("telephone")).append(", Mail : ");
                    sb.append(lesDonnees.getString("mail"));
                    produit.addElement(sb.toString());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProduitList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonAdminActionPerformed

    /**
     * Affiche la page de création de profils
     * @param evt 
     */
    private void jButtonAddProfilsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProfilsActionPerformed
        jDialogAjoutProfil.setVisible(true);
        jDialogAjoutProfil.setSize(400, 400);
    }//GEN-LAST:event_jButtonAddProfilsActionPerformed

    
    /**
     * Permet d'afficher les agents enregistré dans la base de donnée
     * @param evt 
     */
    private void jButtonAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgentActionPerformed
        DefaultListModel produit = (DefaultListModel) jListProfils.getModel();
        produit.clear();
        if(Connection.connecte != 0){
            try {
                ResultSet lesDonnees = DaoSIO.getInstance().requeteSelection("select * from personel where idProfil = 2");
                while(lesDonnees.next()){
                    StringBuilder sb = new StringBuilder();
                    sb.append(lesDonnees.getString("idPersonnel")).append(", Nom : ");
                    sb.append(lesDonnees.getString("nom")).append(", Prenom : ");
                    sb.append(lesDonnees.getString("prenom")).append(", mdp : ");
                    sb.append(lesDonnees.getString("mdp")).append(", Tel : ");
                    sb.append(lesDonnees.getInt("telephone")).append(", Mail : ");
                    sb.append(lesDonnees.getString("mail"));
                    produit.addElement(sb.toString());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProduitList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonAgentActionPerformed

    private void jTextFieldNomProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomProfilActionPerformed

    
    /**
     * Ajoute un nouveu personnel dans la base de donnée
     * @param evt 
     */
    private void jButtonAddPersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPersonnelActionPerformed
        CategorieCombo cca = (CategorieCombo) jComboBoxCatAddP.getSelectedItem();
        int ajouter = DaoSIO.getInstance().requeteAction("insert into personel(nom, prenom, telephone, mdp, mail, idProfil) values ('" + jTextFieldNomProfil.getText() + "', '"+ jTextFieldPrenomProfil.getText() +"', '"+ jTextFieldTelProfil.getText() +"', '"+ jTextFieldMdp.getText() + "', '" + jTextFieldMailProfil.getText() +"', '"+ cca.getId() +"')");
    }//GEN-LAST:event_jButtonAddPersonnelActionPerformed

    private void jComboBoxCatAddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCatAddPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCatAddPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPersonnel;
    private javax.swing.JButton jButtonAddProfils;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonAgent;
    private javax.swing.JComboBox<String> jComboBoxCatAddP;
    private javax.swing.JDialog jDialogAjoutProfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListProfils;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldMailProfil;
    private javax.swing.JTextField jTextFieldMdp;
    private javax.swing.JTextField jTextFieldNomProfil;
    private javax.swing.JTextField jTextFieldPrenomProfil;
    private javax.swing.JTextField jTextFieldTelProfil;
    // End of variables declaration//GEN-END:variables
}
