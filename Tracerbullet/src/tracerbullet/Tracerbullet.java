/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tracerbullet;

import java.util.*;
/**
 *
 * @author 843947
 */
public class Tracerbullet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=11,sum=0;
        System.out.println("Number:\tSum:");
        while(num>0)
        {
            System.out.println(num+"\t"+sum);
            num--;
            sum+=num*5;
        }
        System.out.println("Final number: "+num+1);
        System.out.println("Final Sum: "+sum);
    }
}
