/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typesofsearches;

/**
 *
 * @author 843947
 */
import java.util.*;

public class tos {

    /**
     * @param args the command line arguments
     */
    public static int[] num = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
    public static int i, j, n, temp;

    public static void main(String[] args) {
        System.out.println("1. Selection Sort\n2. Bubble Sort\n3. Insertion Sort\n4. Quick Sort");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 0; i <= n
                um.length-1; i++) {
            for (j = i+1; j < num.length ; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                    System.out.println("Temp"+temp+" num[i]"+num[i]+" num[j]"+num[j]);
                }
            }
        }
        for (i = 0; i < num.length - 1; i++) {
            System.out.print(" " + num[i]);
        }
    }
}
