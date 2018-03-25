import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GisolfiBlottoFrame extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenu mnTools = new JMenu("Tools");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenuItem mntmAddGame = new JMenuItem("Add Game");
	private final JMenuItem mntmSetSort = new JMenuItem("Set Sort");
	private final JMenuItem mntmSetFilter = new JMenuItem("Set Filter");
	private final JMenuItem mntmHelp = new JMenuItem("Help");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiBlottoFrame frame = new GisolfiBlottoFrame();
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
	public GisolfiBlottoFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Blotto ");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnTools);
		mntmAddGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmAddGame_actionPerformed(e);
			}
		});
		
		mnTools.add(mntmAddGame);
		
		mnTools.add(mntmSetSort);
		
		mnTools.add(mntmSetFilter);
		
		menuBar.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	//Add Game
	protected void do_mntmAddGame_actionPerformed(ActionEvent e) {
		GisolfiBlottoAddGameFrame AddGameframe = new GisolfiBlottoAddGameFrame();
		AddGameframe.setVisible(true);
		AddGameframe.setLocation(this.getX() + 30 , getY() + 30);
	}
}
