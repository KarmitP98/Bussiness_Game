public class Demo {

    public static void main(String[] args)
    {
        /*Stuff s = new Stuff();
        s.start();
        Stuff s1 = new Stuff();
        s1.start();                     //One way to create thread is to make an instance of a class and extend Thread
*/

        Thread t1 = new Thread(new MyClass());
        Thread t2 = new Thread(new MyClass());
        t1.start();
        t2.start();                     //Second Way, Create thread object and call em



    }


}

class Stuff extends Thread
{
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getId()+" Value: "+ i);
        }
       try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class MyClass implements Runnable
{

    @Override
    public void run() {
            for(int i=1;i<=10;i++)
            {
                System.out.println(Thread.currentThread().getId()+" Value: "+ i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
    }
}

