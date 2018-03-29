import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GisolfiBlottoAddGameFrame extends JFrame {

	private JPanel contentPane;
	private final JButton btnOk = new JButton("OK");
	private final JButton btnCancel = new JButton("Cancel");
	private final JTextField gameNameTF = new JTextField();
	private final JComboBox gameTypeCB = new JComboBox();
	private final JSpinner numPrintedSpin = new JSpinner();
	private final JSpinner numWinnersSpin = new JSpinner();
	private final JLabel lblGameid = new JLabel("GameID: ");
	private final JLabel lblGameName = new JLabel("Game Name:");
	private final JLabel lblGameType = new JLabel("Game Type:");
	private final JLabel lblGamePrice = new JLabel("Game Price: ");
	private final JLabel lblGameTopPrize = new JLabel("Game Top Prize: ");
	private final JLabel lblNumTickets = new JLabel("Number of tickets: ");
	private final JLabel lblWinningTickets = new JLabel("Winning Tickets: ");
	private final JLabel lblAddANew = new JLabel("Add a New Game");
	private final JFormattedTextField gameIDFTF = new JFormattedTextField();

	//Define the Game ID Mask
	MaskFormatter idMask = createFormatter("###");
	
	//Define the Price mask
	MaskFormatter priceMask = createFormatter("##,###");
	
	//Define the top Prize mask
	MaskFormatter topPrizeMask = createFormatter("###,###,###");
	private final JSpinner priceSpin = new JSpinner();
	private final JSpinner prizeSpin = new JSpinner();
	
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
	
	
	public GisolfiBlottoAddGameFrame() {
		gameNameTF.setBounds(219, 71, 130, 26);
		gameNameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Blotto Add Game");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnOk_actionPerformed(e);
			}
		});
		btnOk.setBounds(57, 312, 117, 29);
		
		contentPane.add(btnOk);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		btnCancel.setBounds(232, 312, 117, 29);
		
		contentPane.add(btnCancel);
		
		contentPane.add(gameNameTF);
		gameTypeCB.setModel(new DefaultComboBoxModel(new String[] {"…", "Bingo", "TriplePay", "88Fortunes", "Millionaire", "CashWord", "JumboBucks", "MoneyVault", "CashForLife "}));
		gameTypeCB.setBounds(219, 109, 130, 27);
		
		contentPane.add(gameTypeCB);
		numPrintedSpin.setBounds(219, 224, 55, 26);
		
		contentPane.add(numPrintedSpin);
		numWinnersSpin.setBounds(219, 262, 55, 26);
		
		contentPane.add(numWinnersSpin);
		
		lblGameid.setBounds(57, 38, 61, 16);
		
		contentPane.add(lblGameid);
		lblGameName.setBounds(57, 76, 91, 16);
		
		contentPane.add(lblGameName);
		lblGameType.setBounds(57, 113, 91, 16);
		
		contentPane.add(lblGameType);
		lblGamePrice.setBounds(57, 153, 91, 16);
		
		contentPane.add(lblGamePrice);
		lblGameTopPrize.setBounds(57, 191, 117, 16);
		
		contentPane.add(lblGameTopPrize);
		lblNumTickets.setBounds(57, 229, 141, 16);
		
		contentPane.add(lblNumTickets);
		lblWinningTickets.setBounds(57, 267, 141, 16);
		
		contentPane.add(lblWinningTickets);
		lblAddANew.setBounds(172, 5, 117, 16);
		
		contentPane.add(lblAddANew);
		gameIDFTF.setBounds(219, 33, 38, 26);
		
		contentPane.add(gameIDFTF);
		
		//Associate all masks
		idMask.setPlaceholderCharacter('0');
		idMask.install(gameIDFTF);
		priceMask.setPlaceholderCharacter('0');
		topPrizeMask.setPlaceholderCharacter('0');
		priceSpin.setBounds(219, 148, 55, 26);
		
		contentPane.add(priceSpin);
		prizeSpin.setBounds(219, 186, 55, 26);
		
		contentPane.add(prizeSpin);
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnOk_actionPerformed(ActionEvent e) {

		 if (checkAllVals() == true){
			ResultSet rs = null;
			Statement stmt = null;
			//establish the connection
			gameIDFTF.setForeground(Color.BLACK);
			gameNameTF.setForeground(Color.BLACK);
			gameTypeCB.setForeground(Color.BLACK);
			priceSpin.setForeground(Color.BLACK);
			prizeSpin.setForeground(Color.BLACK);
			numPrintedSpin.setForeground(Color.BLACK);
			numWinnersSpin.setForeground(Color.BLACK);
		
			try {
				Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/daniel/Dropbox/Marist/Sophmore/Spring/SystemsDesign/GisolfiBlotto/GisolfiBlotto.accdb");
				stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				String query = "INSERT INTO Games(GameID, GameName, GameType, Price, TopPrize, NumPrinted, NumWinners) VALUES (";
				query += gameIDFTF.getText().trim() + ", ";
				query += "'" + gameNameTF.getText().trim() + "',";
				query += "'" + gameTypeCB.getSelectedItem().toString().trim() + "', ";
				query += priceSpin.getValue().toString().trim() + ", ";
				query += prizeSpin.getValue().toString().trim() + ", ";
				query += numPrintedSpin.getValue().toString().trim() + ", ";
				query += numWinnersSpin.getValue().toString().trim() + ")";

				System.out.println(query);

				if (stmt.executeUpdate(query) != 0) {
					System.out.println("Success");
				}else {
						System.out.println("Nope");
				}
				conn.close();
				this.dispose();
		
			}catch (SQLException ex){
				System.out.println("SQL Exception: " + ex.getMessage());
				System.out.println("SQL State: " + ex.getSQLState());
				System.out.println("Vendor Error: " + ex.getErrorCode());
				ex.printStackTrace();
			} //catch
		}
	}
	
	
	public boolean checkAllVals() {
	
		Statement stmt = null;
		ResultSet rs = null; //will hold the records
		
		try {
			boolean err = false;
			//establish the connection
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/daniel/Dropbox/Marist/Sophmore/Spring/SystemsDesign/GisolfiBlotto/GisolfiBlotto.accdb");
			
			stmt = conn.createStatement();
			
			//Validate ID
			String testIDQuery = "SELECT * FROM Games WHERE GameID = '" + gameIDFTF.getText().trim() + "'";
			System.out.println(testIDQuery);
			rs = stmt.executeQuery(testIDQuery);
			if (rs.next()) {
				errMsg("ID currently in use within the Database please use a new ID");
				gameIDFTF.setForeground(Color.RED);
				err = true;
			}
			
			//Validate Name
			String testNameQuery = "SELECT * FROM Games WHERE GameName = '" + gameNameTF.getText().trim() + "'";
			System.out.println(testNameQuery);
			rs = stmt.executeQuery(testNameQuery);
			if (rs.next()) {
				errMsg("Name currently in use within the Database please use a new ID");
				gameNameTF.setForeground(Color.RED);
				err = true;
			}
			if (gameNameTF.getText() == null) {
				errMsg("A game must have a name");
				gameNameTF.setForeground(Color.RED);
				err = true;
			}
			
			if (gameNameTF.getText().length() > 20) {
				errMsg("A game name may not exceed 20 characters in length");
				gameNameTF.setForeground(Color.RED);
				err = true;
			}

			//Validate GameType
			if (gameTypeCB.getSelectedItem() == "…") {
				errMsg("A GameType must be chosen");
				gameTypeCB.setForeground(Color.RED);
				err = true;
				
			}
			if (err == true) {
				return false;
			}else {
				return true;	
			}
			
		}catch (SQLException ex){
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
			return false;
			}	
	}
	
	
	public void errMsg(String msg) {
		Component frame = null;
		//Error messages for all errors within form
		JOptionPane.showMessageDialog(frame,
		    msg,
		    "Inane error",
		    JOptionPane.ERROR_MESSAGE);
	}
}



