import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiDialogsAndMoreFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblEnterAPositive = new JLabel("Enter a Positive Number: ");
	private final JLabel lblEnterANegative = new JLabel("Enter a Negative Number: ");
	private final JTextField posNumTF = new JTextField();
	private final JTextField negNumTF = new JTextField();
	private final JButton btnExit = new JButton("Exit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiDialogsAndMoreFrame frame = new GisolfiDialogsAndMoreFrame();
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
	public GisolfiDialogsAndMoreFrame() {
		negNumTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_negNumTF_focusLost(e);
			}
		});
		negNumTF.setBounds(242, 75, 130, 26);
		negNumTF.setColumns(10);
		posNumTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_posNumTF_focusLost(e);
			}
		});
		posNumTF.setBounds(242, 47, 130, 26);
		posNumTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Dialogs and More");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblEnterAPositive.setBounds(55, 52, 164, 16);
		
		contentPane.add(lblEnterAPositive);
		lblEnterANegative.setBounds(55, 80, 164, 16);
		
		contentPane.add(lblEnterANegative);
		
		contentPane.add(posNumTF);
		
		contentPane.add(negNumTF);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExit_actionPerformed(e);
			}
		});
		btnExit.setBounds(242, 142, 117, 29);
		
		contentPane.add(btnExit);
	}

	protected void do_posNumTF_focusLost(FocusEvent e) {
		if (Integer.parseInt(posNumTF.getText().trim()) <= 0) {
			JOptionPane.showMessageDialog(this, "Must Be Positive","Invalid Value", JOptionPane.ERROR_MESSAGE);
			posNumTF.grabFocus();
		}
	}
	protected void do_negNumTF_focusLost(FocusEvent e) {
		if ((Integer.parseInt(negNumTF.getText()) >= 0)) {
			JOptionPane.showMessageDialog(this, "Must Be Negative", "Invalid Value", JOptionPane.ERROR_MESSAGE);
			negNumTF.grabFocus();
		}
	}
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		int n = JOptionPane.showConfirmDialog(
			    this,
			    "Are you sure you would like to quit?",
			    "Exit?",
			    JOptionPane.YES_NO_OPTION);
		if (n == 0) {
			System.exit(0);
		}	  
	}
}
