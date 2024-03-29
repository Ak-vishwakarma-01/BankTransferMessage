/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ankit.banktransfermessage;

import javax.swing.*; 

interface BankTransfers {
    public String encrypt(String a);

    public String decrypt(String a);
}

class ICICI implements BankTransfers {
    public String encrypt(String a) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                b.append('!');
                b.append("1");
            } else {
                char c = (char) ((int) a.charAt(i) + 1);
                b.append(c);
                b.append("1");
            }
        }
        return b.toString();
    }

    public String decrypt(String a) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '1') {
                if (a.charAt(i) == '!') {
                    b.append(' ');
                } else {
                    char c = (char) ((int) a.charAt(i) - 1);
                    b.append(c);
                }
            }
        }
        return b.toString();
    }
}

class HDFC implements BankTransfers {
    public String encrypt(String a) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                b.append(' ');
            } else {
                if (i % 2 == 0) {
                    char c = (char) ((int) a.charAt(i) + 1);
                    b.append(c);
                } else {
                    char c = (char) ((int) a.charAt(i) - 1);
                    b.append(c);
                }
            }
        }
        return b.toString();
    }

    public String decrypt(String a) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                b.append(' ');
            } else {
                if (i % 2 == 0) {
                    char c = (char) ((int) a.charAt(i) - 1);
                    b.append(c);
                } else {
                    char c = (char) ((int) a.charAt(i) + 1);
                    b.append(c);
                }
            }
        }
        return b.toString();
    }
}


public class messageTransfer extends javax.swing.JFrame {

    /**
     * Creates new form messageTransfer
     */
    public messageTransfer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ICICIbtn = new javax.swing.JRadioButton();
        HDFCbtn = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        tmtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sencrypt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sdecrypt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bank Transfer Message");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select the Bank Name:");

        buttonGroup1.add(ICICIbtn);
        ICICIbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ICICIbtn.setText("ICICI");
        ICICIbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICICIbtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(HDFCbtn);
        HDFCbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HDFCbtn.setText("HDFC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter the Message to Transfer");

        tmtf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tmtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmtfActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("The Encrypted message is:");

        sencrypt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("The Decrypted message is:");

        sdecrypt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Result");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tmtf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ICICIbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HDFCbtn))
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sencrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ICICIbtn)
                                    .addComponent(HDFCbtn))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tmtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sencrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sdecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmtfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String messege = tmtf.getText();
        if(ICICIbtn.isSelected()==true){
            ICICI ic = new ICICI();
            sencrypt.setText( ic.encrypt(messege));
            sdecrypt.setText(ic.decrypt(ic.encrypt(messege)));
        }
        else if(HDFCbtn.isSelected()==true){
            HDFC hd = new HDFC();
            sencrypt.setText( hd.encrypt(messege));
            sdecrypt.setText(hd.decrypt(hd.encrypt(messege)));
        }
        else{
            sencrypt.setText("null");
            sdecrypt.setText("null");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ICICIbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICICIbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ICICIbtnActionPerformed

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
            java.util.logging.Logger.getLogger(messageTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messageTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messageTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messageTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messageTransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton HDFCbtn;
    private javax.swing.JRadioButton ICICIbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField sdecrypt;
    private javax.swing.JTextField sencrypt;
    private javax.swing.JTextField tmtf;
    // End of variables declaration//GEN-END:variables
}
