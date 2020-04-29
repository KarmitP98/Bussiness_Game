/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.scanner;

import java.util.Scanner;
/**
 *
 * @author King KP
 */
public class sca {

    public static int a,i=1,j=1;
    public static int[][] sc=new int[100][100];
    public static int[] sum=new int[100];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       for(i=1;i<=4;i++)
       {
           
           for(j=1;j<=9;j++)
           {
               System.out.println("Enter Player "+i+" Game "+j+" score:[0 to exit]");
               sc[i][j]=n.nextInt();
               if(sc[i][j]==0)
               {
                   System.exit(0);
               }
               sum[i]=sum[i]+sc[i][j];
           }
       }
       System.out.print("Game\t\tHole 1.\tHole 2.\tHole 3.\tHole 4.\tHole 5.\tHole 6.\tHole 7.\tHole 8.\tHole 9.\tSum\n");
       for(i=1;i<=4;i++)
       {
           System.out.print("Player "+i);
           for(j=1;j<=9;j++)
           {
               
               System.out.print("\t"+sc[i][j]);
           }
           System.out.println("\t"+sum[i]+"\n");
       }
       if(sum[1]<sum[2]&&sum[1]<sum[3]&&sum[1]<sum[4]){
           System.out.println("Player 1 Won!!");
       }
       else if(sum[2]<sum[1]&&sum[2]<sum[3]&&sum[2]<sum[4]){
           System.out.println("Player 2 Won!!");
       }
       else if(sum[3]<sum[2]&&sum[3]<sum[1]&&sum[3]<sum[4]){
           System.out.println("Player 3 Won!!");
       }
       else if(sum[4]<sum[2]&&sum[4]<sum[3]&&sum[4]<sum[1]){
           System.out.println("Player 4 Won!!");
       }
       else{
           System.out.println("Ehhh!!! Who Cares to code everytihng!!");
       }
    }
    }

