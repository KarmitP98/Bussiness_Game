/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

import javax.swing.*;
import java.awt.*;
/**
 File Name:	HelloWorld
Programmer:	Your name here
Date:		Current date here
Description:	This program demonstrates the
use of graphics.

 */
public class Greetings extends JFrame{
    public Greetings () {
        super ("Hello World!");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel pageLabel = new JLabel("<html><center>The Wonderful Thing"
        + "<br> About Tiggers"); //apply html formatting to comment

        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(pageLabel);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greetings hw = new Greetings();
    }
}