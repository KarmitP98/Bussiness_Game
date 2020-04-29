/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adding.image.with.button;
  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author karmi
 */
public class AddingImageWithButton extends JFrame{
        private JButton button;
        private JLabel label;
        
       public AddingImageWithButton(){
           setLayout(new FlowLayout());
           
           button=new JButton("Click me!!!");
           add(button);
           label=new JLabel("");
           add(label);
           
           AddingImageWithButton e=new AddingImageWithButton();
           button.addActionListener((ActionListener) e);
       }
        
       public class event implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Now you can see words here");
        }
           
       }
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     AddingImageWithButton gui=new AddingImageWithButton();
     gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gui.setTitle("Events Program");
     gui.setSize(500,500);
     gui.setVisible(true);
             
    }
 
}
