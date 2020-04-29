/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.circle;

import java.util.Scanner;

/**
 *
 * @author 843947
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float r;
        float pi=(float) 3.14;
        float a;    //Declaring the datratypes of the variables
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=in.nextInt();
        a=pi*r*r;
        System.out.println("The area of the circle with radius "+ r +" is "+a);
        // TODO code application logic here
    }
}
