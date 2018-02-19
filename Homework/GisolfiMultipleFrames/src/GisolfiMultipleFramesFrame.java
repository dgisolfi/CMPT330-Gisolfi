import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiMultipleFramesFrame extends JFrame {

	private JPanel contentPane;
	private final JButton btnExit = new JButton("Exit");
	private final JButton btnNewFrame = new JButton("New Frame 1");
	private final JButton btnNewFrame_1 = new JButton("New Frame 2");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiMultipleFramesFrame frame = new GisolfiMultipleFramesFrame();
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
	public GisolfiMultipleFramesFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExit_actionPerformed(e);
			}
		});
		btnExit.setBounds(116, 161, 133, 29);
		
		contentPane.add(btnExit);
		btnNewFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewFrame_actionPerformed(e);
			}
		});
		btnNewFrame.setBounds(116, 74, 117, 29);
		
		contentPane.add(btnNewFrame);
		btnNewFrame_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewFrame_1_actionPerformed(e);
			}
		});
		btnNewFrame_1.setBounds(116, 115, 117, 29);
		
		contentPane.add(btnNewFrame_1);
	}
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void do_btnNewFrame_actionPerformed(ActionEvent e) {
		GisolfiNewFrame1 newFrame1 = new GisolfiNewFrame1();
		newFrame1.setVisible(true);
		newFrame1.setLocation(this.getX() + 30 , getY() + 30);
	}
	protected void do_btnNewFrame_1_actionPerformed(ActionEvent e) {
		GisolfiNewFrame2 newFrame2 = new GisolfiNewFrame2();
		newFrame2.setVisible(true);
		newFrame2.setLocation(this.getX() + 30 , getY() + 30);
	}
}
