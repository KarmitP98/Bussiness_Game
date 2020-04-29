/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.a.rectangle;

import java.util.*;

/**
 *
 * @author 843947
 */
public class AreaOfARectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* float l=(float) 5.7,b=(float) 4.8,area;
        area=l*b;
        System.out.println("The length of the rectangle is "+l);
        System.out.println("The breathe of the rectangle is "+b);
        System.out.println("The area of the rectangle is "+area);
        // TODO code application logic here*/
        
        float principal,roi,interest;
        int years;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the principal:");
        principal=in.nextFloat();
        System.out.println("Enter the rate of interest:");
        roi=in.nextFloat();
        System.out.println("Enter the term:");
        years=in.nextInt();
        interest=principal*roi*years/100;
        System.out.println("The simple interest of the amount "+principal+" on "+roi+" rate of interest for "+years+" is $"+interest);
    }
}
