/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.gui;

/**
 *
 * @author karmit
 * Date:22nd March, 2016
 */
public class BMI_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form BMI_Calculator
     */
    public BMI_Calculator() {
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
        HEIGHT = new javax.swing.JTextField();
        WEIGHT = new javax.swing.JTextField();
        TYPEH = new javax.swing.JComboBox();
        TPYEW = new javax.swing.JComboBox();
        DONE = new javax.swing.JButton();
        OUTPUT = new javax.swing.JLabel();
        MESS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OpenDyslexic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BMI CALCULATOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ENTER YOUR HEIGHT:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ENTER YOUR WEIGHT:");

        HEIGHT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HEIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HEIGHTActionPerformed(evt);
            }
        });

        WEIGHT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        TYPEH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TYPEH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CM", "M", "INCH", "FT", "KM", "MM" }));

        TPYEW.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TPYEW.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KG", "GRAM", "PD", "OZ", "MG" }));

        DONE.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        DONE.setText("CHECK YOURSELF!!!");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });

        OUTPUT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OUTPUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        MESS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MESS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MESS, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OUTPUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DONE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HEIGHT)
                            .addComponent(WEIGHT, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TYPEH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TPYEW, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TYPEH)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HEIGHT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WEIGHT)
                    .addComponent(TPYEW))
                .addGap(18, 18, 18)
                .addComponent(DONE, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OUTPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MESS, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void HEIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HEIGHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HEIGHTActionPerformed

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
      float h,w,bmi;  //h=height,w=weight,bmi is where final answer is stored
      String ht,wt;         //ht and wt is to store the format of the height and weight in the calculator
      h=Float.parseFloat(HEIGHT.getText());
      w=Float.parseFloat(WEIGHT.getText());
      ht=(String) TYPEH.getSelectedItem();
      wt=(String) TPYEW.getSelectedItem();
      
      if(ht=="CM")                  //All the if and else are to convert the height and wieght format into Standard metric form
      {
          h= (float)(h*0.01);
      }
      else if(ht=="M")
      {
          h=h;
      }
      else if(ht=="INCH")
      {
          h=(float) (h*0.0254);
      }
      else if(ht=="FT")
      {
          h=(float) (h*0.3048);
      }
      else if(ht=="KM")
      {
          h=(float) (h*1000);
      }
      else if(ht=="MM")
      {
          h=(float) (h*0.001);
      }
      if(wt=="GRAM")
      {
          w=(float) (w*0.001);
      }
      else if(wt=="PD")
      {
          w=(float) (w*0.4536);
         }
      else if(wt=="OZ")
      {
          w=(float) (w*0.02835);
      }
      else if(wt=="MG")
      {
          w=(float) (w*0.000001);
      }
     
      bmi=w/(h*h);    //Formula for bmi calculation
      if(bmi<18.5)     //Next if and else are used to display what type of bmi you have and some message to help improve that
      {
          MESS.setText("You need to eat something.");
      }
      else if(bmi>=18.5&&bmi<25)
      {
          MESS.setText("You are awesome!!");
      }
      else if(bmi==25){
          MESS.setText("Mam-a-mia!! You are parfiate");
      }
      else if(bmi>25&&bmi<=29.9)
      {
          MESS.setText("Bhaiyaji gym me jae.");
              }
      else if(bmi>29.9){
          MESS.setText("Tohar kuchhu nahi ho sakat hai!!!");
      }
      
      OUTPUT.setText("Your BMI is "+String.format("%.2f",bmi));
    }//GEN-LAST:event_DONEActionPerformed

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
            java.util.logging.Logger.getLogger(BMI_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DONE;
    private javax.swing.JTextField HEIGHT;
    private javax.swing.JLabel MESS;
    private javax.swing.JLabel OUTPUT;
    private javax.swing.JComboBox TPYEW;
    private javax.swing.JComboBox TYPEH;
    private javax.swing.JTextField WEIGHT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
