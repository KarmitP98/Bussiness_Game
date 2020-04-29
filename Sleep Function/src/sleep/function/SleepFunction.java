/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleep.function;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author karmi
 */
public class SleepFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            System.out.println("I waited 1 sec");
        } catch (InterruptedException ex) {}
         System.out.println("I waited 5 sec");
        try {
            Thread.sleep(3000);
            System.out.println("I waited 3 sec");
        } catch (InterruptedException ex) {}
    }
    
}
