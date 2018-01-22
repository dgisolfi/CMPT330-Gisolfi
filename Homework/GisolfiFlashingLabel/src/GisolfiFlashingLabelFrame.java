import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiFlashingLabelFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCMPT330 = new JLabel("CMPT - 330");
	private final JButton btnNewButton = new JButton("Flash");
	private final JButton btnFancier = new JButton("Fancier");
	private final JLabel lblDmb = new JLabel("DMB");

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
		jbInit();
	}
	private void jbInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblCMPT330.setBounds(169, 64, 89, 14);
		//add your own code before the object is added
		//Set the label to begin as not visible
		lblCMPT330.setVisible(false);
		contentPane.add(lblCMPT330);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNewButton_actionPerformed(arg0);
			}
		});
		btnNewButton.setBounds(169, 117, 89, 23);
		
		contentPane.add(btnNewButton);
		btnFancier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFancier_actionPerformed(e);
			}
		});
		btnFancier.setBounds(169, 151, 89, 23);
		
		contentPane.add(btnFancier);
		lblDmb.setBounds(169, 89, 46, 14);
		
		contentPane.add(lblDmb);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		lblCMPT330.setVisible(!lblCMPT330.isVisible());
	}
//		if (lblCMPT330.isVisible()) {
//			lblCMPT330.setVisible(false);
//		}else
//			lblCMPT330.setVisible(true);	
//	}
	protected void do_btnFancier_actionPerformed(ActionEvent e) {
		lblCMPT330.setVisible(!lblCMPT330.isVisible());
		lblDmb.setVisible(!lblDmb.isVisible());
	}
}
