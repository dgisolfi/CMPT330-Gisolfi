import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;

public class GisolfiBlottoFilterByGameTypeFrame extends JFrame {

	private JPanel contentPane;
	private final JFormattedTextField formattedTextField = new JFormattedTextField();

	/**
	 * Create the frame.
	 */
	public GisolfiBlottoFilterByGameTypeFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Filter By Game Type");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		formattedTextField.setBounds(6, 32, 109, 26);
		
		contentPane.add(formattedTextField);
	}
}
