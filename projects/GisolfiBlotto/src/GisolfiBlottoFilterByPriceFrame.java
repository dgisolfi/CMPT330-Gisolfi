import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;



public class GisolfiBlottoFilterByPriceFrame extends JFrame {

	private JPanel contentPane;
	private final JFormattedTextField lesserPriceFTF = new JFormattedTextField();
	
	//Define the Price mask
	MaskFormatter priceMask = createFormatter("##,###");
	private final JRadioButton rdbtnLessThan = new JRadioButton("Less than:");
	private final JRadioButton rdbtnGreaterThan = new JRadioButton("Greater than: ");
	private final JFormattedTextField lessRangeFTF = new JFormattedTextField();
	private final JFormattedTextField greaterRangeFTF = new JFormattedTextField();
	private final JRadioButton rdbtnBetween = new JRadioButton("Between: ");
	private final JLabel lblAnd = new JLabel("and");
	private final JFormattedTextField greaterPriceFTF = new JFormattedTextField();
	private final ButtonGroup rangeChoicebtnGroup = new ButtonGroup();
	private final JButton btnOk = new JButton("Ok");
	private final JButton btnCancel = new JButton("Cancel");
	
	private final priceType thing;

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
	public GisolfiBlottoFilterByPriceFrame() {
		jbInit();
		
		rangeChoicebtnGroup.add(rdbtnLessThan);
		rdbtnLessThan.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnLessThan_stateChanged(e);
			}
		});
		rdbtnLessThan.setBounds(6, 39, 141, 23);
		
		contentPane.add(rdbtnLessThan);
		rangeChoicebtnGroup.add(rdbtnGreaterThan);
		rdbtnGreaterThan.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnGreaterThan_stateChanged(e);
			}
		});
		rdbtnGreaterThan.setBounds(6, 76, 141, 23);
		
		contentPane.add(rdbtnGreaterThan);
		lessRangeFTF.setBounds(138, 110, 62, 26);
		
		contentPane.add(lessRangeFTF);
		greaterRangeFTF.setBounds(243, 110, 62, 26);
		
		contentPane.add(greaterRangeFTF);
		rangeChoicebtnGroup.add(rdbtnBetween);
		rdbtnBetween.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_rdbtnBetween_stateChanged(e);
			}
		});
	
		rdbtnBetween.setBounds(6, 111, 141, 23);
		
		contentPane.add(rdbtnBetween);
		lblAnd.setBounds(207, 115, 61, 16);
		
		contentPane.add(lblAnd);
		greaterPriceFTF.setBounds(138, 76, 62, 26);
		
		contentPane.add(greaterPriceFTF);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnOk_actionPerformed(e);
			}
		});
		btnOk.setBounds(27, 179, 117, 29);
		
		contentPane.add(btnOk);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		btnCancel.setBounds(159, 179, 117, 29);
		
		contentPane.add(btnCancel);
		priceType it = null;
		thing = it;
	}
	private void jbInit() {
		setTitle("Filter By Price");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 317, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lesserPriceFTF.setBounds(138, 38, 62, 26);
		
		contentPane.add(lesserPriceFTF);
		
		priceMask.setPlaceholderCharacter('0');
		priceMask.install(lesserPriceFTF);
		priceMask.install(lessRangeFTF);
		priceMask.install(greaterRangeFTF);
		priceMask.install(greaterRangeFTF);
	}
	
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnOk_actionPerformed(ActionEvent e) {
		//Find the text feild the val is in
		if (rdbtnLessThan.isSelected()) {
			thing.setPrice(lesserPriceFTF.getText().trim());
		}else if (rdbtnGreaterThan.isSelected()) {
			thing.setPrice(greaterPriceFTF.getText().trim());
		}else if (rdbtnBetween.isSelected()) {
			thing.setPrice(lessRangeFTF.getText().trim() + greaterRangeFTF.getText().trim());
		}
		
		this.dispose();
	}
	protected void do_rdbtnGreaterThan_stateChanged(ChangeEvent e) {
		lesserPriceFTF.setEnabled(false);
		greaterPriceFTF.setEnabled(true);
		
		greaterRangeFTF.setEnabled(false);
		lblAnd.setEnabled(false);
		lessRangeFTF.setEnabled(false);
	
	}
	protected void do_rdbtnLessThan_stateChanged(ChangeEvent e) {
		lesserPriceFTF.setEnabled(true);
		greaterPriceFTF.setEnabled(false);
		
		greaterRangeFTF.setEnabled(false);
		lblAnd.setEnabled(false);
		lessRangeFTF.setEnabled(false);
		
	}
	protected void do_rdbtnBetween_stateChanged(ChangeEvent e) {
		lesserPriceFTF.setEnabled(false);
		greaterPriceFTF.setEnabled(false);
		
		greaterRangeFTF.setEnabled(true);
		lblAnd.setEnabled(true);
		lessRangeFTF.setEnabled(true);	
	}
	
	
	
}
