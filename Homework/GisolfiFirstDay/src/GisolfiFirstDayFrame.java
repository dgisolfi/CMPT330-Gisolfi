import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiFirstDayFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHello = new JLabel("Hello");
	private final JLabel lblGoodbye = new JLabel("Goodbye");
	private final JButton btnNewButton = new JButton("Switch Text");
	private final JLabel lblDaniel = new JLabel("Daniel");
	private final JButton btnSwitf = new JButton("Switch Color");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiFirstDayFrame frame = new GisolfiFirstDayFrame();
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
	public GisolfiFirstDayFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi First Day Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHello.setFont(new Font("Franklin Gothic Heavy", Font.BOLD | Font.ITALIC, 37));
		lblHello.setForeground(Color.RED);
		lblHello.setBounds(10, 0, 225, 38);
		
		contentPane.add(lblHello);
		lblGoodbye.setForeground(Color.BLUE);
		lblGoodbye.setFont(new Font("Franklin Gothic Heavy", Font.BOLD | Font.ITALIC, 42));
		lblGoodbye.setBounds(199, 172, 214, 78);
		
		contentPane.add(lblGoodbye);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btnNewButton.setBounds(10, 50, 117, 23);
		
		contentPane.add(btnNewButton);
		lblDaniel.setForeground(new Color(0, 128, 0));
		lblDaniel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 37));
		lblDaniel.setBounds(94, 95, 225, 53);
		
		contentPane.add(lblDaniel);
		btnSwitf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Get the current color in each label
				Color helloTempColor = lblHello.getForeground();
				Color nameTempColor = lblDaniel.getForeground();
				Color goodbyeTempColor = lblGoodbye.getForeground();
				
				//Set Name Label to Goodbye label
				lblDaniel.setForeground(helloTempColor);
				//Set Goodbye label to Hello label
				lblGoodbye.setForeground(nameTempColor);
				//Set hello label to Name
				lblHello.setForeground(goodbyeTempColor);
			}
		});
		btnSwitf.setBounds(10, 71, 117, 29);
		
		contentPane.add(btnSwitf);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		//Get the current text in each label
		String helloTemp = lblHello.getText();
		String nameTemp = lblDaniel.getText();
		String goodbyeTemp = lblGoodbye.getText();
		
		//Set Name Label to Goodbye label
		lblDaniel.setText(helloTemp);
		//Set Goodbye label to Hello label
		lblGoodbye.setText(nameTemp);
		//Set hello label to Name
		lblHello.setText(goodbyeTemp);
	}
}
