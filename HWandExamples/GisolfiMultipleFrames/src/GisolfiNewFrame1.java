import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiNewFrame1 extends JFrame {

	private JPanel contentPane;
	private final JButton btnClose = new JButton("Close");
	private final JButton btnNewFrame = new JButton("New Frame 2");

	/**
	 * Create the frame.
	 */
	public GisolfiNewFrame1() {
		jbInit();
	}
	private void jbInit() {
		setTitle("New Sub frame 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClose_actionPerformed(e);
			}
		});
		btnClose.setBounds(140, 120, 117, 29);
		
		contentPane.add(btnClose);
		btnNewFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewFrame_actionPerformed(e);
			}
		});
		btnNewFrame.setBounds(140, 79, 117, 29);
		
		contentPane.add(btnNewFrame);
	}

	protected void do_btnClose_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnNewFrame_actionPerformed(ActionEvent e) {
		GisolfiNewFrame2 newFrame2 = new GisolfiNewFrame2();
		newFrame2.setVisible(true);
		newFrame2.setLocation(this.getX() + 50 , getY() + 50);
	}
}
