import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    static int i;
    static String message = "", input = "";

    public Main()
    {
        program();
    }

    public static void program()
    {
        input = s.next();
        while(input!="0")
        {
            input = s.next();
            if(input.equalsIgnoreCase("Hello"))
                outMess(1);
            else if(input.equalsIgnoreCase("Bye"))
                outMess(2);
            else if(input.equalsIgnoreCase("How was your day?"))
                outMess(3);
            else if(input.equalsIgnoreCase("What is my name?"))
                outMess(4);
            else if(input.equalsIgnoreCase("Oh boy"))
                outMess(5);
            else
                outMess(6);
        }
    }

    public static void outMess(int index)
    {
        switch(index)
        {
            case 1:
                System.out.println("Hey there...");
                break;
            case 2:
                System.out.println("Bye, have a good day.");
                break;
            case 3:
                System.out.println("It was amazing.");
                break;
            case 4:
                System.out.println("Karmit \"Greatness\" Patel");
                break;
            case 5:
                System.out.println("Boy O boy...");
                break;
            case 6:
                System.out.println("I did not recognize what you say.");
                break;
        }
    }


    public static void main(String[] args){
        program();
    }
}
