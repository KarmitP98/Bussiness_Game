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
    
    public static Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
    public static int w = (int) ss.getWidth(), h = (int) ss.getHeight();
    
    public static void main(String[] args) {
        
        GUI gui=new GUI();
        ImageIcon icon=new ImageIcon("D:\\Photos\\msd\\12.jpg");
        Image ig = icon.getImage();
        ig = icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        icon = new ImageIcon(ig);
        
        JLabel label=new JLabel(icon);
        gui.add(label);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(w,h);
        gui.setExtendedState(MAXIMIZED_BOTH);
        gui.setVisible(true);
        
        
    
    }
    
}
