/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameDev;

/**
 *
 * @author karmi
 */
import java.awt.*;
import javax.swing.JFrame;

public class Screen
  {
    private GraphicsDevice vc;
    
    public Screen()
      {
        GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc=env.getDefaultScreenDevice();
      }
    
    public void setfullscreen(DisplayMode dm,JFrame window)
      {
        window.setUndecorated(true);
        window.setResizable(false);
        vc.setFullScreenWindow(window);
        
        if(dm!=null&&vc.isDisplayChangeSupported())
          {
            try{
                vc.setDisplayMode(dm);
            }
            catch(Exception ex){}
          }
      }
    
    public Window getFullScreenWindow()
      {
        return vc.getFullScreenWindow();
      }
    
    public void restorScreen()
      {
        Window w=vc.getFullScreenWindow();
        if(w!=null)
          {
            w.dispose();
          }
        vc.setFullScreenWindow(null);
      }
    
  }
