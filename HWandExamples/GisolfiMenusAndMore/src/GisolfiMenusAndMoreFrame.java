import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class GisolfiMenusAndMoreFrame extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenu mnEdit = new JMenu("Edit");
	private final JMenu mnCopy = new JMenu("Copy");
	private final JLabel lblMenuChoice = new JLabel("Menu Choice: ");
	private final JLabel lblChoice = new JLabel("Choice: ");
	private final JMenuItem mntmNew = new JMenuItem("New");
	private final JProgressBar progressBar = new JProgressBar();
	private final JButton btnRun = new JButton("Run");
	private final JButton btnReset = new JButton("Reset");
	private final JButton btnPrint = new JButton("Print");
	private final JLabel lblShowPass = new JLabel("Password: ");
	private final JPasswordField passwordField = new JPasswordField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiMenusAndMoreFrame frame = new GisolfiMenusAndMoreFrame();
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
	public GisolfiMenusAndMoreFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Menus and More");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmNew_actionPerformed(e);
			}
		});
		
		mnFile.add(mntmNew);
		
		menuBar.add(mnEdit);
		
		mnEdit.add(mnCopy);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblMenuChoice.setBounds(6, 157, 150, 16);
		
		contentPane.add(lblMenuChoice);
		lblChoice.setBounds(6, 185, 93, 16);
		
		contentPane.add(lblChoice);
		progressBar.setBounds(206, 157, 218, 20);
		
		contentPane.add(progressBar);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnRun_actionPerformed(e);
			}
		});
		btnRun.setBounds(193, 189, 117, 29);
		
		contentPane.add(btnRun);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnReset_actionPerformed(e);
			}
		});
		btnReset.setBounds(322, 189, 117, 29);
		
		contentPane.add(btnReset);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPrint_actionPerformed(e);
			}
		});
		btnPrint.setBounds(307, 54, 117, 29);
		
		contentPane.add(btnPrint);
		lblShowPass.setBounds(166, 30, 134, 16);
		
		contentPane.add(lblShowPass);
		passwordField.setBounds(312, 25, 112, 26);
		
		contentPane.add(passwordField);
	}
	protected void do_mntmNew_actionPerformed(ActionEvent e) {
		lblChoice.setText("Choice: New");
	}
	protected void do_btnRun_actionPerformed(ActionEvent e) {
		int x = progressBar.getValue();
		progressBar.setValue(x + 10);
	}
	protected void do_btnReset_actionPerformed(ActionEvent e) {
		progressBar.setValue(0);
	}
	protected void do_btnPrint_actionPerformed(ActionEvent e) {
		lblShowPass.setText("Password: " + passwordField.getText());
		
	}
}
