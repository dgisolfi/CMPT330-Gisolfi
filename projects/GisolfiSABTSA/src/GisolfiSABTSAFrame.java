import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GisolfiSABTSAFrame extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane armyFormTP = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel applicantInfoPanel = new JPanel();
	private final JPanel childInfoPanel = new JPanel();
	private final JPanel financialInfoPanel = new JPanel();
	private final JLabel lblLastName = new JLabel("Last Name: ");
	private final JLabel lblMiddleInitial = new JLabel("Middle Initial: ");
	private final JLabel lblFirstName = new JLabel("First Name: ");
	private final JLabel lblMaidenName = new JLabel("Maiden Name: ");
	private final JLabel lblSocialSecurity = new JLabel("Social Security: ");
	private final JLabel lblDOB = new JLabel("Date Of Birth: ");
	private final JLabel lblRace = new JLabel("Race:");
	private final JLabel lblTribe = new JLabel("Tribe: ");
	private final JLabel lblAddress = new JLabel("Address: ");
	private final JLabel lblCity = new JLabel("City: ");
	private final JLabel lblZip = new JLabel("ZIP: ");
	private final JLabel lblLengthOfOccupancy_1 = new JLabel("Occupancy Length:");
	private final JTextField lastNameTF = new JTextField();
	private final JTextField middleInitialTF = new JTextField();
	private final JTextField firstNameTF = new JTextField();
	private final JTextField maidennameTF = new JTextField();
	private final JFormattedTextField SSNFTF = new JFormattedTextField();
	private final JFormattedTextField dobFTF = new JFormattedTextField();
	private final JRadioButton rdbtnNativeAmerican = new JRadioButton("Native American");
	private final JRadioButton rdbtnAsian = new JRadioButton("Asian");
	private final JRadioButton rdbtnAfricanAmerican = new JRadioButton("African American");
	private final JRadioButton rdbtnCaucasian = new JRadioButton("Caucasian");
	private final JRadioButton rdbtnHispanic = new JRadioButton("Hispanic");
	private final JRadioButton rdbtnMultiracial = new JRadioButton("Multi-Racial");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JMenuBar FormMenuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmStartNewForm = new JMenuItem("Start New Form");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmApplicantInformationHelp = new JMenuItem("Applicant Information Help");
	private final JMenuItem mntmChildInformationHelp = new JMenuItem("Child Information Help");
	private final JMenuItem mntmFinancialInformationHelp = new JMenuItem("Financial Information Help");
	private final JLabel lblDependent = new JLabel("Dependent 1");
	private final JLabel lblName = new JLabel("Name: ");
	private final JLabel lblYearOfSchool = new JLabel("Year of School: ");
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth: ");
	private final JLabel lblRelationship = new JLabel("Relationship: ");
	private final JTextField D1NameTF = new JTextField();
	private final JTextField D1relationshipTF = new JTextField();
	private final JFormattedTextField D1YOSFTF = new JFormattedTextField();
	private final JFormattedTextField D1DOBFTF = new JFormattedTextField();
	private final JRadioButton rdbtnNativeAmerican_1 = new JRadioButton("Native American");
	private final JRadioButton rdbtnAsian_1 = new JRadioButton("Asian");
	private final JRadioButton rdbtnAfricanAmerican_1 = new JRadioButton("African American");
	private final JRadioButton rdbtnCaucasian_1 = new JRadioButton("Caucasian");
	private final JRadioButton rdbtnHispanic_1 = new JRadioButton("Hispanic");
	private final JRadioButton rdbtnMultiracial_1 = new JRadioButton("Multi-Racial");
	private final JLabel lblRace_1 = new JLabel("Race:");
	private final JLabel lblD2 = new JLabel("Dependent 2");
	private final JLabel label_2 = new JLabel("Name: ");
	private final JLabel label_3 = new JLabel("Year of School: ");
	private final JLabel label_4 = new JLabel("Date of Birth: ");
	private final JLabel label_5 = new JLabel("Relationship: ");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JFormattedTextField formattedTextField = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_1 = new JFormattedTextField();
	private final JRadioButton radioButton = new JRadioButton("Native American");
	private final JRadioButton radioButton_1 = new JRadioButton("Asian");
	private final JRadioButton radioButton_2 = new JRadioButton("African American");
	private final JRadioButton radioButton_3 = new JRadioButton("Caucasian");
	private final JRadioButton radioButton_4 = new JRadioButton("Hispanic");
	private final JRadioButton radioButton_5 = new JRadioButton("Multi-Racial");
	private final JLabel label_6 = new JLabel("Race:");
	private final JLabel lblDependent_1 = new JLabel("Dependent 3");
	private final JLabel label_8 = new JLabel("Name: ");
	private final JLabel label_9 = new JLabel("Year of School: ");
	private final JLabel label_10 = new JLabel("Date of Birth: ");
	private final JLabel label_11 = new JLabel("Relationship: ");
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JFormattedTextField formattedTextField_2 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_3 = new JFormattedTextField();
	private final JRadioButton radioButton_6 = new JRadioButton("Native American");
	private final JRadioButton radioButton_7 = new JRadioButton("Asian");
	private final JRadioButton radioButton_8 = new JRadioButton("African American");
	private final JRadioButton radioButton_9 = new JRadioButton("Caucasian");
	private final JRadioButton radioButton_10 = new JRadioButton("Hispanic");
	private final JRadioButton radioButton_11 = new JRadioButton("Multi-Racial");
	private final JLabel label_12 = new JLabel("Race:");
	private final JLabel lblIncome = new JLabel("Income");
	private final JLabel lblSnapfoodStamps = new JLabel("Snap-Food Stamps");
	private final JLabel lblSsdisability = new JLabel("SS/Disability");
	private final JLabel lblWages = new JLabel("Wages");
	private final JLabel lblTanfOrTea = new JLabel("Tanf or Tea");
	private final JLabel lblUnemployment = new JLabel("Unemployment");
	private final JLabel lblChildSupport = new JLabel("Child Support");
	private final JLabel lblOther = new JLabel("Other");
	private final JFormattedTextField formattedTextField_5 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_6 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_7 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_8 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_9 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_10 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_11 = new JFormattedTextField();
	private final JLabel lblExpenses = new JLabel("Expenses");
	private final JLabel lblRent = new JLabel("Rent");
	private final JLabel lblUtilities = new JLabel("Utilities");
	private final JLabel lblTelephone = new JLabel("Telephone");
	private final JLabel lblFood = new JLabel("Food");
	private final JLabel lblCarPayment = new JLabel("Car Payment");
	private final JLabel label_17 = new JLabel("Child Support");
	private final JLabel label_18 = new JLabel("Other");
	private final JFormattedTextField formattedTextField_13 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_14 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_15 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_16 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_17 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_18 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_19 = new JFormattedTextField();
	private final JLabel lblAreYourEmployed = new JLabel("Are Your Employed?");
	private final JLabel lblPlaceOfEmployment = new JLabel("Place of Employment");
	private final JLabel lblLengthOfOccupancy = new JLabel("Length of Occupancy:");
	private final JLabel lblIfNotEmployed = new JLabel("Registered with Careersource");
	private final JLabel lblS = new JLabel("of Southwest Florida?\n");
	private final JTextField textField_4 = new JTextField();
	private final JFormattedTextField formattedTextField_4 = new JFormattedTextField();
	private final JLabel lblYears = new JLabel("years");
	private final JCheckBox chckbxYes = new JCheckBox("Yes");
	private final JCheckBox chckbxNo = new JCheckBox("No");
	private final JCheckBox checkBox = new JCheckBox("Yes");
	private final JCheckBox checkBox_1 = new JCheckBox("No");
	private final JLabel label_1 = new JLabel("Are Your Employed?");
	private final JCheckBox checkBox_2 = new JCheckBox("Yes");
	private final JCheckBox checkBox_3 = new JCheckBox("No");
	private final JLabel label_7 = new JLabel("Place of Employment");
	private final JTextField textField_5 = new JTextField();
	private final JFormattedTextField formattedTextField_12 = new JFormattedTextField();
	private final JLabel label_13 = new JLabel("years");
	private final JLabel label_14 = new JLabel("Length of Occupancy:");
	private final JLabel label_15 = new JLabel("of Southwest Florida?\n");
	private final JLabel label_16 = new JLabel("Registered with Careersource");
	private final JCheckBox checkBox_4 = new JCheckBox("Yes");
	private final JCheckBox checkBox_5 = new JCheckBox("No");
	private final JLabel lblPersonal = new JLabel("Personal");
	private final JLabel lblSpouse = new JLabel("Spouse");
	private final JLabel lblLevelOfEducation = new JLabel("Level Of Education:");
	private final JLabel lblTotal = new JLabel("Total: ");
	private final JLabel label_19 = new JLabel("Total: ");
	private final JComboBox comboBox = new JComboBox();
	private final JLabel lblPersonalInformation = new JLabel("Personal Information");
	private final JLabel lblTelephone_1 = new JLabel("Telephone:");
	private final JLabel lblFamilyStatus = new JLabel("Family Status: ");
	private final JComboBox comboBox_1 = new JComboBox();
	private final JTextField textField_6 = new JTextField();
	private final JTextField textField_7 = new JTextField();
	private final JTextField textField_8 = new JTextField();
	private final JFormattedTextField formattedTextField_20 = new JFormattedTextField();
	private final JFormattedTextField formattedTextField_21 = new JFormattedTextField();
	private final JFormattedTextField phFTF = new JFormattedTextField();
	private final JLabel lblSpouseInformation = new JLabel("Spouse Information");
	private final JLabel lblSpouseName = new JLabel("Spouse Name");
	private final JLabel lblSocialSecurity_1 = new JLabel("Social Security");
	private final JLabel lblDateOfBirth_1 = new JLabel("Date of Birth");
	private final JLabel label = new JLabel("Race:");
	private final JRadioButton radioButton_12 = new JRadioButton("Native American");
	private final JRadioButton radioButton_13 = new JRadioButton("Asian");
	private final JRadioButton radioButton_14 = new JRadioButton("African American");
	private final JRadioButton radioButton_15 = new JRadioButton("Caucasian");
	private final JRadioButton radioButton_16 = new JRadioButton("Hispanic");
	private final JRadioButton radioButton_17 = new JRadioButton("Multi-Racial");
	private final JTextField textField_9 = new JTextField();
	private final JLabel label_20 = new JLabel("Address: ");
	private final JLabel label_21 = new JLabel("City: ");
	private final JTextField textField_10 = new JTextField();
	private final JLabel label_22 = new JLabel("Occupancy Length:");
	private final JFormattedTextField formattedTextField_23 = new JFormattedTextField();
	private final JLabel label_23 = new JLabel("Telephone:");
	private final JFormattedTextField phSpouseFTF = new JFormattedTextField();
	private final JTextField textField_11 = new JTextField();
	private final JFormattedTextField formattedTextField_25 = new JFormattedTextField();
	private final JFormattedTextField spouseSSNFTF = new JFormattedTextField();
	
	
	
	
	//Define the SSN Mask
	MaskFormatter ssnMask = createFormatter("####");
	MaskFormatter ssnSpouseMask = createFormatter("####");
	
	//Define the Phone number mask
	MaskFormatter telMask = createFormatter("###-###-####");
	MaskFormatter telSpouseMask = createFormatter("###-###-####");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GisolfiSABTSAFrame frame = new GisolfiSABTSAFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
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
	public GisolfiSABTSAFrame() {
		textField_11.setBounds(144, 467, 130, 26);
		textField_11.setColumns(10);
		textField_8.setBounds(144, 260, 130, 26);
		textField_8.setColumns(10);
		textField_7.setBounds(144, 232, 130, 26);
		textField_7.setColumns(10);
		textField_6.setBounds(144, 204, 130, 26);
		textField_6.setColumns(10);
		textField_4.setBounds(237, 87, 130, 26);
		textField_4.setColumns(10);
		D1relationshipTF.setBounds(125, 129, 130, 26);
		D1relationshipTF.setColumns(10);
		D1NameTF.setBounds(125, 45, 130, 26);
		D1NameTF.setColumns(10);
		maidennameTF.setBounds(144, 120, 130, 26);
		maidennameTF.setColumns(10);
		firstNameTF.setBounds(144, 92, 130, 26);
		firstNameTF.setColumns(10);
		middleInitialTF.setBounds(144, 64, 130, 26);
		middleInitialTF.setColumns(10);
		lastNameTF.setBounds(144, 36, 130, 26);
		lastNameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Salvation Army Back-to-School Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 900);
		
		setJMenuBar(FormMenuBar);
		
		FormMenuBar.add(mnFile);
		mntmStartNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmStartNewForm_actionPerformed(e);
			}
		});
		
		mnFile.add(mntmStartNewForm);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		
		//Associate All masks
		
		//Associate SSN masks
		ssnMask.setPlaceholderCharacter('#');
		ssnMask.install(SSNFTF);
		
		ssnSpouseMask.setPlaceholderCharacter('#');
		ssnSpouseMask.install(spouseSSNFTF);
		
		
		
		//Associate TEL masks
		telMask.setPlaceholderCharacter('#');
		telMask.install(phFTF);
		
		telSpouseMask.setPlaceholderCharacter('#');
		telSpouseMask.install(phSpouseFTF);
		
		
		
		
		
		
		
		
		mnFile.add(mntmExit);
		
		FormMenuBar.add(mnHelp);
		
		mnHelp.add(mntmApplicantInformationHelp);
		
		mnHelp.add(mntmChildInformationHelp);
		
		mnHelp.add(mntmFinancialInformationHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		armyFormTP.setBounds(6, 6, 488, 798);
		
		contentPane.add(armyFormTP);
		
		armyFormTP.addTab("Applicant Information", null, applicantInfoPanel, null);
		applicantInfoPanel.setLayout(null);
		lblLastName.setBounds(6, 36, 90, 16);
		
		applicantInfoPanel.add(lblLastName);
		lblMiddleInitial.setBounds(6, 64, 90, 16);
		
		applicantInfoPanel.add(lblMiddleInitial);
		lblFirstName.setBounds(6, 92, 90, 16);
		
		applicantInfoPanel.add(lblFirstName);
		lblMaidenName.setBounds(6, 120, 107, 16);
		
		applicantInfoPanel.add(lblMaidenName);
		lblSocialSecurity.setBounds(6, 148, 107, 16);
		
		applicantInfoPanel.add(lblSocialSecurity);
		lblDOB.setBounds(6, 176, 90, 16);
		
		applicantInfoPanel.add(lblDOB);
		lblRace.setBounds(320, 36, 61, 16);
		
		applicantInfoPanel.add(lblRace);
		lblTribe.setBounds(6, 204, 61, 16);
		
		applicantInfoPanel.add(lblTribe);
		lblAddress.setBounds(6, 232, 61, 16);
		
		applicantInfoPanel.add(lblAddress);
		lblCity.setBounds(6, 260, 61, 16);
		
		applicantInfoPanel.add(lblCity);
		lblZip.setBounds(6, 288, 61, 16);
		
		applicantInfoPanel.add(lblZip);
		lblLengthOfOccupancy_1.setBounds(6, 316, 153, 16);
		
		applicantInfoPanel.add(lblLengthOfOccupancy_1);
		
		applicantInfoPanel.add(lastNameTF);
		
		applicantInfoPanel.add(middleInitialTF);
		
		applicantInfoPanel.add(firstNameTF);
		
		applicantInfoPanel.add(maidennameTF);
		SSNFTF.setBounds(146, 148, 42, 26);
		
		applicantInfoPanel.add(SSNFTF);
		dobFTF.setBounds(144, 176, 71, 26);
		
		applicantInfoPanel.add(dobFTF);
		buttonGroup.add(rdbtnNativeAmerican);
		rdbtnNativeAmerican.setBounds(320, 64, 141, 23);
		
		applicantInfoPanel.add(rdbtnNativeAmerican);
		buttonGroup.add(rdbtnAsian);
		rdbtnAsian.setBounds(320, 99, 141, 23);
		
		applicantInfoPanel.add(rdbtnAsian);
		buttonGroup.add(rdbtnAfricanAmerican);
		rdbtnAfricanAmerican.setBounds(320, 130, 141, 23);
		
		applicantInfoPanel.add(rdbtnAfricanAmerican);
		buttonGroup.add(rdbtnCaucasian);
		rdbtnCaucasian.setBounds(320, 165, 141, 23);
		
		applicantInfoPanel.add(rdbtnCaucasian);
		buttonGroup.add(rdbtnHispanic);
		rdbtnHispanic.setBounds(320, 200, 141, 23);
		
		applicantInfoPanel.add(rdbtnHispanic);
		buttonGroup.add(rdbtnMultiracial);
		rdbtnMultiracial.setBounds(320, 235, 141, 23);
		
		applicantInfoPanel.add(rdbtnMultiracial);
		lblPersonalInformation.setBounds(157, 6, 153, 16);
		
		applicantInfoPanel.add(lblPersonalInformation);
		lblTelephone_1.setBounds(6, 344, 117, 16);
		
		applicantInfoPanel.add(lblTelephone_1);
		lblFamilyStatus.setBounds(6, 376, 107, 16);
		
		applicantInfoPanel.add(lblFamilyStatus);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"…", "Married", "Single", "Divorced", "Seperated", "Widowed"}));
		comboBox_1.setBounds(144, 372, 107, 27);
		
		applicantInfoPanel.add(comboBox_1);
		
		applicantInfoPanel.add(textField_6);
		
		applicantInfoPanel.add(textField_7);
		
		applicantInfoPanel.add(textField_8);
		formattedTextField_20.setBounds(146, 288, 71, 26);
		
		applicantInfoPanel.add(formattedTextField_20);
		formattedTextField_21.setBounds(146, 316, 71, 26);
		
		applicantInfoPanel.add(formattedTextField_21);
		phFTF.setBounds(146, 344, 71, 26);
		
		applicantInfoPanel.add(phFTF);
		lblSpouseInformation.setBounds(157, 431, 130, 16);
		
		applicantInfoPanel.add(lblSpouseInformation);
		lblSpouseName.setBounds(6, 472, 85, 16);
		
		applicantInfoPanel.add(lblSpouseName);
		lblSocialSecurity_1.setBounds(6, 500, 107, 16);
		
		applicantInfoPanel.add(lblSocialSecurity_1);
		lblDateOfBirth_1.setBounds(6, 528, 90, 16);
		
		applicantInfoPanel.add(lblDateOfBirth_1);
		label.setBounds(320, 472, 61, 16);
		
		applicantInfoPanel.add(label);
		radioButton_12.setBounds(320, 500, 141, 23);
		
		applicantInfoPanel.add(radioButton_12);
		radioButton_13.setBounds(320, 535, 141, 23);
		
		applicantInfoPanel.add(radioButton_13);
		radioButton_14.setBounds(320, 566, 141, 23);
		
		applicantInfoPanel.add(radioButton_14);
		radioButton_15.setBounds(320, 601, 141, 23);
		
		applicantInfoPanel.add(radioButton_15);
		radioButton_16.setBounds(320, 636, 141, 23);
		
		applicantInfoPanel.add(radioButton_16);
		radioButton_17.setBounds(320, 671, 141, 23);
		
		applicantInfoPanel.add(radioButton_17);
		textField_9.setColumns(10);
		textField_9.setBounds(144, 551, 130, 26);
		
		applicantInfoPanel.add(textField_9);
		label_20.setBounds(6, 556, 61, 16);
		
		applicantInfoPanel.add(label_20);
		label_21.setBounds(6, 584, 61, 16);
		
		applicantInfoPanel.add(label_21);
		textField_10.setColumns(10);
		textField_10.setBounds(144, 579, 130, 26);
		
		applicantInfoPanel.add(textField_10);
		label_22.setBounds(6, 612, 153, 16);
		
		applicantInfoPanel.add(label_22);
		formattedTextField_23.setBounds(144, 607, 71, 26);
		
		applicantInfoPanel.add(formattedTextField_23);
		label_23.setBounds(6, 640, 117, 16);
		
		applicantInfoPanel.add(label_23);
		phSpouseFTF.setBounds(144, 635, 71, 26);
		
		applicantInfoPanel.add(phSpouseFTF);
		
		applicantInfoPanel.add(textField_11);
		formattedTextField_25.setBounds(144, 523, 71, 26);
		
		applicantInfoPanel.add(formattedTextField_25);
		spouseSSNFTF.setBounds(144, 495, 42, 26);
		
		applicantInfoPanel.add(spouseSSNFTF);
		
		armyFormTP.addTab("Child Information", null, childInfoPanel, null);
		childInfoPanel.setLayout(null);
		lblDependent.setBounds(20, 22, 85, 16);
		
		childInfoPanel.add(lblDependent);
		lblName.setBounds(20, 50, 61, 16);
		
		childInfoPanel.add(lblName);
		lblYearOfSchool.setBounds(20, 78, 98, 16);
		
		childInfoPanel.add(lblYearOfSchool);
		lblDateOfBirth.setBounds(20, 106, 98, 16);
		
		childInfoPanel.add(lblDateOfBirth);
		lblRelationship.setBounds(20, 134, 98, 16);
		
		childInfoPanel.add(lblRelationship);
		
		childInfoPanel.add(D1NameTF);
		
		childInfoPanel.add(D1relationshipTF);
		D1YOSFTF.setBounds(125, 73, 44, 26);
		
		childInfoPanel.add(D1YOSFTF);
		D1DOBFTF.setBounds(125, 101, 69, 26);
		
		childInfoPanel.add(D1DOBFTF);
		rdbtnNativeAmerican_1.setBounds(267, 46, 141, 23);
		
		childInfoPanel.add(rdbtnNativeAmerican_1);
		rdbtnAsian_1.setBounds(267, 74, 141, 23);
		
		childInfoPanel.add(rdbtnAsian_1);
		rdbtnAfricanAmerican_1.setBounds(267, 102, 141, 23);
		
		childInfoPanel.add(rdbtnAfricanAmerican_1);
		rdbtnCaucasian_1.setBounds(267, 130, 141, 23);
		
		childInfoPanel.add(rdbtnCaucasian_1);
		rdbtnHispanic_1.setBounds(267, 156, 141, 23);
		
		childInfoPanel.add(rdbtnHispanic_1);
		rdbtnMultiracial_1.setBounds(267, 183, 141, 23);
		
		childInfoPanel.add(rdbtnMultiracial_1);
		lblRace_1.setBounds(272, 22, 61, 16);
		
		childInfoPanel.add(lblRace_1);
		lblD2.setBounds(20, 218, 85, 16);
		
		childInfoPanel.add(lblD2);
		label_2.setBounds(20, 246, 61, 16);
		
		childInfoPanel.add(label_2);
		label_3.setBounds(20, 274, 98, 16);
		
		childInfoPanel.add(label_3);
		label_4.setBounds(20, 302, 98, 16);
		
		childInfoPanel.add(label_4);
		label_5.setBounds(20, 330, 98, 16);
		
		childInfoPanel.add(label_5);
		textField.setColumns(10);
		textField.setBounds(125, 241, 130, 26);
		
		childInfoPanel.add(textField);
		textField_1.setColumns(10);
		textField_1.setBounds(125, 325, 130, 26);
		
		childInfoPanel.add(textField_1);
		formattedTextField.setBounds(125, 269, 44, 26);
		
		childInfoPanel.add(formattedTextField);
		formattedTextField_1.setBounds(125, 297, 69, 26);
		
		childInfoPanel.add(formattedTextField_1);
		radioButton.setBounds(267, 242, 141, 23);
		
		childInfoPanel.add(radioButton);
		radioButton_1.setBounds(267, 270, 141, 23);
		
		childInfoPanel.add(radioButton_1);
		radioButton_2.setBounds(267, 298, 141, 23);
		
		childInfoPanel.add(radioButton_2);
		radioButton_3.setBounds(267, 326, 141, 23);
		
		childInfoPanel.add(radioButton_3);
		radioButton_4.setBounds(267, 352, 141, 23);
		
		childInfoPanel.add(radioButton_4);
		radioButton_5.setBounds(267, 379, 141, 23);
		
		childInfoPanel.add(radioButton_5);
		label_6.setBounds(272, 218, 61, 16);
		
		childInfoPanel.add(label_6);
		lblDependent_1.setBounds(20, 414, 85, 16);
		
		childInfoPanel.add(lblDependent_1);
		label_8.setBounds(20, 442, 61, 16);
		
		childInfoPanel.add(label_8);
		label_9.setBounds(20, 470, 98, 16);
		
		childInfoPanel.add(label_9);
		label_10.setBounds(20, 498, 98, 16);
		
		childInfoPanel.add(label_10);
		label_11.setBounds(20, 526, 98, 16);
		
		childInfoPanel.add(label_11);
		textField_2.setColumns(10);
		textField_2.setBounds(125, 437, 130, 26);
		
		childInfoPanel.add(textField_2);
		textField_3.setColumns(10);
		textField_3.setBounds(125, 521, 130, 26);
		
		childInfoPanel.add(textField_3);
		formattedTextField_2.setBounds(125, 465, 44, 26);
		
		childInfoPanel.add(formattedTextField_2);
		formattedTextField_3.setBounds(125, 493, 69, 26);
		
		childInfoPanel.add(formattedTextField_3);
		radioButton_6.setBounds(267, 438, 141, 23);
		
		childInfoPanel.add(radioButton_6);
		radioButton_7.setBounds(267, 466, 141, 23);
		
		childInfoPanel.add(radioButton_7);
		radioButton_8.setBounds(267, 494, 141, 23);
		
		childInfoPanel.add(radioButton_8);
		radioButton_9.setBounds(267, 522, 141, 23);
		
		childInfoPanel.add(radioButton_9);
		radioButton_10.setBounds(267, 548, 141, 23);
		
		childInfoPanel.add(radioButton_10);
		radioButton_11.setBounds(267, 575, 141, 23);
		
		childInfoPanel.add(radioButton_11);
		label_12.setBounds(272, 414, 61, 16);
		
		childInfoPanel.add(label_12);
		
		armyFormTP.addTab("Financial Information", null, financialInfoPanel, null);
		financialInfoPanel.setLayout(null);
		lblIncome.setBounds(6, 496, 61, 16);
		
		financialInfoPanel.add(lblIncome);
		lblSnapfoodStamps.setBounds(6, 524, 119, 16);
		
		financialInfoPanel.add(lblSnapfoodStamps);
		lblSsdisability.setBounds(6, 552, 101, 16);
		
		financialInfoPanel.add(lblSsdisability);
		lblWages.setBounds(6, 580, 61, 16);
		
		financialInfoPanel.add(lblWages);
		lblTanfOrTea.setBounds(6, 608, 95, 16);
		
		financialInfoPanel.add(lblTanfOrTea);
		lblUnemployment.setBounds(6, 636, 101, 16);
		
		financialInfoPanel.add(lblUnemployment);
		lblChildSupport.setBounds(6, 664, 101, 16);
		
		financialInfoPanel.add(lblChildSupport);
		lblOther.setBounds(6, 692, 61, 16);
		
		financialInfoPanel.add(lblOther);
		formattedTextField_5.setBounds(126, 524, 95, 26);
		
		financialInfoPanel.add(formattedTextField_5);
		formattedTextField_6.setBounds(126, 552, 95, 26);
		
		financialInfoPanel.add(formattedTextField_6);
		formattedTextField_7.setBounds(126, 580, 95, 26);
		
		financialInfoPanel.add(formattedTextField_7);
		formattedTextField_8.setBounds(126, 608, 95, 26);
		
		financialInfoPanel.add(formattedTextField_8);
		formattedTextField_9.setBounds(126, 636, 95, 26);
		
		financialInfoPanel.add(formattedTextField_9);
		formattedTextField_10.setBounds(126, 664, 95, 26);
		
		financialInfoPanel.add(formattedTextField_10);
		formattedTextField_11.setBounds(126, 692, 95, 26);
		
		financialInfoPanel.add(formattedTextField_11);
		lblExpenses.setBounds(248, 496, 61, 16);
		
		financialInfoPanel.add(lblExpenses);
		lblRent.setBounds(248, 524, 119, 16);
		
		financialInfoPanel.add(lblRent);
		lblUtilities.setBounds(248, 552, 101, 16);
		
		financialInfoPanel.add(lblUtilities);
		lblTelephone.setBounds(248, 580, 95, 16);
		
		financialInfoPanel.add(lblTelephone);
		lblFood.setBounds(248, 608, 95, 16);
		
		financialInfoPanel.add(lblFood);
		lblCarPayment.setBounds(248, 636, 101, 16);
		
		financialInfoPanel.add(lblCarPayment);
		label_17.setBounds(248, 664, 101, 16);
		
		financialInfoPanel.add(label_17);
		label_18.setBounds(248, 692, 61, 16);
		
		financialInfoPanel.add(label_18);
		formattedTextField_13.setBounds(366, 524, 95, 26);
		
		financialInfoPanel.add(formattedTextField_13);
		formattedTextField_14.setBounds(366, 552, 95, 26);
		
		financialInfoPanel.add(formattedTextField_14);
		formattedTextField_15.setBounds(366, 580, 95, 26);
		
		financialInfoPanel.add(formattedTextField_15);
		formattedTextField_16.setBounds(366, 608, 95, 26);
		
		financialInfoPanel.add(formattedTextField_16);
		formattedTextField_17.setBounds(366, 636, 95, 26);
		
		financialInfoPanel.add(formattedTextField_17);
		formattedTextField_18.setBounds(366, 664, 95, 26);
		
		financialInfoPanel.add(formattedTextField_18);
		formattedTextField_19.setBounds(366, 692, 95, 26);
		
		financialInfoPanel.add(formattedTextField_19);
		lblAreYourEmployed.setBounds(6, 46, 160, 16);
		
		financialInfoPanel.add(lblAreYourEmployed);
		lblPlaceOfEmployment.setBounds(6, 92, 131, 16);
		
		financialInfoPanel.add(lblPlaceOfEmployment);
		lblLengthOfOccupancy.setBounds(6, 129, 147, 16);
		
		financialInfoPanel.add(lblLengthOfOccupancy);
		lblIfNotEmployed.setBounds(8, 162, 203, 26);
		
		financialInfoPanel.add(lblIfNotEmployed);
		lblS.setBounds(8, 186, 171, 16);
		
		financialInfoPanel.add(lblS);
		
		financialInfoPanel.add(textField_4);
		formattedTextField_4.setBounds(237, 124, 33, 26);
		
		financialInfoPanel.add(formattedTextField_4);
		lblYears.setBounds(269, 129, 61, 16);
		
		financialInfoPanel.add(lblYears);
		chckbxYes.setBounds(239, 162, 128, 23);
		
		financialInfoPanel.add(chckbxYes);
		chckbxNo.setBounds(239, 181, 128, 23);
		
		financialInfoPanel.add(chckbxNo);
		checkBox.setBounds(237, 39, 128, 23);
		
		financialInfoPanel.add(checkBox);
		checkBox_1.setBounds(237, 58, 128, 23);
		
		financialInfoPanel.add(checkBox_1);
		label_1.setBounds(6, 255, 160, 16);
		
		financialInfoPanel.add(label_1);
		checkBox_2.setBounds(237, 248, 128, 23);
		
		financialInfoPanel.add(checkBox_2);
		checkBox_3.setBounds(237, 267, 128, 23);
		
		financialInfoPanel.add(checkBox_3);
		label_7.setBounds(6, 301, 131, 16);
		
		financialInfoPanel.add(label_7);
		textField_5.setColumns(10);
		textField_5.setBounds(237, 296, 130, 26);
		
		financialInfoPanel.add(textField_5);
		formattedTextField_12.setBounds(237, 333, 33, 26);
		
		financialInfoPanel.add(formattedTextField_12);
		label_13.setBounds(269, 338, 61, 16);
		
		financialInfoPanel.add(label_13);
		label_14.setBounds(6, 338, 147, 16);
		
		financialInfoPanel.add(label_14);
		label_15.setBounds(8, 395, 171, 16);
		
		financialInfoPanel.add(label_15);
		label_16.setBounds(8, 371, 203, 26);
		
		financialInfoPanel.add(label_16);
		checkBox_4.setBounds(239, 371, 128, 23);
		
		financialInfoPanel.add(checkBox_4);
		checkBox_5.setBounds(239, 390, 128, 23);
		
		financialInfoPanel.add(checkBox_5);
		lblPersonal.setBounds(156, 6, 61, 16);
		
		financialInfoPanel.add(lblPersonal);
		lblSpouse.setBounds(156, 227, 61, 16);
		
		financialInfoPanel.add(lblSpouse);
		lblLevelOfEducation.setBounds(6, 423, 160, 16);
		
		financialInfoPanel.add(lblLevelOfEducation);
		lblTotal.setBounds(126, 730, 61, 16);
		
		financialInfoPanel.add(lblTotal);
		label_19.setBounds(366, 730, 61, 16);
		
		financialInfoPanel.add(label_19);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No GED/Diploma", "GED", "High School Diploma", "Associates Degree", "Bachelors Degree Post-Gradudate"}));
		comboBox.setBounds(237, 419, 171, 27);
		
		financialInfoPanel.add(comboBox);
	}
	//Menu Buttons
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void do_mntmStartNewForm_actionPerformed(ActionEvent e) {
		this.dispose();
		GisolfiSABTSAFrame frame = new GisolfiSABTSAFrame();
		frame.setVisible(true);
	}
}
