import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class GisolfiInputVerifierFrame extends JFrame {

	private JPanel contentPane;
	
	//set up number format stuff
	NumberFormat numFormat = NumberFormat.getNumberInstance();
	
	//Modify the call to constructor to use num format
	private final JFormattedTextField num1FTF = new JFormattedTextField(numFormat);
	private final JFormattedTextField num2FTF = new JFormattedTextField(numFormat);
	private final JFormattedTextField num3FTF = new JFormattedTextField(numFormat);
	private final JLabel lblnum1Text = new JLabel("");
	private final JLabel lblnum1Value = new JLabel("");

	private double num1 = 1;
	private double num2 = 2;
	private double num3 = 3;
	private final JLabel lblnum2Text = new JLabel("");
	private final JLabel lblnum2Value = new JLabel("");
	private final JLabel lblnum3Text = new JLabel("num3Text: ");
	private final JLabel lblnum3Value = new JLabel("num3Value: ");
	private final JLabel lblNewLabel = new JLabel("_________________");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiInputVerifierFrame frame = new GisolfiInputVerifierFrame();
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
	public GisolfiInputVerifierFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Input Verifier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num1FTF.setBounds(72, 32, 75, 26);
		num1FTF.setValue(num1); //  or num1FTF.setValue(new Double(num1));
		
		contentPane.add(num1FTF);
		num2FTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_num2FTF_propertyChange(evt);
			}
		});
		num2FTF.setBounds(72, 70, 75, 26);
		num2FTF.setValue(num2);
		
		contentPane.add(num2FTF);
		num3FTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_num3FTF_propertyChange(evt);
			}
		});
		num3FTF.setBounds(72, 124, 75, 26);
		num3FTF.setValue(num3);
		
		contentPane.add(num3FTF);
		lblnum1Text.setBounds(159, 37, 119, 16);
		
		contentPane.add(lblnum1Text);
		lblnum1Value.setBounds(281, 37, 135, 16);
		
		contentPane.add(lblnum1Value);
		lblnum2Text.setBounds(159, 75, 128, 16);
		
		contentPane.add(lblnum2Text);
		lblnum2Value.setBounds(279, 75, 148, 16);
		
		contentPane.add(lblnum2Value);
		lblnum3Text.setBounds(159, 129, 119, 16);
		
		contentPane.add(lblnum3Text);
		lblnum3Value.setBounds(269, 129, 147, 16);
		
		contentPane.add(lblnum3Value);
		lblNewLabel.setBounds(72, 108, 135, 16);
		
		num1FTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_num1FTF_propertyChange(evt);
			}
		});
		
		contentPane.add(lblNewLabel);
	}
	
	public void subtract() {
//		num1 = (double) num1FTF.getValue();
		num1 = ((Number)num1FTF.getValue()).doubleValue();
//		num2 = (double) num2FTF.getValue();
		num2 = ((Number)num2FTF.getValue()).doubleValue();

		num3 = num1 - num2;
		
		if (num3 < 0){
			num3FTF.setForeground(Color.RED);
		}else {
			num3FTF.setForeground(Color.BLACK);
		}
		
		num3FTF.setValue(num3);
		
	}
	//property chnage happens when it is first upadated
	protected void do_num1FTF_propertyChange(PropertyChangeEvent evt) {
		subtract();
		lblnum1Text.setText(" " + num1FTF.getText());
		lblnum1Value.setText(" " + num1FTF.getValue());
	}
	protected void do_num2FTF_propertyChange(PropertyChangeEvent evt) {
		subtract();
		lblnum2Text.setText(" " + num2FTF.getText());
		lblnum2Value.setText(" " + num2FTF.getValue());
	}
	protected void do_num3FTF_propertyChange(PropertyChangeEvent evt) {
		lblnum3Text.setText(" " + num3FTF.getText());
		lblnum3Value.setText(" " + num3FTF.getValue());
	}
}
