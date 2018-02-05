import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

public class GisolfiChallengeFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblRadioGroupVal = new JLabel("Radio Group Value:");
	private final JRadioButton rdbtnOne = new JRadioButton("One");
	private final JRadioButton rdbtnTwo = new JRadioButton("Two");
	private final JRadioButton rdbtnThree = new JRadioButton("Three");
	private final JRadioButton rdbtnFour = new JRadioButton("Four");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JSlider slider = new JSlider();
	private final JLabel lblSliderValue = new JLabel("Slider Value:");
	private final JCheckBox chckbxFirst = new JCheckBox("First");
	private final JCheckBox chckbxSecond = new JCheckBox("Second");
	private final JCheckBox chckbxThird = new JCheckBox("Third");
	private final JLabel lblCheckboxValue = new JLabel("Checkbox Value:");
	private final JSpinner spinner = new JSpinner();
	private final JLabel lblSpinnerValue = new JLabel("SpinnerValue:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiChallengeFrame frame = new GisolfiChallengeFrame();
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
	public GisolfiChallengeFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Challange");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblRadioGroupVal.setBounds(6, 6, 163, 16);
		
		contentPane.add(lblRadioGroupVal);
		buttonGroup.add(rdbtnOne);
		rdbtnOne.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnOne_stateChanged(e);
			}
		});
		rdbtnOne.setBounds(6, 34, 141, 23);
		
		contentPane.add(rdbtnOne);
		buttonGroup.add(rdbtnTwo);
		rdbtnTwo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnTwo_stateChanged(e);
			}
		});
		rdbtnTwo.setBounds(6, 69, 141, 23);
		
		contentPane.add(rdbtnTwo);
		buttonGroup.add(rdbtnThree);
		rdbtnThree.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnThree_stateChanged(e);
			}
		});
		rdbtnThree.setBounds(6, 104, 141, 23);
		
		contentPane.add(rdbtnThree);
		buttonGroup.add(rdbtnFour);
		rdbtnFour.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnFour_stateChanged(e);
			}
		});
		rdbtnFour.setBounds(6, 139, 141, 23);
		
		contentPane.add(rdbtnFour);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_slider_stateChanged(e);
			}
		});
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setBounds(6, 221, 212, 51);
		
		contentPane.add(slider);
		lblSliderValue.setBounds(230, 239, 105, 16);
		
		contentPane.add(lblSliderValue);
		
		chckbxFirst.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxFirst_stateChanged(e);
			}
		});
		chckbxFirst.setBounds(159, 34, 128, 23);
		
		contentPane.add(chckbxFirst);
		chckbxSecond.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxSecond_stateChanged(e);
			}
		});
		chckbxSecond.setBounds(159, 69, 128, 23);
		
		contentPane.add(chckbxSecond);
		chckbxThird.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxThird_stateChanged(e);
			}
		});
		chckbxThird.setBounds(159, 104, 128, 23);
		
		contentPane.add(chckbxThird);
		lblCheckboxValue.setBounds(159, 6, 176, 16);
		
		contentPane.add(lblCheckboxValue);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_spinner_stateChanged(e);
			}
		});
		spinner.setBounds(251, 160, 48, 26);
		
		contentPane.add(spinner);
		lblSpinnerValue.setBounds(311, 165, 121, 16);
		
		contentPane.add(lblSpinnerValue);
		
		lblSliderValue.setText("Slider Value: " + slider.getValue());
		
		lblSpinnerValue.setText("Spinner Value: " + spinner.getValue());
	}
	
	//Radio Buttons
	protected void do_rdbtnOne_stateChanged(ChangeEvent e) {
		lblRadioGroupVal.setText("Radio Group Value: " + rdbtnOne.getText());
	}
	protected void do_rdbtnTwo_stateChanged(ChangeEvent e) {
		lblRadioGroupVal.setText("Radio Group Value: " + rdbtnTwo.getText());
	}
	protected void do_rdbtnThree_stateChanged(ChangeEvent e) {
		lblRadioGroupVal.setText("Radio Group Value: " + rdbtnThree.getText());
	}
	protected void do_rdbtnFour_stateChanged(ChangeEvent e) {
		lblRadioGroupVal.setText("Radio Group Value: " + rdbtnFour.getText());
	}
	
	//Slider
	protected void do_slider_stateChanged(ChangeEvent e) {
		lblSliderValue.setText("Slider Value: " + slider.getValue());
	}
	
	//Check Boxes
	public void checkboxHandeler(String selectedBox) {
	String box1Val = chckbxFirst.getText();
	String box2Val = chckbxSecond.getText();
	String box3Val = chckbxThird.getText();
	String chckbxVal = "Checkbox Value:";
	
	if (chckbxFirst.isSelected()) {
		chckbxVal += " " + box1Val;
		
	}else if (chckbxSecond.isSelected()){
		chckbxVal += " " + box2Val;
		
	}else if (chckbxThird.isSelected()) {
		chckbxVal += " " + box3Val;
	}
	
	lblCheckboxValue.setText(chckbxVal);
	}
	
	protected void do_chckbxFirst_stateChanged(ChangeEvent e) {
//		lblCheckboxValue.setText("Checkbox Value: " + chckbxFirst.getText());
		String selectedBox = "First";
		checkboxHandeler(String selectedBox);
	}
	protected void do_chckbxSecond_stateChanged(ChangeEvent e) {
//		lblCheckboxValue.setText("Checkbox Value: " + chckbxSecond.getText());
		String selectedBox = "Second";
		checkboxHandeler(String selectedBox);
	}
	protected void do_chckbxThird_stateChanged(ChangeEvent e) {
//		lblCheckboxValue.setText("Checkbox Value: " + chckbxThird.getText());
		String selectedBox = "Thrid";
		checkboxHandeler(String selectedBox);
	}
	
	
	//Spinner
	protected void do_spinner_stateChanged(ChangeEvent e) {
		lblSpinnerValue.setText("Spinner Value: " + spinner.getValue());
	}
}
