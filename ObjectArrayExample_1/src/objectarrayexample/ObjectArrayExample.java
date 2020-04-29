/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objectarrayexample;
import java.util.*;
/**
 *
 * @author School
 */
public class ObjectArrayExample {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> row1 = new ArrayList<String>();
        
        row1.add("A");
        row1.add("B");
        row1.add("C");
        System.out.println(row1);

        row1.add(1, "D");
        System.out.println(row1);

        row1.set(0, "E");
        System.out.println(row1);

        System.out.println(row1.get(0));
        System.out.println(row1.get(1));

        System.out.println(row1.contains("E"));
        System.out.println(row1.contains("A"));

        System.out.println(row1.indexOf("B"));
        System.out.println(row1.lastIndexOf("A"));

        row1.remove("B");
        System.out.println(row1);

        System.out.println(row1.size());

        row1.clear();
        System.out.println(row1);

    }

}
