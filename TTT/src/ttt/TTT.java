/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;

/**
 *
 * @author 843947
 */
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TTT extends JFrame {
    EVENT tictac = new EVENT(this);

    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[3][3];
    JButton play = new JButton("Play");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback.jpg");


    public TTT() {
        super ("Tic Tac Toe");
        setSize (500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(4, 3, 1, 1);
        row1.setLayout(layout1);
        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                boxes[x][y].setOpaque(true);
                row1.add(boxes[x][y]);
            }
        }
        row1.add(blank1);
        row1.add(play);
        row1.add(blank2);
        add (row1);

        play.addActionListener((ActionListener) tictac);
        for (int x=0; x<=2; x++){
            for (int y=0; y<=2; y++){
                boxes[x][y].addActionListener((ActionListener) tictac);
            }
        }


        setVisible(true);
    }

    public static void main(String[] arguments){
        TTT frame = new TTT();
    }
}