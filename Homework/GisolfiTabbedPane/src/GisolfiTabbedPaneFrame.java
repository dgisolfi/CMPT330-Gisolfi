import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiTabbedPaneFrame extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel namePanel = new JPanel();
	private final JPanel addressPanel = new JPanel();
	private final JPanel summaryPanel = new JPanel();
	private final JLabel lblName = new JLabel("Name: ");
	private final JTextField nameTF = new JTextField();
	private final JLabel lblAddress = new JLabel("Address: ");
	private final JTextField addressTF = new JTextField();
	private final JLabel lblNameSummary = new JLabel("Name: ");
	private final JLabel lblAddressSummary = new JLabel("Address: ");
	private final JLabel lblCity = new JLabel("City: ");
	private final JLabel lblState = new JLabel("State: ");
	private final JLabel lblZip = new JLabel("ZIP: ");
	private final JTextField cityTF = new JTextField();
	private final JTextField stateTF = new JTextField();
	private final JTextField zipTF = new JTextField();
	private final JButton btnExit = new JButton("Exit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiTabbedPaneFrame frame = new GisolfiTabbedPaneFrame();
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
	public GisolfiTabbedPaneFrame() {
		zipTF.setBounds(169, 178, 49, 26);
		zipTF.setColumns(10);
		stateTF.setBounds(169, 150, 49, 26);
		stateTF.setColumns(10);
		cityTF.setBounds(169, 122, 130, 26);
		cityTF.setColumns(10);
		addressTF.setBounds(169, 84, 130, 26);
		addressTF.setColumns(10);
		nameTF.setBounds(166, 90, 130, 26);
		nameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Tabbed Panes and More");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_tabbedPane_stateChanged(e);
			}
		});
		tabbedPane.setBounds(6, 6, 524, 323);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Name", null, namePanel, null);
		namePanel.setLayout(null);
		lblName.setBounds(93, 95, 61, 16);
		
		namePanel.add(lblName);
		
		namePanel.add(nameTF);
		
		tabbedPane.addTab("Address", null, addressPanel, null);
		addressPanel.setLayout(null);
		lblAddress.setBounds(96, 89, 61, 16);
		
		addressPanel.add(lblAddress);
		
		addressPanel.add(addressTF);
		lblCity.setBounds(96, 127, 61, 16);
		
		addressPanel.add(lblCity);
		lblState.setBounds(96, 155, 61, 16);
		
		addressPanel.add(lblState);
		lblZip.setBounds(96, 183, 61, 16);
		
		addressPanel.add(lblZip);
		
		addressPanel.add(cityTF);
		
		addressPanel.add(stateTF);
		
		addressPanel.add(zipTF);
		
		tabbedPane.addTab("Summary", null, summaryPanel, null);
		summaryPanel.setLayout(null);
		lblNameSummary.setBounds(79, 105, 178, 16);
		
		summaryPanel.add(lblNameSummary);
		lblAddressSummary.setBounds(79, 134, 371, 16);
		
		summaryPanel.add(lblAddressSummary);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExit_actionPerformed(e);
			}
		});
		btnExit.setBounds(198, 172, 117, 29);
		
		summaryPanel.add(btnExit);
	}
	protected void do_tabbedPane_stateChanged(ChangeEvent e) {
		lblNameSummary.setText("Name: " + nameTF.getText());
		lblAddressSummary.setText("Address: " + addressTF.getText());
	}
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
