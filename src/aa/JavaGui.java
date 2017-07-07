package aa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComboBoxUI;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JCheckBox;

public class JavaGui extends JFrame {
	Button buttonShowMe;
	Button buttonNext;
	JTextField txtpnEmre;
	JTextField textPane;
	JTextField textPane_1;
	JTextField textPane_2;
	JTextField textPane_3;
	JTextField textPane_4;
	static String dosyayolu="Musteriler/";
	static String content;
	static String cont;
	static String country;
	static String vacationtype;
	static String howlong;
	static String tripbudget;
	static String Name;
	static String Surname;
	static String Mail;
	static String Opinion;
	static String tmp="";
	static String route;
	static String rotanames="";
	static String rotanames1="";
	static String rotanames2="";
	static String file1="";
	static String file2="";
	static String file3="";
	static String file4="";
	static String file5="";
	static int index=0;
	static int index2=0;
	static int secim=0;
	static String fileName="";
	private Image background;
	private JPanel contentPane;
	private JPanel secondContentPane;
	private JPanel topPanel;
	private String[] Afrika;
	private String[] Avrupa;
	private String[] Asya;
	private String[] KuzeyAmerika;
	private String[] KuzeyAvrupa;
	Bill fatura=new Bill();
	Insurance sigorta=new Insurance();
	Person who=new Person();
	Accomodation Otel=new Accomodation();
	Transportation Vehicle=new Transportation();
	
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldEmail;
	private String pageTreeBackGround;
	private String vacitionIcon;
	private String vacitionInfo;
	private int day=2;
	private String howLong1;
	private Button buttonPageEndGoback;
	private Button buttonPageEndNext;
	private JPanel pageSixRightPanel;
	private Button buttonPageSixGoback;
	private Button buttonPageSixNext;
	private JTextArea textAreaSix;
	private JPanel pageSevenRightPanel;
	private Button buttonPageSevenGoback;
	private Button buttonPageSevenNext;
	private JTextArea textAreaSeven;
	private JLabel lblEndName;
	private JLabel lblPoint81;
	private JLabel lblPoint82;
	private JLabel lblPoint83;
	private JLabel lblEndSurname;
	private JLabel lblInsurance;
	private JLabel lblTravelType;
	
	private int con = 0;
	private int cou = 0;
	private int ins = 0;
	private int vac = 0;
	private int bud = 0;
	private int dayLong=1;
	
	
	public JavaGui() {
		
		who.setIns(sigorta);
		Otel.setPassenger(who);
		Vehicle.setPassenger(who);
		who.setFaturam(fatura);
		fatura.setPassenger(who);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("1.jpg");
		setIconImage(img);
		
		
		/*JFrame bilgileri*/
		setResizable(false);
		setBackground(new Color(0, 0, 205));
		setTitle("Trip Planner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 482);
		
		/*Kapsayýcý Panel*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(210,245,240));
		contentPane.setLayout(null);
		
		/*Top Panel */
		topPanel = new JPanel();
		topPanel.setBounds(20, 7, 754, 73);
		topPanel.setBackground(new Color(239, 253, 252));
		contentPane.add(topPanel);
		topPanel.setLayout(null);
		
		/*JFrame logomuz*/
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(32, 0, 57, 68);
		lblLogo.setIcon(new ImageIcon("logo.png"));
		topPanel.add(lblLogo);
		
		/*Facebok iconu */
		JLabel lblFacebook = new JLabel("");
		lblFacebook.setIcon(new ImageIcon("icon_facebook.png"));
		lblFacebook.setBounds(506, 22, 26, 25);
		topPanel.add(lblFacebook);
		
		/*Instagram iconumuz*/
		JLabel lblInstagram = new JLabel("");
		lblInstagram.setIcon(new ImageIcon("twitter-icon.png"));
		lblInstagram.setBounds(558, 22, 26, 25);
		topPanel.add(lblInstagram);
		
		/*Twitter iconumuz*/
		JLabel lblTwitter = new JLabel("");
		lblTwitter.setIcon(new ImageIcon("pinterest-icon.png"));
		lblTwitter.setBounds(533, 22, 26, 25);
		topPanel.add(lblTwitter);
		
		/*Like iconumuz*/
		JLabel lblFaceLike = new JLabel("");
		lblFaceLike.setIcon(new ImageIcon("like.png"));
		lblFaceLike.setBounds(397, 22, 85, 25);
		topPanel.add(lblFaceLike);
		
		/*Point iconumuz*/
		JLabel lblPointSwap = new JLabel("");
		lblPointSwap.setIcon(new ImageIcon("point.png"));
		lblPointSwap.setBounds(486, 22, 10, 25);
		topPanel.add(lblPointSwap);
		
		/*Point iconumuz*/
		JLabel lblPointSwap2 = new JLabel("");
		lblPointSwap2.setIcon(new ImageIcon("point.png"));
		lblPointSwap2.setBounds(588, 22, 10, 25);
		topPanel.add(lblPointSwap2);
		
		/*Help etiketimiz*/
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblHelp.setForeground(new Color(173, 166, 171));
		lblHelp.setBounds(673, 22, 46, 25);
		topPanel.add(lblHelp);
		
		/*Point iconumuz*/
		JLabel lblPointSwap3 = new JLabel("");
		lblPointSwap3.setIcon(new ImageIcon("point.png"));
		lblPointSwap3.setBounds(653, 22, 10, 25);
		topPanel.add(lblPointSwap3);
		
		/*Sign in etiketimiz*/
		JLabel lblSingIn = new JLabel("Sing in");
		lblSingIn.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		lblSingIn.setForeground(new Color(173, 166, 171));
		lblSingIn.setBounds(608, 22, 46, 25);
		topPanel.add(lblSingIn);
	
		/*Right Panel*/
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(398, 89, 376, 396);
		rightPanel.setBackground(new Color(239,253,252));
		contentPane.add(rightPanel);
		rightPanel.setLayout(null);
		
		/*Baslik*/
		JLabel lblMain = new JLabel("Plan your trip");
		lblMain.setForeground(new Color(122, 192, 71));
		lblMain.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		lblMain.setBounds(27, 11, 132, 38);
		rightPanel.add(lblMain);
		
		/*Kýta ve Ulke Secim Etiketimiz*/
		JLabel lblSelectContinents = new JLabel("Select Location :");
		lblSelectContinents.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblSelectContinents.setForeground(new Color(173, 166, 171));
		lblSelectContinents.setBounds(27, 72, 120, 19);
		rightPanel.add(lblSelectContinents);
		
		/*Sigorta Secim Etiketimiz*/
		JLabel lblSelectCountry = new JLabel("Insurance Company:");
		lblSelectCountry.setForeground(new Color(173, 166, 171));
		lblSelectCountry.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblSelectCountry.setBounds(27, 124, 120, 19);
		rightPanel.add(lblSelectCountry);
		
		/*VacationType etiketimiz*/
		JLabel lblVacition = new JLabel("Vacation type:");
		lblVacition.setForeground(new Color(173, 166, 171));
		lblVacition.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblVacition.setBounds(27, 170, 109, 19);
		rightPanel.add(lblVacition);
		
		/*For How Long Etiketimiz*/
		JLabel lblHowLong = new JLabel("For how long?");
		lblHowLong.setForeground(new Color(173, 166, 171));
		lblHowLong.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblHowLong.setBounds(27, 253, 99, 19);
		rightPanel.add(lblHowLong);
		
		/*Trip Budget Etiketimiz*/
		JLabel lblTripBudget = new JLabel("Trip Budget :");
		lblTripBudget.setForeground(new Color(173, 166, 171));
		lblTripBudget.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblTripBudget.setBounds(27, 301, 83, 19);
		rightPanel.add(lblTripBudget);
		
		JLabel lblPoint1 = new JLabel(".........................................................."
		+ "...................................................");
		lblPoint1.setBounds(27, 46, 311, 14);
		lblPoint1.setForeground(new Color(173, 166, 171));
		rightPanel.add(lblPoint1);
		
		JLabel lblPoint2 = new JLabel(".............................................................................................................");
		lblPoint2.setForeground(new Color(173, 166, 171));
		lblPoint2.setBounds(27, 98, 311, 14);
		rightPanel.add(lblPoint2);
		
		JLabel lblPoint3 = new JLabel(".............................................................................................................");
		lblPoint3.setForeground(new Color(173, 166, 171));
		lblPoint3.setBounds(27, 150, 311, 14);
		rightPanel.add(lblPoint3);
		
		JLabel lblPoint4 = new JLabel(".............................................................................................................");
		lblPoint4.setForeground(new Color(173, 166, 171));
		lblPoint4.setBounds(27, 228, 311, 14);
		rightPanel.add(lblPoint4);
		
		JLabel lblPoint5 = new JLabel(".............................................................................................................");
		lblPoint5.setForeground(new Color(173, 166, 171));
		lblPoint5.setBounds(27, 278, 311, 14);
		rightPanel.add(lblPoint5);
		
		/*Kýta Secim ComboBox*/
		JComboBox comboBoxContinent = new JComboBox();
		comboBoxContinent.setForeground(new Color(122, 192, 71));
		comboBoxContinent.setModel(new DefaultComboBoxModel(new String[] {"Continent","Europe", "Africa", "Asia", "NorthAmerica", "NorthEurope"}));
		comboBoxContinent.setToolTipText("kk\r\nooo");
		comboBoxContinent.setBounds(145, 72, 99, 20);
		rightPanel.add(comboBoxContinent);
		
		/*Ulke Secim ComboBox*/
		JComboBox comboBoxCountry = new JComboBox();
		comboBoxCountry.setForeground(new Color(122, 192, 71));
		comboBoxCountry.setToolTipText("kk\r\nooo");
		comboBoxCountry.setBounds(145, 72, 99, 20);
		rightPanel.add(comboBoxCountry);
		comboBoxCountry.setVisible(false);
		
		/*Sigorta Secim ComboBox*/
		JComboBox comboBoxInsurance = new JComboBox();
		comboBoxInsurance.setToolTipText("kk\r\nooo");
		comboBoxInsurance.setForeground(new Color(122, 192, 71));
		comboBoxInsurance.setBounds(145, 124, 99, 20);
		comboBoxInsurance.setModel(new DefaultComboBoxModel(new String[]{"Insurance","Allianz","Berkshire","China","Ing"}));
		rightPanel.add(comboBoxInsurance);
				//Sigorta Secim Metodu.
		comboBoxInsurance.addActionListener(new ActionListener() 
			{
			public void actionPerformed(ActionEvent e) 
				{
				ins = 1; 
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
				who.getIns().setName((String)comboBoxInsurance.getSelectedItem());
				textPane_1.setText(who.getIns().getName());
				}
			});

		/*Ulkelerin Dizilere Yerlesimi*/
		Avrupa=new String[]{"Country","Germany","France","Spain","Italy","Portugal"};
		Asya=new String[]{"Country","China","Indonesia","India","Japan","Russia"};
		KuzeyAmerika=new String[]{"Country","Usa","Canada","Cuba","Dominican","Mexican"};
		KuzeyAvrupa=new String[]{"Country","Ireland","Uk","Swedish","Norway"};
		Afrika=new String[]{"Country","Tunusian","Egypt"};
		
		pageTreeBackGround="1.jpg";
		vacitionIcon="other.png";
		vacitionInfo="Solo";
		/*ComboBoxContinent Secimi Yapýldýgýnda*/
		comboBoxContinent.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0) 
			{
			
			/*Kullanýcýnýn sectiði kýta ismi alýnarak 
			 * hem kýtadaký ulkeler comboboxa set edilliyor hem de dosya yolunda
			 * kullanýmak ýcýn kýta ismi tutuluyor.*/
				cont=(String)comboBoxContinent.getSelectedItem();
				who.setSelectedContinent(cont);
				fileName=cont; /*dosyayolu icin kýta ismi alýnýyor.*/
				comboBoxContinent.setVisible(false);
				comboBoxCountry.setVisible(true);
				
				
			if(comboBoxContinent.getSelectedItem().equals("Asia"))
				{
				con = 1;
				comboBoxCountry.setModel(new DefaultComboBoxModel(Asya));
					pageTreeBackGround="Asya.png";
				}
			else if(comboBoxContinent.getSelectedItem().equals("Europe"))
				{
				con = 1;
				comboBoxCountry.setModel(new DefaultComboBoxModel(Avrupa));
					pageTreeBackGround="Avrupa.png";
				}
			else if(comboBoxContinent.getSelectedItem().equals("NorthAmerica"))
				{
				con = 1;
				comboBoxCountry.setModel(new DefaultComboBoxModel(KuzeyAmerika));
					pageTreeBackGround="KuzeyAmerika.png";
				}
			else if(comboBoxContinent.getSelectedItem().equals("NorthEurope"))
				{
				con = 1;
				comboBoxCountry.setModel(new DefaultComboBoxModel(KuzeyAvrupa));
				pageTreeBackGround="KuzeyAvrupa.png";
				}
			else if(comboBoxContinent.getSelectedItem().equals("Africa"))
				{
				con = 1;
				comboBoxCountry.setModel(new DefaultComboBoxModel(Afrika));
				pageTreeBackGround="Afrika.png";
				} 
			if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1))
			{
				buttonShowMe.setVisible(true);
			}
			}
		});

			/*ComboBoxCountry Secimi Yapýldýgýnda*/
			comboBoxCountry.addActionListener(new ActionListener() 
			{		
				public void actionPerformed(ActionEvent e) {
				int i=0;
				/*Kýta isminden sonra ulke ismi de alýnýyor ve dosya yolunun tutuldugu filename 
				 * degiskenine ekleniyor. (ornek KuzeyAmerika/Kanada)*/
				cou = 1;
				country=(String)comboBoxCountry.getSelectedItem();
				fileName+="/";
				fileName+=country;
				who.setSelectedCoutry(country);
			
				Scanner s = null;
				try 
				{
					String tmp=fileName;
					tmp+="/names.txt"; /*dosya yoluna /names eklenerek 
					ýlgýlý ulkedeký sehýrlerýn ýsýmlerýnýn tutuldugu dosyaya ulasýlýyor ve						
					rotalar burdaký sehýr ýsýmlerýnden olusturuluyor.*/
					s = new Scanner(new File(tmp));
				} 
				catch (FileNotFoundException f) 
				{
					f.printStackTrace();
				}
				while(s.hasNextLine())
				{
					/* Rota0 dosyanýn 0,1,2,3,4 satýrlarýnda yer alan sehýrlerden olusturuluyor*/
					String keep = s.nextLine();
					if(i==0||i==1||i==2||i==3||i==4)
					{
					rotanames+= "-";
					rotanames+=keep;
					}
					/*Rota1 dosyanýn 2,3,4,5,6 satýrlarýnda yer alan sehýrlerden olusturuluyor.*/
					if(i==2||i==3||i==4||i==5||i==6)
					{
					rotanames1+="-";
					rotanames1+=keep;		
					}
					/*Rota2 dosyanýn 4,5,6,7,8 satýrlarýnda yer alan sehýrlerden olusturuluyor.*/
					if(i==7||i==8||i==4||i==5||i==6)
					{
					rotanames2+="-";
					rotanames2+=keep;			
					}
					i++;
					
				}
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
				
				}
			});
		
		/*VacationType icin RadioGrup*/
		ButtonGroup RadioGroup =new ButtonGroup();
		JRadioButton rdbtnRomantic = new JRadioButton("Romantic");
		RadioGroup.add(rdbtnRomantic);
		rdbtnRomantic.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnRomantic.setToolTipText("");
		rdbtnRomantic.setForeground(new Color(122, 192, 71));
		rdbtnRomantic.setBounds(27, 201, 75, 23);
		rightPanel.add(rdbtnRomantic);
		rdbtnRomantic.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				vac = 1;
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
				/*Kullanýcýnýn sectýgý vacatýon type alýnýyor ve person nesnesýne set edýlýyor.*/
			vacationtype=(String)rdbtnRomantic.getActionCommand();
			who.setVacationtype(vacationtype);
			vacitionIcon="romantic.png";
			vacitionInfo="Romantic";
			}
		});
		
		
		JRadioButton rdbtnFriends = new JRadioButton("Friends");
		RadioGroup.add(rdbtnFriends);
		rdbtnFriends.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnFriends.setForeground(new Color(122, 192, 71));
		rdbtnFriends.setBounds(112, 201, 75, 23);
		rightPanel.add(rdbtnFriends);
		rdbtnFriends.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				vac = 1;
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
				vacationtype=(String)rdbtnFriends.getActionCommand();
				who.setVacationtype(vacationtype);
				vacitionIcon="friends.png";
				vacitionInfo="Friends";
			}
		});
		
		
		JRadioButton rdbtnFamily = new JRadioButton("Family");
		RadioGroup.add(rdbtnFamily);
		rdbtnFamily.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnFamily.setForeground(new Color(122, 192, 71));
		rdbtnFamily.setBounds(197, 201, 75, 23);
		rightPanel.add(rdbtnFamily);
		rdbtnFamily.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e) 
			{
				vac = 1;
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
				vacationtype=(String)rdbtnFamily.getActionCommand();
				who.setVacationtype(vacationtype);	
				vacitionIcon="family.png";
				vacitionInfo="Family";
			}
		});
		
		
		JRadioButton rdbtnSolo = new JRadioButton("Solo");
		RadioGroup.add(rdbtnSolo);
		rdbtnSolo.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnSolo.setForeground(new Color(122, 192, 71));
		rdbtnSolo.setBounds(282, 201, 55, 23);
		rightPanel.add(rdbtnSolo);
		rdbtnSolo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				vac = 1;
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
				vacationtype=(String)rdbtnSolo.getActionCommand();
				who.setVacationtype(vacationtype);	
				vacitionIcon="other.png";
				vacitionInfo="Solo";
			}
		});
		
		/*Kullanýcý Gün Sayýsý icin TextField*/
		TextField textFieldHowLong = new TextField();
		textFieldHowLong.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		textFieldHowLong.setBounds(129, 252, 30, 22);
		textFieldHowLong.setForeground(new Color(122, 192, 71));
		rightPanel.add(textFieldHowLong);
		textFieldHowLong.setText("14");
		textFieldHowLong.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			howlong=(String)textFieldHowLong.getText();
			day=Integer.parseInt(textFieldHowLong.getText());
			who.setNumofdays(day);
			
			}
		});
		
		/*Budget Icýn RadioGrup*/
		ButtonGroup tripBudget =new ButtonGroup();
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		tripBudget.add(rdbtnEconomy);
		rdbtnEconomy.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnEconomy.setForeground(new Color(122, 192, 71));
		rdbtnEconomy.setBounds(27, 327, 83, 23);
		rightPanel.add(rdbtnEconomy);
		rdbtnEconomy.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e) 
			{
				bud = 1;
				dayLong=Integer.parseInt(textFieldHowLong.getText());
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
			tripbudget=(String)rdbtnEconomy.getActionCommand();
			who.setBudget(tripbudget);
			}
		});
		
		
		
		JRadioButton rdbtnModarate = new JRadioButton("Moderate");
		tripBudget.add(rdbtnModarate);
		rdbtnModarate.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnModarate.setForeground(new Color(122, 192, 71));
		rdbtnModarate.setBounds(107, 327, 85, 23);
		rightPanel.add(rdbtnModarate);
		rdbtnModarate.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e) 
			{
				bud = 1;
				dayLong=Integer.parseInt(textFieldHowLong.getText());
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
			tripbudget=(String)rdbtnModarate.getActionCommand();
			who.setBudget(tripbudget);
						
			}
		});
		
		
		JRadioButton rdbtnLuxury = new JRadioButton("Luxury");
		tripBudget.add(rdbtnLuxury);
		rdbtnLuxury.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		rdbtnLuxury.setForeground(new Color(122, 192, 71));
		rdbtnLuxury.setBounds(194, 327, 71, 23);
		rightPanel.add(rdbtnLuxury);
		rdbtnLuxury.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e) 
			{
				bud = 1;
				dayLong=Integer.parseInt(textFieldHowLong.getText());
				if((con==1) && (cou==1) && (vac==1) && (ins==1) && (bud==1)&&(dayLong>0))
				{
					buttonShowMe.setVisible(true);
				}
			tripbudget=(String)rdbtnLuxury.getActionCommand();
			who.setBudget(tripbudget);		
			}
		});
		
		
		/*Showme mytrip Butonu*/
	    buttonShowMe = new Button("PlanYourTrip");
		buttonShowMe.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonShowMe.setBackground(new Color(122, 192, 71));
		buttonShowMe.setForeground(Color.WHITE);
		buttonShowMe.setBounds(27, 365, 152, 22);
		rightPanel.add(buttonShowMe);
		buttonShowMe.setVisible(false);
		
		/*Left Panel*/
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(20, 89, 359, 396);
		leftPanel.setBackground(new Color(210,245,240));
		contentPane.add(leftPanel);
		leftPanel.setLayout(null);
		
		/*Etiket*/
		JLabel lblCreateTrip = new JLabel("Create Your perfect Trip");
		lblCreateTrip.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		lblCreateTrip.setForeground(new Color(122, 192, 71));
		lblCreateTrip.setBounds(32, 52, 291, 21);
		leftPanel.add(lblCreateTrip);
		
		/*Etiket*/
		JLabel lblExplain = new JLabel("  Easily plan your trip based on your preferences,\r\n");
		lblExplain.setToolTipText("");
		lblExplain.setHorizontalAlignment(SwingConstants.LEFT);
		lblExplain.setVerticalAlignment(SwingConstants.TOP);
		lblExplain.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblExplain.setBounds(32, 83, 291, 21);
		leftPanel.add(lblExplain);
		
		/*Etiket*/
		JLabel lblExplain2 = new JLabel("  budget, and style. Book as a custom package \r\nand");
		lblExplain2.setVerticalAlignment(SwingConstants.TOP);
		lblExplain2.setToolTipText("");
		lblExplain2.setHorizontalAlignment(SwingConstants.LEFT);
		lblExplain2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblExplain2.setBounds(32, 102, 291, 21);
		leftPanel.add(lblExplain2);
		
		/*Etiket*/
		JLabel lblExplain3 = new JLabel("  save up to 20%!");
		lblExplain3.setVerticalAlignment(SwingConstants.TOP);
		lblExplain3.setToolTipText("");
		lblExplain3.setHorizontalAlignment(SwingConstants.LEFT);
		lblExplain3.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblExplain3.setBounds(32, 121, 291, 21);
		leftPanel.add(lblExplain3);
		
		/*BackGround*/
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 749, 514);
		lblBackground.setIcon(new ImageIcon("leftbackground.png"));
		leftPanel.add(lblBackground);
		
		
		/*
		 * Bir Sonraki Sayfa 
		 */
		contentPane.setBackground(new Color(210,245,240));
		
		/*Showme den sonra olusacak panel*/
		JPanel otherLeftPanel = new JPanel();
		otherLeftPanel.setBorder(null);
		otherLeftPanel.setBounds(20, 89, 359, 396);
		contentPane.add(otherLeftPanel);
		otherLeftPanel.setLayout(null);
		
		/*Panelin arka plan rengi*/
		JLabel otherLeftPanelBG = new JLabel("");
		otherLeftPanelBG.setBounds(0, 0, 359, 396);
		otherLeftPanelBG.setIcon(new ImageIcon("2.jpg"));
		otherLeftPanel.add(otherLeftPanelBG);
		otherLeftPanel.setVisible(false);
		
		/*RightPanel*/
		JPanel otherRightPanel = new JPanel();
		otherRightPanel.setBounds(398, 89, 376, 396);
		otherRightPanel.setBackground(new Color(239,253,252));
		contentPane.add(otherRightPanel);
		otherRightPanel.setLayout(null);
		otherRightPanel.setVisible(false);
		
		
		
		/*Etiket*/
		JLabel lblInput = new JLabel("Please Enter Your Information");
		lblInput.setForeground(new Color(122, 192, 71));
		lblInput.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		lblInput.setBounds(27, 11, 350, 38);
		otherRightPanel.add(lblInput);
		
		JLabel lblSecondPoint1 = new JLabel(".............................................................................................................");
		lblSecondPoint1.setBounds(27, 46, 311, 14);
		otherRightPanel.add(lblSecondPoint1);
		lblSecondPoint1.setForeground(new Color(173, 166, 171));
		
		JLabel lblSecondPoint2 = new JLabel(".............................................................................................................");
		lblSecondPoint2.setForeground(new Color(173, 166, 171));
		lblSecondPoint2.setBounds(27, 94, 311, 14);
		otherRightPanel.add(lblSecondPoint2);
		
		JLabel lblSecondPoint3 = new JLabel(".............................................................................................................");
		lblSecondPoint3.setForeground(new Color(173, 166, 171));
		lblSecondPoint3.setBounds(27, 142, 311, 14);
		otherRightPanel.add(lblSecondPoint3);
		
		JLabel lblSecondPoint4 = new JLabel(".............................................................................................................");
		lblSecondPoint4.setForeground(new Color(173, 166, 171));
		lblSecondPoint4.setBounds(27, 190, 311, 14);
		otherRightPanel.add(lblSecondPoint4);
		
		/*Etiket*/
		JLabel lblName = new JLabel("Enter Your Name :");
		lblName.setToolTipText("Trip");
		lblName.setBounds(27, 70, 120, 19);
		otherRightPanel.add(lblName);
		lblName.setForeground(new Color(173, 166, 171));
		lblName.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		
		/*Etiket*/
		JLabel lblSurname = new JLabel("Enter Your SurName :");
		lblSurname.setToolTipText("Planner");
		lblSurname.setForeground(new Color(173, 166, 171));
		lblSurname.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblSurname.setBounds(27, 118, 135, 19);
		otherRightPanel.add(lblSurname);
		
		/*Etiket*/
		JLabel lblEmail = new JLabel("Enter Your E-Mail :");
		lblEmail.setToolTipText("tripplanner@gmail.com");
		lblEmail.setForeground(new Color(173, 166, 171));
		lblEmail.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblEmail.setBounds(27, 166, 120, 19);
		otherRightPanel.add(lblEmail);
		/*Etiket*/
		JLabel lblSozlesme = new JLabel("By Cliking this Button");
		lblSozlesme.setToolTipText("");
		lblSozlesme.setForeground(new Color(193, 166, 171));
		lblSozlesme.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblSozlesme.setBounds(27, 335, 247, 19);
		otherRightPanel.add(lblSozlesme);
		
		/*Etiket*/
		JLabel lblSozlesme2 = new JLabel("I Agree to Term");
		lblSozlesme2.setToolTipText("");
		lblSozlesme2.setForeground(new Color(173, 166, 171));
		lblSozlesme2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblSozlesme2.setBounds(167, 335, 104, 19);
		otherRightPanel.add(lblSozlesme2);
		
/*Kullanýcý Bilgi Girisi*/
		
		JLabel lblChoose = new JLabel("Choose Rotate");
		lblChoose.setToolTipText("");
		lblChoose.setForeground(new Color(173, 166, 171));
		lblChoose.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblChoose.setBounds(27, 214, 120, 19);
		otherRightPanel.add(lblChoose);
		textFieldName = new JTextField();
		textFieldName.setText("");
		textFieldName.setToolTipText("");
		textFieldName.setBounds(160, 70, 86, 20);
		textFieldName.setForeground(new Color(122, 192, 71));
		textFieldName.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		otherRightPanel.add(textFieldName);
		textFieldName.setColumns(10);
		
		//Kullanicidan aldgýný inputu who nesnesine set ediyor.
		textFieldName.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				printIt(e);
			}
			
			public void insertUpdate(DocumentEvent e) {
				printIt(e);	
			}
			
			public void changedUpdate(DocumentEvent e) {
				printIt(e);	
			}
			
			private void printIt(DocumentEvent e) {
		        DocumentEvent.EventType type = e.getType();
		        if (type.equals(DocumentEvent.EventType.CHANGE)) {
		        	Name=(String)textFieldName.getText();
					who.setName(Name);
					txtpnEmre.setText(Name);
		        }  
		        else if (type.equals(DocumentEvent.EventType.INSERT)) {
		        	Name=(String)textFieldName.getText();
					who.setName(Name);
					txtpnEmre.setText(Name);
		        }  
		        else if (type.equals(DocumentEvent.EventType.REMOVE)) {
		        	Name=(String)textFieldName.getText();
					who.setName(Name);
					txtpnEmre.setText(Name);
		        }
		        dosyayolu+=Name;
				dosyayolu+=".txt";
		    }
		});
		
		/*Kullanýcý Bilgi Girisi*/
		textFieldSurname = new JTextField();
		textFieldSurname.setText("");
		textFieldSurname.setToolTipText("");
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(160, 118, 86, 20);
		textFieldSurname.setForeground(new Color(122, 192, 71));
		textFieldSurname.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		otherRightPanel.add(textFieldSurname);
		textFieldSurname.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				printIt(e);
			}
			
			public void insertUpdate(DocumentEvent e) {
				printIt(e);	
			}
			
			public void changedUpdate(DocumentEvent e) {
				printIt(e);	
			}
			
			private void printIt(DocumentEvent e) {
		        DocumentEvent.EventType type = e.getType();
		        if (type.equals(DocumentEvent.EventType.CHANGE)) {
		        	Surname=(String)textFieldSurname.getText();
					who.setSurname(Surname);
					textPane.setText(Surname);
		        }  
		        else if (type.equals(DocumentEvent.EventType.INSERT)) {
		        	Surname=(String)textFieldSurname.getText();
					who.setSurname(Surname);
					textPane.setText(Surname);
		        }  
		        else if (type.equals(DocumentEvent.EventType.REMOVE)) {
		        	Surname=(String)textFieldSurname.getText();
					who.setSurname(Surname);
					textPane.setText(Surname);
		        }
		    }
		});
		
		/*Kullanýcý Bilgi Girisi*/
		textFieldEmail = new JTextField();
		textFieldEmail.setText("");
		textFieldEmail.setToolTipText("");
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(160, 166, 150, 20);
		textFieldEmail.setForeground(new Color(122, 192, 71));
		textFieldEmail.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		otherRightPanel.add(textFieldEmail);
		textFieldEmail.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				printIt(e);
			}
			
			public void insertUpdate(DocumentEvent e) {
				printIt(e);	
			}
			
			public void changedUpdate(DocumentEvent e) {
				printIt(e);	
			}
			
			private void printIt(DocumentEvent e) {
		        DocumentEvent.EventType type = e.getType();
		        if (type.equals(DocumentEvent.EventType.CHANGE)) {
		        	Mail=(String)textFieldEmail.getText();
					who.setMail(Mail);
		        }  
		        else if (type.equals(DocumentEvent.EventType.INSERT)) {
		        	Mail=(String)textFieldEmail.getText();
					who.setMail(Mail);
		        }  
		        else if (type.equals(DocumentEvent.EventType.REMOVE)) {
		        	Mail=(String)textFieldEmail.getText();
					who.setMail(Mail);
		        }
		    }
		});
		
		
		/*  
		 * Route Secimleri
		 * */
		ButtonGroup RadioGroupRoute =new ButtonGroup();
		JRadioButton rdbtnRoute1 = new JRadioButton();
		rdbtnRoute1.setBounds(27, 240, 311, 23);
		otherRightPanel.add(rdbtnRoute1);
		RadioGroupRoute.add(rdbtnRoute1);
		rdbtnRoute1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			secim=1;
			/*Kullanýcý ilk onerýlen route ý sectý ýse secým=1 yapýlýyor*/
			route=(String)rdbtnRoute1.getActionCommand();
			who.setRoute(route);
			}
		});
		
		JRadioButton rdbtnRoute2 = new JRadioButton();
		rdbtnRoute2.setBounds(27, 270, 311, 23);
		otherRightPanel.add(rdbtnRoute2);
		RadioGroupRoute.add(rdbtnRoute2);
		rdbtnRoute2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			secim=2;
			/*Kullanýcý ikýncý onerýlen route ý sectý ýse secým=2 yapýlýyor*/
			route=(String)rdbtnRoute2.getActionCommand();
			who.setRoute(route);
			}
		});
		
		JRadioButton rdbtnRoute3 = new JRadioButton();
		rdbtnRoute3.setBounds(27, 300, 311, 23);
		otherRightPanel.add(rdbtnRoute3);
		RadioGroupRoute.add(rdbtnRoute3);
		rdbtnRoute3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			secim=3;
			/*Kullanýcý ucuncu onerýlen route ý sectý ýse secým=3 yapýlýyor*/
			route=(String)rdbtnRoute3.getActionCommand();
			who.setRoute(route);
			}
		});
		
		
		JCheckBox chckbxOk = new JCheckBox("");
		chckbxOk.setBackground(Color.WHITE);
		chckbxOk.setForeground(Color.green);
		chckbxOk.setBounds(280, 335, 21, 23);
		otherRightPanel.add(chckbxOk);
		chckbxOk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(ItemEvent.SELECTED == e.getStateChange())
				{
					if((secim==1)||(secim==2)||(secim==3))
					{
						buttonNext.setVisible(true);
					}
				}
				else
				{
					buttonNext.setVisible(false);
				}
				
			}
		});
		
		/*GoBack butonu*/
		Button buttonGoback = new Button("Go Back");
		buttonGoback.setBounds(27, 365, 152, 22);
		otherRightPanel.add(buttonGoback);
		buttonGoback.setForeground(Color.WHITE);
		buttonGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonGoback.setBackground(new Color(122, 192, 71));
		
		/*Next Butonu*/
		buttonNext = new Button("Next");
		buttonNext.setBounds(200, 365, 152, 22);
		otherRightPanel.add(buttonNext);
		buttonNext.setForeground(Color.WHITE);
		buttonNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonNext.setBackground(new Color(122, 192, 71));
		buttonNext.setVisible(false);
		
		/*
		 * 
		 * Page 3 RightPanel
		 * 
		 * */
		
		JPanel pageTreeRightPanel = new JPanel();
		pageTreeRightPanel.setBounds(398, 89, 376, 396);
		pageTreeRightPanel.setBackground(new Color(239,253,252));
		contentPane.add(pageTreeRightPanel);
		pageTreeRightPanel.setLayout(null);
		pageTreeRightPanel.setVisible(false);
		
			/*GoBack butonu*/
			Button buttonPageTreeGoback = new Button("Go Back");
			buttonPageTreeGoback.setBounds(27, 365, 152, 22);
			pageTreeRightPanel.add(buttonPageTreeGoback);
			buttonPageTreeGoback.setForeground(Color.WHITE);
			buttonPageTreeGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageTreeGoback.setBackground(new Color(122, 192, 71));
			
			/*Next Butonu*/
			Button buttonPageTreeNext = new Button("Next");
			buttonPageTreeNext.setBounds(200, 365, 152, 22);
			pageTreeRightPanel.add(buttonPageTreeNext);
			buttonPageTreeNext.setForeground(Color.WHITE);
			buttonPageTreeNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageTreeNext.setBackground(new Color(122, 192, 71));
			
			JTextArea sunucu=new JTextArea("");
			sunucu.setFont(new Font("Arial Narrow", Font.BOLD, 13));
			sunucu.setBackground(new Color(239,253,252));
			sunucu.setForeground(new Color(122, 192, 71));
			sunucu.setBounds(27, 43,325, 205);
			pageTreeRightPanel.setBackground(new Color(239,253,252));
			pageTreeRightPanel.add(sunucu);
			
			JLabel lblPageTreePlane = new JLabel("");
			lblPageTreePlane.setIcon(new ImageIcon("plane123.png"));
			lblPageTreePlane.setBounds(27, 257, 65, 60);
			pageTreeRightPanel.add(lblPageTreePlane);
			
			JLabel lblPageTreeLine = new JLabel("");
			lblPageTreeLine.setIcon(new ImageIcon("green-line.png"));
			lblPageTreeLine.setBounds(27, 243, 310, 91);
			pageTreeRightPanel.add(lblPageTreeLine);
		
		
		
		/*Page 4 RightPanel*/
		JPanel pageFourRightPanel = new JPanel();
		pageFourRightPanel.setBounds(398, 89, 376, 396);
		pageFourRightPanel.setBackground(new Color(239,253,252));
		contentPane.add(pageFourRightPanel);
		pageFourRightPanel.setLayout(null);
		pageFourRightPanel.setVisible(false);
		
			/*GoBack butonu*/
			Button buttonPageFourGoback = new Button("Go Back");
			buttonPageFourGoback.setBounds(27, 365, 152, 22);
			pageFourRightPanel.add(buttonPageFourGoback);
			buttonPageFourGoback.setForeground(Color.WHITE);
			buttonPageFourGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageFourGoback.setBackground(new Color(122, 192, 71));
			
			/*Next Butonu*/
			Button buttonPageFourNext = new Button("Next");
			buttonPageFourNext.setBounds(200, 365, 152, 22);
			pageFourRightPanel.add(buttonPageFourNext);
			buttonPageFourNext.setForeground(Color.WHITE);
			buttonPageFourNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageFourNext.setBackground(new Color(122, 192, 71));
			
			JTextArea textAreaFour=new JTextArea("Ferhat ATLINAR");
			textAreaFour.setFont(new Font("Arial Narrow", Font.BOLD, 13));
			textAreaFour.setBackground(new Color(239,253,252));
			textAreaFour.setForeground(new Color(122, 192, 71));
			textAreaFour.setBounds(27, 43,325, 205);
			pageFourRightPanel.setBackground(new Color(239,253,252));
			pageFourRightPanel.add(textAreaFour);
			
			JLabel lblPageTreePlane4 = new JLabel("");
			lblPageTreePlane4.setIcon(new ImageIcon("plane123.png"));
			lblPageTreePlane4.setBounds(90, 257, 65, 60);
			pageFourRightPanel.add(lblPageTreePlane4);
			
			JLabel lblPageTreeLine4 = new JLabel("");
			lblPageTreeLine4.setIcon(new ImageIcon("green-line.png"));
			lblPageTreeLine4.setBounds(27, 243, 310, 91);
			pageFourRightPanel.add(lblPageTreeLine4);
		
		
		
		/* page 5  */
			JPanel pageFiveRightPanel = new JPanel();
			pageFiveRightPanel.setBounds(398, 89, 376, 396);
			pageFiveRightPanel.setBackground(new Color(239,253,252));
			contentPane.add(pageFiveRightPanel);
			pageFiveRightPanel.setLayout(null);				
			pageFiveRightPanel.setVisible(false);
				
			/*GoBack butonu*/		
			Button buttonPageFiveGoback = new Button("Go Back");
			buttonPageFiveGoback.setBounds(27, 365, 152, 22);
			pageFiveRightPanel.add(buttonPageFiveGoback);
			buttonPageFiveGoback.setForeground(Color.WHITE);
			buttonPageFiveGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageFiveGoback.setBackground(new Color(122, 192, 71));
					
			/*Next Butonu*/
			Button buttonPageFiveNext = new Button("Next");
			buttonPageFiveNext.setBounds(200, 365, 152, 22);
			pageFiveRightPanel.add(buttonPageFiveNext);
			buttonPageFiveNext.setForeground(Color.WHITE);
			buttonPageFiveNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageFiveNext.setBackground(new Color(122, 192, 71));
					
			JTextArea textAreaFive=new JTextArea("Ferhat ATLINAR");
			textAreaFive.setFont(new Font("Arial Narrow", Font.BOLD, 13));
			textAreaFive.setBackground(new Color(239,253,252));
			textAreaFive.setForeground(new Color(122, 192, 71));
			textAreaFive.setBounds(27, 43,325, 205);
			pageFiveRightPanel.setBackground(new Color(239,253,252));
			pageFiveRightPanel.add(textAreaFive);
			
			JLabel lblPageTreePlane5 = new JLabel("");
			lblPageTreePlane5.setIcon(new ImageIcon("plane123.png"));
			lblPageTreePlane5.setBounds(145, 257, 65, 60);
			pageFiveRightPanel.add(lblPageTreePlane5);
			
			JLabel lblPageTreeLine5 = new JLabel("");
			lblPageTreeLine5.setIcon(new ImageIcon("green-line.png"));
			lblPageTreeLine5.setBounds(27, 243, 310, 91);
			pageFiveRightPanel.add(lblPageTreeLine5);
			
		
					
			/* page 6 */
			JPanel pageSixRightPanel;
			pageSixRightPanel = new JPanel();
			pageSixRightPanel.setBounds(398, 89, 376, 396);
			pageSixRightPanel.setBackground(new Color(239,253,252));
			contentPane.add(pageSixRightPanel);
			pageSixRightPanel.setLayout(null);
			pageSixRightPanel.setVisible(false);
				
			/*GoBack butonu*/
			Button buttonPageSixGoback;
			buttonPageSixGoback = new Button("Go Back");
			buttonPageSixGoback.setBounds(27, 365, 152, 22);
			pageSixRightPanel.add(buttonPageSixGoback);
			buttonPageSixGoback.setForeground(Color.WHITE);
			buttonPageSixGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageSixGoback.setBackground(new Color(122, 192, 71));
					
			/*Next Butonu*/
			Button buttonPageSixNext;
			buttonPageSixNext = new Button("Next");
			buttonPageSixNext.setBounds(200, 365, 152, 22);
			pageSixRightPanel.add(buttonPageSixNext);
			buttonPageSixNext.setForeground(Color.WHITE);
			buttonPageSixNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageSixNext.setBackground(new Color(122, 192, 71));
					
			JTextArea textAreaSix;
			textAreaSix=new JTextArea("Ferhat ATLINAR");
			textAreaSix.setFont(new Font("Arial Narrow", Font.BOLD, 13));
			textAreaSix.setBackground(new Color(239,253,252));
			textAreaSix.setForeground(new Color(122, 192, 71));
			textAreaSix.setBounds(27, 43,325, 205);
			pageSixRightPanel.setBackground(new Color(239,253,252));
			pageSixRightPanel.add(textAreaSix);
					
			JLabel lblPageTreePlane6 = new JLabel("");
			lblPageTreePlane6.setIcon(new ImageIcon("plane123.png"));
			lblPageTreePlane6.setBounds(199, 257, 65, 60);
			pageSixRightPanel.add(lblPageTreePlane6);
			
			JLabel lblPageTreeLine6 = new JLabel("");
			lblPageTreeLine6.setIcon(new ImageIcon("green-line.png"));
			lblPageTreeLine6.setBounds(27, 243, 310, 91);
			pageSixRightPanel.add(lblPageTreeLine6);
			
			/* page 7 */
			JPanel pageSevenRightPanel;
			pageSevenRightPanel = new JPanel();
			pageSevenRightPanel.setBounds(398, 89, 376, 396);
			pageSevenRightPanel.setBackground(new Color(239,253,252));
			contentPane.add(pageSevenRightPanel);
			pageSevenRightPanel.setLayout(null);
			pageSevenRightPanel.setVisible(false);
				
			/*GoBack butonu*/
			Button buttonPageSevenGoback;
			buttonPageSevenGoback = new Button("Go Back");
			buttonPageSevenGoback.setBounds(27, 365, 152, 22);
			pageSevenRightPanel.add(buttonPageSevenGoback);
			buttonPageSevenGoback.setForeground(Color.WHITE);
			buttonPageSevenGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageSevenGoback.setBackground(new Color(122, 192, 71));
					
			/*Next Butonu*/
			Button buttonPageSevenNext;
			buttonPageSevenNext = new Button("Next");
			buttonPageSevenNext.setBounds(200, 365, 152, 22);
			pageSevenRightPanel.add(buttonPageSevenNext);
			buttonPageSevenNext.setForeground(Color.WHITE);
			buttonPageSevenNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
			buttonPageSevenNext.setBackground(new Color(122, 192, 71));
					
			JTextArea textAreaSeven;
			textAreaSeven=new JTextArea("Ferhat ATLINAR");
			textAreaSeven.setFont(new Font("Arial Narrow", Font.BOLD, 13));
			textAreaSeven.setBackground(new Color(239,253,252));
			textAreaSeven.setForeground(new Color(122, 192, 71));
			textAreaSeven.setBounds(27, 43,325, 205);
			pageSevenRightPanel.setBackground(new Color(239,253,252));
			pageSevenRightPanel.add(textAreaSeven);
				
					
			JLabel lblPageTreePlane7 = new JLabel("");
			lblPageTreePlane7.setIcon(new ImageIcon("plane123.png"));
			lblPageTreePlane7.setBounds(260, 257, 65, 60);
			pageSevenRightPanel.add(lblPageTreePlane7);
					
			JLabel lblPageTreeLine7 = new JLabel("");
			lblPageTreeLine7.setIcon(new ImageIcon("green-line.png"));
			lblPageTreeLine7.setBounds(27, 243, 310, 91);
			pageSevenRightPanel.add(lblPageTreeLine7);
				
					
		
		
		/*Page Suggest RightPanel */
		JPanel suggestionPanel = new JPanel();
		suggestionPanel.setBounds(20, 89, 754, 396);
		suggestionPanel.setBackground(new Color(239,253,252));
		contentPane.add(suggestionPanel);
		suggestionPanel.setLayout(null);
		suggestionPanel.setVisible(false);
			
		/*GoBack butonu*/
		JLabel lblSuggestedOur = new JLabel("Suggested Itineraries by our travel experts");
		lblSuggestedOur.setBounds(78, 26, 397, 26);
		suggestionPanel.add(lblSuggestedOur);
		lblSuggestedOur.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		lblSuggestedOur.setForeground(new Color(131,196,83));
		
		JLabel lblLeftBG = new JLabel("");
		lblLeftBG.setBounds(78, 93, 286, 130);
		lblLeftBG.setIcon(new ImageIcon("rome.jpg"));
		suggestionPanel.add(lblLeftBG);
		lblLeftBG.setIcon(new ImageIcon("rome.jpg"));
		
		JLabel lblLeftLabel = new JLabel("Rome-Florence-Venice");
		lblLeftLabel.setBounds(78, 230, 195, 26);
		lblLeftLabel.setForeground(new Color(110, 200, 181));
		lblLeftLabel.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		suggestionPanel.add(lblLeftLabel);
		
		JLabel lblLefticon = new JLabel("");
		lblLefticon.setBounds(78, 259, 32, 22);
		suggestionPanel.add(lblLefticon);
		
		JLabel lblPoint6 = new JLabel("");
		lblPoint6.setIcon(new ImageIcon("point.png"));
		lblPoint6.setBounds(109, 257, 10, 25);
		suggestionPanel.add(lblPoint6);
		
		JLabel lblLeftType = new JLabel(vacitionInfo);
		lblLeftType.setBounds(129, 259, 61, 22);
		suggestionPanel.add(lblLeftType);
		
		JLabel lblPoint7 = new JLabel("");
		lblPoint7.setIcon(new ImageIcon("point.png"));
		lblPoint7.setBounds(190, 259, 10, 25);
		suggestionPanel.add(lblPoint7);
		
		JLabel lblLeftDay = new JLabel("");
		lblLeftDay.setBounds(209, 259, 70, 22);
		suggestionPanel.add(lblLeftDay);
		
		JTextArea txtrLeftArea = new JTextArea();
		txtrLeftArea.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		txtrLeftArea.setRows(6);
		txtrLeftArea.setText("Travel through three of Italy's most iconic cities,\r\n toss a coin in the Trevi Fountain, ride a gondola\r\n in Venice, and visit Florence's famous basilica\r\n on this Italian getaway.");
		txtrLeftArea.setBounds(78, 285, 240, 85);
		txtrLeftArea.setBackground(new Color(239,253,252));
		suggestionPanel.add(txtrLeftArea);
		
		JLabel lblRightBG = new JLabel("");
		lblRightBG.setIcon(new ImageIcon("sicily.jpg"));
		lblRightBG.setBounds(440, 93, 286, 130);
		suggestionPanel.add(lblRightBG);
		
		JLabel lblRightLabel = new JLabel("Sicily Exploration");
		lblRightLabel.setForeground(new Color(110, 200, 181));
		lblRightLabel.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblRightLabel.setBounds(440, 230, 195, 26);
		suggestionPanel.add(lblRightLabel);
		
		JLabel lblRighticon = new JLabel("");
		lblRighticon.setBounds(440, 259, 32, 22);
		suggestionPanel.add(lblRighticon);
		
		JLabel lblPoint8 = new JLabel("");
		lblPoint8.setIcon(new ImageIcon("point.png"));
		lblPoint8.setBounds(471, 257, 10, 25);
		suggestionPanel.add(lblPoint8);
		
		JLabel lblRightType = new JLabel(vacitionInfo);
		lblRightType.setBounds(491, 259, 61, 22);
		suggestionPanel.add(lblRightType);
		
		JLabel lblPoint9 = new JLabel("point.png");
		lblPoint9.setIcon(new ImageIcon("point.png"));
		lblPoint9.setBounds(552, 259, 10, 25);
		suggestionPanel.add(lblPoint9);
		
		JLabel lblRightDay = new JLabel(howLong1);
		lblRightDay.setBounds(571, 259, 70, 22);
		suggestionPanel.add(lblRightDay);
		
		JTextArea txtrRightArea = new JTextArea();
		txtrRightArea.setText("With amazing food, idyllic beaches, breathtaking\r\n nature, and a laid back Mediterranean atmosphere,\r\n Sicily offers the perfect family getaway.");
		txtrRightArea.setRows(6);
		txtrRightArea.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		txtrRightArea.setBackground(new Color(239, 253, 252));
		txtrRightArea.setBounds(440, 285, 247, 62);
		suggestionPanel.add(txtrRightArea);
		
		
		Button buttonPageEndGoback;
		buttonPageEndGoback = new Button("Go Back");
		buttonPageEndGoback.setBounds(405, 365, 152, 22);
		suggestionPanel.add(buttonPageEndGoback);
		buttonPageEndGoback.setForeground(Color.WHITE);
		buttonPageEndGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonPageEndGoback.setBackground(new Color(122, 192, 71));
		
		/*Next Butonu*/
		Button buttonPageEndNext;
		buttonPageEndNext = new Button("Next");
		buttonPageEndNext.setBounds(578, 365, 152, 22);
		suggestionPanel.add(buttonPageEndNext);
		buttonPageEndNext.setForeground(Color.WHITE);
		buttonPageEndNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonPageEndNext.setBackground(new Color(122, 192, 71));
	
		
	/* page 8 */
		JPanel pageEightRightPanel;
		pageEightRightPanel = new JPanel();
		pageEightRightPanel.setBounds(398, 89, 376, 396);
		pageEightRightPanel.setBackground(new Color(239,253,252));
		contentPane.add(pageEightRightPanel);
		pageEightRightPanel.setLayout(null);
		pageEightRightPanel.setVisible(false);
		
		
		
		/*GoBack butonu*/
		Button buttonPageEightGoback;
		buttonPageEightGoback = new Button("Go Back");
		buttonPageEightGoback.setBounds(27, 365, 152, 22);
		pageEightRightPanel.add(buttonPageEightGoback);
		buttonPageEightGoback.setForeground(Color.WHITE);
		buttonPageEightGoback.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonPageEightGoback.setBackground(new Color(122, 192, 71));
			
		/*Next Butonu*/
		Button buttonPageEightNext;
		buttonPageEightNext = new Button("Next");
		buttonPageEightNext.setBounds(200, 365, 152, 22);
		pageEightRightPanel.add(buttonPageEightNext);
		buttonPageEightNext.setForeground(Color.WHITE);
		buttonPageEightNext.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		buttonPageEightNext.setBackground(new Color(122, 192, 71));
		buttonPageEightNext.setVisible(false);
			
		//Kýta Secme Etiketi
			
		JLabel lblEnd = new JLabel("INFORMATION");
		lblEnd.setForeground(new Color(122, 192, 71));
		lblEnd.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		lblEnd.setBounds(27, 11, 150, 38);
		pageEightRightPanel.add(lblEnd);
			
		JLabel lblEndName_1;
		lblEndName_1 = new JLabel("Name :");
		lblEndName_1.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		//Gri Font Renk kodu
		lblEndName_1.setForeground(new Color(173, 166, 171));
		lblEndName_1.setBounds(27, 70, 120, 19);
		pageEightRightPanel.add(lblEndName_1);
			
			
			
		JLabel lblPoint81 = new JLabel(".........................................................."
					+ "...................................................");
		lblPoint81.setBounds(27, 50, 311, 14);
		//Gri Font Renk kodu
		lblPoint81.setForeground(new Color(173, 166, 171));
		pageEightRightPanel.add(lblPoint81);
		
		JLabel lblEndSurname;
		Component lblPoint82 = new JLabel(".............................................................................................................");
		lblPoint82.setForeground(new Color(173, 166, 171));
		lblPoint82.setBounds(27, 90, 311, 14);
		pageEightRightPanel.add(lblPoint82);
		lblEndSurname = new JLabel("Surname :");
		lblEndSurname.setForeground(new Color(173, 166, 171));
		lblEndSurname.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblEndSurname.setBounds(27, 110, 109, 19);
		pageEightRightPanel.add(lblEndSurname);
			
		JLabel lblInsurance;
		JLabel lblPoint83 = new JLabel(".............................................................................................................");
		lblPoint83.setForeground(new Color(173, 166, 171));
		lblPoint83.setBounds(27, 130, 311, 14);
		pageEightRightPanel.add(lblPoint83);
		lblInsurance = new JLabel("Insurance:");
		lblInsurance.setForeground(new Color(173, 166, 171));
		lblInsurance.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblInsurance.setBounds(27, 150, 109, 19);
		pageEightRightPanel.add(lblInsurance);
			
			
		JLabel lblPoint84 = new JLabel(".............................................................................................................");
		lblPoint84.setForeground(new Color(173, 166, 171));
		lblPoint84.setBounds(27, 170, 311, 14);
		pageEightRightPanel.add(lblPoint84);
		JLabel lblTravelType = new JLabel("Travel By :");
		lblTravelType.setForeground(new Color(173, 166, 171));
		lblTravelType.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblTravelType.setBounds(27, 190, 99, 19);
		pageEightRightPanel.add(lblTravelType);
			
		JLabel lblPoint85 = new JLabel(".............................................................................................................");
		lblPoint85.setForeground(new Color(173, 166, 171));
		lblPoint85.setBounds(27, 210, 311, 14);
		pageEightRightPanel.add(lblPoint85);
			
		JLabel lblOtel = new JLabel("Cost:");
		lblOtel.setForeground(new Color(173, 166, 171));
		lblOtel.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblOtel.setBounds(27, 230, 99, 19);
		pageEightRightPanel.add(lblOtel);
			
		JLabel lblPoint86 = new JLabel(".............................................................................................................");
		lblPoint86.setForeground(new Color(173, 166, 171));
		lblPoint86.setBounds(27, 250, 311, 14);
		pageEightRightPanel.add(lblPoint86);
			
		JLabel lblTripBudget1 = new JLabel("Vacation Type:");
		lblTripBudget1.setForeground(new Color(173, 166, 171));
		lblTripBudget1.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
		lblTripBudget1.setBounds(27, 285, 83, 19);
		pageEightRightPanel.add(lblTripBudget1);
			
		txtpnEmre = new JTextField();
		txtpnEmre.setText("-");
		txtpnEmre.setBounds(120, 69, 99, 20);
		txtpnEmre.setBackground(new Color(239,253,252));
		txtpnEmre.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		txtpnEmre.setForeground(new Color(122, 192, 71));
		pageEightRightPanel.add(txtpnEmre);
			
			
		textPane = new JTextField();
		textPane.setText("-");
		textPane.setBounds(120, 109, 99, 20);
		textPane.setBackground(new Color(239,253,252));
		textPane.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		textPane.setForeground(new Color(122, 192, 71));
		pageEightRightPanel.add(textPane);
			
			
		textPane_1 = new JTextField();
		textPane_1.setText("-");
		textPane_1.setBounds(120, 149, 99, 20);
		textPane_1.setBackground(new Color(239,253,252));
		textPane_1.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		textPane_1.setForeground(new Color(122, 192, 71));
		pageEightRightPanel.add(textPane_1);
			
		textPane_2 = new JTextField();
		textPane_2.setText("-");
		textPane_2.setBounds(120, 189, 99, 20);
		textPane_2.setBackground(new Color(239,253,252));
		textPane_2.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		textPane_2.setForeground(new Color(122, 192, 71));
		pageEightRightPanel.add(textPane_2);
			
		textPane_3 = new JTextField();
		textPane_3.setText("-");
		textPane_3.setBounds(120, 229, 99, 20);
		textPane_3.setBackground(new Color(239,253,252));
		textPane_3.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		textPane_3.setForeground(new Color(122, 192, 71));
		pageEightRightPanel.add(textPane_3);
			
		textPane_4 = new JTextField();
		textPane_4.setText("-");
		textPane_4.setBounds(120, 285, 99, 20);
		textPane_4.setBackground(new Color(239,253,252));
		textPane_4.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		textPane_4.setForeground(new Color(122, 192, 71));
		pageEightRightPanel.add(textPane_4);
			
		
		buttonShowMe.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//Mevcut paneller visible false yapýlýyor
				otherLeftPanel.setVisible(true);
				otherRightPanel.setVisible(true);
				
				rightPanel.setVisible(false);
				leftPanel.setVisible(false);
				pageTreeRightPanel.setVisible(false);
				pageFourRightPanel.setVisible(false);
				

				lblLefticon.setIcon(new ImageIcon(vacitionIcon));
				lblLeftType.setText(vacitionInfo);
				lblRighticon.setIcon(new ImageIcon(vacitionIcon));
				lblRightType.setText(vacitionInfo);
				
				day=Integer.parseInt(textFieldHowLong.getText());
				howLong1=day+"-"+(day+2)+" DAY";
				
				lblLeftDay.setText(howLong1);
				lblRightDay.setText(howLong1);
				
				rdbtnRoute1.setText(rotanames);
				rdbtnRoute2.setText(rotanames1);
				rdbtnRoute3.setText(rotanames2);
				
				
				}
		});
		
		buttonNext.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textPane_1.setText(who.getIns().getName());
				textPane_2.setText(Vehicle.benefitsofRoad());
				textPane_3.setText(who.getFaturam().Cost());
				textPane_4.setText(who.getVacationtype());
				String text=who.toString();
				BufferedWriter writer = null;
				try
				{
				    writer = new BufferedWriter( new FileWriter(dosyayolu));
				    writer.write(text);

				}
				catch ( IOException e1)
				{
				}
				finally
				{
				    try
				    {
				        if ( writer != null)
				        writer.close( );
				    }
				    catch ( IOException e1)
				    {
				    }
				}
				otherLeftPanelBG.setIcon(new ImageIcon(pageTreeBackGround));

				pageTreeRightPanel.setVisible(true);
				otherLeftPanel.setVisible(true);
				
				leftPanel.setVisible(false);
				rightPanel.setVisible(false);
				otherRightPanel.setVisible(false);
				
				if(secim==1)
				{
					file1="/1.txt"; file2="/2.txt";	file3="/3.txt";
					file4="/4.txt";	file5="/5.txt";
					
				}

				/*Kullanýcý ýkýncý onerýlen route ý ýstedýyse ýlgýlý dosyalarý
				 * acmak ýcýn fýle ýsýmlý degýskenler ýsýmlendýrýlýyor*/

				if(secim==2)
				{
					file1="/3.txt"; file2="/4.txt";
					file3="/5.txt"; file4="/6.txt"; file5="/7.txt";
					
				}
				
				/*Kullanýcý ucuncu onerýlen route ý ýstedýyse ýlgýlý dosyalarý
				 * acmak ýcýn fýle ýsýmlý degýskenler ýsýmlendýrýlýyor*/

				if(secim==3)
				{
					file1="/5.txt";	file2="/6.txt"; file3="/7.txt";
					file4="/8.txt";	file5="/9.txt";
				}
				
				
				try
				{
				String tmp=fileName;
				tmp+=file1;
				content = new String(Files.readAllBytes(Paths.get(tmp)));
				}catch(IOException z)
				{
				z.printStackTrace();	
				}
				sunucu.setText(content);
				
			}
		});
		
		
		/*Goback Action*/
		buttonGoback.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	
				leftPanel.setVisible(true);
				rightPanel.setVisible(true);
				otherLeftPanel.setVisible(false);
				otherRightPanel.setVisible(false);
				pageTreeRightPanel.setVisible(false);
			}
		});
		
		buttonPageTreeGoback.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pageTreeRightPanel.setVisible(false);
				otherRightPanel.setVisible(true);
				otherLeftPanelBG.setIcon(new ImageIcon("2.jpg"));
				
			}
		});
		
		buttonPageTreeNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				otherLeftPanelBG.setIcon(new ImageIcon(pageTreeBackGround));
				pageTreeRightPanel.setVisible(false);
				pageFourRightPanel.setVisible(true);
			
				try
				{
				String tmp=fileName;
				tmp+=file2;
				content = new String(Files.readAllBytes(Paths.get(tmp)));
				}catch(IOException z)
				{
				z.printStackTrace();	
				}
				
				textAreaFour.setText(content);
				
			}
		});
		
		buttonPageFourGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherLeftPanelBG.setIcon(new ImageIcon(pageTreeBackGround));
				pageFourRightPanel.setVisible(false);
				pageTreeRightPanel.setVisible(true);
				
			}
		});
		
		buttonPageFourNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pageFourRightPanel.setVisible(false);
				pageFiveRightPanel.setVisible(true);
				
				try
				{
				String tmp=fileName;
				tmp+=file3;
				content = new String(Files.readAllBytes(Paths.get(tmp)));
				}catch(IOException z)
				{
				z.printStackTrace();	
				}
				textAreaFive.setText(content);
				
			}
		});
		
		buttonPageFiveGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pageFiveRightPanel.setVisible(false);
				pageFourRightPanel.setVisible(true);
				
			}
		});
		
		

		buttonPageFiveNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pageSixRightPanel.setVisible(true);
				pageFiveRightPanel.setVisible(false);
				
				try
				{
				String tmp=fileName;
				tmp+=file4;
				content = new String(Files.readAllBytes(Paths.get(tmp)));
				}catch(IOException z)
				{
				z.printStackTrace();	
				}
				textAreaSix.setText(content);
			}
		});
		

		buttonPageSixGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageSixRightPanel.setVisible(false);
				pageFiveRightPanel.setVisible(true);
			}
		});
		
		buttonPageSixNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pageSevenRightPanel.setVisible(true);
				pageSixRightPanel.setVisible(false);
				
				try
				{
				String tmp=fileName;
				tmp+=file5;
				content = new String(Files.readAllBytes(Paths.get(tmp)));
				}catch(IOException z)
				{
				z.printStackTrace();	
				}
				textAreaSeven.setText(content);
			}
		});
		

		buttonPageSevenGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageSevenRightPanel.setVisible(false);
				pageSixRightPanel.setVisible(true);
			}
		});
		

		buttonPageSevenNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageSevenRightPanel.setVisible(false);
				otherLeftPanel.setVisible(false);
				suggestionPanel.setVisible(true);
				
			}
		});
		
		buttonPageEndGoback.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				suggestionPanel.setVisible(false);
				otherLeftPanel.setVisible(true);
				pageSevenRightPanel.setVisible(true);
			}
		});
		
		
		buttonPageEndNext.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						otherLeftPanelBG.setIcon(new ImageIcon("gift.png"));
						suggestionPanel.setVisible(false);
						otherLeftPanel.setVisible(true);
						pageEightRightPanel.setVisible(true);
					}
		});
		
		
		buttonPageEightGoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				otherLeftPanelBG.setIcon(new ImageIcon(pageTreeBackGround));
				pageSevenRightPanel.setVisible(false);
				otherLeftPanel.setVisible(false);
				suggestionPanel.setVisible(true);
				pageEightRightPanel.setVisible(false);
			}
		});
		
		
	}
}
