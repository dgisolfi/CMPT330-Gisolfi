import java.awt.BorderLayout;
import java.awt.Color;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;

public class GisolfiBlottoFrame extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenu mnTools = new JMenu("Tools");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenuItem mntmAddGame = new JMenuItem("Add Game");
	private final JMenuItem mntmHelp = new JMenuItem("Help");
	private final JTable outputTA = new JTable();
	private final JMenu mnSort = new JMenu("Set Sort");
	private final JMenu mnFilter = new JMenu("Set Filter");
	private final JMenuItem mntmGameName = new JMenuItem("Game Name");
	private final JMenuItem mntmGameType = new JMenuItem("Game Type");
	private final JMenuItem mntmTopPrize = new JMenuItem("Top Prize");
	private final JMenuItem mntmByPrice = new JMenuItem("By Price");
	private final JMenuItem mntmByGameType = new JMenuItem("By Game Type");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JButton btnClearSortAnd = new JButton("Clear Sort and Filters");
	private final priceType  thePriceFilter = new priceType();
	private final JButton btnApplySortAnd = new JButton("Apply Sort and Filters");

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
		setBounds(100, 100, 472, 300);
		
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
		
		mnTools.add(mnSort);
		mntmGameName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmGameName_actionPerformed(e);
			}
		});
		
		mnSort.add(mntmGameName);
		mntmTopPrize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmTopPrize_actionPerformed(e);
			}
		});
		
		mnSort.add(mntmTopPrize);
		mntmGameType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmGameType_actionPerformed(e);
			}
		});
		
		mnSort.add(mntmGameType);
		
		mnTools.add(mnFilter);
		mntmByPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByPrice_actionPerformed(e);
			}
		});
		
		mnFilter.add(mntmByPrice);
		mntmByGameType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmByGameType_actionPerformed(e);
			}
		});
		
		mnFilter.add(mntmByGameType);
		
		menuBar.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setBounds(6, 6, 460, 161);
		
		contentPane.add(scrollPane);
		outputTA.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"GameID", "GameName", "GameType", "Price", "TopPrize", "NumPrinted", "NumWinners"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Double.class, Double.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(outputTA);
		btnClearSortAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClearSortAnd_actionPerformed(e);
			}
		});
		btnClearSortAnd.setBounds(291, 196, 175, 29);
		
		contentPane.add(btnClearSortAnd);
		btnApplySortAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnApplySortAnd_actionPerformed(e);
			}
		});
		btnApplySortAnd.setBounds(6, 196, 185, 29);
		
		contentPane.add(btnApplySortAnd);
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
	protected void do_mntmGameName_actionPerformed(ActionEvent e) {
		String query = queryBuilder();
		refreshTable(query);
		mntmGameName.setEnabled(false);
		mntmTopPrize.setEnabled(true);
		mntmGameType.setEnabled(true);
	}
	protected void do_mntmTopPrize_actionPerformed(ActionEvent e) {
		String query = queryBuilder();
		refreshTable(query);
		mntmGameName.setEnabled(true);
		mntmTopPrize.setEnabled(false);
		mntmGameType.setEnabled(true);
	}
	protected void do_mntmGameType_actionPerformed(ActionEvent e) {
		String query = queryBuilder();
		refreshTable(query);
		mntmGameName.setEnabled(true);
		mntmTopPrize.setEnabled(true);
		mntmGameType.setEnabled(false);
	}
	
	public String queryBuilder() {
		
		String query = ("SELECT GameID, GameName, GameType, Price, TopPrize, NumPrinted, NumWinners"
					+ " FROM Games"
					+ " WHERE(1=1)"
					+ " AND(1=0)");
		//Build Query
		
		//filters
		
		//price
		String price = thePriceFilter.getPrice();
		String greaterPrice = thePriceFilter.getGreaterPrice();
		String filter = thePriceFilter.getFilter();
				
		if (filter == "less than") {
			query += "OR Price < " + price;
		}else if (filter == "Greater than") {
			query += "OR Price > " + price;	
		}else if (filter == "Between") {
			query += "OR BETWEEN " + price + " AND " + greaterPrice;			
		}
		
		
		//gametype
		
		
		
		//Sorts
		if (mntmGameName.isEnabled() == false) {
			query += " ORDER BY GameName;";
		}else if (mntmTopPrize.isEnabled() == false) {
			query += " ORDER BY TopPrize DESC;";
		}else if (mntmGameType.isEnabled() == false) {
			query += " ORDER BY GameType;";
		}else {
			query+= " ORDER BY GameID;";
		}
			
		System.out.println(query);	
		return query;
	}
	
	public void refreshTable(String query) {
		ResultSet rs = null;
		Statement stmt = null;
		try {
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/daniel/Dropbox/Marist/Sophmore/Spring/SystemsDesign/GisolfiBlotto/GisolfiBlotto.accdb");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			rs = stmt.executeQuery(query);
			
			
			while(outputTA.getRowCount() > 0) {
				((DefaultTableModel) outputTA.getModel()).removeRow(0);
			}
			
			int numColumns = rs.getMetaData().getColumnCount();
			
			
			while (rs.next()) {
				Object[] row = new Object[numColumns];
				
				for (int i=0; i < numColumns; i++) {
					row[i] = rs.getObject(i+1);
				}
				
				((DefaultTableModel) outputTA.getModel()).insertRow(rs.getRow() - 1, row);
			}
			
			conn.close();
		
		}catch (SQLException ex){
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		} //catch
	}
	protected void do_btnClearSortAnd_actionPerformed(ActionEvent e) {
		String sort = queryBuilder();
		refreshTable(sort);
		mntmGameName.setEnabled(true);
		mntmTopPrize.setEnabled(true);
		mntmGameType.setEnabled(true);
		
	}
	protected void do_mntmByPrice_actionPerformed(ActionEvent e) {
		GisolfiBlottoFilterByPriceFrame FilterByPriceframe = new GisolfiBlottoFilterByPriceFrame(thePriceFilter);
		FilterByPriceframe.setVisible(true);
		FilterByPriceframe.setLocation(this.getX() + 30 , getY() + 30);
		
	}
	protected void do_mntmByGameType_actionPerformed(ActionEvent e) {
		GisolfiBlottoFilterByGameTypeFrame FilterByGameTypeframe = new GisolfiBlottoFilterByGameTypeFrame();
		FilterByGameTypeframe.setVisible(true);
		FilterByGameTypeframe.setLocation(this.getX() + 30 , getY() + 30);
	}
	protected void do_btnApplySortAnd_actionPerformed(ActionEvent e) {
		String applySortsQuery = queryBuilder();
		refreshTable(applySortsQuery);
	}
}

