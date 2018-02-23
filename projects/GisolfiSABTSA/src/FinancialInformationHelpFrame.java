import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinancialInformationHelpFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblFirstPleaseChoose = new JLabel("First please choose employment status");
	private final JLabel lblNextIfEmployed = new JLabel("Next if employed please povide place of employment");
	private final JLabel lblThenInputThe = new JLabel("Then input the length you have held the job");
	private final JLabel lblPleaseChooseCarreer = new JLabel("Please choose Carreer source registration status");
	private final JLabel lblRepeatStepsFor = new JLabel("Repeat steps for Spouse");
	private final JLabel lblFinallyFillIn = new JLabel("Finally fill in all income and expenses statements");
	private final JButton btnOkay = new JButton("Okay");

	/**
	 * Create the frame.
	 */
	public FinancialInformationHelpFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Financial Information Help");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblFirstPleaseChoose.setBounds(6, 6, 397, 16);
		
		contentPane.add(lblFirstPleaseChoose);
		lblNextIfEmployed.setBounds(6, 34, 454, 16);
		
		contentPane.add(lblNextIfEmployed);
		lblThenInputThe.setBounds(6, 62, 338, 16);
		
		contentPane.add(lblThenInputThe);
		lblPleaseChooseCarreer.setBounds(6, 90, 338, 16);
		
		contentPane.add(lblPleaseChooseCarreer);
		lblRepeatStepsFor.setBounds(6, 118, 312, 16);
		
		contentPane.add(lblRepeatStepsFor);
		lblFinallyFillIn.setBounds(6, 146, 349, 16);
		
		contentPane.add(lblFinallyFillIn);
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnOkay_actionPerformed(e);
			}
		});
		btnOkay.setBounds(169, 181, 117, 29);
		
		contentPane.add(btnOkay);
	}

	protected void do_btnOkay_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
