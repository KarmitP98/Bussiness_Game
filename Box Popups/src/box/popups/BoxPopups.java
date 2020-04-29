/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.popups;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author karmi
 */
public class BoxPopups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Eventhandler karmit=new Eventhandler();
        karmit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        karmit.setSize(1000,500);
        karmit.setVisible(true);
    }
    
}
