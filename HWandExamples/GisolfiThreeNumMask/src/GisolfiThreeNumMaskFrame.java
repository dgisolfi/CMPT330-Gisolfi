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

import static java.lang.Integer.parseInt;
import java.lang.Math;

public class GisolfiThreeNumMaskFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNumber = new JLabel("Number 1:");
	private final JLabel lblNumber_1 = new JLabel("Number 2: ");
	private final JLabel lblNumber_2 = new JLabel("Number 3: ");
	private final JFormattedTextField num1FTF = new JFormattedTextField();
	private final JFormattedTextField num2FTF = new JFormattedTextField();
	private final JFormattedTextField num3FTF = new JFormattedTextField();
	private final JLabel lblMax = new JLabel("Max Number:");
	private final JLabel lblmaxNum = new JLabel("");
	
	//Define the num 1 Mask
	MaskFormatter num1Mask = createFormatter("###");
	
	//Define the num 2 Mask
	MaskFormatter num2Mask = createFormatter("###");
	
	//Define the num 3 Mask
	MaskFormatter num3Mask = createFormatter("###");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiThreeNumMaskFrame frame = new GisolfiThreeNumMaskFrame();
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
	public GisolfiThreeNumMaskFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Three Number Mask");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNumber.setBounds(35, 49, 66, 16);
		
		contentPane.add(lblNumber);
		lblNumber_1.setBounds(35, 77, 78, 16);
		
		contentPane.add(lblNumber_1);
		lblNumber_2.setBounds(35, 105, 78, 16);
		
		contentPane.add(lblNumber_2);
		num1FTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_num1FTF_focusLost(e);
			}
		});
		num1FTF.setBounds(113, 44, 49, 26);
		//Associate mask with formatted text field
		num1Mask.setPlaceholderCharacter('0');
		num1Mask.install(num1FTF);
		
		contentPane.add(num1FTF);
		num2FTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_num2FTF_focusLost(e);
			}
		});
		num2FTF.setBounds(113, 72, 49, 26);
		//Associate mask with formatted text field
		num2Mask.setPlaceholderCharacter('0');
		num2Mask.install(num2FTF);
		contentPane.add(num2FTF);
		num3FTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_num3FTF_focusLost(e);
			}
		});
		num3FTF.setBounds(113, 100, 49, 26);
		//Associate mask with formatted text field
		num3Mask.setPlaceholderCharacter('0');
		num3Mask.install(num3FTF);
		contentPane.add(num3FTF);
		lblMax.setBounds(19, 133, 127, 16);
		
		contentPane.add(lblMax);
		lblmaxNum.setBounds(113, 133, 94, 16);
		
		contentPane.add(lblmaxNum);
	}

	protected void do_num1FTF_focusLost(FocusEvent e) {
		updateMaxNum();
	}
	protected void do_num2FTF_focusLost(FocusEvent e) {
		updateMaxNum();
	}
	protected void do_num3FTF_focusLost(FocusEvent e) {
		updateMaxNum();
	}
	public void updateMaxNum() {
		String num1Str = num1FTF.getText();
		String num2Str = num2FTF.getText();
		String num3Str = num3FTF.getText();
		
		//create 3 ints that hold the value of the 3 numbers inputed
		int num1 = Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		int num3 = Integer.parseInt(num3Str);
		
		//declare maxNum and find the max of the three nums
		int maxNum = Math.max(Math.max(num1, num2), num3);
		
		lblmaxNum.setText(Integer.toString(maxNum));
	}
}
