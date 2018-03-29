import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	private final JButton btnClearSortAnd = new JButton("Clear Sort");
	private final priceType  thePriceFilter = new priceType();
	private final JButton btnApplySortAnd = new JButton("Apply Sort and Filters");
	private final gameFilter  theGameFilter = new gameFilter();
	private final JButton btnClearPriceFilter = new JButton("Clear Price Filter");
	private final JButton btnClearGameFilter = new JButton("Clear Game Filter");
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
		setBounds(100, 100, 542, 382);
		
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
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmHelp_actionPerformed(e);
			}
		});
		
		menuBar.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setBounds(6, 6, 530, 215);
		
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
		btnClearSortAnd.setBounds(379, 303, 157, 29);
		
		contentPane.add(btnClearSortAnd);
		btnApplySortAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnApplySortAnd_actionPerformed(e);
			}
		});
		btnApplySortAnd.setBounds(170, 250, 185, 29);
		
		contentPane.add(btnApplySortAnd);
		btnClearPriceFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClearPriceFilter_actionPerformed(e);
			}
		});
		btnClearPriceFilter.setBounds(182, 303, 157, 29);
		
		contentPane.add(btnClearPriceFilter);
		btnClearGameFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClearGameFilter_actionPerformed(e);
			}
		});
		btnClearGameFilter.setBounds(6, 303, 157, 29);
		
		contentPane.add(btnClearGameFilter);
	}

	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		//close the program
		System.exit(0);
	}
	
	//Add Game
	protected void do_mntmAddGame_actionPerformed(ActionEvent e) {
		//open a new instance of the add game frame
		GisolfiBlottoAddGameFrame AddGameframe = new GisolfiBlottoAddGameFrame();
		AddGameframe.setVisible(true);
		AddGameframe.setLocation(this.getX() + 30 , getY() + 30);
	}
	protected void do_mntmGameName_actionPerformed(ActionEvent e) {
		//apply the current sort by graying out the selected and running the query builder
		mntmGameName.setEnabled(false);
		mntmTopPrize.setEnabled(true);
		mntmGameType.setEnabled(true);
		String query = queryBuilder();
		refreshTable(query);
	}
	protected void do_mntmTopPrize_actionPerformed(ActionEvent e) {
		//apply the current sort by graying out the selected and running the query builder
		mntmGameName.setEnabled(true);
		mntmTopPrize.setEnabled(false);
		mntmGameType.setEnabled(true);
		String query = queryBuilder();
		refreshTable(query);
	}
	protected void do_mntmGameType_actionPerformed(ActionEvent e) {
		//apply the current sort by graying out the selected and running the query builder
		mntmGameName.setEnabled(true);
		mntmTopPrize.setEnabled(true);
		mntmGameType.setEnabled(false);
		String query = queryBuilder();
		refreshTable(query);
	}
	
	public String queryBuilder() {
		//the base query
		String query = ("SELECT GameID, GameName, GameType, Price, TopPrize, NumPrinted, NumWinners"
					+ " FROM Games"
					+ " WHERE(1=1)");
		//Build Query
		
		
		//price
		//get all price dependent class vars
		String price = thePriceFilter.getPrice();
		String greaterPrice = thePriceFilter.getGreaterPrice();
		String filter = thePriceFilter.getFilter();
		
		//gametype
		//get all gametype dependent class vars
		String selectedgames = theGameFilter.getGames();
		selectedgames += " defualt";
		System.out.println(selectedgames);
		String[] games = selectedgames.split(" ");
		
		//If either filter setting is applied add the AND(1=0) 
		//additionally find the exact game or price modifier and add it to the query
		if (filter != null || theGameFilter.getSort() == true) {
			query += " AND(1=0 ";
		
			if (filter == "less than") {
				query += "OR Price < " + price;
			}else if (filter == "Greater than") {
				query += "OR Price > " + price;	
			}else if (filter == "Between") {
				query += " OR Price < " + price + " OR Price > " + greaterPrice;			
			}
			
	
			if( Arrays.asList(games).contains("Bingo")) {
				query += " OR GameType = 'Bingo'";
			}
			if( Arrays.asList(games).contains("TriplePay")) {
				query += " OR GameType = 'TriplePay'";
			} 
			if( Arrays.asList(games).contains("88Fortunes")) {
				query += " OR GameType = '88Fortunes'";
			} 
			if( Arrays.asList(games).contains("Millionaire")) {
				query += " OR GameType = 'Millionaire'";
			}
			if( Arrays.asList(games).contains("CashWord")) {
				query += " OR GameType = 'CashWord'";
			}
			if( Arrays.asList(games).contains("JumboBucks")) {
				query += " OR GameType = 'JumboBucks'";
			}
			if( Arrays.asList(games).contains("MoneyVault")) {
				query += " OR GameType = 'MoneyVault'";
			}
			if( Arrays.asList(games).contains("'CashForLife'")) {
				query += " OR GameType = 'CashForLife'";
			}
			
			query += " )";
		
		}

		
		//Sorts
		//when a sort is selected use the cheaty way to determine which was
		//selcted and then add the modifier to the query
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
		//Declare a function able to refresh the table no matter what modifiers
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
		//set all class variables and modifiers back to normal to reset the program
		mntmGameName.setEnabled(true);
		mntmTopPrize.setEnabled(true);
		mntmGameType.setEnabled(true);
		
		thePriceFilter.setPrice("0");
		thePriceFilter.setGreaterPrice("0");
		thePriceFilter.setFilter("defualt");
		
		theGameFilter.setGames("defualt");
		
		String sort = queryBuilder();
		refreshTable(sort);
		
	}
	protected void do_mntmByPrice_actionPerformed(ActionEvent e) {
		GisolfiBlottoFilterByPriceFrame FilterByPriceframe = new GisolfiBlottoFilterByPriceFrame(thePriceFilter);
		FilterByPriceframe.setVisible(true);
		FilterByPriceframe.setLocation(this.getX() + 30 , getY() + 30);
		
	}
	protected void do_mntmByGameType_actionPerformed(ActionEvent e) {
		GisolfiBlottoFilterByGameTypeFrame FilterByGameTypeframe = new GisolfiBlottoFilterByGameTypeFrame(theGameFilter);
		FilterByGameTypeframe.setVisible(true);
		FilterByGameTypeframe.setLocation(this.getX() + 30 , getY() + 30);
	}
	protected void do_btnApplySortAnd_actionPerformed(ActionEvent e) {
		//force run a query builder and query execution
		String applySortsQuery = queryBuilder();
		refreshTable(applySortsQuery);
	}
	protected void do_btnClearGameFilter_actionPerformed(ActionEvent e) {
		//force remove and rerun game filter
		theGameFilter.setGames("defualt");
		String sort = queryBuilder();
		refreshTable(sort);
	}
	protected void do_btnClearPriceFilter_actionPerformed(ActionEvent e) {
		//force re move price filter 
		thePriceFilter.setPrice("0");
		thePriceFilter.setGreaterPrice("0");
		thePriceFilter.setFilter("defualt");
		
		String sort = queryBuilder();
		refreshTable(sort);
		
	}
	public void helpMsg(String msg) {
		//allow for any help menu to appear if needed 
		Component frame = null;
		//Error messages for all errors within form
		JOptionPane.showMessageDialog(frame, msg);
	}
	protected void do_mntmHelp_actionPerformed(ActionEvent e) {
		//send the help info to the pop up because theres no reason to make a whole frame for some text
		helpMsg("Add a Game: to add a game click Tools > Add Game. This will pop up a window to input all required data,\n"
				+ " ensure the game ID and game Name have not been used in the database already.\n"
				+ "\n " + 
				"Sorting: To sort the outputs of the Database go to Tools > Set Sort and choose the appropriate sort\n "
				+ "option. It will refresh automatically. Click the clear sort button below to remove the sort\n"
				+ "\n " + 
				"Filters: To filter you can either go to Tools > Filter by > Game Type or Price. Each will bring\n "
				+ "up its own window where you may enter data to use in filtering the database. This will not auto refresh\n"
				+ " to apply it press the top button below. Additionally there are to corresponding buttons at the bottom\n "
				+ "to clear these sorts");
	}
}

