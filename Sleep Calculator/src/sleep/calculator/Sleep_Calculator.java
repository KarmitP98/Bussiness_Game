/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sleep.calculator;

import java.util.*;
/**
 *
 * @author 843947
 */
public class Sleep_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Sleep_Calculator
     */
    public Sleep_Calculator() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BDate = new javax.swing.JTextField();
        BMonth = new javax.swing.JTextField();
        BYear = new javax.swing.JTextField();
        TDate = new javax.swing.JTextField();
        TMonth = new javax.swing.JTextField();
        TYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AvgSleep = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Answer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("!!Sleep Calculator!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 488, 73));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Today's Date!!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 102, 229, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Your Birthday!!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 229, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Month:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Year:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Date:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Month:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 219, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Year:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 258, -1, -1));

        BDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDateActionPerformed(evt);
            }
        });
        jPanel1.add(BDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 177, 82, -1));

        BMonth.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(BMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 216, 82, -1));

        BYear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(BYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 255, 82, -1));

        TDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDateActionPerformed(evt);
            }
        });
        jPanel1.add(TDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 177, 91, -1));

        TMonth.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(TMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 216, 91, -1));

        TYear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(TYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 255, 91, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Average Hours Sleep per Day:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, 254, 43));

        AvgSleep.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AvgSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvgSleepActionPerformed(evt);
            }
        });
        jPanel1.add(AvgSleep, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 301, 158, 43));

        Calculate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Calculate.setText("Waste Some Time!!");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        jPanel1.add(Calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 355, -1, -1));

        Answer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 468, 61));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TDateActionPerformed

    private void AvgSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvgSleepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvgSleepActionPerformed

    private void BDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDateActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
       float bday,bmonth,byear,tday,tmonth,tyear,avgsleep,totaldays,totalsleep;
       
       bday=Float.parseFloat(BDate.getText());
       bmonth=Float.parseFloat(BMonth.getText());
       byear=Float.parseFloat(BYear.getText());
       tday=Float.parseFloat(TDate.getText());
       tmonth=Float.parseFloat(TMonth.getText());
       tyear=Float.parseFloat(TYear.getText());
       avgsleep=Float.parseFloat(AvgSleep.getText());
       
       //Converting everything to days 
       bmonth=bmonth*30;
       byear*=365;
       tmonth*=30;
       tyear*=365;
       totaldays=(tday+tmonth+tyear)-(bday+bmonth+byear);
       totalsleep=totaldays*avgsleep;
       
       Answer.setText("Great!! You survived for "+totaldays+" days and wasted "+totalsleep+" hrs of those in doing nothing!!! Awesome!!!");
    }//GEN-LAST:event_CalculateActionPerformed

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
            java.util.logging.Logger.getLogger(Sleep_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sleep_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sleep_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sleep_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sleep_Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer;
    private javax.swing.JTextField AvgSleep;
    private javax.swing.JTextField BDate;
    private javax.swing.JTextField BMonth;
    private javax.swing.JTextField BYear;
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField TDate;
    private javax.swing.JTextField TMonth;
    private javax.swing.JTextField TYear;
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
}
