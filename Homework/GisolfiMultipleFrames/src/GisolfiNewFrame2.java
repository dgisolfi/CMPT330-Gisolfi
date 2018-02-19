import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiNewFrame2 extends JFrame {

	private JPanel contentPane;
	private final JButton btnClose = new JButton("Close");


	/**
	 * Create the frame.
	 */
	public GisolfiNewFrame2() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Frame 2");
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
		btnClose.setBounds(78, 78, 117, 29);
		
		contentPane.add(btnClose);
	}

	protected void do_btnClose_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
