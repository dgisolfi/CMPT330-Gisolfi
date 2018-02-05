import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiFlashingLabelFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiFlashingLabelFrame frame = new GisolfiFlashingLabelFrame();
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
	public GisolfiFlashingLabelFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblCMPT330.isVisible(); == True) {
					lblCMPT330.setVisible(False);
				}else {
					lblCMPT330.setVisible(True);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(60, 132, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblCmpt = new JLabel("CMPT - 330");
		lblCmpt.setBounds(75, 86, 84, 16);
		contentPane.add(lblCmpt);
	}
}
