/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reimann.sum;

import java.util.Scanner;

/**
 *
 * @author karmi
 */
public class ReimannSum {

    /**
     * @param args the command line arguments
     */
    public static Double sum = 0.000000, sNum, fNum, nn = 0.0, tn = 0.0, num;
    public static int i = 0, sType, n, trial = 0;
    
    public static void main(String[] args) {
        System.out.println("1. Trapezoid Rule.\n2. Midpoint Rule\n3. Simpson Rule\n4. Right Rule\n5. Left Rule\nSelect the type of rule required:");
        Scanner s = new Scanner(System.in);
        sType = s.nextInt();

        System.out.println("Enter n:");
        n = s.nextInt();

        System.out.println("Enter start and end:");
        sNum = s.nextDouble();
        fNum = s.nextDouble();

        nn = (fNum - sNum) / n;
        sum(sType, nn, n);

    }

    public static void sum(int t, Double nn, int n) {
        tn = sNum;
        sum = 0.0;
        num = 0.0;
        switch (t) {
            case 1:
                num = 1 / Math.log(tn);
                sum += num;
                System.out.println("Trial: " + trial + " Sum:" + sum + " Tn:" + tn);
                tn += nn;
                trial++;

                for (int i = 1; i <= n - 1; i++) {
                    num = 2 * (1 / Math.log(tn));
                    sum += num;
                    System.out.println("Trial: " + trial + " Sum:" + sum + " Tn:" + tn);
                    tn += nn;
                    trial++;
                }
                num = 1 / Math.log(tn);
                sum += num;
                System.out.println("Trial: " + trial + " Sum:" + sum + " Tn:" + tn);
                sum = (nn / 2) * sum;
                System.out.println("Sum: " + sum);
                break;

            case 2:
                tn = sNum + (nn / 2);
                for (int i = 1; i <= n; i++) {
                    num = 1 / Math.log(tn);
                    sum += num;
                    tn += nn;
                }
                sum = nn * sum;
                System.out.println("Sum:" + sum);
                break;

            case 3:
                num = 1 / Math.log(tn);
                sum += num;
                System.out.println("Trial: " + trial + " Sum:" + sum + " Tn:" + tn);
                tn += nn;
                trial++;

                for (int i = 1; i <= n - 1; i++) {
                    int a = 2;
                    if (i % 2 == 1) {
                        a = 4;
                    } else {
                        a = 2;
                    }
                    num = a * 1 / Math.log(tn);
                    sum += num;
                    System.out.println("Trial: " + trial + " Sum:" + sum + " Tn:" + tn);
                    tn += nn;
                    trial++;
                }
                num = 1 / Math.log(tn);
                sum += num;
                System.out.println("Trial: " + trial + " Sum:" + sum + " Tn:" + tn);
                sum = (nn / 3) * sum;
                System.out.println("Sum: " + sum);
                break;
        }
    }

}
