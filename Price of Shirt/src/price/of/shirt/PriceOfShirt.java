/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package price.of.shirt;
import java.util.Scanner;
/**
 *
 * @author 843947
 */
public class PriceOfShirt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pr,mg,ch,tb;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the price of shirt:");
        pr=in.nextFloat();
        System.out.println("Enter the amount you gave to the clerk:");
        mg=in.nextFloat();
        ch=mg-pr;
        tb=(float) (pr+(pr*0.13));
        System.out.println("Price of shirt: $"+pr);
        System.out.println("Money given: $"+mg);
        System.out.println("Change: $"+ch);
        System.out.println("Total bill (incl. 13% HST): $"+tb);
        
        // TODO code application logic here
    }
}
