/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.application;

import java.util.Scanner;

/**
 *
 * @author karmi
 */
public class LibraryApplication
  {

    public static int[] numbers =
      {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
      };
    public static String[] books =
      {
        "ANSI C", "C++", "MISSING JAVADOC", "LANGUAGE CODER", "ANDROID", "PYTHON", "VISUAL BASICS", "GUI", "WORD", "EXCEL"
      };
    public static int i, n, count = 0, m, f = 0, l = 9;
    public static Boolean choice = false;
    public static String mess;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the refrence #number of the book:");
        n = s.nextInt();
        binsearch(f, l);
        if (choice == false)
          {
            System.out.println("" + mess);
          }
        else{
            System.out.println(""+mess);
        }
      }

    public static String binsearch(int f, int l)
      {
        count++;
        if (f > l)
          {
            choice = false;
          }
        m = (f + l) / 2;
        if (m == n)
          {
            choice = true;
            return books[m];
          }
        if (m > n)
          {
            binsearch(m + 1, l);
          } else
          {
            binsearch(f, m - 1);
          }
        choice = false;
        return "Found Nothing";
      }

  }
