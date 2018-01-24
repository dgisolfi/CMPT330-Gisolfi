import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class GisolfiTextExamplesFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblAge = new JLabel("Age:");
	private final JTextField nameTF = new JTextField();
	private final JTextField ageTF = new JTextField();
	private final JButton btnPrint = new JButton("Print");
	private final JTextArea outputTA = new JTextArea();
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
		ageTF.setBounds(112, 72, 86, 20);
		ageTF.setColumns(10);
		nameTF.setBounds(112, 47, 86, 20);
		nameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Text Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblName.setBounds(67, 50, 46, 14);
		
		contentPane.add(lblName);
		lblAge.setBounds(67, 75, 46, 14);
		
		contentPane.add(lblAge);
		
		contentPane.add(nameTF);
		
		contentPane.add(ageTF);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPrint_actionPerformed(e);
			}
		});
		btnPrint.setBounds(77, 106, 89, 23);
		
		contentPane.add(btnPrint);
		scrollPane.setBounds(228, 11, 154, 118);
		
		contentPane.add(scrollPane);
		scrollPane.setViewportView(outputTA);
	}
	protected void do_btnPrint_actionPerformed(ActionEvent e) {
		//System.out.println("Name: " + nameTF.getText());
		//System.out.println("Age: " + ageTF.getText());
		//outputTA.setText("Name: " + nameTF.getText() + "\n" + "Age: " + ageTF.getText());
		if (nameTF.getText().isEmpty()) {
			outputTA.append("Please fill in Name value \n");
		}else if(ageTF.getText().isEmpty()){
			outputTA.setText("Red");
			outputTA.append("Please fill in Age value \n");
		}else {
			outputTA.append("Name: " + nameTF.getText() + "\n");
			outputTA.append("Age: " + ageTF.getText() + "\n"); 
		}
		
	}
}
