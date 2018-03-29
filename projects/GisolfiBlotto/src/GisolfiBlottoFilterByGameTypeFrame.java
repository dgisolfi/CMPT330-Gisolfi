import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class GisolfiBlottoFilterByGameTypeFrame extends JFrame {

	private JPanel contentPane;
	private final JButton btnCancel = new JButton("Cancel");
	
	private final gameFilter GameFilter;
	private final JButton btnOk = new JButton("Ok");
	private final JCheckBox chckbxBingo = new JCheckBox("Bingo");
	private final JCheckBox chckbxTriplepay = new JCheckBox("TriplePay");
	private final JCheckBox chckbxfortunes = new JCheckBox("88Fortunes");
	private final JCheckBox chckbxMillionaire = new JCheckBox("Millionaire");
	private final JCheckBox chckbxCashword = new JCheckBox("CashWord");
	private final JCheckBox chckbxJumbobucks = new JCheckBox("JumboBucks");
	private final JCheckBox chckbxMoneyvault = new JCheckBox("MoneyVault");
	private final JCheckBox chckbxCashforlife = new JCheckBox("CashForLife ");

	/**
	 * Create the frame.
	 */
	public GisolfiBlottoFilterByGameTypeFrame(gameFilter it) {
		jbInit();
		GameFilter = it;
	}
	private void jbInit() {
		setTitle("Filter By Game Type");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 260, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		btnCancel.setBounds(135, 232, 117, 29);
		
		contentPane.add(btnCancel);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnOk_actionPerformed(e);
			}
		});
		btnOk.setBounds(6, 232, 117, 29);
		
		contentPane.add(btnOk);
		chckbxBingo.setBounds(6, 45, 128, 23);
		
		contentPane.add(chckbxBingo);
		chckbxTriplepay.setBounds(6, 80, 128, 23);
		
		contentPane.add(chckbxTriplepay);
		chckbxfortunes.setBounds(6, 115, 128, 23);
		
		contentPane.add(chckbxfortunes);
		chckbxMillionaire.setBounds(6, 150, 128, 23);
		
		contentPane.add(chckbxMillionaire);
		chckbxCashword.setBounds(6, 185, 128, 23);
		
		contentPane.add(chckbxCashword);
		chckbxJumbobucks.setBounds(127, 45, 128, 23);
		
		contentPane.add(chckbxJumbobucks);
		chckbxMoneyvault.setBounds(127, 80, 128, 23);
		
		contentPane.add(chckbxMoneyvault);
		chckbxCashforlife.setBounds(127, 115, 128, 23);
		
		contentPane.add(chckbxCashforlife);
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnOk_actionPerformed(ActionEvent e) {
		String games = GameFilter.getGames();
		if (chckbxBingo.isSelected()) {
			GameFilter.setGames( games += " Bingo");
		}
		if (chckbxTriplepay.isSelected()) {
			GameFilter.setGames( games += " TriplePay");
		}
		if (chckbxfortunes.isSelected()) {
			GameFilter.setGames( games += " 88Fortunes");
		}
		if (chckbxMillionaire.isSelected()) {
			GameFilter.setGames( games += " Millionaire");
		}
		if (chckbxCashword.isSelected()) {
			GameFilter.setGames( games += " CashWord");
		}
		if (chckbxJumbobucks.isSelected()) {
			GameFilter.setGames( games += " JumboBucks");
		}
		if (chckbxMoneyvault.isSelected()) {
			GameFilter.setGames( games += " MoneyVault");
		}
		if (chckbxCashforlife.isSelected()) {
			GameFilter.setGames( games += " CashForLife");
		}
		
		System.out.println(GameFilter.getGames());
		
		this.dispose();
		
	}
}
