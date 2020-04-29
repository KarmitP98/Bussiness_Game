/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package name.number;
import java.util.*;
import java.text.*;
/**
 *
 * @author 843947
 */
public class NameNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1, name2, name3;
        int y,x=5,a=12,c=5,d=7;
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your first name:");
        name1=in.nextLine();
        System.out.println("Enter your last name:");
        name2=in.nextLine();
        System.out.println("Enter your birth year:");
        y=in.nextInt();
        name3= name1 + name2;
        System.out.println("Your full name is "+name3+" and your birth year is "+y);
        
        NumberFormat x= NumberFormat.getCurrencyInstance();
        System.out.println("x");
         NumberFormat a= NumberFormat.getIntegerInstance();
        System.out.println("a");
         NumberFormat c= NumberFormat.getNumberInstance();
        System.out.println("c");
         NumberFormat d= NumberFormat.getPercentInstance();
        System.out.println("d");
    }
}
