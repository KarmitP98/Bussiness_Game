/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.gen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author karmi
 */
public class NameGen {

    public static int i=0;
    public static Timer t;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I am here!");
        
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            i++;
            System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NameGen.class.getName()).log(Level.SEVERE, null, ex);
                }
            if(i>10)
                t.stop();
            }
        });       
        t.start();
        
        System.out.println("Now I am here!");
    }
    
}
