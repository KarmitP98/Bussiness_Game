import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Page {


    public static void main(String[] str)
    {
        Timer1 t1 =new Timer1();
        Timer2 t2 = new Timer2();
        t1.start();
        t2.start();
    }
}

class Timer1 extends Thread
{

    int i=1;
    Timer t;

    @Override
    public void run() {
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                i++;
                if(i>=10)
                {
                    t.stop();
                }
            }
        });
        t.start();
    }
}

class Timer2 extends Thread
{
    int j=1;
    Timer t1;

    @Override
    public void run() {
        t1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Thread.currentThread().getName()+" "+j);
                j++;
                if(j>=10)
                {
                    t1.stop();
                }
            }
        });
        t1.start();
    }
}