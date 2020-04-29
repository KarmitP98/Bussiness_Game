/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameDev;

import java.awt.DisplayMode;

/**
 *
 * @author karmi
 */
import java.awt.Color;
import java.awt.Graphics;
public class Main
  {

    public static Main m;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        DisplayMode dm=new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
        m=new Main();
        m.run(dm);
      }

    public void run(DisplayMode dm)
      {
      }

  }
