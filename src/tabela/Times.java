/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import model.bean.tabela;
import model.dao.TabelaDao;

/**
 *
 * @author betim
 */
public class Times extends javax.swing.JInternalFrame {

    /**
     * Creates new form Times
     */
    public Times() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextPalmeirasc = new javax.swing.JTextField();
        TextPalmeirasf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextSPc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextSPf = new javax.swing.JTextField();
        TextFlaf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextFlac = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextGrec = new javax.swing.JTextField();
        TextGref = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Tnomes = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("Palmeiras");

        jLabel2.setText("Sao Paulo");

        jLabel3.setText("Flamengo");

        jLabel4.setText("Gremio");

        TextPalmeirasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPalmeirascActionPerformed(evt);
            }
        });

        TextPalmeirasf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPalmeirasfActionPerformed(evt);
            }
        });

        jLabel6.setText("x");

        TextSPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSPcActionPerformed(evt);
            }
        });

        jLabel7.setText("x");

        TextSPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSPfActionPerformed(evt);
            }
        });

        TextFlaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFlafActionPerformed(evt);
            }
        });

        jLabel8.setText("x");

        TextFlac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFlacActionPerformed(evt);
            }
        });

        jLabel9.setText("x");

        TextGrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextGrecActionPerformed(evt);
            }
        });

        TextGref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextGrefActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel5.setText("Times");
        jLabel5.setToolTipText("");

        jButton1.setText("adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ano");

        Tnomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnomesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tnomes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextGrec)
                            .addComponent(TextPalmeirasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(TextSPc)
                            .addComponent(TextFlac))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextPalmeirasf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextSPf)
                                    .addComponent(TextFlaf)
                                    .addComponent(TextGref)))))
                    .addComponent(jButton1))
                .addGap(79, 79, 79))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TextFlac, TextFlaf, TextGrec, TextGref, TextPalmeirasc, TextPalmeirasf, TextSPc, TextSPf});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPalmeirasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPalmeirasf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextSPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextSPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFlac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TextFlaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TextGref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextGrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Tnomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextPalmeirascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPalmeirascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPalmeirascActionPerformed

    private void TextSPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSPcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSPcActionPerformed

    private void TextSPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSPfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSPfActionPerformed

    private void TextFlafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFlafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFlafActionPerformed

    private void TextFlacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFlacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFlacActionPerformed

    private void TextGrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextGrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextGrecActionPerformed

    private void TextGrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextGrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextGrefActionPerformed

    private void TextPalmeirasfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPalmeirasfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPalmeirasfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            // TODO add your handling code here:
        tabela t = new tabela();
        TabelaDao dao = new TabelaDao();
        
        t.resultados(Integer.parseInt(TextPalmeirasc.getText()),Integer.parseInt(TextPalmeirasf.getText()),0);
        t.resultados(Integer.parseInt(TextSPc.getText()), Integer.parseInt(TextSPf.getText()), 1);
        t.resultados(Integer.parseInt(TextFlac.getText()), Integer.parseInt(TextFlaf.getText()), 2);
        t.resultados(Integer.parseInt(TextGrec.getText()), Integer.parseInt(TextGref.getText()), 3);
//        t.resultados(3, 3, 0);
//        t.resultados(4, 3, 1);
//        t.resultados(5, 3, 2);
//        t.resultados(4, 5, 3);
        t.setPontos();
        t.setVitorias();
        t.setDerrotas();
        t.setEmpate();
        t.setGols_feitos();
        t.setGols_sofridos();
        t.setS_gols();
        t.setnomes("Palmeiras", 0);
        t.setnomes("São Paulo", 1);
        t.setnomes("Flamengo", 2);
        t.setnomes("Gremio", 3);
       //teste netbeans
      
        dao.pesquisaPorAno(Integer.parseInt(Tnomes.getText()));
        dao.create(t);
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TnomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnomesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnomesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFlac;
    private javax.swing.JTextField TextFlaf;
    private javax.swing.JTextField TextGrec;
    private javax.swing.JTextField TextGref;
    private javax.swing.JTextField TextPalmeirasc;
    private javax.swing.JTextField TextPalmeirasf;
    private javax.swing.JTextField TextSPc;
    private javax.swing.JTextField TextSPf;
    private javax.swing.JTextField Tnomes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void exibir2(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
