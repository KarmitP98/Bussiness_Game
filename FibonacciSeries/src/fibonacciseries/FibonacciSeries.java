/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author 843947
 */
public class FibonacciSeries {

    public static int a, b, c, num, i = 0, sum = 1, prod = 0, count = 0,x=3;
    public static Timer t;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        num = s.nextInt();
        a = 0;
        b = 1;
        System.out.print("The terms of fibonacci series till number " + num + " are: \n" + a + ", " + b);
        fib(a, b);
        System.out.println("\nThe sum of these terms is: " + sum);
        System.out.println("The product of all these terms is:");
        System.out.println("Drum Roll pleeeeasssse!!!!...........");
        for (count = 0; count <= 10; count++) {
            try {
                System.out.println(".");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FibonacciSeries.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("0");
    }

    public static void fib(int a, int b) {
        i++;
        if (i >= num) {
        } else {
            c = a + b;
            a = b;
            b = c;
            sum += c;
            prod *= c;
            System.out.print(", " + c);
            fib(a, b);
        }
    }
}
