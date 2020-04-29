/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carpet;
import java.util.*;
/**
 *
 * @author 843947
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float l,b,a,m,p;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the carpet (m):");
        l=in.nextFloat();
        System.out.println("Enter the breath of the carpet (m):");
        b=in.nextFloat();
        a=l*b;
        System.out.println("Enter the cost of the carpet per sq metre:");
        p=in.nextFloat();
        m=p*a;
        System.out.println("The total cost the carpet with area "+a+"metre square at cost of $"+p+" per metre square is $"+m);

        
        // TODO code application logic here
    }
}
