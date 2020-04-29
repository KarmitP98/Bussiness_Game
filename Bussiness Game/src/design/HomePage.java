package design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage{

    private static JFrame frame;
    private Dimension screenSize;
    private int W, H;
    private JPanel mainPanel;
    private JButton exitBtn;

    public HomePage()
    {
        setupScreenSize();
        initialize();
        exitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
    }

    private void initialize() {
        mainPanel.setBounds(0,0,W,H);
    }

    private void setupScreenSize() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        W = (int) screenSize.getWidth();
        H = (int) screenSize.getHeight();
    }


    public Dimension getScreenSize() {
        return screenSize;
    }

    public int getW() {
        return W;
    }

    public int getH() {
        return H;
    }

    public static void main(String[] args) {
        frame = new JFrame("HomePage");
        frame.setContentPane(new HomePage().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1920,1080);
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
    }

}
