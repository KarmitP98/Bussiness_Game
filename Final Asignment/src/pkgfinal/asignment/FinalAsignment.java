/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.asignment;
import java.util.*;
import java.text.*;
/**
 *
 * @author 843947
 */
public class FinalAsignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pr,tp,hst;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter the price of food:$");
        pr=in.nextFloat();
        hst=(float) (pr*0.13);
        tp=pr+hst;
        System.out.println("\tYour Bill\t");
        System.out.println("********************************");
        System.out.format("\tMEAL:\t%.2f\n",pr);
        System.out.format("\tHST:\t%.2f\n",hst);
        System.out.format("\tTOTAL:\t%.2f\n",tp);
        
        
       
    }
}
