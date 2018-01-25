import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class GisolfiPizzaFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblGisolfiPizzaVillage = new JLabel("Gisolfi Pizza Village");
	private final JLabel lblSize = new JLabel("Size:");
	private final JComboBox sizeCB = new JComboBox();
	private final JButton btnPlaceOrder = new JButton("Place Order");
	private final JTextArea outputTA = new JTextArea();
	private final JScrollPane OutputScroll = new JScrollPane();
	private final JList toppingsList = new JList();
	private final JLabel lblToppings = new JLabel("Toppings:");
	private final JScrollPane toppingsScroll = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiPizzaFrame frame = new GisolfiPizzaFrame();
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
	public GisolfiPizzaFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Gisolfi Pizza Ordering App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblGisolfiPizzaVillage.setFont(new Font("Superclarendon", Font.PLAIN, 13));
		lblGisolfiPizzaVillage.setForeground(Color.RED);
		lblGisolfiPizzaVillage.setBounds(134, 6, 183, 39);
		
		contentPane.add(lblGisolfiPizzaVillage);
		lblSize.setBounds(6, 64, 61, 16);
		
		contentPane.add(lblSize);
		sizeCB.setModel(new DefaultComboBoxModel(new String[] {"Extra Large", "Large", "Medium", "Small", "Personal"}));
		sizeCB.setBounds(69, 60, 126, 27);
		
		contentPane.add(sizeCB);
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPlaceOrder_actionPerformed(e);
			}
		});
		btnPlaceOrder.setBounds(69, 228, 117, 29);
		
		contentPane.add(btnPlaceOrder);
		OutputScroll.setBounds(222, 64, 199, 160);
		
		contentPane.add(OutputScroll);
		OutputScroll.setViewportView(outputTA);
		toppingsScroll.setBounds(73, 99, 117, 117);
		
		contentPane.add(toppingsScroll);
		toppingsScroll.setViewportView(toppingsList);
		toppingsList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pepperoni", "Susage", "Chicken", "Bacon", "Pineapple", "Onions", "Olives", "Anchovies", "Mushrooms", "Brocoli"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lblToppings.setBounds(0, 101, 67, 16);
		
		contentPane.add(lblToppings);
	}
	protected void do_btnPlaceOrder_actionPerformed(ActionEvent e) {
		outputTA.append("Your Ordered a(n) " + sizeCB.getSelectedItem().toString() + "\n");
		Object[] toppings = toppingsList.getSelectedValues();
		outputTA.append("with the following toppings: \n");
		for (int i = 0; i < toppings.length; i++) {
			outputTA.append(toppings[i].toString() + "\n");
		}
	}
}
