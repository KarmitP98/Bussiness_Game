package helloworld;
import javax.swing.*;
import java.awt.*;
/**
 File Name:	HelloWorld
Programmer:	Your name here
Date:		Current date here
Description:	This program demonstrates the
use of graphics.

 */
public class HelloWorld extends JFrame{
    public HelloWorld () {
        super ("Hello World!");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel pageLabel = new JLabel("<html>"
                + "<table border=5>"
                + "<tr><td colspan=2><center color=red><h2>About Me</h2></center></td></tr>"
                + "<tr><td><h3>Name:</h3></td><td> Karmit Patel</td> </tr>"
                + "<tr><td>School:</td><td><u> Mississauga Secondary</u></td> </tr>"
                + "<tr><td bgcolor=yellow>Favourite Music:</td><td> Yo Yo Honey Singh</td></tr>"
                + "<tr><td>Favourite TV show:</td><td color=green> Kapil Sharma Show</td></tr>"
                + "<tr><td>Favourite Colour:</td><td bgcolor=red> Red</td></tr>"
                + "<tr><td color=blue>Favourite Sport:</td><td><h1> Cricket</h1></td></tr>"
                + "<tr><td><i>Idol:</i></td><td> Mahendra Singh Dhoni 7</td></tr>"
                + "</table>"
                + "</html>"); //apply html formatting to comment

        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(pageLabel);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
    }
}