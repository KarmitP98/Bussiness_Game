/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.and.sort;

import java.util.*;

/**
 *
 * @author karmi
 */
public class SAS
    {

    public static int[] num = new int[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        {
        selecSort();
        insertSort();
        bubble();
        }

    public static void randomize()
        {
        for (int i = 0; i < 10; i++)
            {
            Random rand = new Random();
            int x = rand.nextInt(20);
            num[i] = x;
            }
        }

    public static void selecSort()
        {
        randomize();
        for (int i = 0; i < num.length; i++)
            {
            for (int j = i; j < num.length; j++)
                {
                if (num[i] > num[j])
                    {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                    }
                }
            }
        System.out.println("Selection Sort:");
        for (int i = 0; i < num.length; i++)
            {
            System.out.println("" + num[i]);
            }
        }

    public static void insertSort()
        {
        randomize();
        //go through the num of the numbers, starting with number two (we say that number one is already sorted) 
        for (int i = 1; i < num.length - 1; i++)
            {
            //store the value of the number we are dealing with (because it's place can be taken by other bigger numbers) 
            int value = num[i];
            //define j (its a pointer to the already sorted num, starting at the largest number - back of the sorted num) 
            int j = i - 1;
            //as long as value is lower than the number in sorted num and we are still in the num 
            while (j >= 0 && num[j] > value)
                {
                // we are going to move the higher number(from the sorted num) one step to the right (so it will make space for the current value number - witch is lower) 
                num[j + 1] = num[j];
                //and we move our pointer in the num to next place - lower number 
                j--;
                }
            //once we come to the right spot, we insert our value number in there and start with next i value. 
            num[j + 1] = value;
            }
        System.out.println("Insertion Sort:");
        for (int i = 0; i < num.length; i++)
            {
            System.out.println("" + num[i]);
            }
        }

    public static void bubble()
        {
        randomize();
        int n = num.length;
        int temp = 0;
        for (int i = 0; i < n; i++)
            {
            for (int j = 1; j < (n - i); j++)
                {
                if (num[j - 1] > num[j])
                    {
                    //swap the elements! 
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                    }
                }
            }
        System.out.println("Bubble Sort:");
        for (int i = 0; i < num.length; i++)
            {
            System.out.println("" + num[i]);
            }
        }

    public void Quicksort(int[] A, int start, int end)
        {
        if (start < end)
            {
            //we partition the list and get back two lists (lower than pivot, and bigger than pivot) 
            int middle = Partition(A, start, end);
            //we then do a recursive call to sort out lower numbers than pivot 
            Quicksort(A, start, middle - 1);
            //and we do same with higher numbers than pivot 
            Quicksort(A, middle + 1, end);
            //NOTE: pivot is already in it's place, where he supposed to be (in a sorted list). 
            }
        }

    public int Partition(int[] A, int start, int end)
        {
        int pivot = A[end]; //we define pivot (the number we will be comparing other numbers to 
        int lo = start - 1; // we define low value index 
        for (int hi = start; hi < end; hi++)
            {
            //we go throug the list, compare other numbers to pivot 
            if (A[hi] <= pivot)
                {
                //if pivot is lower that the current number 
                lo++; //we increase lo value 
                //and exchange current lo with hi (so we will have all lower numbers than pivot on one side) 
                int temp = A[lo];
                A[lo] = A[hi];
                A[hi] = temp;
                }
            }
        //at the end we put in pivot right inbetween low and high values and we know that pivot element is in the right place. 
        int temp = A[lo + 1];
        A[lo + 1] = A[end];
        A[end] = temp;
        return lo + 1; //we return the pivot elements place 
        }

    }
