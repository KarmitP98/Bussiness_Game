import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Scrollview extends JFrame {

	private JPanel contentPane, selPane, recPane, listPane, butPane, swapPane;
	Toolkit t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrollview frame = new Scrollview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scrollview() {

		makeFrame();
		addPane();

	}

	private void addPane() {

		selPane = new JPanel();
		selPane.setBounds(8, 8, (int) (this.getWidth() * 0.4), (int) (this.getHeight() * 0.35));
		selPane.setLayout(new GridLayout(5, 1, (int) (selPane.getWidth() * 0.1 / 2), (int) (selPane.getHeight() * 0.1 / 6)));
		contentPane.add(selPane);
		addSelPaneComp();
		
		

	}

	
	
	private void addSelPaneComp() {

		for (int i = 0; i < 5; i++) {
			JButton but = new JButton("Button " + (i + 1));
			but.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					File f = new File("res");
					System.out.println(f.toString());
				}
			});
			selPane.add(but);
		}

	}

	private void makeFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, this.getWidth(), this.getHeight());
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(this.getBounds());
		contentPane.setLayout(null);
		setContentPane(contentPane);

	}

	public int getHeight() {
		return (int) t.getDefaultToolkit().getScreenSize().getHeight();
	}

	public int getWidth() {
		return (int) t.getDefaultToolkit().getScreenSize().getWidth();
	}
}
