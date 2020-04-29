/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabby.box;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author karmi
 */
public class Animations extends JPanel implements ActionListener, KeyListener
  {

    static ActionListener a = null;
    Timer t = new Timer(5, this);
    int x = 0, y = 0, vx = 0, vy = 0;

    public Animations()
      {
        setBackground(Color.white);
        setFocusTraversalKeysEnabled(true);
        addKeyListener(this);
            
        t.start();

      }

    @Override
    public void paintComponent(Graphics g)
      {
        super.paintComponent(g);
        g.fillRect(x, y, 100, 100);
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        JFrame frame = new JFrame();
        Animations panel = new Animations();
//        JButton button = new JButton();
//        button.setLocation(300,300);
//        button.setText("Press Me");
//        button.addActionListener(a);
//        button.setSize(10, 10);
//         panel.add(button);
        frame.add(panel);
//        frame.setTitle(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);

      }

    public void actionPerformed(ActionEvent a)
      {
        x += vx;
            y += vy;
            repaint();
            if (x <= 0&&y>=400)
              {
                x = 0;
                vx = 0;
                vy = -2;
              }
            if (x >=400&&y<=0)
              {
                x = 400;
                vx = 0;
                vy = 2;
              }
            if (y <= 0&&x>=400)
              {
                y = 0;
                vy = 0;
                vx = 2;
              }
            if (y >= 400&&x<=0)
              {
                y = 400;
                vy = 0;
                vx = -2;
              }
            if(x<=0&&y<=0)
              {
                vx=2;
                vy=0;
                x=0;
                y=0;
              }
      }

    @Override
    public void keyTyped(KeyEvent e)
      {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

    @Override
    public void keyPressed(KeyEvent e)
      {
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
          {
          }
      }

    @Override
    public void keyReleased(KeyEvent e)
      {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

  }
