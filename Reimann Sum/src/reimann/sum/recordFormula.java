/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reimann.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author karmi
 */
public class recordFormula {

    public static String form = null, dChar = "/", mChar = "*";
    public static ArrayList part = new ArrayList();

    public static void main(String[] args) {

        System.out.println("Enter a formula:");
        Scanner s = new Scanner(System.in);
        form = s.next();

        if (form.contains(dChar) && !form.contains(mChar)) {
            divideChar(dChar);
        } else if (form.contains(mChar) && !form.contains(dChar)) {
            multiChar(mChar);
        } else if (form.contains(dChar) && form.contains(mChar)) {
            multiDChar(dChar, mChar);
        } else {
            System.out.println(form + " Invalid! [* and / only]");
        }
    }

    public static float multi(ArrayList part) {
        float answer = 0;
        float sum = 0, num = 1;
        for (int i = 0; i < part.size(); i++) {
            num = num * Float.parseFloat((String) part.get(i));
            System.out.println("Trial: " + i + "  Sum: " + sum + "  Num: " + num);
        }
        answer = num;
        return answer;
    }

    public static float divide(ArrayList part) {
        float answer = 0;
        float sum = 0, num = Float.parseFloat((String) part.get(0));
        for (int i = 1; i < part.size(); i++) {
            num = num / Float.parseFloat((String) part.get(i));
            System.out.println("Trial: " + i + "  Sum: " + sum + "  Num: " + num);
        }
        answer = num;
        return answer;
    }

    public static void divideChar(String c) {
        String[] parts = form.split(Pattern.quote("/"));

        for (int i = 0; i < parts.length; i++) {
            part.add(parts[i]);
        }

        System.out.println("Length: " + parts.length + "  Terms: " + part);
        float answer = divide(part);

        System.out.println("Answer: " + answer);
    }

    public static void multiChar(String c) {
        String[] parts = form.split(Pattern.quote("*"));

        for (int i = 0; i < parts.length; i++) {
            part.add(parts[i]);
        }

        System.out.println("Length: " + parts.length + "  Terms: " + part);
        float answer = multi(part);

        System.out.println("Answer: " + answer);
    }

    public static void multiDChar(String d, String m) {
        String[] dParts = new String[1000];
        int i = 0;
        Float[] sum = new Float[100];
        for (String parts : dParts) {
            sum[i] = multiChar("*",parts);
            i++;
        }

         ArrayList<Float> p = new ArrayList();
        
        for (i = 0; i < sum.length; i++) {
            p.add(sum[i]);
        }
        
        float answer = divide(p);
        
    }

    public static float multiChar(String c,String l) {
        String[] parts = l.split(Pattern.quote("*"));
        ArrayList<String> p = new ArrayList();
        
        for (int i = 0; i < parts.length; i++) {
            p.add(parts[i]);
        }

        System.out.println("Length: " + parts.length + "  Terms: " + p);
        float answer = multi(p);
        return answer;

    }

}
