import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class GisolfiSABTSAFrame extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane armyFormTP = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel applicantInfoPanel = new JPanel();
	private final JPanel childInfoPanel = new JPanel();
	private final JPanel financialInfoPanel = new JPanel();
	private final JLabel lblLastName = new JLabel("Last Name* ");
	private final JLabel lblMiddleInitial = new JLabel("Middle Initial");
	private final JLabel lblFirstName = new JLabel("First Name:*");
	private final JLabel lblMaidenName = new JLabel("Maiden Name: ");
	private final JLabel lblSocialSecurity = new JLabel("Social Security*");
	private final JLabel lblDOB = new JLabel("Date Of Birth*");
	private final JLabel lblRace = new JLabel("Race");
	private final JLabel lblTribe = new JLabel("Tribe");
	private final JLabel lblAddress = new JLabel("Address*");
	private final JLabel lblCity = new JLabel("City*");
	private final JLabel lblZip = new JLabel("ZIP");
	private final JLabel lblLengthOfOccupancy_1 = new JLabel("Occupancy Length:");
	private final JTextField lastNameTF = new JTextField();
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
	private final ButtonGroup raceBG = new ButtonGroup();
	private final JMenuBar FormMenuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmStartNewForm = new JMenuItem("Start New Form");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmApplicantInformationHelp = new JMenuItem("Applicant Information Help");
	private final JMenuItem mntmChildInformationHelp = new JMenuItem("Child Information Help");
	private final JMenuItem mntmFinancialInformationHelp = new JMenuItem("Financial Information Help");
	private final JLabel lblDependent = new JLabel("Dependent 1");
	private final JLabel lblName = new JLabel("Name*");
	private final JLabel lblYearOfSchool = new JLabel("Year of School*");
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth*");
	private final JLabel lblRelationship = new JLabel("Relationship*");
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
	private final JLabel lblRaceD1 = new JLabel("Race");
	private final JLabel lblD2 = new JLabel("Dependent 2");
	private final JLabel lblName_1 = new JLabel("Name");
	private final JLabel lblYearOfSchool_1 = new JLabel("Year of School");
	private final JLabel lblDateOfBirth_2 = new JLabel("Date of Birth");
	private final JLabel lblRelationship_1 = new JLabel("Relationship");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JFormattedTextField D2YOSFTF = new JFormattedTextField();
	private final JFormattedTextField D2DOBFTF = new JFormattedTextField();
	private final JRadioButton radioButton = new JRadioButton("Native American");
	private final JRadioButton radioButton_1 = new JRadioButton("Asian");
	private final JRadioButton radioButton_2 = new JRadioButton("African American");
	private final JRadioButton radioButton_3 = new JRadioButton("Caucasian");
	private final JRadioButton radioButton_4 = new JRadioButton("Hispanic");
	private final JRadioButton radioButton_5 = new JRadioButton("Multi-Racial");
	private final JLabel lblRace_1 = new JLabel("Race");
	private final JLabel lblDependent_1 = new JLabel("Dependent 3");
	private final JLabel lblName_2 = new JLabel("Name");
	private final JLabel lblYearOfSchool_2 = new JLabel("Year of School");
	private final JLabel lblDateOfBirth_3 = new JLabel("Date of Birth");
	private final JLabel lblRelationship_2 = new JLabel("Relationship");
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JFormattedTextField D3YOSFTF = new JFormattedTextField();
	private final JFormattedTextField D3DOBFTF = new JFormattedTextField();
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
	private final JFormattedTextField snapFoodStampsFTF = new JFormattedTextField();
	private final JFormattedTextField ssDisabilityFTF = new JFormattedTextField();
	private final JFormattedTextField wagesFTF = new JFormattedTextField();
	private final JFormattedTextField tanfTeaFTF = new JFormattedTextField();
	private final JFormattedTextField unemploymentFTF = new JFormattedTextField();
	private final JFormattedTextField childSupFTF = new JFormattedTextField();
	private final JFormattedTextField otherIncFTF = new JFormattedTextField();
	private final JLabel lblExpenses = new JLabel("Expenses");
	private final JLabel lblRent = new JLabel("Rent");
	private final JLabel lblUtilities = new JLabel("Utilities");
	private final JLabel lblTelephone = new JLabel("Telephone");
	private final JLabel lblFood = new JLabel("Food");
	private final JLabel lblCarPayment = new JLabel("Car Payment");
	private final JLabel lblChildSupport_1 = new JLabel("Child Support");
	private final JLabel lblOther_1 = new JLabel("Other");
	private final JFormattedTextField rentFTF = new JFormattedTextField();
	private final JFormattedTextField utilitiesFTF = new JFormattedTextField();
	private final JFormattedTextField telCostFTF = new JFormattedTextField();
	private final JFormattedTextField foodFTF = new JFormattedTextField();
	private final JFormattedTextField carPayFTF = new JFormattedTextField();
	private final JFormattedTextField childSupExFTF = new JFormattedTextField();
	private final JFormattedTextField otherExFTF = new JFormattedTextField();
	private final JLabel lblAreYourEmployed = new JLabel("Are Your Employed?*");
	private final JLabel lblPlaceOfEmployment = new JLabel("Place of Employment");
	private final JLabel lblLengthOfOccupancy = new JLabel("Length of Occupancy:");
	private final JLabel lblIfNotEmployed = new JLabel("Registered with Careersource");
	private final JLabel lblS = new JLabel("of Southwest Florida?\n*");
	private final JTextField textField_4 = new JTextField();
	private final JFormattedTextField lenofOccFTF = new JFormattedTextField();
	private final JLabel lblYears = new JLabel("years");
	private final JLabel lblAreYourEmployed_1 = new JLabel("Are Your Employed?*");
	private final JLabel label_7 = new JLabel("Place of Employment");
	private final JTextField textField_5 = new JTextField();
	private final JFormattedTextField lenofOccSpouseFTF = new JFormattedTextField();
	private final JLabel label_13 = new JLabel("years");
	private final JLabel label_14 = new JLabel("Length of Occupancy:");
	private final JLabel lblOfSouthwestFlorida = new JLabel("of Southwest Florida?\n*");
	private final JLabel label_16 = new JLabel("Registered with Careersource");
	private final JLabel lblPersonal = new JLabel("Personal");
	private final JLabel lblSpouse = new JLabel("Spouse");
	private final JLabel lblLevelOfEducation = new JLabel("Level Of Education:");
	private final JLabel lblIncTotal = new JLabel("Total");
	private final JLabel lblTotal = new JLabel("Total");
	private final JComboBox comboBox = new JComboBox();
	private final JLabel lblPersonalInformation = new JLabel("Personal Information");
	private final JLabel lblphonenumber = new JLabel("Telephone*");
	private final JLabel lblFamilyStatus = new JLabel("Family Status");
	private final JComboBox FamilyStatusComboBox = new JComboBox();
	private final JTextField tribeTF = new JTextField();
	private final JTextField addressTF = new JTextField();
	private final JTextField cityTF = new JTextField();
	private final JFormattedTextField zipFTF = new JFormattedTextField();
	private final JFormattedTextField hLengthFTF = new JFormattedTextField();
	private final JFormattedTextField phFTF = new JFormattedTextField();
	private final JLabel lblSpouseInformation = new JLabel("Spouse Information");
	private final JLabel lblSpouseName = new JLabel("Spouse Name");
	private final JLabel lblSocialSecuritySpouse = new JLabel("Social Security");
	private final JLabel lblDateOfBirth_1 = new JLabel("Date of Birth");
	private final JLabel label = new JLabel("Race:");
	private final JRadioButton rdbtnSpouseNA = new JRadioButton("Native American");
	private final JRadioButton rdbtnSpouseA = new JRadioButton("Asian");
	private final JRadioButton rdbtnSpouseAA = new JRadioButton("African American");
	private final JRadioButton rdbtnSpouseC = new JRadioButton("Caucasian");
	private final JRadioButton rdbtnSpouseH = new JRadioButton("Hispanic");
	private final JRadioButton rdbtnSpouseMR = new JRadioButton("Multi-Racial");
	private final JTextField spouseAddressTF = new JTextField();
	private final JLabel lblSpouseAddress = new JLabel("Address");
	private final JLabel lblSpouseCity = new JLabel("City");
	private final JTextField spouseCityTF = new JTextField();
	private final JLabel lblSpouseoccupancy = new JLabel("Occupancy Length:");
	private final JFormattedTextField hLengthSpouseFTF = new JFormattedTextField();
	private final JLabel lblTelephoneSpouse = new JLabel("Telephone");
	private final JFormattedTextField phSpouseFTF = new JFormattedTextField();
	private final JTextField textField_11 = new JTextField();
	private final JFormattedTextField dobSpouseFTF = new JFormattedTextField();
	private final JFormattedTextField spouseSSNFTF = new JFormattedTextField();
	private final JLabel lblYears_1 = new JLabel("years");
	private final JLabel lblOccupancyLenYears = new JLabel("years");
	private final JFormattedTextField middleInitialFTF = new JFormattedTextField();
	private final JLabel lblTab3ApplicantName = new JLabel("Applicant: ");
	private final JLabel lblTab1ApplicantName = new JLabel("Applicant: ");
	private final JLabel lblTab2ApplicantName = new JLabel("Applicant: ");
	private final JLabel lblrequired = new JLabel("* = All required Feilds");
	private final JLabel lblIncCalcTotal = new JLabel("");
	private final JLabel lblNetTotal = new JLabel("Net Total");
	private final JLabel lblnettotcalc = new JLabel("0");
	private final JLabel lblExpCalcTotal = new JLabel("0");
	private final JRadioButton rdbtnEmployedYes = new JRadioButton("Yes");
	private final JRadioButton rdbtnEmployedNo = new JRadioButton("No");
	private final JRadioButton rdbtnCSYes = new JRadioButton("Yes");
	private final JRadioButton rdbtnCSNo = new JRadioButton("No");
	private final JRadioButton rdbtnSpouseEmployedYes = new JRadioButton("Yes");
	private final JRadioButton rdbtnSpouseEmployedNo = new JRadioButton("No");
	private final JRadioButton rdbtnSpouseCSYes = new JRadioButton("Yes");
	private final JRadioButton rdbtnSpouseCSNo = new JRadioButton("No");
	private final ButtonGroup employedBG = new ButtonGroup();
	private final ButtonGroup CarreerSourceBG = new ButtonGroup();
	private final ButtonGroup spouseEmployedBG = new ButtonGroup();
	private final ButtonGroup SpouseCarreerSourceBG = new ButtonGroup();
	private final ButtonGroup spouseRaceBG = new ButtonGroup();
	private final ButtonGroup D1raceBG = new ButtonGroup();
	private final ButtonGroup D2raceBG = new ButtonGroup();
	private final ButtonGroup D3raceBG = new ButtonGroup();
	private final JLabel label_17 = new JLabel("* = All required Feilds");
	private final JLabel label_18 = new JLabel("* = All required Feilds");
	private final JLabel lblonlyLast = new JLabel("(Only Last 4 Digits)");
	
	
	//Define the SSN Mask
	MaskFormatter ssnMask = createFormatter("####");
	MaskFormatter ssnSpouseMask = createFormatter("####");
	
	//Define the Phone number mask
	MaskFormatter telMask = createFormatter("###-###-####");
	MaskFormatter telSpouseMask = createFormatter("###-###-####");
	
	//Define the DOB mask
	MaskFormatter dobMask = createFormatter("##/##/##");
	MaskFormatter dobSpouseMask = createFormatter("##/##/##");
	
	MaskFormatter D1DOBMask = createFormatter("##/##/##");
	MaskFormatter D2DOBMask = createFormatter("##/##/##");
	MaskFormatter D3DOBMask = createFormatter("##/##/##");
	
	
	//Define the occupancy length mask
	MaskFormatter hLengthMask = createFormatter("##");
	MaskFormatter hLengthSpouseMask = createFormatter("##");
	
	MaskFormatter lenofOccMask = createFormatter("##");
	MaskFormatter lenofOccSpouseMask = createFormatter("##");

	//Define the Zip mask
	MaskFormatter zipMask = createFormatter("#####");
	
	//Define the Middle initial mask
	MaskFormatter mInitialMask = createFormatter("U");
	
	//Define the year of school mask
	
	MaskFormatter D1YOSMask = createFormatter("##");
	MaskFormatter D2YOSMask = createFormatter("##");
	MaskFormatter D3YOSMask = createFormatter("##");
	
	//Income and Expense Masks
	
	//Income
	
	MaskFormatter snapFoodStampsMask = createFormatter("######");
	MaskFormatter ssDisabilityMask = createFormatter("######");
	MaskFormatter wagesMask = createFormatter("######");
	MaskFormatter tanfTeaMask = createFormatter("######");
	MaskFormatter unemploymentMask= createFormatter("######");
	MaskFormatter childSupMask = createFormatter("######");
	MaskFormatter otherIncMask = createFormatter("######");
	
	//Expenses
	MaskFormatter rentMask = createFormatter("######");
	MaskFormatter utilitiesMask = createFormatter("######");
	MaskFormatter telCostMask = createFormatter("######");
	MaskFormatter foodMask = createFormatter("######");
	MaskFormatter carPayMask = createFormatter("######");
	MaskFormatter childSupExMask = createFormatter("######");
	MaskFormatter otherExMask = createFormatter("######");


	
	
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
		textField_11.setToolTipText("enter your spouse's name");
		textField_11.setBounds(144, 501, 130, 26);
		textField_11.setColumns(10);
		cityTF.setToolTipText("enter your city");
		cityTF.setBounds(144, 294, 130, 26);
		cityTF.setColumns(10);
		addressTF.setToolTipText("enter your address");
		addressTF.setBounds(144, 266, 130, 26);
		addressTF.setColumns(10);
		tribeTF.setToolTipText("enter your tribe");
		tribeTF.setBounds(144, 238, 130, 26);
		tribeTF.setColumns(10);
		textField_4.setBounds(226, 97, 130, 26);
		textField_4.setColumns(10);
		D1relationshipTF.setToolTipText("enter your relationship to the dependet");
		D1relationshipTF.setBounds(125, 140, 130, 26);
		D1relationshipTF.setColumns(10);
		D1NameTF.setToolTipText("enter name of child/dependent");
		D1NameTF.setBounds(125, 56, 130, 26);
		D1NameTF.setColumns(10);
		maidennameTF.setToolTipText("Enter your maiden name if nessecary");
		maidennameTF.setBounds(144, 154, 130, 26);
		maidennameTF.setColumns(10);
		firstNameTF.setToolTipText("Enter your first name");
		firstNameTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_firstNameTF_focusLost(arg0);
			}
		});
		firstNameTF.setBounds(144, 126, 130, 26);
		firstNameTF.setColumns(10);
		lastNameTF.setToolTipText("Enter your last name");
		lastNameTF.setBounds(144, 70, 130, 26);
		lastNameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Salvation Army Back-to-School Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 864);
		
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
		
		//Associate DOB masks
		dobMask.setPlaceholderCharacter('0');
		dobMask.install(dobFTF);
		
		dobSpouseMask.setPlaceholderCharacter('0');
		dobSpouseMask.install(dobSpouseFTF);
		
		D1DOBMask.setPlaceholderCharacter('0');
		
		D2DOBMask.setPlaceholderCharacter('0');
		
		D3DOBMask.setPlaceholderCharacter('0');
		
		//Associate the occupancy length masks
		hLengthMask.setPlaceholderCharacter('0');
		hLengthMask.install(hLengthFTF);
		
		hLengthSpouseMask.setPlaceholderCharacter('0');
		hLengthSpouseMask.install(hLengthSpouseFTF);
		
		lenofOccMask.setPlaceholderCharacter('0');
		
		lenofOccSpouseMask.setPlaceholderCharacter('0');
		
		//Associate the Zip masks
		zipMask.setPlaceholderCharacter('0');
		zipMask.install(zipFTF);
		
		//Associate the  Middle initial masks
		mInitialMask.setPlaceholderCharacter(' ');
		mInitialMask.install(middleInitialFTF);
		
		//Associate the Year of school masks
		D1YOSMask.setPlaceholderCharacter('0');
		
		D2YOSMask.setPlaceholderCharacter('0');
		
		D3YOSMask.setPlaceholderCharacter('0');
		
		//Associate Income and expense masks
		//income
		snapFoodStampsMask.setPlaceholderCharacter('0');
		
		ssDisabilityMask.setPlaceholderCharacter('0');
		
		wagesMask.setPlaceholderCharacter('0');
		
		tanfTeaMask.setPlaceholderCharacter('0');
		
		unemploymentMask.setPlaceholderCharacter('0');
		
		childSupMask.setPlaceholderCharacter('0');
		
		otherIncMask.setPlaceholderCharacter('0');
		
		//Expenses
		rentMask.setPlaceholderCharacter('0');
		
		utilitiesMask.setPlaceholderCharacter('0');
		
		telCostMask.setPlaceholderCharacter('0');
		
		foodMask.setPlaceholderCharacter('0');
		
		carPayMask.setPlaceholderCharacter('0');
		
		childSupExMask.setPlaceholderCharacter('0');
		
		otherExMask.setPlaceholderCharacter('0');
		
		
		lblIncCalcTotal.setText("0");
		//Populate totals
//		updateIncomeTotal(0);
//		updateExpensesTotal(0);
//		updateNetTotal(0);
	
		
		mnFile.add(mntmExit);
		
		FormMenuBar.add(mnHelp);
		mntmApplicantInformationHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmApplicantInformationHelp_actionPerformed(e);
			}
		});
		
		mnHelp.add(mntmApplicantInformationHelp);
		mntmChildInformationHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmChildInformationHelp_actionPerformed(e);
			}
		});
		
		mnHelp.add(mntmChildInformationHelp);
		mntmFinancialInformationHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmFinancialInformationHelp_actionPerformed(e);
			}
		});
		
		mnHelp.add(mntmFinancialInformationHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		armyFormTP.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_armyFormTP_stateChanged(e);
			}
		});
		armyFormTP.setBounds(6, 6, 488, 798);
		
		contentPane.add(armyFormTP);
		
		armyFormTP.addTab("Applicant Information", null, applicantInfoPanel, null);
		applicantInfoPanel.setLayout(null);
		lblLastName.setBounds(6, 70, 90, 16);
		
		applicantInfoPanel.add(lblLastName);
		lblMiddleInitial.setBounds(6, 98, 90, 16);
		
		applicantInfoPanel.add(lblMiddleInitial);
		lblFirstName.setBounds(6, 126, 90, 16);
		
		applicantInfoPanel.add(lblFirstName);
		lblMaidenName.setBounds(6, 154, 107, 16);
		
		applicantInfoPanel.add(lblMaidenName);
		lblSocialSecurity.setBounds(6, 182, 107, 16);
		
		applicantInfoPanel.add(lblSocialSecurity);
		lblDOB.setBounds(6, 210, 90, 16);
		
		applicantInfoPanel.add(lblDOB);
		lblRace.setBounds(320, 70, 61, 16);
		
		applicantInfoPanel.add(lblRace);
		lblTribe.setBounds(6, 238, 61, 16);
		
		applicantInfoPanel.add(lblTribe);
		lblAddress.setBounds(6, 266, 61, 16);
		
		applicantInfoPanel.add(lblAddress);
		lblCity.setBounds(6, 294, 61, 16);
		
		applicantInfoPanel.add(lblCity);
		lblZip.setBounds(6, 322, 61, 16);
		
		applicantInfoPanel.add(lblZip);
		lblLengthOfOccupancy_1.setBounds(6, 350, 153, 16);
		
		applicantInfoPanel.add(lblLengthOfOccupancy_1);
		
		applicantInfoPanel.add(lastNameTF);
		
		applicantInfoPanel.add(firstNameTF);
		
		applicantInfoPanel.add(maidennameTF);
		SSNFTF.setToolTipText("enter the last 4 digits of your social security number");
		SSNFTF.setBounds(144, 182, 42, 26);
		
		applicantInfoPanel.add(SSNFTF);
		dobFTF.setToolTipText("enter your DOB in format 00/00/00");
		dobFTF.setBounds(144, 210, 72, 26);
		
		applicantInfoPanel.add(dobFTF);
		raceBG.add(rdbtnNativeAmerican);
		rdbtnNativeAmerican.setBounds(320, 98, 141, 23);
		
		applicantInfoPanel.add(rdbtnNativeAmerican);
		raceBG.add(rdbtnAsian);
		rdbtnAsian.setBounds(320, 133, 141, 23);
		
		applicantInfoPanel.add(rdbtnAsian);
		raceBG.add(rdbtnAfricanAmerican);
		rdbtnAfricanAmerican.setBounds(320, 164, 141, 23);
		
		applicantInfoPanel.add(rdbtnAfricanAmerican);
		raceBG.add(rdbtnCaucasian);
		rdbtnCaucasian.setBounds(320, 199, 141, 23);
		
		applicantInfoPanel.add(rdbtnCaucasian);
		raceBG.add(rdbtnHispanic);
		rdbtnHispanic.setBounds(320, 234, 141, 23);
		
		applicantInfoPanel.add(rdbtnHispanic);
		raceBG.add(rdbtnMultiracial);
		rdbtnMultiracial.setBounds(320, 269, 141, 23);
		
		applicantInfoPanel.add(rdbtnMultiracial);
		lblPersonalInformation.setBounds(122, 6, 153, 16);
		
		applicantInfoPanel.add(lblPersonalInformation);
		lblphonenumber.setBounds(6, 378, 117, 16);
		
		applicantInfoPanel.add(lblphonenumber);
		lblFamilyStatus.setToolTipText("");
		lblFamilyStatus.setBounds(6, 410, 107, 16);
		
		applicantInfoPanel.add(lblFamilyStatus);
		FamilyStatusComboBox.setToolTipText("Select a Family status");
		FamilyStatusComboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Married", "Single", "Divorced", "Seperated", "Widowed"}));
		FamilyStatusComboBox.setBounds(144, 406, 107, 27);
		
		applicantInfoPanel.add(FamilyStatusComboBox);
		
		applicantInfoPanel.add(tribeTF);
		
		applicantInfoPanel.add(addressTF);
		
		applicantInfoPanel.add(cityTF);
		zipFTF.setToolTipText("enter your Zip code");
		zipFTF.setBounds(144, 322, 50, 26);
		
		applicantInfoPanel.add(zipFTF);
		hLengthFTF.setToolTipText("Enter your length of time in that residence");
		hLengthFTF.setBounds(144, 350, 42, 26);
		
		applicantInfoPanel.add(hLengthFTF);
		phFTF.setToolTipText("enter your phone number");
		phFTF.setBounds(144, 377, 107, 26);
		
		applicantInfoPanel.add(phFTF);
		lblSpouseInformation.setBounds(157, 465, 130, 16);
		
		applicantInfoPanel.add(lblSpouseInformation);
		lblSpouseName.setBounds(6, 506, 107, 16);
		
		applicantInfoPanel.add(lblSpouseName);
		lblSocialSecuritySpouse.setBounds(6, 534, 107, 16);
		
		applicantInfoPanel.add(lblSocialSecuritySpouse);
		lblDateOfBirth_1.setBounds(6, 562, 90, 16);
		
		applicantInfoPanel.add(lblDateOfBirth_1);
		label.setBounds(320, 506, 61, 16);
		
		applicantInfoPanel.add(label);
		spouseRaceBG.add(rdbtnSpouseNA);
		rdbtnSpouseNA.setBounds(320, 534, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseNA);
		spouseRaceBG.add(rdbtnSpouseA);
		rdbtnSpouseA.setBounds(320, 569, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseA);
		spouseRaceBG.add(rdbtnSpouseAA);
		rdbtnSpouseAA.setBounds(320, 600, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseAA);
		spouseRaceBG.add(rdbtnSpouseC);
		rdbtnSpouseC.setBounds(320, 635, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseC);
		spouseRaceBG.add(rdbtnSpouseH);
		rdbtnSpouseH.setBounds(320, 670, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseH);
		spouseRaceBG.add(rdbtnSpouseMR);
		rdbtnSpouseMR.setBounds(320, 705, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseMR);
		spouseAddressTF.setToolTipText("enter your spouse's address");
		spouseAddressTF.setColumns(10);
		spouseAddressTF.setBounds(144, 585, 130, 26);
		
		applicantInfoPanel.add(spouseAddressTF);
		lblSpouseAddress.setBounds(6, 590, 61, 16);
		
		applicantInfoPanel.add(lblSpouseAddress);
		lblSpouseCity.setBounds(6, 618, 61, 16);
		
		applicantInfoPanel.add(lblSpouseCity);
		spouseCityTF.setToolTipText("enter your spouse's city");
		spouseCityTF.setColumns(10);
		spouseCityTF.setBounds(144, 613, 130, 26);
		
		applicantInfoPanel.add(spouseCityTF);
		lblSpouseoccupancy.setBounds(6, 646, 153, 16);
		
		applicantInfoPanel.add(lblSpouseoccupancy);
		hLengthSpouseFTF.setToolTipText("enter your spouse's duration in that residence");
		hLengthSpouseFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_hLengthSpouseFTF_focusLost(e);
			}
		});
		hLengthSpouseFTF.setBounds(144, 641, 42, 26);
		
		applicantInfoPanel.add(hLengthSpouseFTF);
		lblTelephoneSpouse.setBounds(6, 674, 117, 16);
		
		applicantInfoPanel.add(lblTelephoneSpouse);
		phSpouseFTF.setToolTipText("enter your spouse's phone number");
		phSpouseFTF.setBounds(144, 669, 107, 26);
		
		applicantInfoPanel.add(phSpouseFTF);
		
		applicantInfoPanel.add(textField_11);
		dobSpouseFTF.setToolTipText("enter your spouse's date of birth in format: 00/00/00");
		dobSpouseFTF.setBounds(144, 557, 72, 26);
		
		applicantInfoPanel.add(dobSpouseFTF);
		spouseSSNFTF.setToolTipText("enter your spouse's lasgt 4 digits of ssn");
		spouseSSNFTF.setBounds(144, 529, 42, 26);
		
		applicantInfoPanel.add(spouseSSNFTF);
		lblYears_1.setBounds(190, 355, 61, 16);
		
		applicantInfoPanel.add(lblYears_1);
		lblOccupancyLenYears.setBounds(190, 646, 61, 16);
		
		applicantInfoPanel.add(lblOccupancyLenYears);
		middleInitialFTF.setToolTipText("Enter your middle initial");
		middleInitialFTF.setBounds(144, 97, 22, 26);
		
		applicantInfoPanel.add(middleInitialFTF);
		lblTab1ApplicantName.setBounds(286, 7, 181, 14);
		
		applicantInfoPanel.add(lblTab1ApplicantName);
		lblrequired.setBounds(6, 42, 147, 16);
		
		applicantInfoPanel.add(lblrequired);
		lblonlyLast.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblonlyLast.setBounds(190, 187, 97, 16);
		
		applicantInfoPanel.add(lblonlyLast);
		
		D1DOBMask.install(D1DOBFTF);
		D2DOBMask.install(D2DOBFTF);
		D3DOBMask.install(D3DOBFTF);
		D1YOSMask.install(D1YOSFTF);
		D2YOSMask.install(D2YOSFTF);
		D3YOSMask.install(D2YOSFTF);
		childInfoPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_childInfoPanel_mouseClicked(e);
			}
		});
		
		armyFormTP.addTab("Child Information", null, childInfoPanel, null);
		childInfoPanel.setLayout(null);
		lblDependent.setBounds(20, 33, 85, 16);
		
		childInfoPanel.add(lblDependent);
		lblName.setBounds(20, 61, 61, 16);
		
		childInfoPanel.add(lblName);
		lblYearOfSchool.setBounds(20, 89, 98, 16);
		
		childInfoPanel.add(lblYearOfSchool);
		lblDateOfBirth.setBounds(20, 117, 98, 16);
		
		childInfoPanel.add(lblDateOfBirth);
		lblRelationship.setBounds(20, 145, 98, 16);
		
		childInfoPanel.add(lblRelationship);
		
		childInfoPanel.add(D1NameTF);
		
		childInfoPanel.add(D1relationshipTF);
		D1YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D1YOSFTF.setBounds(125, 84, 28, 26);
		
		childInfoPanel.add(D1YOSFTF);
		D1DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D1DOBFTF.setBounds(125, 112, 76, 26);
		
		childInfoPanel.add(D1DOBFTF);
		D1raceBG.add(rdbtnNativeAmerican_1);
		rdbtnNativeAmerican_1.setBounds(267, 57, 141, 23);
		
		childInfoPanel.add(rdbtnNativeAmerican_1);
		D1raceBG.add(rdbtnAsian_1);
		rdbtnAsian_1.setBounds(267, 85, 141, 23);
		
		childInfoPanel.add(rdbtnAsian_1);
		D1raceBG.add(rdbtnAfricanAmerican_1);
		rdbtnAfricanAmerican_1.setBounds(267, 113, 141, 23);
		
		childInfoPanel.add(rdbtnAfricanAmerican_1);
		D1raceBG.add(rdbtnCaucasian_1);
		rdbtnCaucasian_1.setBounds(267, 141, 141, 23);
		
		childInfoPanel.add(rdbtnCaucasian_1);
		D1raceBG.add(rdbtnHispanic_1);
		rdbtnHispanic_1.setBounds(267, 167, 141, 23);
		
		childInfoPanel.add(rdbtnHispanic_1);
		D1raceBG.add(rdbtnMultiracial_1);
		rdbtnMultiracial_1.setBounds(267, 194, 141, 23);
		
		childInfoPanel.add(rdbtnMultiracial_1);
		lblRaceD1.setBounds(272, 33, 61, 16);
		
		childInfoPanel.add(lblRaceD1);
		lblD2.setBounds(20, 268, 85, 16);
		
		childInfoPanel.add(lblD2);
		lblName_1.setBounds(20, 296, 61, 16);
		
		childInfoPanel.add(lblName_1);
		lblYearOfSchool_1.setBounds(20, 324, 133, 16);
		
		childInfoPanel.add(lblYearOfSchool_1);
		lblDateOfBirth_2.setBounds(20, 352, 98, 16);
		
		childInfoPanel.add(lblDateOfBirth_2);
		lblRelationship_1.setBounds(20, 380, 98, 16);
		
		childInfoPanel.add(lblRelationship_1);
		textField.setToolTipText("enter name of child/dependent");
		textField.setColumns(10);
		textField.setBounds(125, 291, 130, 26);
		
		childInfoPanel.add(textField);
		textField_1.setToolTipText("enter your relationship to the dependet");
		textField_1.setColumns(10);
		textField_1.setBounds(125, 375, 130, 26);
		
		childInfoPanel.add(textField_1);
		D2YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D2YOSFTF.setBounds(125, 319, 28, 26);
		
		childInfoPanel.add(D2YOSFTF);
		D2DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D2DOBFTF.setBounds(125, 347, 76, 26);
		
		childInfoPanel.add(D2DOBFTF);
		D2raceBG.add(radioButton);
		radioButton.setBounds(267, 292, 141, 23);
		
		childInfoPanel.add(radioButton);
		D2raceBG.add(radioButton_1);
		radioButton_1.setBounds(267, 320, 141, 23);
		
		childInfoPanel.add(radioButton_1);
		D2raceBG.add(radioButton_2);
		radioButton_2.setBounds(267, 348, 141, 23);
		
		childInfoPanel.add(radioButton_2);
		D2raceBG.add(radioButton_3);
		radioButton_3.setBounds(267, 376, 141, 23);
		
		childInfoPanel.add(radioButton_3);
		D2raceBG.add(radioButton_4);
		radioButton_4.setBounds(267, 402, 141, 23);
		
		childInfoPanel.add(radioButton_4);
		D2raceBG.add(radioButton_5);
		radioButton_5.setBounds(267, 429, 141, 23);
		
		childInfoPanel.add(radioButton_5);
		lblRace_1.setBounds(272, 268, 61, 16);
		
		childInfoPanel.add(lblRace_1);
		lblDependent_1.setBounds(20, 507, 85, 16);
		
		childInfoPanel.add(lblDependent_1);
		lblName_2.setBounds(20, 535, 61, 16);
		
		childInfoPanel.add(lblName_2);
		lblYearOfSchool_2.setBounds(20, 563, 116, 16);
		
		childInfoPanel.add(lblYearOfSchool_2);
		lblDateOfBirth_3.setBounds(20, 591, 98, 16);
		
		childInfoPanel.add(lblDateOfBirth_3);
		lblRelationship_2.setBounds(20, 619, 98, 16);
		
		childInfoPanel.add(lblRelationship_2);
		textField_2.setToolTipText("enter name of child/dependent");
		textField_2.setColumns(10);
		textField_2.setBounds(125, 530, 130, 26);
		
		childInfoPanel.add(textField_2);
		textField_3.setToolTipText("enter your relationship to the dependet");
		textField_3.setColumns(10);
		textField_3.setBounds(125, 614, 130, 26);
		
		childInfoPanel.add(textField_3);
		D3YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D3YOSFTF.setBounds(125, 558, 28, 26);
		
		childInfoPanel.add(D3YOSFTF);
		D3DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D3DOBFTF.setBounds(125, 586, 76, 26);
		
		childInfoPanel.add(D3DOBFTF);
		D3raceBG.add(radioButton_6);
		radioButton_6.setBounds(267, 531, 141, 23);
		
		childInfoPanel.add(radioButton_6);
		D3raceBG.add(radioButton_7);
		radioButton_7.setBounds(267, 559, 141, 23);
		
		childInfoPanel.add(radioButton_7);
		D3raceBG.add(radioButton_8);
		radioButton_8.setBounds(267, 587, 141, 23);
		
		childInfoPanel.add(radioButton_8);
		D3raceBG.add(radioButton_9);
		radioButton_9.setBounds(267, 615, 141, 23);
		
		childInfoPanel.add(radioButton_9);
		D3raceBG.add(radioButton_10);
		radioButton_10.setBounds(267, 641, 141, 23);
		
		childInfoPanel.add(radioButton_10);
		D3raceBG.add(radioButton_11);
		radioButton_11.setBounds(267, 668, 141, 23);
		
		childInfoPanel.add(radioButton_11);
		label_12.setBounds(272, 507, 61, 16);
		
		childInfoPanel.add(label_12);
		lblTab2ApplicantName.setBounds(291, 11, 182, 14);
		
		childInfoPanel.add(lblTab2ApplicantName);
		label_17.setBounds(20, 10, 147, 16);
		
		childInfoPanel.add(label_17);
		lenofOccMask.install(lenofOccFTF);
		lenofOccSpouseMask.install(lenofOccSpouseFTF);
		snapFoodStampsMask.install(snapFoodStampsFTF);
		ssDisabilityMask.install(ssDisabilityFTF);
		wagesMask.install(wagesFTF);
		tanfTeaMask.install(tanfTeaFTF);
		unemploymentMask.install(unemploymentFTF);
		childSupMask.install(childSupFTF);
		otherIncMask.install(otherIncFTF);
		rentMask.install(rentFTF);
		utilitiesMask.install(utilitiesFTF);
		telCostMask.install(telCostFTF);
		foodMask.install(foodFTF);
		carPayMask.install(carPayFTF);
		childSupExMask.install(childSupExFTF);
		otherExMask.install(otherExFTF);
		
		armyFormTP.addTab("Financial Information", null, financialInfoPanel, null);
		financialInfoPanel.setLayout(null);
		lblIncome.setBounds(6, 454, 61, 16);
		
		financialInfoPanel.add(lblIncome);
		lblSnapfoodStamps.setBounds(6, 482, 131, 16);
		
		financialInfoPanel.add(lblSnapfoodStamps);
		lblSsdisability.setBounds(6, 510, 101, 16);
		
		financialInfoPanel.add(lblSsdisability);
		lblWages.setBounds(6, 538, 61, 16);
		
		financialInfoPanel.add(lblWages);
		lblTanfOrTea.setBounds(6, 566, 95, 16);
		
		financialInfoPanel.add(lblTanfOrTea);
		lblUnemployment.setBounds(6, 594, 101, 16);
		
		financialInfoPanel.add(lblUnemployment);
		lblChildSupport.setBounds(6, 622, 101, 16);
		
		financialInfoPanel.add(lblChildSupport);
		lblOther.setBounds(6, 650, 61, 16);
	
		
		financialInfoPanel.add(lblOther);
		snapFoodStampsFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_snapFoodStampsFTF_focusLost(e);
			}
		});
		snapFoodStampsFTF.setBounds(150, 482, 64, 26);
		
		financialInfoPanel.add(snapFoodStampsFTF);
		ssDisabilityFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_ssDisabilityFTF_focusLost(e);
			}
		});
		ssDisabilityFTF.setBounds(150, 510, 64, 26);
		
		financialInfoPanel.add(ssDisabilityFTF);
		wagesFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_wagesFTF_focusLost(e);
			}
		});
		wagesFTF.setBounds(150, 538, 64, 26);
		
		financialInfoPanel.add(wagesFTF);
		tanfTeaFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_tanfTeaFTF_focusLost(e);
			}
		});
		tanfTeaFTF.setBounds(150, 566, 64, 26);
		
		financialInfoPanel.add(tanfTeaFTF);
		unemploymentFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_unemploymentFTF_focusLost(e);
			}
		});
		unemploymentFTF.setBounds(150, 594, 64, 26);
		
		financialInfoPanel.add(unemploymentFTF);
		childSupFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_childSupFTF_focusLost(e);
			}
		});
		childSupFTF.setBounds(150, 622, 64, 26);
		
		financialInfoPanel.add(childSupFTF);
		otherIncFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_otherIncFTF_focusLost(e);
			}
		});
		otherIncFTF.setBounds(150, 650, 64, 26);
		
		financialInfoPanel.add(otherIncFTF);
		lblExpenses.setBounds(226, 454, 61, 16);
		
		financialInfoPanel.add(lblExpenses);
		lblRent.setBounds(226, 482, 119, 16);
		
		financialInfoPanel.add(lblRent);
		lblUtilities.setBounds(226, 510, 101, 16);
		
		financialInfoPanel.add(lblUtilities);
		lblTelephone.setBounds(226, 538, 95, 16);
		
		financialInfoPanel.add(lblTelephone);
		lblFood.setBounds(226, 566, 95, 16);
		
		financialInfoPanel.add(lblFood);
		lblCarPayment.setBounds(226, 594, 101, 16);
		
		financialInfoPanel.add(lblCarPayment);
		lblChildSupport_1.setBounds(226, 622, 101, 16);
		
		financialInfoPanel.add(lblChildSupport_1);
		lblOther_1.setBounds(226, 650, 61, 16);
		
		financialInfoPanel.add(lblOther_1);
		rentFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_rentFTF_focusLost(e);
			}
		});
		rentFTF.setBounds(344, 482, 64, 26);
		
		financialInfoPanel.add(rentFTF);
		utilitiesFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_utilitiesFTF_focusLost(e);
			}
		});
		utilitiesFTF.setBounds(344, 510, 64, 26);
		
		financialInfoPanel.add(utilitiesFTF);
		telCostFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_telCostFTF_focusLost(e);
			}
		});
		telCostFTF.setBounds(344, 538, 64, 26);
		
		financialInfoPanel.add(telCostFTF);
		foodFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_foodFTF_focusLost(e);
			}
		});
		foodFTF.setBounds(344, 566, 64, 26);
		
		financialInfoPanel.add(foodFTF);
		carPayFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_carPayFTF_focusLost(e);
			}
		});
		carPayFTF.setBounds(344, 594, 64, 26);
		
		financialInfoPanel.add(carPayFTF);
		childSupExFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_childSupExFTF_focusLost(e);
			}
		});
		childSupExFTF.setBounds(344, 622, 64, 26);
		
		financialInfoPanel.add(childSupExFTF);
		otherExFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_otherExFTF_focusLost(e);
			}
		});
		otherExFTF.setBounds(344, 650, 64, 26);
		
		financialInfoPanel.add(otherExFTF);
		lblAreYourEmployed.setBounds(6, 56, 160, 16);
		
		financialInfoPanel.add(lblAreYourEmployed);
		lblPlaceOfEmployment.setBounds(6, 102, 131, 16);
		
		financialInfoPanel.add(lblPlaceOfEmployment);
		lblLengthOfOccupancy.setBounds(6, 139, 147, 16);
		
		financialInfoPanel.add(lblLengthOfOccupancy);
		lblIfNotEmployed.setBounds(8, 162, 203, 26);
		
		financialInfoPanel.add(lblIfNotEmployed);
		lblS.setBounds(8, 186, 171, 16);
		
		financialInfoPanel.add(lblS);
		
		financialInfoPanel.add(textField_4);
		lenofOccFTF.setBounds(226, 134, 27, 26);
		
		financialInfoPanel.add(lenofOccFTF);
		lblYears.setBounds(258, 139, 61, 16);
		
		financialInfoPanel.add(lblYears);
		lblAreYourEmployed_1.setBounds(6, 255, 160, 16);
		
		financialInfoPanel.add(lblAreYourEmployed_1);
		label_7.setBounds(6, 301, 131, 16);
		
		financialInfoPanel.add(label_7);
		textField_5.setColumns(10);
		textField_5.setBounds(226, 301, 130, 26);
		
		financialInfoPanel.add(textField_5);
		lenofOccSpouseFTF.setBounds(226, 338, 27, 26);
		
		financialInfoPanel.add(lenofOccSpouseFTF);
		label_13.setBounds(258, 343, 61, 16);
		
		financialInfoPanel.add(label_13);
		label_14.setBounds(6, 338, 147, 16);
		
		financialInfoPanel.add(label_14);
		lblOfSouthwestFlorida.setBounds(8, 395, 171, 16);
		
		financialInfoPanel.add(lblOfSouthwestFlorida);
		label_16.setBounds(8, 371, 203, 26);
		
		financialInfoPanel.add(label_16);
		lblPersonal.setBounds(150, 28, 61, 16);
		
		financialInfoPanel.add(lblPersonal);
		lblSpouse.setBounds(156, 227, 61, 16);
		
		financialInfoPanel.add(lblSpouse);
		lblLevelOfEducation.setBounds(6, 423, 160, 16);
		
		financialInfoPanel.add(lblLevelOfEducation);
		lblIncTotal.setBounds(97, 688, 40, 16);
		
		financialInfoPanel.add(lblIncTotal);
		lblTotal.setBounds(306, 688, 40, 16);
		
		financialInfoPanel.add(lblTotal);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No GED/Diploma", "GED", "High School Diploma", "Associates Degree", "Bachelors Degree Post-Gradudate"}));
		comboBox.setBounds(226, 424, 171, 27);
		
		financialInfoPanel.add(comboBox);
		lblTab3ApplicantName.setBounds(288, 7, 185, 14);
		financialInfoPanel.add(lblTab3ApplicantName);
		lblIncCalcTotal.setBounds(160, 688, 77, 16);
		
		financialInfoPanel.add(lblIncCalcTotal);
		lblNetTotal.setBounds(72, 716, 61, 16);
		
		financialInfoPanel.add(lblNetTotal);
		lblnettotcalc.setBounds(160, 716, 119, 16);
		
		financialInfoPanel.add(lblnettotcalc);
		lblExpCalcTotal.setBounds(355, 688, 95, 16);
		
		financialInfoPanel.add(lblExpCalcTotal);
		employedBG.add(rdbtnEmployedYes);
		rdbtnEmployedYes.setBounds(226, 43, 141, 23);
		
		financialInfoPanel.add(rdbtnEmployedYes);
		employedBG.add(rdbtnEmployedNo);
		rdbtnEmployedNo.setBounds(226, 66, 141, 23);
		
		financialInfoPanel.add(rdbtnEmployedNo);
		CarreerSourceBG.add(rdbtnCSYes);
		rdbtnCSYes.setBounds(226, 162, 141, 23);
		
		financialInfoPanel.add(rdbtnCSYes);
		CarreerSourceBG.add(rdbtnCSNo);
		rdbtnCSNo.setBounds(226, 185, 141, 23);
		
		financialInfoPanel.add(rdbtnCSNo);
		spouseEmployedBG.add(rdbtnSpouseEmployedYes);
		rdbtnSpouseEmployedYes.setBounds(226, 238, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseEmployedYes);
		spouseEmployedBG.add(rdbtnSpouseEmployedNo);
		rdbtnSpouseEmployedNo.setBounds(226, 261, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseEmployedNo);
		SpouseCarreerSourceBG.add(rdbtnSpouseCSYes);
		rdbtnSpouseCSYes.setBounds(226, 370, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseCSYes);
		SpouseCarreerSourceBG.add(rdbtnSpouseCSNo);
		rdbtnSpouseCSNo.setBounds(226, 393, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseCSNo);
		label_18.setBounds(6, 6, 147, 16);
		
		financialInfoPanel.add(label_18);
		financialInfoPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{snapFoodStampsFTF, ssDisabilityFTF, wagesFTF, tanfTeaFTF, unemploymentFTF, childSupFTF, otherIncFTF, lblExpenses, lblRent, lblUtilities, lblTelephone, lblFood, lblCarPayment, lblChildSupport_1, lblOther_1, rentFTF, utilitiesFTF, telCostFTF, foodFTF, carPayFTF, childSupExFTF, otherExFTF, lblAreYourEmployed, lblPlaceOfEmployment, lblLengthOfOccupancy, lblIfNotEmployed, lblS, textField_4, lenofOccFTF, lblYears, lblAreYourEmployed_1, label_7, textField_5, lenofOccSpouseFTF, comboBox}));
		
		armyFormTP.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent ce) {
	        		int index = armyFormTP.getSelectedIndex() + 1;
	           if (index == 2) {
	        	   		checkTab1();
	           }else if (index == 3) {
	        	   		checkTab2();
	           }
	        }
	     });
	}
	
	
	//change listener 

	
	
	//Menu Buttons
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void do_mntmStartNewForm_actionPerformed(ActionEvent e) {
		this.dispose();
		GisolfiSABTSAFrame frame = new GisolfiSABTSAFrame();
		frame.setVisible(true);
	}

	protected void do_firstNameTF_focusLost(FocusEvent arg0) {
		String name = firstNameTF.getText();
		lblTab1ApplicantName.setText("Applicant: " + name);
		lblTab2ApplicantName.setText("Applicant: " + name);
		lblTab3ApplicantName.setText("Applicant: " + name);
	}
	
	//Validation
	
	public void invalidYearCheck(int year, JFormattedTextField textFeild) {
	
	if (year < 0 || year > 90) {
		textFeild.setForeground(Color.RED);
		
		JOptionPane.showMessageDialog(this,
			    "Please enter a Valid length of time",
			    "Missing Required Data Error",
			    JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void checkTab1() {

		if (lastNameTF.getText().trim().isEmpty()) {
			lblLastName.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			lastNameTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the 'Last Name' feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
			
		}else if(firstNameTF.getText().trim().isEmpty()) {
			lblFirstName.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			firstNameTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the First Name feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
			
		}else if(SSNFTF.getText().trim().isEmpty()) {
			lblSocialSecurity.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			SSNFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the Social Security feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
			
		}else if(dobFTF.getText().trim().isEmpty()) {
			lblDOB.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			dobFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the Date of Birth feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else if(addressTF.getText().trim().isEmpty()) {
			lblAddress.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			addressTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the address feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else if(cityTF.getText().trim().isEmpty()) {
			lblCity.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			cityTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the City feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else if(phFTF.getText().trim().isEmpty()) {
			lblTelephone.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(0);
			phFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the telephone feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else {
			lblLastName.setForeground(Color.BLACK);
			lblFirstName.setForeground(Color.BLACK);
			lblSocialSecurity.setForeground(Color.BLACK);
			lblDOB.setForeground(Color.BLACK);
			lblAddress.setForeground(Color.BLACK);
			lblCity.setForeground(Color.BLACK);
			lblTelephone.setForeground(Color.BLACK);
		}
	}
	
	//Ensure all required fields in tab 2 are complete
	protected void checkTab2() {

		if (D1NameTF.getText().trim().isEmpty()) {
			lblName.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(1);
			D1NameTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the Name feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
			
		}else if(D1YOSFTF.getText().trim().isEmpty()) {
			lblYearOfSchool.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(1);
			D1YOSFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the Grade in school feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
			
		}else if(D1DOBFTF.getText().trim().isEmpty()) {
			lblDateOfBirth.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(1);
			D1DOBFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the Date of Birth feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
			
		}else if(D1relationshipTF.getText().trim().isEmpty()) {
			lblRelationship.setForeground(Color.RED);
			armyFormTP.setSelectedIndex(1);
			D1relationshipTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please fill out the Realtionship feild",
				    "Missing Required Data Error",
				    JOptionPane.ERROR_MESSAGE);
	
		}else {
			//Set all colors back to black
			lblName.setForeground(Color.BLACK);
			lblYearOfSchool.setForeground(Color.BLACK);
			lblDateOfBirth.setForeground(Color.BLACK);
			lblRelationship.setForeground(Color.BLACK);
			
		}
	}
		
	
	//income calculating function
	private void updateIncomeTotal(int num) {
		String oldString = lblIncCalcTotal.getText().trim();
		int oldVal = Integer.parseInt(oldString);
		int newTotal = oldVal + num;
		lblIncCalcTotal.setText(Integer.toString(newTotal));
	}
	
	//Call calculating functions when focus lost
	protected void do_wagesFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(wagesFTF.getText()));
		updateNetTotal();
	}
	protected void do_ssDisabilityFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(ssDisabilityFTF.getText()));
		updateNetTotal();
	}
	protected void do_otherIncFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(otherIncFTF.getText()));
		updateNetTotal();
	}
	protected void do_childSupFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(childSupFTF.getText()));
		updateNetTotal();
	}
	protected void do_tanfTeaFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(tanfTeaFTF.getText()));
		updateNetTotal();
	}
	protected void do_unemploymentFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(unemploymentFTF.getText()));
		updateNetTotal();
	}
	protected void do_snapFoodStampsFTF_focusLost(FocusEvent e) {
		updateIncomeTotal(Integer.parseInt(snapFoodStampsFTF.getText()));
		updateNetTotal();
	}
	
	//Calculate Expenses
	private void updateExpensesTotal(int num) {
		String oldString = lblExpCalcTotal.getText().trim();
		int oldVal = Integer.parseInt(oldString);
		int newTotal = oldVal + num;
		lblExpCalcTotal.setText(Integer.toString(newTotal));
	}
	
	//Call calculating functions when focus lost
	protected void do_rentFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(rentFTF.getText()));
		updateNetTotal();
	}
	protected void do_childSupExFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(childSupExFTF.getText()));
		updateNetTotal();
	}
	protected void do_telCostFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(telCostFTF.getText()));
		updateNetTotal();
	}
	protected void do_otherExFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(otherExFTF.getText()));
		updateNetTotal();
	}
	protected void do_utilitiesFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(utilitiesFTF.getText()));
		updateNetTotal();
	}
	protected void do_foodFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(foodFTF.getText()));
		updateNetTotal();
	}
	protected void do_carPayFTF_focusLost(FocusEvent e) {
		updateExpensesTotal(Integer.parseInt(carPayFTF.getText()));
		updateNetTotal();
	}
	
	//Finds the net total of all expenses and income
	private void updateNetTotal() {
		int Income = Integer.parseInt(lblIncCalcTotal.getText());
		int Expenses = Integer.parseInt(lblExpCalcTotal.getText());
		int netTotal = Income - Expenses;
		if (netTotal < 0) {
			lblnettotcalc.setForeground(Color.RED);
		}else {
			lblnettotcalc.setForeground(Color.BLACK);
		}
		lblnettotcalc.setText(Integer.toString(netTotal));
	}
	
	
	//Help Menus
	protected void do_mntmApplicantInformationHelp_actionPerformed(ActionEvent e) {
		ApplicantInformationHelpFrame personalinfoHelpframe = new ApplicantInformationHelpFrame();
		personalinfoHelpframe.setVisible(true);
		personalinfoHelpframe.setLocation(this.getX() + 30 , getY() + 30);
		
	}
	protected void do_mntmChildInformationHelp_actionPerformed(ActionEvent e) {
		ChildInformationHelpFrame childHelpframe = new ChildInformationHelpFrame();
		childHelpframe.setVisible(true);
		childHelpframe.setLocation(this.getX() + 30 , getY() + 30);
	
	}
	protected void do_mntmFinancialInformationHelp_actionPerformed(ActionEvent e) {
		FinancialInformationHelpFrame financialHelpframe = new FinancialInformationHelpFrame();
		financialHelpframe.setVisible(true);
		financialHelpframe.setLocation(this.getX() + 30 , getY() + 30);
	
	}

	protected void do_hLengthSpouseFTF_focusLost(FocusEvent e) {
		int lenOfOccupance = Integer.parseInt(hLengthSpouseFTF.getText());
		invalidYearCheck(lenOfOccupance, hLengthSpouseFTF);
	}
	
	
	
	
	protected void do_childInfoPanel_mouseClicked(MouseEvent e) {
	}
	protected void do_armyFormTP_stateChanged(ChangeEvent e) {
	
	}
}
