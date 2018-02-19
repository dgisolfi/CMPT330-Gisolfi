import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Dimension;

public class GisolfiScrollTabPaneFrame extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JScrollPane scrollPane = new JScrollPane();
	private final JPanel panel = new JPanel();
	private final JLabel lblHello = new JLabel("hello");
	private final JLabel lblGoodbye = new JLabel("goodbye");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiScrollTabPaneFrame frame = new GisolfiScrollTabPaneFrame();
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
	public GisolfiScrollTabPaneFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Scroll Tab Pane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(6, 6, 688, 792);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("New tab", null, scrollPane, null);
		panel.setPreferredSize(new Dimension(680, 980));
		
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		lblHello.setBounds(113, 85, 61, 16);
		
		panel.add(lblHello);
		lblGoodbye.setBounds(131, 570, 61, 16);
		
		panel.add(lblGoodbye);
	}

}
