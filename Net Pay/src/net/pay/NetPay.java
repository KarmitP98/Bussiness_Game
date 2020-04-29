/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pay;

/**
 *
 * @author 843947
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h=40,w=5,i=2;
        float r=(float) 0.22,n,t;
        t=h*w*i;
        n=t-(r*t);
        System.out.println("Your net pay is $"+n);
        
        // TODO code application logic here
    }
}
