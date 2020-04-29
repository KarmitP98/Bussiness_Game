/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.advanced;

import java.util.*;
import java.awt.AWTError.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author karmi
 */
public class NUmberInfo_Advanced extends javax.swing.JFrame {

    /**
     * Creates new form NUmberInfo_Advanced
     */
    public NUmberInfo_Advanced() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        remove = new javax.swing.JTextField();
        list = new javax.swing.JButton();
        sumabtn = new javax.swing.JButton();
        suma = new javax.swing.JTextField();
        sumebtn = new javax.swing.JButton();
        sume = new javax.swing.JTextField();
        sumobtn = new javax.swing.JButton();
        sumo = new javax.swing.JTextField();
        rangebtn = new javax.swing.JButton();
        range = new javax.swing.JTextField();
        meanbtn = new javax.swing.JButton();
        mean = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number Information");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 1, 1, new java.awt.Color(0, 0, 0)));

        display.setColumns(20);
        display.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        display.setRows(5);
        display.setEnabled(false);
        jScrollPane1.setViewportView(display);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add!!!");

        add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Remove!!!");

        remove.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        remove.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        remove.setEnabled(false);
        remove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                removeKeyPressed(evt);
            }
        });

        list.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        list.setText("List!!!");
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });

        sumabtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sumabtn.setText("Sum All!!");
        sumabtn.setEnabled(false);
        sumabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumabtnMouseClicked(evt);
            }
        });

        suma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        suma.setEnabled(false);

        sumebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sumebtn.setText("Sum Even!!");
        sumebtn.setEnabled(false);
        sumebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumebtnMouseClicked(evt);
            }
        });

        sume.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sume.setEnabled(false);

        sumobtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sumobtn.setText("Sum Odd!!");
        sumobtn.setEnabled(false);
        sumobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumobtnMouseClicked(evt);
            }
        });

        sumo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sumo.setEnabled(false);

        rangebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rangebtn.setText("Range!!");
        rangebtn.setEnabled(false);
        rangebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rangebtnMouseClicked(evt);
            }
        });

        range.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        range.setEnabled(false);

        meanbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        meanbtn.setText("Mean!!");
        meanbtn.setEnabled(false);
        meanbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meanbtnMouseClicked(evt);
            }
        });

        mean.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mean.setEnabled(false);

        resetbtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        resetbtn.setText("Reset!!!");
        resetbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbtnMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exit.setText("Done");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(resetbtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(sume, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sumebtn, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(sumo, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sumobtn, javax.swing.GroupLayout.Alignment.LEADING)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(84, 84, 84)
                                                        .addComponent(rangebtn)
                                                        .addGap(42, 42, 42))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(21, 21, 21)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addComponent(meanbtn))
                                                    .addComponent(mean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(168, 168, 168)
                                                .addComponent(list)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(suma, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sumabtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                    .addComponent(add))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(exit)))))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(list))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sumabtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sumebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sumobtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rangebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meanbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(resetbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(exit)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ArrayList numlist = new ArrayList();

    @SuppressWarnings("empty-statement")
    private void addKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyPressed
        int i;
        String str;
        float n, s = 0, sa = 0, se = 0, so = 0, max, min, m;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            str = remove.getText();
            if (str == "") {
                JOptionPane.showConfirmDialog(rootPane, "Enter a number!!!", "No number0", JOptionPane.DEFAULT_OPTION);
            } else {
                n = (float) Float.parseFloat(add.getText());      //Getting the number from "add"
                numlist.add(n);                         //Adding "n" to "numlist"
                add.setText(null);                      //Setting the "add" textfield to "null"
                for (i = 0; i < numlist.size(); i++) {
                    s += (float) numlist.get(i);
                }                                    //Sum of all numbers
                for (i = 0; i < numlist.size(); i++) {
                    if ((float) numlist.get(i) % 2 == 0) {
                        se += (float) numlist.get(i);
                    }
                }   //Sum of even numbers  
                for (i = 0; i < numlist.size(); i++) {
                    if ((float) numlist.get(i) % 2 == 1) {
                        so += (float) numlist.get(i);
                    }
                }   //Sum of odd numbers
                max = (float) Collections.max(numlist);           //Finding max
                min = (float) Collections.min(numlist);           //Finding min       //It is equal to finding range
                m = (float) s / numlist.size();                     //Finding mean or median
                printmedia(s, se, so, max, min, m);
            }
        }
    }//GEN-LAST:event_addKeyPressed

    private void removeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removeKeyPressed
        float n, s = 0, se = 0, so = 0, max, min, m;
        int i;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String str = remove.getText();
            if (str == "") {
                JOptionPane.showConfirmDialog(rootPane, "Enter a number!!!", "No number0", JOptionPane.DEFAULT_OPTION);
            } else {
                n = Float.parseFloat(remove.getText());
                numlist.remove(n);
            }
            if (numlist.size() > 0) {
                for (i = 0; i < numlist.size(); i++) {
                    s += (float) numlist.get(i);
                }                                    //Sum of all numbers
                for (i = 0; i < numlist.size(); i++) {
                    if ((float) numlist.get(i) % 2 == 0) {
                        se += (float) numlist.get(i);
                    }
                }   //Sum of even numbers  
                for (i = 0; i < numlist.size(); i++) {
                    if ((float) numlist.get(i) % 2 == 1) {
                        so += (float) numlist.get(i);
                    }
                }   //Sum of odd numbers
                max = (float) Collections.max(numlist);           //Finding max
                min = (float) Collections.min(numlist);           //Finding min       //It is equal to finding range
                m = (float) s / numlist.size();                     //Finding mean or median
                remove.setText(null);
                printmedia(s, se, so, max, min, m);
            } else {
                s = 0;
                se = 0;
                so = 0;
                max = 0;
                min = 0;
                m = 0;
                printmedia(s, se, so, max, min, m);
                remove.setText(null);
            }
        }
    }//GEN-LAST:event_removeKeyPressed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        int i;
        display.append("\n\n**List:**\n");
        for (i = 0; i < numlist.size(); i++) {
            display.append(i + ") " + numlist.get(i) + "\n");
        }
    }//GEN-LAST:event_listMouseClicked

    private void sumabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumabtnMouseClicked
        int i;
        float s = 0;
        for (i = 0; i < numlist.size(); i++) {
            s += (float) numlist.get(i);
        }        //Sum of all numbers
        display.append("\n\nSum= " + s);
    }//GEN-LAST:event_sumabtnMouseClicked

    private void sumebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumebtnMouseClicked
        int i;
        float se = 0;
        for (i = 0; i < numlist.size(); i++) {
            if ((float) numlist.get(i) % 2 == 0) {
                se += (float) numlist.get(i);
            }
        }   //Sum of even numbers
        display.append("\n\nSum Even= " + se);
    }//GEN-LAST:event_sumebtnMouseClicked

    private void sumobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumobtnMouseClicked
        int i;
        float so = 0;
        for (i = 0; i < numlist.size(); i++) {
            if ((float) numlist.get(i) % 2 == 1) {
                so += (float) numlist.get(i);
            }
        }   //Sum of odd numbers
        display.append("\n\nSum Odd= " + so);
    }//GEN-LAST:event_sumobtnMouseClicked

    private void rangebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rangebtnMouseClicked
        float max, min;
        max = (float) Collections.max(numlist);           //Finding max
        min = (float) Collections.min(numlist);           //Finding min       //It is equal to finding range
        display.append("\n\nRange: " + min + "-" + max);
    }//GEN-LAST:event_rangebtnMouseClicked

    private void meanbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meanbtnMouseClicked
        int i;
        float m, s = 0;
        for (i = 1; i < numlist.size(); i++) {
            s += (float) numlist.get(i);
        }                                    //Sum of all numbers
        m = (float) s / numlist.size();                     //Finding mean or median
        display.append("\n\nMean= " + m);
    }//GEN-LAST:event_meanbtnMouseClicked

    private void resetbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbtnMouseClicked
        numlist.clear();
        add.setText(null);
        remove.setText(null);
        suma.setText(null);
        sume.setText(null);
        sumo.setText(null);
        range.setText(null);
        mean.setText(null);
        display.setText(null);
        check();
    }//GEN-LAST:event_resetbtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void printmedia(float s, float se, float so, float max, float min, float m) {
        suma.setText(s + "");
        sume.setText(se + "");
        sumo.setText(so + "");
        range.setText(min + "-" + max);
        mean.setText(m + "");

        check();
    }

    private void check() {
        int s = numlist.size();

        if (s == 0) {
            remove.setEnabled(false);
            remove.setEditable(false);
            sumabtn.setEnabled(false);
            sumebtn.setEnabled(false);
            sumobtn.setEnabled(false);
            rangebtn.setEnabled(false);
            meanbtn.setEnabled(false);
        } else if (s == 1) {
            remove.setEnabled(true);
            remove.setEditable(true);
            meanbtn.setEnabled(true);
        } else {
            sumabtn.setEnabled(true);
            sumebtn.setEnabled(true);
            sumobtn.setEnabled(true);
            rangebtn.setEnabled(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NUmberInfo_Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NUmberInfo_Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NUmberInfo_Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NUmberInfo_Advanced.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NUmberInfo_Advanced().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextArea display;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton list;
    private javax.swing.JTextField mean;
    private javax.swing.JButton meanbtn;
    private javax.swing.JTextField range;
    private javax.swing.JButton rangebtn;
    private javax.swing.JTextField remove;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField suma;
    private javax.swing.JButton sumabtn;
    private javax.swing.JTextField sume;
    private javax.swing.JButton sumebtn;
    private javax.swing.JTextField sumo;
    private javax.swing.JButton sumobtn;
    // End of variables declaration//GEN-END:variables
}