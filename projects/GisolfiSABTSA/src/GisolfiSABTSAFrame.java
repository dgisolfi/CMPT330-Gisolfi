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
	private final JLabel lblFirstName = new JLabel("First Name*");
	private final JLabel lblMaidenName = new JLabel("Maiden Name");
	private final JLabel lblSocialSecurity = new JLabel("Social Security*");
	private final JLabel lblDOB = new JLabel("Date Of Birth*");
	private final JLabel lblRace = new JLabel("Race");
	private final JLabel lblTribe = new JLabel("Tribe");
	private final JLabel lblAddress = new JLabel("Address*");
	private final JLabel lblCity = new JLabel("City*");
	private final JLabel lblZip = new JLabel("ZIP");
	private final JLabel lblLengthOfOccupancyPersonal = new JLabel("Occupancy Length");
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
	private final JLabel lblDependent1 = new JLabel("Dependent 1");
	private final JLabel lblName = new JLabel("Name*");
	private final JLabel lblYearOfSchool = new JLabel("Year of School*");
	private final JLabel lblDateOfBirthD1 = new JLabel("Date of Birth*");
	private final JLabel lblRelationship = new JLabel("Relationship*");
	private final JTextField D1NameTF = new JTextField();
	private final JTextField D1relationshipTF = new JTextField();
	private final JFormattedTextField D1YOSFTF = new JFormattedTextField();
	private final JFormattedTextField D1DOBFTF = new JFormattedTextField();
	private final JLabel lblRaceD1 = new JLabel("Race");
	private final JLabel lblD2 = new JLabel("Dependent 2");
	private final JLabel lblNameD2 = new JLabel("Name");
	private final JLabel lblYearOfSchoolD2 = new JLabel("Year of School");
	private final JLabel lblDateOfBirthD2 = new JLabel("Date of Birth");
	private final JLabel lblRelationshipD2 = new JLabel("Relationship");
	private final JTextField D2NameTF = new JTextField();
	private final JTextField D2relationshipTF = new JTextField();
	private final JFormattedTextField D2YOSFTF = new JFormattedTextField();
	private final JFormattedTextField D2DOBFTF = new JFormattedTextField();
	private final JLabel lblRaceD2 = new JLabel("Race");
	private final JLabel lblDependentD3 = new JLabel("Dependent 3");
	private final JLabel lblNameD3 = new JLabel("Name");
	private final JLabel lblYearOfSchoolD3 = new JLabel("Year of School");
	private final JLabel lblDateOfBirthD3 = new JLabel("Date of Birth");
	private final JLabel lblRelationshipD3 = new JLabel("Relationship");
	private final JTextField D3NameTF = new JTextField();
	private final JTextField D3relationshipTF = new JTextField();
	private final JFormattedTextField D3YOSFTF = new JFormattedTextField();
	private final JFormattedTextField D3DOBFTF = new JFormattedTextField();
	private final JLabel lblraceD3 = new JLabel("Race");
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
	private final JLabel lblChildSupportExp = new JLabel("Child Support");
	private final JLabel lblOtherExp = new JLabel("Other");
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
	private final JLabel lblCarreersource = new JLabel("of Southwest Florida?\n*");
	private final JTextField placeofEmplTF = new JTextField();
	private final JFormattedTextField lenofOccFTF = new JFormattedTextField();
	private final JLabel lblYears = new JLabel("years");
	private final JLabel lblAreYourEmployedspopuse = new JLabel("Are Your Employed?*");
	private final JLabel lblplaceofemplSpouse = new JLabel("Place of Employment");
	private final JTextField placeofEmplSpouseTF = new JTextField();
	private final JFormattedTextField lenofOccSpouseFTF = new JFormattedTextField();
	private final JLabel lblunits = new JLabel("years");
	private final JLabel lblLengthofEmpl = new JLabel("Length of Occupancy:");
	private final JLabel lblOfSouthwestFlorida = new JLabel("of Southwest Florida?\n*");
	private final JLabel lblreigstration = new JLabel("Registered with Careersource");
	private final JLabel lblPersonal = new JLabel("Personal");
	private final JLabel lblSpouse = new JLabel("Spouse");
	private final JLabel lblLevelOfEducation = new JLabel("Level Of Education:");
	private final JLabel lblIncTotal = new JLabel("Total");
	private final JLabel lblTotal = new JLabel("Total");
	private final JComboBox educationComboBox = new JComboBox();
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
	private final JLabel lblDOBSpouse = new JLabel("Date of Birth");
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
	private final JLabel lblSpouseoccupancy = new JLabel("Occupancy Length");
	private final JFormattedTextField hLengthSpouseFTF = new JFormattedTextField();
	private final JLabel lblTelephoneSpouse = new JLabel("Telephone");
	private final JFormattedTextField phSpouseFTF = new JFormattedTextField();
	private final JTextField spouseNameTF = new JTextField();
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
	private final JLabel lblrequiredfeilds = new JLabel("* = All required Feilds");
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
	private final JCheckBox chckbxEnableD2 = new JCheckBox("enable");
	private final JCheckBox chckbxEnableD3 = new JCheckBox("enable");
	private final JComboBox RaceD2comboBox = new JComboBox();
	private final JComboBox RaceD3comboBox = new JComboBox();
	private final JComboBox RaceD1comboBox = new JComboBox();
	private final JLabel lblDependentD4 = new JLabel("Dependent 4");
	private final JCheckBox chckbxEnableD4 = new JCheckBox("enable");
	private final JLabel lblNameD4 = new JLabel("Name");
	private final JTextField D4NameTF = new JTextField();
	private final JLabel lblYearOfSchoolD4 = new JLabel("Year of School");
	private final JFormattedTextField D4YOSFTF = new JFormattedTextField();
	private final JLabel lblDateOfBirthD4 = new JLabel("Date of Birth");
	private final JFormattedTextField D4DOBFTF = new JFormattedTextField();
	private final JLabel lblRelationshipD4 = new JLabel("Relationship");
	private final JTextField D4relationshipTF = new JTextField();
	private final JLabel lblraceD4 = new JLabel("Race");
	private final JComboBox RaceD4comboBox = new JComboBox();


	
	
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
		spouseNameTF.setToolTipText("enter your spouse's name");
		spouseNameTF.setBounds(144, 519, 130, 26);
		spouseNameTF.setColumns(10);
		cityTF.setToolTipText("enter your city");
		cityTF.setBounds(144, 312, 130, 26);
		cityTF.setColumns(10);
		addressTF.setToolTipText("enter your address");
		addressTF.setBounds(144, 284, 130, 26);
		addressTF.setColumns(10);
		tribeTF.setToolTipText("enter your tribe");
		tribeTF.setBounds(144, 256, 130, 26);
		tribeTF.setColumns(10);
		placeofEmplTF.setToolTipText("name the place of employment");
		placeofEmplTF.setBounds(226, 97, 130, 26);
		placeofEmplTF.setColumns(10);
		D1relationshipTF.setToolTipText("enter your relationship to the dependet");
		D1relationshipTF.setBounds(119, 140, 130, 26);
		D1relationshipTF.setColumns(10);
		D1NameTF.setToolTipText("enter name of child/dependent");
		D1NameTF.setBounds(119, 56, 130, 26);
		D1NameTF.setColumns(10);
		maidennameTF.setToolTipText("Enter your maiden name if nessecary");
		maidennameTF.setBounds(144, 172, 130, 26);
		maidennameTF.setColumns(10);
		firstNameTF.setToolTipText("Enter your first name");
		firstNameTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_firstNameTF_focusLost(arg0);
			}
		});
		firstNameTF.setBounds(144, 144, 130, 26);
		firstNameTF.setColumns(10);
		lastNameTF.setToolTipText("Enter your last name");
		lastNameTF.setBounds(144, 88, 130, 26);
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
		lblLastName.setBounds(6, 88, 90, 16);
		
		applicantInfoPanel.add(lblLastName);
		lblMiddleInitial.setBounds(6, 116, 90, 16);
		
		applicantInfoPanel.add(lblMiddleInitial);
		lblFirstName.setBounds(6, 144, 90, 16);
		
		applicantInfoPanel.add(lblFirstName);
		lblMaidenName.setBounds(6, 172, 107, 16);
		
		applicantInfoPanel.add(lblMaidenName);
		lblSocialSecurity.setBounds(6, 200, 107, 16);
		
		applicantInfoPanel.add(lblSocialSecurity);
		lblDOB.setBounds(6, 228, 90, 16);
		
		applicantInfoPanel.add(lblDOB);
		lblRace.setBounds(320, 88, 61, 16);
		
		applicantInfoPanel.add(lblRace);
		lblTribe.setBounds(6, 256, 61, 16);
		
		applicantInfoPanel.add(lblTribe);
		lblAddress.setBounds(6, 284, 61, 16);
		
		applicantInfoPanel.add(lblAddress);
		lblCity.setBounds(6, 312, 61, 16);
		
		applicantInfoPanel.add(lblCity);
		lblZip.setBounds(6, 340, 61, 16);
		
		applicantInfoPanel.add(lblZip);
		lblLengthOfOccupancyPersonal.setBounds(6, 368, 153, 16);
		
		applicantInfoPanel.add(lblLengthOfOccupancyPersonal);
		
		applicantInfoPanel.add(lastNameTF);
		
		applicantInfoPanel.add(firstNameTF);
		
		applicantInfoPanel.add(maidennameTF);
		SSNFTF.setToolTipText("enter the last 4 digits of your social security number");
		SSNFTF.setBounds(144, 200, 42, 26);
		
		applicantInfoPanel.add(SSNFTF);
		dobFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_dobFTF_focusLost(e);
			}
		});
		dobFTF.setToolTipText("enter your DOB in format 00/00/00");
		dobFTF.setBounds(144, 228, 72, 26);
		
		applicantInfoPanel.add(dobFTF);
		raceBG.add(rdbtnNativeAmerican);
		rdbtnNativeAmerican.setBounds(320, 116, 141, 23);
		
		applicantInfoPanel.add(rdbtnNativeAmerican);
		raceBG.add(rdbtnAsian);
		rdbtnAsian.setBounds(320, 151, 141, 23);
		
		applicantInfoPanel.add(rdbtnAsian);
		raceBG.add(rdbtnAfricanAmerican);
		rdbtnAfricanAmerican.setBounds(320, 182, 141, 23);
		
		applicantInfoPanel.add(rdbtnAfricanAmerican);
		raceBG.add(rdbtnCaucasian);
		rdbtnCaucasian.setBounds(320, 217, 141, 23);
		
		applicantInfoPanel.add(rdbtnCaucasian);
		raceBG.add(rdbtnHispanic);
		rdbtnHispanic.setBounds(320, 252, 141, 23);
		
		applicantInfoPanel.add(rdbtnHispanic);
		raceBG.add(rdbtnMultiracial);
		rdbtnMultiracial.setBounds(320, 287, 141, 23);
		
		applicantInfoPanel.add(rdbtnMultiracial);
		lblPersonalInformation.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPersonalInformation.setBounds(125, 32, 190, 16);
		
		applicantInfoPanel.add(lblPersonalInformation);
		lblphonenumber.setBounds(6, 396, 117, 16);
		
		applicantInfoPanel.add(lblphonenumber);
		lblFamilyStatus.setToolTipText("");
		lblFamilyStatus.setBounds(6, 428, 107, 16);
		
		applicantInfoPanel.add(lblFamilyStatus);
		FamilyStatusComboBox.setToolTipText("Select a Family status");
		FamilyStatusComboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "Married", "Single", "Divorced", "Seperated", "Widowed"}));
		FamilyStatusComboBox.setBounds(144, 424, 107, 27);
		
		applicantInfoPanel.add(FamilyStatusComboBox);
		
		applicantInfoPanel.add(tribeTF);
		
		applicantInfoPanel.add(addressTF);
		
		applicantInfoPanel.add(cityTF);
		zipFTF.setToolTipText("enter your Zip code");
		zipFTF.setBounds(144, 340, 50, 26);
		
		applicantInfoPanel.add(zipFTF);
		hLengthFTF.setToolTipText("Enter your length of time in that residence");
		hLengthFTF.setBounds(144, 368, 42, 26);
		
		applicantInfoPanel.add(hLengthFTF);
		phFTF.setToolTipText("enter your phone number");
		phFTF.setBounds(144, 395, 107, 26);
		
		applicantInfoPanel.add(phFTF);
		lblSpouseInformation.setBounds(157, 483, 130, 16);
		
		applicantInfoPanel.add(lblSpouseInformation);
		lblSpouseName.setBounds(6, 524, 107, 16);
		
		applicantInfoPanel.add(lblSpouseName);
		lblSocialSecuritySpouse.setBounds(6, 552, 107, 16);
		
		applicantInfoPanel.add(lblSocialSecuritySpouse);
		lblDOBSpouse.setBounds(6, 580, 90, 16);
		
		applicantInfoPanel.add(lblDOBSpouse);
		label.setBounds(320, 524, 61, 16);
		
		applicantInfoPanel.add(label);
		spouseRaceBG.add(rdbtnSpouseNA);
		rdbtnSpouseNA.setBounds(320, 552, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseNA);
		spouseRaceBG.add(rdbtnSpouseA);
		rdbtnSpouseA.setBounds(320, 587, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseA);
		spouseRaceBG.add(rdbtnSpouseAA);
		rdbtnSpouseAA.setBounds(320, 618, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseAA);
		spouseRaceBG.add(rdbtnSpouseC);
		rdbtnSpouseC.setBounds(320, 653, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseC);
		spouseRaceBG.add(rdbtnSpouseH);
		rdbtnSpouseH.setBounds(320, 688, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseH);
		spouseRaceBG.add(rdbtnSpouseMR);
		rdbtnSpouseMR.setBounds(320, 723, 141, 23);
		
		applicantInfoPanel.add(rdbtnSpouseMR);
		spouseAddressTF.setToolTipText("enter your spouse's address");
		spouseAddressTF.setColumns(10);
		spouseAddressTF.setBounds(144, 603, 130, 26);
		
		applicantInfoPanel.add(spouseAddressTF);
		lblSpouseAddress.setBounds(6, 608, 61, 16);
		
		applicantInfoPanel.add(lblSpouseAddress);
		lblSpouseCity.setBounds(6, 636, 61, 16);
		
		applicantInfoPanel.add(lblSpouseCity);
		spouseCityTF.setToolTipText("enter your spouse's city");
		spouseCityTF.setColumns(10);
		spouseCityTF.setBounds(144, 631, 130, 26);
		
		applicantInfoPanel.add(spouseCityTF);
		lblSpouseoccupancy.setBounds(6, 664, 153, 16);
		
		applicantInfoPanel.add(lblSpouseoccupancy);
		hLengthSpouseFTF.setToolTipText("enter your spouse's duration in that residence");
		hLengthSpouseFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_hLengthSpouseFTF_focusLost(e);
			}
		});
		hLengthSpouseFTF.setBounds(144, 659, 42, 26);
		
		applicantInfoPanel.add(hLengthSpouseFTF);
		lblTelephoneSpouse.setBounds(6, 692, 117, 16);
		
		applicantInfoPanel.add(lblTelephoneSpouse);
		phSpouseFTF.setToolTipText("enter your spouse's phone number");
		phSpouseFTF.setBounds(144, 687, 107, 26);
		
		applicantInfoPanel.add(phSpouseFTF);
		
		applicantInfoPanel.add(spouseNameTF);
		dobSpouseFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_dobSpouseFTF_focusLost(e);
			}
		});
		dobSpouseFTF.setToolTipText("enter your spouse's date of birth in format: 00/00/00");
		dobSpouseFTF.setBounds(144, 575, 72, 26);
		
		applicantInfoPanel.add(dobSpouseFTF);
		spouseSSNFTF.setToolTipText("enter your spouse's lasgt 4 digits of ssn");
		spouseSSNFTF.setBounds(144, 547, 42, 26);
		
		applicantInfoPanel.add(spouseSSNFTF);
		lblYears_1.setBounds(190, 373, 61, 16);
		
		applicantInfoPanel.add(lblYears_1);
		lblOccupancyLenYears.setBounds(190, 664, 61, 16);
		
		applicantInfoPanel.add(lblOccupancyLenYears);
		middleInitialFTF.setToolTipText("Enter your middle initial");
		middleInitialFTF.setBounds(144, 115, 22, 26);
		
		applicantInfoPanel.add(middleInitialFTF);
		lblTab1ApplicantName.setBounds(280, 6, 181, 14);
		
		applicantInfoPanel.add(lblTab1ApplicantName);
		lblrequired.setBounds(6, 60, 147, 16);
		
		applicantInfoPanel.add(lblrequired);
		lblonlyLast.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblonlyLast.setBounds(190, 205, 97, 16);
		
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
		lblDependent1.setBounds(14, 33, 85, 16);
		
		childInfoPanel.add(lblDependent1);
		lblName.setBounds(14, 61, 61, 16);
		
		childInfoPanel.add(lblName);
		lblYearOfSchool.setBounds(14, 89, 98, 16);
		
		childInfoPanel.add(lblYearOfSchool);
		lblDateOfBirthD1.setBounds(14, 117, 98, 16);
		
		childInfoPanel.add(lblDateOfBirthD1);
		lblRelationship.setBounds(14, 145, 98, 16);
		
		childInfoPanel.add(lblRelationship);
		
		childInfoPanel.add(D1NameTF);
		
		childInfoPanel.add(D1relationshipTF);
		D1YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D1YOSFTF.setBounds(119, 84, 28, 26);
		
		childInfoPanel.add(D1YOSFTF);
		D1DOBFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_D1DOBFTF_focusLost(e);
			}
		});
		D1DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D1DOBFTF.setBounds(119, 112, 76, 26);
		
		childInfoPanel.add(D1DOBFTF);
		lblRaceD1.setBounds(14, 173, 61, 16);
		
		childInfoPanel.add(lblRaceD1);
		lblD2.setBounds(14, 212, 85, 16);
		
		childInfoPanel.add(lblD2);
		lblNameD2.setEnabled(false);
		lblNameD2.setBounds(14, 240, 61, 16);
		
		childInfoPanel.add(lblNameD2);
		lblYearOfSchoolD2.setEnabled(false);
		lblYearOfSchoolD2.setBounds(14, 268, 98, 16);
		
		childInfoPanel.add(lblYearOfSchoolD2);
		lblDateOfBirthD2.setEnabled(false);
		lblDateOfBirthD2.setBounds(14, 296, 98, 16);
		
		childInfoPanel.add(lblDateOfBirthD2);
		lblRelationshipD2.setEnabled(false);
		lblRelationshipD2.setBounds(14, 324, 98, 16);
		
		childInfoPanel.add(lblRelationshipD2);
		D2NameTF.setEnabled(false);
		D2NameTF.setToolTipText("enter name of child/dependent");
		D2NameTF.setColumns(10);
		D2NameTF.setBounds(119, 235, 130, 26);
		
		childInfoPanel.add(D2NameTF);
		D2relationshipTF.setEnabled(false);
		D2relationshipTF.setToolTipText("enter your relationship to the dependet");
		D2relationshipTF.setColumns(10);
		D2relationshipTF.setBounds(119, 319, 130, 26);
		
		childInfoPanel.add(D2relationshipTF);
		D2YOSFTF.setEnabled(false);
		D2YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D2YOSFTF.setBounds(119, 263, 28, 26);
		
		childInfoPanel.add(D2YOSFTF);
		D2DOBFTF.setEnabled(false);
		D2DOBFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_D2DOBFTF_focusLost(e);
			}
		});
		D2DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D2DOBFTF.setBounds(119, 291, 76, 26);
		
		childInfoPanel.add(D2DOBFTF);
		lblRaceD2.setEnabled(false);
		lblRaceD2.setBounds(14, 350, 61, 16);
		
		childInfoPanel.add(lblRaceD2);
		lblDependentD3.setBounds(14, 389, 85, 16);
		
		childInfoPanel.add(lblDependentD3);
		lblNameD3.setEnabled(false);
		lblNameD3.setBounds(14, 417, 61, 16);
		
		childInfoPanel.add(lblNameD3);
		lblYearOfSchoolD3.setEnabled(false);
		lblYearOfSchoolD3.setBounds(14, 445, 116, 16);
		
		childInfoPanel.add(lblYearOfSchoolD3);
		lblDateOfBirthD3.setEnabled(false);
		lblDateOfBirthD3.setBounds(14, 473, 98, 16);
		
		childInfoPanel.add(lblDateOfBirthD3);
		lblRelationshipD3.setEnabled(false);
		lblRelationshipD3.setBounds(14, 501, 98, 16);
		
		childInfoPanel.add(lblRelationshipD3);
		D3NameTF.setEnabled(false);
		D3NameTF.setToolTipText("enter name of child/dependent");
		D3NameTF.setColumns(10);
		D3NameTF.setBounds(119, 412, 130, 26);
		
		childInfoPanel.add(D3NameTF);
		D3relationshipTF.setEnabled(false);
		D3relationshipTF.setToolTipText("enter your relationship to the dependet");
		D3relationshipTF.setColumns(10);
		D3relationshipTF.setBounds(119, 496, 130, 26);
		
		childInfoPanel.add(D3relationshipTF);
		D3YOSFTF.setEnabled(false);
		D3YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D3YOSFTF.setBounds(119, 440, 28, 26);
		
		childInfoPanel.add(D3YOSFTF);
		D3DOBFTF.setEnabled(false);
		D3DOBFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_D3DOBFTF_focusLost(e);
			}
		});
		D3DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D3DOBFTF.setBounds(119, 468, 76, 26);
		
		childInfoPanel.add(D3DOBFTF);
		lblraceD3.setEnabled(false);
		lblraceD3.setBounds(14, 529, 61, 16);
		
		childInfoPanel.add(lblraceD3);
		lblTab2ApplicantName.setBounds(285, 7, 182, 14);
		
		childInfoPanel.add(lblTab2ApplicantName);
		lblrequiredfeilds.setBounds(14, 6, 147, 16);
		
		childInfoPanel.add(lblrequiredfeilds);
		chckbxEnableD2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxEnableD2_stateChanged(e);
			}
		});
		chckbxEnableD2.setBounds(119, 208, 128, 23);
		
		childInfoPanel.add(chckbxEnableD2);
		chckbxEnableD3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxEnableD3_stateChanged(e);
			}
		});
		chckbxEnableD3.setBounds(119, 385, 128, 23);
		
		childInfoPanel.add(chckbxEnableD3);
		RaceD2comboBox.setEnabled(false);
		RaceD2comboBox.setModel(new DefaultComboBoxModel(new String[] {"…", "Native American", "Asian", "African American", "Caucasian", "Hispanic", "Multi-Racial"}));
		RaceD2comboBox.setBounds(119, 346, 182, 27);
		
		childInfoPanel.add(RaceD2comboBox);
		RaceD3comboBox.setModel(new DefaultComboBoxModel(new String[] {"…", "Native American", "Asian", "African American", "Caucasian", "Hispanic", "Multi-Racial"}));
		RaceD3comboBox.setEnabled(false);
		RaceD3comboBox.setBounds(119, 525, 182, 27);
		
		childInfoPanel.add(RaceD3comboBox);
		RaceD1comboBox.setModel(new DefaultComboBoxModel(new String[] {"…", "Native American", "Asian", "African American", "Caucasian", "Hispanic", "Multi-Racial"}));
		RaceD1comboBox.setBounds(119, 169, 182, 27);
		
		childInfoPanel.add(RaceD1comboBox);
		lblDependentD4.setBounds(14, 568, 85, 16);
		
		childInfoPanel.add(lblDependentD4);
		chckbxEnableD4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbxEnableD4_stateChanged(e);
			}
		});
		chckbxEnableD4.setBounds(119, 564, 128, 23);
		
		childInfoPanel.add(chckbxEnableD4);
		lblNameD4.setEnabled(false);
		lblNameD4.setBounds(14, 596, 61, 16);
		
		childInfoPanel.add(lblNameD4);
		D4NameTF.setToolTipText("enter name of child/dependent");
		D4NameTF.setEnabled(false);
		D4NameTF.setColumns(10);
		D4NameTF.setBounds(119, 591, 130, 26);
		
		childInfoPanel.add(D4NameTF);
		lblYearOfSchoolD4.setEnabled(false);
		lblYearOfSchoolD4.setBounds(14, 624, 116, 16);
		
		childInfoPanel.add(lblYearOfSchoolD4);
		D4YOSFTF.setToolTipText("enter grade in school of child/dependent");
		D4YOSFTF.setEnabled(false);
		D4YOSFTF.setBounds(119, 619, 28, 26);
		
		childInfoPanel.add(D4YOSFTF);
		lblDateOfBirthD4.setEnabled(false);
		lblDateOfBirthD4.setBounds(14, 652, 98, 16);
		
		childInfoPanel.add(lblDateOfBirthD4);
		D4DOBFTF.setToolTipText("enter date of birth for child/dependet in format 00/00/00");
		D4DOBFTF.setEnabled(false);
		D4DOBFTF.setBounds(119, 647, 76, 26);
		
		childInfoPanel.add(D4DOBFTF);
		lblRelationshipD4.setEnabled(false);
		lblRelationshipD4.setBounds(14, 680, 98, 16);
		
		childInfoPanel.add(lblRelationshipD4);
		D4relationshipTF.setToolTipText("enter your relationship to the dependet");
		D4relationshipTF.setEnabled(false);
		D4relationshipTF.setColumns(10);
		D4relationshipTF.setBounds(119, 675, 130, 26);
		
		childInfoPanel.add(D4relationshipTF);
		lblraceD4.setEnabled(false);
		lblraceD4.setBounds(14, 708, 61, 16);
		
		childInfoPanel.add(lblraceD4);
		RaceD4comboBox.setModel(new DefaultComboBoxModel(new String[] {"…", "Native American", "Asian", "African American", "Caucasian", "Hispanic", "Multi-Racial"}));
		RaceD4comboBox.setEnabled(false);
		RaceD4comboBox.setBounds(119, 704, 182, 27);
		
		childInfoPanel.add(RaceD4comboBox);
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
		snapFoodStampsFTF.setToolTipText("Specify a amount of currency");
		snapFoodStampsFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_snapFoodStampsFTF_focusLost(e);
			}
		});
		snapFoodStampsFTF.setBounds(150, 482, 64, 26);
		
		financialInfoPanel.add(snapFoodStampsFTF);
		ssDisabilityFTF.setToolTipText("Specify a amount of currency");
		ssDisabilityFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_ssDisabilityFTF_focusLost(e);
			}
		});
		ssDisabilityFTF.setBounds(150, 510, 64, 26);
		
		financialInfoPanel.add(ssDisabilityFTF);
		wagesFTF.setToolTipText("Specify a amount of currency");
		wagesFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_wagesFTF_focusLost(e);
			}
		});
		wagesFTF.setBounds(150, 538, 64, 26);
		
		financialInfoPanel.add(wagesFTF);
		tanfTeaFTF.setToolTipText("Specify a amount of currency");
		tanfTeaFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_tanfTeaFTF_focusLost(e);
			}
		});
		tanfTeaFTF.setBounds(150, 566, 64, 26);
		
		financialInfoPanel.add(tanfTeaFTF);
		unemploymentFTF.setToolTipText("Specify a amount of currency");
		unemploymentFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_unemploymentFTF_focusLost(e);
			}
		});
		unemploymentFTF.setBounds(150, 594, 64, 26);
		
		financialInfoPanel.add(unemploymentFTF);
		childSupFTF.setToolTipText("Specify a amount of currency");
		childSupFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_childSupFTF_focusLost(e);
			}
		});
		childSupFTF.setBounds(150, 622, 64, 26);
		
		financialInfoPanel.add(childSupFTF);
		otherIncFTF.setToolTipText("Specify a amount of currency");
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
		lblChildSupportExp.setBounds(226, 622, 101, 16);
		
		financialInfoPanel.add(lblChildSupportExp);
		lblOtherExp.setBounds(226, 650, 61, 16);
		
		financialInfoPanel.add(lblOtherExp);
		rentFTF.setToolTipText("Specify a amount of currency");
		rentFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_rentFTF_focusLost(e);
			}
		});
		rentFTF.setBounds(344, 482, 64, 26);
		
		financialInfoPanel.add(rentFTF);
		utilitiesFTF.setToolTipText("Specify a amount of currency");
		utilitiesFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_utilitiesFTF_focusLost(e);
			}
		});
		utilitiesFTF.setBounds(344, 510, 64, 26);
		
		financialInfoPanel.add(utilitiesFTF);
		telCostFTF.setToolTipText("Specify a amount of currency");
		telCostFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_telCostFTF_focusLost(e);
			}
		});
		telCostFTF.setBounds(344, 538, 64, 26);
		
		financialInfoPanel.add(telCostFTF);
		foodFTF.setToolTipText("Specify a amount of currency");
		foodFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_foodFTF_focusLost(e);
			}
		});
		foodFTF.setBounds(344, 566, 64, 26);
		
		financialInfoPanel.add(foodFTF);
		carPayFTF.setToolTipText("Specify a amount of currency");
		carPayFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_carPayFTF_focusLost(e);
			}
		});
		carPayFTF.setBounds(344, 594, 64, 26);
		
		financialInfoPanel.add(carPayFTF);
		childSupExFTF.setToolTipText("Specify a amount of currency");
		childSupExFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_childSupExFTF_focusLost(e);
			}
		});
		childSupExFTF.setBounds(344, 622, 64, 26);
		
		financialInfoPanel.add(childSupExFTF);
		otherExFTF.setToolTipText("Specify a amount of currency");
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
		lblCarreersource.setBounds(8, 186, 171, 16);
		
		financialInfoPanel.add(lblCarreersource);
		
		financialInfoPanel.add(placeofEmplTF);
		lenofOccFTF.setToolTipText("Enter a length of time in years");
		lenofOccFTF.setBounds(226, 134, 27, 26);
		
		financialInfoPanel.add(lenofOccFTF);
		lblYears.setBounds(258, 139, 61, 16);
		
		financialInfoPanel.add(lblYears);
		lblAreYourEmployedspopuse.setBounds(6, 255, 160, 16);
		
		financialInfoPanel.add(lblAreYourEmployedspopuse);
		lblplaceofemplSpouse.setBounds(6, 301, 131, 16);
		
		financialInfoPanel.add(lblplaceofemplSpouse);
		placeofEmplSpouseTF.setToolTipText("name the place of employment");
		placeofEmplSpouseTF.setColumns(10);
		placeofEmplSpouseTF.setBounds(226, 301, 130, 26);
		
		financialInfoPanel.add(placeofEmplSpouseTF);
		lenofOccSpouseFTF.setToolTipText("specify the length of years");
		lenofOccSpouseFTF.setBounds(226, 338, 27, 26);
		
		financialInfoPanel.add(lenofOccSpouseFTF);
		lblunits.setBounds(258, 343, 61, 16);
		
		financialInfoPanel.add(lblunits);
		lblLengthofEmpl.setBounds(6, 338, 147, 16);
		
		financialInfoPanel.add(lblLengthofEmpl);
		lblOfSouthwestFlorida.setBounds(8, 395, 171, 16);
		
		financialInfoPanel.add(lblOfSouthwestFlorida);
		lblreigstration.setBounds(8, 371, 203, 26);
		
		financialInfoPanel.add(lblreigstration);
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
		educationComboBox.setToolTipText("Select a level of schooling");
		educationComboBox.setModel(new DefaultComboBoxModel(new String[] {"No GED/Diploma", "GED", "High School Diploma", "Associates Degree", "Bachelors Degree Post-Gradudate"}));
		educationComboBox.setBounds(226, 424, 171, 27);
		
		financialInfoPanel.add(educationComboBox);
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
		rdbtnEmployedYes.setToolTipText("Select to confirm employment");
		rdbtnEmployedYes.setBounds(226, 43, 141, 23);
		
		financialInfoPanel.add(rdbtnEmployedYes);
		employedBG.add(rdbtnEmployedNo);
		rdbtnEmployedNo.setToolTipText("Select to confirm no employment");
		rdbtnEmployedNo.setBounds(226, 66, 141, 23);
		
		financialInfoPanel.add(rdbtnEmployedNo);
		CarreerSourceBG.add(rdbtnCSYes);
		rdbtnCSYes.setToolTipText("selct to confirm registration with Careerspurce");
		rdbtnCSYes.setBounds(226, 162, 141, 23);
		
		financialInfoPanel.add(rdbtnCSYes);
		CarreerSourceBG.add(rdbtnCSNo);
		rdbtnCSNo.setToolTipText("selct to deny registration with Careerspurce");
		rdbtnCSNo.setBounds(226, 185, 141, 23);
		
		financialInfoPanel.add(rdbtnCSNo);
		spouseEmployedBG.add(rdbtnSpouseEmployedYes);
		rdbtnSpouseEmployedYes.setToolTipText("Select to confirm employment");
		rdbtnSpouseEmployedYes.setBounds(226, 238, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseEmployedYes);
		spouseEmployedBG.add(rdbtnSpouseEmployedNo);
		rdbtnSpouseEmployedNo.setToolTipText("Select to confirm no employment");
		rdbtnSpouseEmployedNo.setBounds(226, 261, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseEmployedNo);
		SpouseCarreerSourceBG.add(rdbtnSpouseCSYes);
		rdbtnSpouseCSYes.setToolTipText("selct to confirm registration with Careerspurce");
		rdbtnSpouseCSYes.setBounds(226, 370, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseCSYes);
		SpouseCarreerSourceBG.add(rdbtnSpouseCSNo);
		rdbtnSpouseCSNo.setToolTipText("selct to deny registration with Careerspurce");
		rdbtnSpouseCSNo.setBounds(226, 393, 141, 23);
		
		financialInfoPanel.add(rdbtnSpouseCSNo);
		label_18.setBounds(6, 6, 147, 16);
		
		financialInfoPanel.add(label_18);
		financialInfoPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{snapFoodStampsFTF, ssDisabilityFTF, wagesFTF, tanfTeaFTF, unemploymentFTF, childSupFTF, otherIncFTF, lblExpenses, lblRent, lblUtilities, lblTelephone, lblFood, lblCarPayment, lblChildSupportExp, lblOtherExp, rentFTF, utilitiesFTF, telCostFTF, foodFTF, carPayFTF, childSupExFTF, otherExFTF, lblAreYourEmployed, lblPlaceOfEmployment, lblLengthOfOccupancy, lblIfNotEmployed, lblCarreersource, placeofEmplTF, lenofOccFTF, lblYears, lblAreYourEmployedspopuse, lblplaceofemplSpouse, placeofEmplSpouseTF, lenofOccSpouseFTF, educationComboBox}));
		
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
		}else if(phFTF.getText().trim().equals("###-###-####")) {
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
			lblDateOfBirthD1.setForeground(Color.RED);
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
			lblDateOfBirthD1.setForeground(Color.BLACK);
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
	
	
	
	protected void do_dobFTF_focusLost(FocusEvent e) {
		System.out.println(dobFTF.getText().trim());
		if (dobFTF.getText().trim().equals("00/00/00")) {
			
			lblDOB.setForeground(Color.RED);
//			This creates and infinite loop
//			dobFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please enter a valid Date",
				    "Invalid Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else{
			lblDOB.setForeground(Color.BLACK);
		}
	}
	protected void do_dobSpouseFTF_focusLost(FocusEvent e) {
		System.out.println(dobSpouseFTF.getText().trim());
		if (dobSpouseFTF.getText().trim().equals("00/00/00")) {
			
			lblDOBSpouse.setForeground(Color.RED);
//			This creates and infinite loop
//			dobFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please enter a valid Date",
				    "Invalid Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else{
			lblDOBSpouse.setForeground(Color.BLACK);
		}
	}
	protected void do_D1DOBFTF_focusLost(FocusEvent e) {
		System.out.println(D1DOBFTF.getText().trim());
		if (D1DOBFTF.getText().trim().equals("00/00/00")) {
			
			lblDateOfBirthD1.setForeground(Color.RED);
//			This creates and infinite loop
//			dobFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please enter a valid Date",
				    "Invalid Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else{
			lblDateOfBirthD1.setForeground(Color.BLACK);
		}
	}
	protected void do_D2DOBFTF_focusLost(FocusEvent e) {
		System.out.println(D2DOBFTF.getText().trim());
		if (D2DOBFTF.getText().trim().equals("00/00/00")) {
			
			lblDateOfBirthD2.setForeground(Color.RED);
//			This creates and infinite loop
//			dobFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please enter a valid Date",
				    "Invalid Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else{
			lblDateOfBirthD2.setForeground(Color.BLACK);
		}
	}
	protected void do_D3DOBFTF_focusLost(FocusEvent e) {
		System.out.println(D3DOBFTF.getText().trim());
		if (D3DOBFTF.getText().trim().equals("00/00/00")) {
			
			lblDateOfBirthD3.setForeground(Color.RED);
//			This creates and infinite loop
//			dobFTF.requestFocus();
			
			JOptionPane.showMessageDialog(this,
				    "Please enter a valid Date",
				    "Invalid Data Error",
				    JOptionPane.ERROR_MESSAGE);
		}else{
			lblDateOfBirthD3.setForeground(Color.BLACK);
		}
	}
	protected void do_chckbxEnableD2_stateChanged(ChangeEvent e) {
		if (chckbxEnableD2.isSelected()) {
			lblNameD2.setEnabled(true);
			D2NameTF.setEnabled(true);
			lblYearOfSchoolD2.setEnabled(true);
			D2YOSFTF.setEnabled(true);
			lblDateOfBirthD2.setEnabled(true);
			D2DOBFTF.setEnabled(true);
			lblRelationshipD2.setEnabled(true);
			D2relationshipTF.setEnabled(true);
			lblRaceD2.setEnabled(true);
			RaceD2comboBox.setEnabled(true);
		}else {
			lblNameD2.setEnabled(false);
			D2NameTF.setEnabled(false);
			lblYearOfSchoolD2.setEnabled(false);
			D2YOSFTF.setEnabled(false);
			lblDateOfBirthD2.setEnabled(false);
			D2DOBFTF.setEnabled(false);
			lblRelationshipD2.setEnabled(false);
			D2relationshipTF.setEnabled(false);
			lblRaceD2.setEnabled(false);
			RaceD2comboBox.setEnabled(false);
			
		}
	}
	protected void do_chckbxEnableD3_stateChanged(ChangeEvent e) {
		if (chckbxEnableD3.isSelected()) {
			lblNameD3.setEnabled(true);
			D3NameTF.setEnabled(true);
			lblYearOfSchoolD3.setEnabled(true);
			D3YOSFTF.setEnabled(true);
			lblDateOfBirthD3.setEnabled(true);
			D3DOBFTF.setEnabled(true);
			lblRelationshipD3.setEnabled(true);
			D3relationshipTF.setEnabled(true);
			lblraceD3.setEnabled(true);
			RaceD3comboBox.setEnabled(true);
		}else {
			lblNameD3.setEnabled(false);
			D3NameTF.setEnabled(false);
			lblYearOfSchoolD3.setEnabled(false);
			D3YOSFTF.setEnabled(false);
			lblDateOfBirthD3.setEnabled(false);
			D3DOBFTF.setEnabled(false);
			lblRelationshipD3.setEnabled(false);
			D3relationshipTF.setEnabled(false);
			lblraceD3.setEnabled(false);
			RaceD3comboBox.setEnabled(false);
			
		}
	}
	protected void do_chckbxEnableD4_stateChanged(ChangeEvent e) {
		if (chckbxEnableD4.isSelected()) {
			lblNameD4.setEnabled(true);
			D4NameTF.setEnabled(true);
			lblYearOfSchoolD4.setEnabled(true);
			D4YOSFTF.setEnabled(true);
			lblDateOfBirthD4.setEnabled(true);
			D4DOBFTF.setEnabled(true);
			lblRelationshipD4.setEnabled(true);
			D4relationshipTF.setEnabled(true);
			lblraceD4.setEnabled(true);
			RaceD3comboBox.setEnabled(true);
		}else {
			lblNameD4.setEnabled(false);
			D4NameTF.setEnabled(false);
			lblYearOfSchoolD4.setEnabled(false);
			D4YOSFTF.setEnabled(false);
			lblDateOfBirthD4.setEnabled(false);
			D4DOBFTF.setEnabled(false);
			lblRelationshipD4.setEnabled(false);
			D4relationshipTF.setEnabled(false);
			lblraceD4.setEnabled(false);
			RaceD4comboBox.setEnabled(false);
			
		}
	}
}
