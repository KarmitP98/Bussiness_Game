/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package first.gui;

/**
 *
 * @author 843947
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Sale
     */
    public Sale() {
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
        Heading = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        Purchase = new javax.swing.JLabel();
        Purchasein = new javax.swing.JTextField();
        $ = new javax.swing.JLabel();
        Calculate = new javax.swing.JToggleButton();
        Congo = new javax.swing.JLabel();
        Disprice = new javax.swing.JLabel();
        dispricefin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Heading.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        Heading.setText("SUPER SALE STORE");
        jPanel1.add(Heading);
        Heading.setBounds(10, 11, 428, 72);

        Line.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Line.setText("20% OFF ON PURCHASE OF MOLRE THAN 20$");
        jPanel1.add(Line);
        Line.setBounds(10, 89, 428, 36);

        Purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Purchase.setText("PURCHASE:");
        jPanel1.add(Purchase);
        Purchase.setBounds(10, 136, 104, 26);

        Purchasein.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Purchasein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseinActionPerformed(evt);
            }
        });
        jPanel1.add(Purchasein);
        Purchasein.setBounds(118, 141, 37, 23);

        $.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        $.setText("$");
        jPanel1.add($);
        $.setBounds(159, 138, 42, 26);

        Calculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Calculate.setText("CALCULATE DISCOUNT");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        jPanel1.add(Calculate);
        Calculate.setBounds(283, 136, 155, 23);

        Congo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(Congo);
        Congo.setBounds(10, 175, 428, 81);

        Disprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(Disprice);
        Disprice.setBounds(10, 267, 428, 39);

        dispricefin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(dispricefin);
        dispricefin.setBounds(10, 317, 428, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\ICS3UO\\discount.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        float price,dis,disprice;
        price=Float.parseFloat(Purchasein.getText());
        dis=(float) (price*0.20);
        disprice=price-dis;
        if(price>20)
        {
            Congo.setText("Congratulation");
            Disprice.setText("Your discount price is "+String.format("$%.2f",dis));
            dispricefin.setText("Your final price is "+String.format("$%.2f",disprice));
        }
        else{
            Congo.setText("Oooooooops!!! Do more shopping to get discount");
            Disprice.setText("You got no 'DISCOUNT'");
            dispricefin.setText("Your final price is "+String.format("$%.2f",price));
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void PurchaseinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PurchaseinActionPerformed

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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel $;
    private javax.swing.JToggleButton Calculate;
    private javax.swing.JLabel Congo;
    private javax.swing.JLabel Disprice;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Line;
    private javax.swing.JLabel Purchase;
    private javax.swing.JTextField Purchasein;
    private javax.swing.JLabel dispricefin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
