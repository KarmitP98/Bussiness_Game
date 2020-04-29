import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {

    static Timer t;
    static int j = 0;
    static char let = 'a';
    static ArrayList<Character> letters = new ArrayList();
    static ArrayList<String> words = new ArrayList();
    static Random ran = new Random();

    public static void main(String[] str)
    {

        for(int i=1;i<26;i++)
        {
            letters.add(let);
            let++;
        }

        System.out.println(letters.get(ran.nextInt(letters.size())+1));

        t = new Timer(1000, e -> {
            j++;
            /*String word="";
            for(int i=0;i<4;i++)
            {
                word=word+letters.get(ran.nextInt(letters.size())+1);
            }*/
            System.out.println(j);

            //words.add(word);

        });
        t.start();

    }


}
