package design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage extends JFrame {

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

    public static void main(String[] args) {
        frame = new JFrame("HomePage");
        frame.setContentPane(new HomePage().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(0, 0);
        frame.setUndecorated(true);
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
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

    private void initialize() {
        mainPanel.setBounds(0, 0, W, H);

        mainPanel.setLayout(new OverlayLayout(mainPanel));
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
