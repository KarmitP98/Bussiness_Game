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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author karmi
 */
public class DabbyBox extends JPanel implements KeyListener, ActionListener
  {

    public Timer t = new Timer(5, this),tn;
    public int y = 150, vy = 0, gr = 3, ny,h1=300,x1=1200,h2=400,x2=1200,n=0;
    public ImageIcon i, f, ic;
    public Color c = Color.white;
    public Boolean start = false;

    public DabbyBox()
      {
        setBackground(c);
        addKeyListener(this);
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(true);
      }

    @Override
    public void paintComponent(Graphics g)
      {
        super.paintComponent(g);
        if (start == false)
          {
            g.drawString("Press Enter to Start!", 500, 300);
            y = 150; vy = 0; gr = 3;h1=300;x1=1200;h2=400;x2=1200;
          } else
          {
            i = new ImageIcon("src/dabby/box/fly.png");
            f = new ImageIcon("src/dabby/box/flydown.png");
            if (vy == gr)
              {
                ic = f;
              } else
              {
                ic = i;
              }
            g.setColor(Color.green);
            ic.paintIcon(this, g, 400, y);
            g.setColor(Color.red);
            g.fillRect(0, 550, 1300, 50);
            g.setColor(Color.green);
            g.fillRect(x1, 0, 90, h1);
          }
      }

    @Override
    public void keyTyped(KeyEvent e)
      {

      }

    @Override
    public void keyPressed(KeyEvent e)
      {
        int k = e.getKeyCode();
        if (k == KeyEvent.VK_SPACE)
          {
//            ny = y - 100;
            tn=new Timer(1,new ActionListener()
              {
                @Override
                public void actionPerformed(ActionEvent e)
                  {
                    n++;
                    ny=(int) (-100*Math.sin(n));
                    if(n>180)
                      {
                        n=0;
                        tn.stop();
                      }
                  }
            });tn.start();
            vy = -2;

          } else if (k == KeyEvent.VK_ENTER)
          {

            t.start();
            c=Color.black;
            start=true;
            repaint();
//            DabbyBox dabbyBox = new DabbyBox();
          }
      }

    @Override
    public void keyReleased(KeyEvent e)
      {
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        JFrame frame = new JFrame();
        DabbyBox gscreen = new DabbyBox();
        frame.add(gscreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 600);
        frame.setVisible(true);
      }

    @Override
    public void actionPerformed(ActionEvent e)
      {
        repaint();
        y += vy;
        x1-=1;
        if(x1==450&&y>=0&&y<=h1)
          {
            try {
                Thread.sleep(1000);
                start=false;
              } catch (InterruptedException ex) {
                Logger.getLogger(DabbyBox.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        if (y <= ny)
          {
            vy = gr;
          }
        if (vy != gr)
          {
            ic = i;
          } else if (vy == gr)
          {
            ic = f;
          }
        if (y > 550)
          {
            try {
                vy = 0;
                y = 550;
                Thread.sleep(1000);
                start=false;
              } catch (InterruptedException ex) {
                Logger.getLogger(DabbyBox.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        if (y < 0)
          {
            vy = gr;
            y = 0;
          }
      }

  }
