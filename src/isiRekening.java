/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Dimas Abid M
 */
public class isiRekening extends javax.swing.JFrame {

    int tmp;
    String pin = "";
    String bank;
    String kode = "";
    /**
     * Creates new form isiRekening
     */
    public isiRekening(int e, String b) {
        initComponents();
        this.tmp = e;
        this.bank = b;
        if(bank.equals("BNI")){
            kodeBank.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alert = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        tvPin = new javax.swing.JTextField();
        kodeBank = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setLayout(null);

        tvPin.setEditable(false);
        tvPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvPinActionPerformed(evt);
            }
        });
        tvPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tvPinKeyPressed(evt);
            }
        });
        jPanel1.add(tvPin);
        tvPin.setBounds(40, 130, 290, 30);

        kodeBank.setBackground(new java.awt.Color(153, 255, 204));
        kodeBank.setText("Kode BANK -->");
        kodeBank.setBorder(null);
        kodeBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBankActionPerformed(evt);
            }
        });
        jPanel1.add(kodeBank);
        kodeBank.setBounds(360, 300, 130, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("0");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 240, 50, 100);

        jButton12.setBackground(new java.awt.Color(255, 153, 153));
        jButton12.setText("C");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(280, 180, 50, 40);

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("1");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(40, 180, 50, 40);

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setText("2");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(120, 180, 50, 40);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setText("3");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(200, 180, 50, 40);

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setText("4");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(40, 240, 50, 40);

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setText("5");
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(120, 240, 50, 40);

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setText("6");
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(200, 240, 50, 40);

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setText("9");
        jButton19.setBorder(null);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(200, 300, 50, 40);

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setText("7");
        jButton20.setBorder(null);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(40, 300, 50, 40);

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setText("8");
        jButton22.setBorder(null);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(120, 300, 50, 40);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dengan Kode BANK Tujuan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 60, 200, 40);

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setText("OK -->");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(360, 240, 130, 40);

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setText("CANCEL -->");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(360, 180, 130, 40);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Masukkan Rekening Tujuan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 0, 250, 40);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Untuk Tujuan BANK Lain, Isi 3 Digit Pertama");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 30, 370, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 370);

        setBounds(0, 0, 546, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void tvPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tvPinActionPerformed

    private void tvPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tvPinKeyPressed

    }//GEN-LAST:event_tvPinKeyPressed

    private void kodeBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBankActionPerformed
        new kodeBank().setVisible(true);
    }//GEN-LAST:event_kodeBankActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pin += "0";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pin = "";
        tvPin.setText(pin);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        pin += "1";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        pin += "2";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        pin += "3";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        pin += "4";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        pin += "5";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        pin += "6";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        pin += "9";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        pin += "7";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        pin += "8";
        tvPin.setText(pin);
        ok();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (pin.equals("")) {
            alert.showMessageDialog(null, "Masukkan Angka Dengan Benar!");
        } else {
            if(bank.equals("BNI")){
                if(pin.length() < 10){
                    alert.showMessageDialog(null, "Masukkan 10 Digit Rekening Dengan Benar!");
                } else {
                    ok();
                }
            } else {
                if(pin.length() < 13){
                    alert.showMessageDialog(null, "Masukkan 13 Digit Rekening Dengan Benar!");
                } else {
                    ok();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new menuLain(tmp).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void ok(){
        if(bank.equals("BNI")) {
            if(pin.length() == 10){
                new transfer(tmp, "000", "BNI", pin).setVisible(true);
                this.setVisible(false);
            }
        } else {
            if(pin.length() == 13){
                kode += pin.substring(0, 1);
                kode += pin.substring(1, 2);
                kode += pin.substring(2, 3);
                String rek = pin.substring(3);
                if(kode.equals("001")){
                    new transfer(tmp, "001", "BRI", rek).setVisible(true);
                    this.setVisible(false);
                } else if(kode.equals("008")){
                    new transfer(tmp, "008", "MANDIRI", rek).setVisible(true);
                    this.setVisible(false);
                } else if(kode.equals("114")){
                    new transfer(tmp, "114", "JATIM", rek).setVisible(true);
                    this.setVisible(false);
                } else if(kode.equals("011")){
                    new transfer(tmp, "011", "DANAMON", rek).setVisible(true);
                    this.setVisible(false);
                } else if(kode.equals("200")){
                    new transfer(tmp, "200", "BTN", rek).setVisible(true);
                    this.setVisible(false);
                } else if(kode.equals("014")){
                    new transfer(tmp, "014", "BCA", rek).setVisible(true);
                    this.setVisible(false);
                } else {
                    alert.showMessageDialog(null, "Kode BANK Tidak Diketahui!");
                }
            } 
        }
    }
    
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
            java.util.logging.Logger.getLogger(isiRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(isiRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(isiRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(isiRekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane alert;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kodeBank;
    private javax.swing.JTextField tvPin;
    // End of variables declaration//GEN-END:variables
}
