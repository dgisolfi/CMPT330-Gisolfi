import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class GisolfiMoreControlsFrame extends JFrame {

	private JPanel contentPane;
	private final JRadioButton rdbtnFirst = new JRadioButton("First");
	private final JRadioButton rdbtnSecond = new JRadioButton("Second");
	private final JRadioButton rdbtnThird = new JRadioButton("Third");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JCheckBox chckbxOne = new JCheckBox("One");
	private final JCheckBox chckbxTwo = new JCheckBox("Two");
	private final JCheckBox chckbxThree = new JCheckBox("Three");
	private final JCheckBox chckbxFour = new JCheckBox("Four");
	private final JSlider slider = new JSlider();
	private final JLabel lblValue = new JLabel("Value:");
	private final JLabel lblRadiogroup = new JLabel("RadioGroup:");
	private final JLabel lblCheckboxes = new JLabel("Checkboxes:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiMoreControlsFrame frame = new GisolfiMoreControlsFrame();
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
	public GisolfiMoreControlsFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi More Controls");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		buttonGroup.add(rdbtnFirst);
		rdbtnFirst.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnFirst_stateChanged(e);
			}
		});
		rdbtnFirst.setBounds(6, 56, 141, 23);
		
		contentPane.add(rdbtnFirst);
		buttonGroup.add(rdbtnSecond);
		rdbtnSecond.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnSecond_stateChanged(e);
			}
		});
		rdbtnSecond.setBounds(6, 91, 141, 23);
		
		contentPane.add(rdbtnSecond);
		buttonGroup.add(rdbtnThird);
		rdbtnThird.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnThird_stateChanged(e);
			}
		});
		rdbtnThird.setBounds(6, 126, 141, 23);
		
		contentPane.add(rdbtnThird);
		chckbxOne.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxOne_stateChanged(e);
			}
		});
		chckbxOne.setBounds(159, 56, 128, 23);
		
		contentPane.add(chckbxOne);
		chckbxTwo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxTwo_stateChanged(e);
			}
		});
		chckbxTwo.setBounds(159, 91, 128, 23);
		
		contentPane.add(chckbxTwo);
		chckbxThree.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxThree_stateChanged(e);
			}
		});
		chckbxThree.setBounds(159, 126, 128, 23);
		
		contentPane.add(chckbxThree);
		chckbxFour.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxFour_stateChanged(e);
			}
		});
		chckbxFour.setBounds(159, 161, 128, 23);
		
		contentPane.add(chckbxFour);
		slider.setValue(0);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_slider_stateChanged(e);
			}
		});
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(20);
		slider.setBounds(6, 224, 215, 37);
		
		contentPane.add(slider);
		lblValue.setToolTipText("Current Value of the Slider");
		lblValue.setBounds(233, 224, 73, 16);
		lblValue.setText("Value: " + slider.getValue());
		
		contentPane.add(lblValue);
		lblRadiogroup.setBounds(6, 28, 133, 16);
		
		contentPane.add(lblRadiogroup);
		lblCheckboxes.setBounds(159, 28, 268, 16);
		
		contentPane.add(lblCheckboxes);
	}
	//Slider
	protected void do_slider_stateChanged(ChangeEvent e) {
		lblValue.setText("Value: " + slider.getValue());
	}
	
	//Radio Buttons
	protected void do_rdbtnThird_stateChanged(ChangeEvent e) {
		lblRadiogroup.setText("RadioGroup: " + rdbtnThird.getText());
	}
	protected void do_rdbtnFirst_stateChanged(ChangeEvent e) {
		lblRadiogroup.setText("RadioGroup: " + rdbtnFirst.getText());
	}
	protected void do_rdbtnSecond_stateChanged(ChangeEvent e) {
		lblRadiogroup.setText("RadioGroup: " + rdbtnSecond.getText());
	}
	
//	public void checkboxHandeler() {
//		String box1Val = chckbxOne.getText();
//		String box2Val = chckbxTwo.getText();
//		String box3Val = chckbxThree.getText();
//		String box4Val = chckbxFour.getText();
//		String chckbxVal = "Checkboxes:";
//		
//		if (chckbxOne.isSelected()) {
//			chckbxVal += " " + box1Val;
//			
//		}else if (chckbxTwo.isSelected()){
//			chckbxVal += " " + box2Val;
//			
//		}else if (chckbxThree.isSelected()) {
//			chckbxVal += " " + box3Val;
//			
//		}else if (chckbxFour.isSelected()) {
//			chckbxVal += " " + box4Val;
//			
//		}
//		
//		lblCheckboxes.setText(chckbxVal);
//	}
	
	//Check boxes
	protected void do_chckbxTwo_stateChanged(ChangeEvent e) {
		lblCheckboxes.setText("Checkboxes: " +chckbxTwo.getText());
//		checkboxHandeler();
	}
	protected void do_chckbxFour_stateChanged(ChangeEvent e) {
		lblCheckboxes.setText("Checkboxes: " +chckbxFour.getText());
//		checkboxHandeler();
	}
	protected void do_chckbxOne_stateChanged(ChangeEvent e) {
		lblCheckboxes.setText("Checkboxes: " +chckbxOne.getText());
//		checkboxHandeler();
	}
	protected void do_chckbxThree_stateChanged(ChangeEvent e) {
		lblCheckboxes.setText("Checkboxes: " + chckbxThree.getText());
//		checkboxHandeler();
	}
}
