/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.popups;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Eventhandler extends JFrame {
    
    private JTextField item1,item2,item3;
    private JPasswordField passwordfield;
    
    public Eventhandler(){
        super("The Title");
        setLayout(new FlowLayout());
        
        item1=new JTextField(10);
        add(item1);
        
        item2=new JTextField("Enter text here");
        add(item2);
        
        item3=new JTextField("Uneditable",20);
        item3.setEditable(false);
        add(item3);
        
        passwordfield=new JPasswordField("");
        add(passwordfield);
        
        thehandler handler=new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordfield.addActionListener(handler);
    }
    
    private class thehandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String string="";
            
            if(event.getSource()==item1)
                string=String.format("Field 1:%s",event.getActionCommand());
            else if(event.getSource()==item2)
                string=String.format("Field 2:%s",event.getActionCommand());
            else if(event.getSource()==item3)
                string=String.format("Field 3:%s",event.getActionCommand());
            else if(event.getSource()==passwordfield)
                string=String.format("Password:%s",event.getActionCommand());
            
            JOptionPane.showMessageDialog(rootPane,string);
        }
    }
    
}
