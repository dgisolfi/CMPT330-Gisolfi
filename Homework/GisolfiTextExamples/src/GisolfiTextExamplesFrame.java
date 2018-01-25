import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class GisolfiTextExamplesFrame extends JFrame {

	private JPanel contentPane;
	private final JTextField nameTF = new JTextField();
	private final JTextField emailTF = new JTextField();
	private final JTextField phoneNumTF = new JTextField();
	private final JTextArea outputTA = new JTextArea();
	private final JButton btnPrint = new JButton("Print");
	private final JLabel lblName = new JLabel("Name: ");
	private final JLabel lblEmail = new JLabel("Email: ");
	private final JLabel lblPhoneNumber = new JLabel("Phone Number: ");
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiTextExamplesFrame frame = new GisolfiTextExamplesFrame();
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
	public GisolfiTextExamplesFrame() {
		phoneNumTF.setBounds(103, 111, 107, 26);
		phoneNumTF.setColumns(10);
		emailTF.setBounds(103, 73, 107, 26);
		emailTF.setColumns(10);
		nameTF.setBounds(103, 35, 107, 26);
		nameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Text Example Homework");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(nameTF);
		
		contentPane.add(emailTF);
		
		contentPane.add(phoneNumTF);
		scrollPane.setBounds(215, 35, 229, 100);
		
		contentPane.add(scrollPane);
		scrollPane.setViewportView(outputTA);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPrint_actionPerformed(e);
			}
		});
		btnPrint.setBounds(140, 187, 117, 29);
		
		contentPane.add(btnPrint);
		lblName.setBounds(6, 40, 61, 16);
		
		contentPane.add(lblName);
		lblEmail.setBounds(6, 78, 61, 16);
		
		contentPane.add(lblEmail);
		lblPhoneNumber.setBounds(6, 116, 100, 16);
		
		contentPane.add(lblPhoneNumber);
	}
	protected void do_btnPrint_actionPerformed(ActionEvent e) {
		String name = nameTF.getText();
		String email = emailTF.getText();
		String phoneNum = phoneNumTF.getText();
		
		if(name.isEmpty() && email.isEmpty() && phoneNum.isEmpty()) {
			outputTA.setForeground(Color.RED);
			outputTA.append("Please enter a value for Name\n");
			outputTA.append("Please enter a value for Email\n");
			outputTA.append("Please enter a value for Phone Number\n");
		}else if (name.isEmpty()) {
			outputTA.setForeground(Color.RED);
			outputTA.append("Please enter a value for Name\n");
		}else if (email.isEmpty()) {
			outputTA.setForeground(Color.RED);
			outputTA.append("Please enter a value for Email\n");
		}else if (phoneNum.isEmpty()) {
			outputTA.setForeground(Color.RED);
			outputTA.append("Please enter a value for Phone Number\n");
		}else {
			outputTA.setForeground(Color.BLACK);
			outputTA.setText("Thank your for your information\n");
			outputTA.append("Name: " + name + "\n");
			outputTA.append("Email: " + email + "\n");
			outputTA.append("Phone Number: " + phoneNum + "\n");
		}	
	}
}
