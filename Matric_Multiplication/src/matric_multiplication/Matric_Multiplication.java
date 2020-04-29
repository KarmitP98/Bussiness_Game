/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matric_multiplication;

import java.util.*;

/**
 *
 * @author Karmit
 */
public class Matric_Multiplication {

    public static float a[][] = new float[100][100];
    public static float b[][] = new float[100][100];
    public static float c[][] = new float[100][100];
    public static int i=0,j=0,srow=0,scol=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the 4 values of matrix 1(2*2):");
        Scanner s=new Scanner(System.in);
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=s.nextFloat();
            }
        }
        System.out.println("Enter the 4 variables of matrix 2 (2*2):");        
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=s.nextFloat();
            }
        }
        
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
               
            }
        }
    }
    
}
