/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trial.and.error;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author 843947
 */
public class TAE extends JPanel implements ActionListener, KeyListener
  {

    Timer tm = new Timer(5, this);
    public int x = 0, velX = 0, y = 0, velY = 0;



    public TAE(){
        setBackground(Color.WHITE);
        tm.start();
        addKeyListener(this);
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.red);
        g.fillRect(0,400,500,100);
        
    }

    public void actionPerformed(ActionEvent e){
        repaint();
        x += velX;
        y += velY;

        if(x<0){
            velX = 0;
            x = 0;
        }

        if(x>450){
            velX = 0;
            x = 450;
        }

        if(y<0){
            velY = 0;
            y = 0;
        }

        if(y>350){
            velY = 0;
            y = 350;
        }
    }

    public void up(){
        velY = (int) -1.5;
        velX = 0;
    }

    public void down(){
        velY = (int) 1.5;
        velX = 0;
    }

    public void left(){
        velX = (int) -1.5;
        velY = 0;
    }

    public void right(){
        velX = (int) 1.5;
        velY = 0;
    }

    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP){
            up();
        }

        if (code == KeyEvent.VK_DOWN){
            down();
        }

        if (code == KeyEvent.VK_LEFT){
            left();
        }

        if (code == KeyEvent.VK_RIGHT){
            right();
        }
    }

    public void keyTyped(KeyEvent e){}

    public void keyReleased(KeyEvent e){

//      velX = 0;
//      velY = 0;
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP){
            velY = 0;
        }
        if (code == KeyEvent.VK_DOWN){
            velY = 0;
        }
        if (code == KeyEvent.VK_LEFT){
            velX = 0;
        }
        if (code == KeyEvent.VK_RIGHT){
            velX = 0;
        }
    }
public static void main(String[] args) {

        JFrame t = new JFrame();
        TAE  g = new TAE();
        t.add(g);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(500,500);

    }

  }
