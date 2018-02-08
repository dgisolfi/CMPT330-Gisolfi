import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GisolfiMaskFormatterFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblSsn = new JLabel("SSN: ");
	private final JFormattedTextField ssnFTF = new JFormattedTextField();
	private final JLabel lblSsnAlt = new JLabel("SSN Alternative:");
	private final JFormattedTextField ssnAltFTF = new JFormattedTextField();
	private final JLabel lblPhoneNumber = new JLabel("Phone Number: ");
	private final JFormattedTextField phnumFTF = new JFormattedTextField();
	private final JLabel lblState = new JLabel("State:");
	private final JFormattedTextField stateFTF = new JFormattedTextField();
	
	//Define the ssn Mask
	MaskFormatter ssnMask = createFormatter("###-##-####");
	
	//Define the Alt ssn Mask
	MaskFormatter ssnAltMask = createFormatter("###-##-####");
	
	//Define the Phone number Mask
	MaskFormatter phNumMask = createFormatter("###-###-####");
	
	//Define the state Mask
	MaskFormatter stateMask = createFormatter("LL");
	private final JLabel lblssnOutput = new JLabel("");
	private final JLabel lblssnAltOutput = new JLabel("");
	private final JLabel lblphNumOutput = new JLabel("");
	private final JLabel lblstateOutput = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiMaskFormatterFrame frame = new GisolfiMaskFormatterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//place this code after main()

	public MaskFormatter createFormatter(String s) {
	     MaskFormatter formatter = null;
	     try {
	          formatter = new MaskFormatter(s);
	         } 
	     catch (java.text.ParseException exc) {
		          System.err.println("formatter is bad: " + exc.getMessage());
		          System.exit(-1);
		      }
	      return formatter;
	}//createFormatter

	/**
	 * Create the frame.
	 */
	public GisolfiMaskFormatterFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Input Masks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblSsn.setBounds(76, 71, 61, 16);
		
		contentPane.add(lblSsn);
		ssnFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_ssnFTF_focusLost(e);
			}
		});
		ssnFTF.setBounds(122, 66, 138, 26);
		
		//Associate mask with formatted text field
		ssnMask.setPlaceholderCharacter('#');
		ssnMask.install(ssnFTF);
		
		contentPane.add(ssnFTF);
		lblSsnAlt.setBounds(6, 99, 100, 16);
		
		contentPane.add(lblSsnAlt);
		ssnAltFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_ssnAltFTF_focusLost(e);
			}
		});
		ssnAltFTF.setBounds(122, 94, 138, 26);
		//Associate mask with formatted text field
		ssnAltMask.setPlaceholderCharacter('#');
		ssnAltMask.install(ssnAltFTF);
		contentPane.add(ssnAltFTF);
		lblPhoneNumber.setBounds(6, 127, 100, 16);
		
		contentPane.add(lblPhoneNumber);
		phnumFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_phnumFTF_focusLost(e);
			}
		});
		phnumFTF.setBounds(122, 122, 138, 26);
		//Associate mask with formatted text field
		phNumMask.setPlaceholderCharacter('#');
		phNumMask.install(phnumFTF);
		stateMask.install(stateFTF);
		contentPane.add(phnumFTF);
		lblState.setBounds(64, 155, 54, 16);
		
		contentPane.add(lblState);
		stateFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_stateFTF_focusLost(e);
			}
		});
		stateFTF.setBounds(122, 150, 54, 26);
		//Associate mask with formatted text field
		stateMask.setPlaceholderCharacter('L');
		stateMask.install(stateFTF);
		contentPane.add(stateFTF);
		lblssnOutput.setBounds(272, 71, 128, 16);
		
		contentPane.add(lblssnOutput);
		lblssnAltOutput.setBounds(272, 99, 128, 16);
		
		contentPane.add(lblssnAltOutput);
		lblphNumOutput.setBounds(272, 127, 128, 16);
		
		contentPane.add(lblphNumOutput);
		lblstateOutput.setBounds(272, 155, 61, 16);
		
		contentPane.add(lblstateOutput);
	}
	protected void do_ssnFTF_focusLost(FocusEvent e) {
		lblssnOutput.setText(ssnFTF.getText());
	}
	protected void do_ssnAltFTF_focusLost(FocusEvent e) {
		lblssnAltOutput.setText(ssnAltFTF.getText());
	}
	protected void do_phnumFTF_focusLost(FocusEvent e) {
		lblphNumOutput.setText(phnumFTF.getText());
	}
	protected void do_stateFTF_focusLost(FocusEvent e) {
		lblstateOutput.setText(stateFTF.getText());
	}
}
