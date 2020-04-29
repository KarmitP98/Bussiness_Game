/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author karmit
 */
public class GUI extends JFrame{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GUI gui=new GUI();
        ImageIcon icon=new ImageIcon("D:\\Photos\\msd\\12.jpg");
        JLabel label=new JLabel(icon);
        gui.add(label);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(2000,2000);
        gui.setVisible(true);
        gui.setTitle("Awesome");
 
        
    
    }
    
}
