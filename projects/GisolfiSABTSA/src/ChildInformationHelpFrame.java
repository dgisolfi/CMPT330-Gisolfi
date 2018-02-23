import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChildInformationHelpFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblPleaseProvideThe = new JLabel("Please Provide the name of your child or dependent");
	private final JLabel lblPleaseProvideWhat = new JLabel("Please provide what grade in school your child or dependent currently is");
	private final JLabel lblNextProvideThe = new JLabel("Next provide the date of birth of your child in the format: 00/00/00");
	private final JLabel lblPleaseProvideThe_1 = new JLabel("Please provide the relationship you hoild with this dependent");
	private final JLabel lblFinallySelectA = new JLabel("Finally select a race on the right for this dependent");
	private final JLabel lblRepeatPreviousSteps = new JLabel("Repeat previous steps for all dependents");
	private final JButton btnOkay = new JButton("Okay");

	/**
	 * Create the frame.
	 */
	public ChildInformationHelpFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Child Information Help");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblPleaseProvideThe.setBounds(6, 6, 403, 16);
		
		contentPane.add(lblPleaseProvideThe);
		lblPleaseProvideWhat.setBounds(6, 34, 504, 16);
		
		contentPane.add(lblPleaseProvideWhat);
		lblNextProvideThe.setBounds(6, 62, 475, 16);
		
		contentPane.add(lblNextProvideThe);
		lblPleaseProvideThe_1.setBounds(6, 90, 403, 16);
		
		contentPane.add(lblPleaseProvideThe_1);
		lblFinallySelectA.setBounds(6, 118, 456, 16);
		
		contentPane.add(lblFinallySelectA);
		lblRepeatPreviousSteps.setBounds(6, 146, 330, 16);
		
		contentPane.add(lblRepeatPreviousSteps);
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnOkay_actionPerformed(e);
			}
		});
		btnOkay.setBounds(208, 182, 117, 29);
		
		contentPane.add(btnOkay);
	}

	protected void do_btnOkay_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
