import java.util.Scanner;

public class Main {

    float i=0;
    float h=0,x0=0,y0=0,dy=0,x=0,y=0, finalY;
    Scanner s = new Scanner(System.in);

    public void main(String[] args) {
        program();
    }

    public void program()
    {
        System.out.println("Enter step size:");
        h = s.nextFloat();

        System.out.println("Enter y0:");
        y0 = s.nextFloat();

        System.out.println("Enter y(n):");
        finalY = s.nextFloat();

        while(i<=finalY)
        {

        }
    }

    public float answer(float h, float y0,float finalY)
    {

    }

}
