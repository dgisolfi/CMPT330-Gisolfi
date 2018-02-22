import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ApplicantInformationHelpFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblAllFieldsWith = new JLabel("All Fields with a * in its label are required");
	private final JLabel lblForYourSocial = new JLabel("For your social security number please enter the Last 4 only");
	private final JLabel lblEnterDateOf = new JLabel("Enter Date of birth in format: 00/00/00");
	private final JLabel lblForLengthOf = new JLabel("For length of Occupancy please specify in years how long you haved lived at that addresss");
	private final JLabel lblPleaseEnterThe = new JLabel("Please enter the phone number in the format of 845-555-3000");
	private final JLabel lblPleaseChooseA = new JLabel("Please Choose a Family status if applicable");
	private final JLabel lblFinallyPleaseFill = new JLabel("Finally please fill out the same information for your spouse");


	/**
	 * Create the frame.
	 */
	public ApplicantInformationHelpFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Applicant Information Help");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblAllFieldsWith.setBounds(6, 6, 336, 16);
		
		contentPane.add(lblAllFieldsWith);
		lblForYourSocial.setBounds(6, 34, 401, 16);
		
		contentPane.add(lblForYourSocial);
		lblEnterDateOf.setBounds(6, 62, 401, 16);
		
		contentPane.add(lblEnterDateOf);
		lblForLengthOf.setBounds(6, 90, 574, 16);
		
		contentPane.add(lblForLengthOf);
		lblPleaseEnterThe.setBounds(6, 118, 460, 16);
		
		contentPane.add(lblPleaseEnterThe);
		lblPleaseChooseA.setBounds(6, 146, 401, 16);
		
		contentPane.add(lblPleaseChooseA);
		lblFinallyPleaseFill.setBounds(6, 174, 401, 16);
		
		contentPane.add(lblFinallyPleaseFill);
	}

}
