package MenuGuý;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BusPage {

	private JFrame frame;
	private JTextField KizilayOtobusAdi_textField;
	private JTextField Plaka_textField;
	private JTextField UniteSayisi_textField;
	private JTextField OtobusunBulunduguAdres_textField;

	/**
	 * Launch the application.
	 */
	public void busMemberScreen(String kullaniciAdi,String sifre) { // Uye ile ilgili spesifik bilgiler ekrana verilecek
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusPage window = new BusPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BusPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel KizilayOtobusuAdi_Label = new JLabel("K\u0131z\u0131lay Otob\u00FCs\u00FC Ad\u0131:");
		KizilayOtobusuAdi_Label.setBounds(49, 12, 113, 14);
		frame.getContentPane().add(KizilayOtobusuAdi_Label);
		
		JLabel Plaka_Label = new JLabel("Plaka:");
		Plaka_Label.setBounds(49, 37, 113, 14);
		frame.getContentPane().add(Plaka_Label);
		
		JLabel KanGrubu_Label = new JLabel("Kan Grubu :");
		KanGrubu_Label.setBounds(49, 123, 113, 14);
		frame.getContentPane().add(KanGrubu_Label);
		
		JLabel UniteSayisi_Label = new JLabel("\u00DCnite Say\u0131s\u0131 :");
		UniteSayisi_Label.setBounds(49, 181, 113, 14);
		frame.getContentPane().add(UniteSayisi_Label);
		
		JLabel OtobusunBulunduguIlIlce_Label = new JLabel("Otobüsün Bulunduðu Ýl/Ýlçe :");
		OtobusunBulunduguIlIlce_Label.setBounds(49, 63, 134, 14);
		frame.getContentPane().add(OtobusunBulunduguIlIlce_Label);
		
		JLabel OtobusunBulunduguAdres_Label = new JLabel("Otob\u00FCs\u00FCn Bulundu\u011Fu Adres :");
		OtobusunBulunduguAdres_Label.setBounds(49, 86, 156, 14);
		frame.getContentPane().add(OtobusunBulunduguAdres_Label);
		
		KizilayOtobusAdi_textField = new JTextField();
		KizilayOtobusAdi_textField.setBounds(197, 10, 113, 20);
		frame.getContentPane().add(KizilayOtobusAdi_textField);
		KizilayOtobusAdi_textField.setColumns(10);
		
		Plaka_textField = new JTextField();
		Plaka_textField.setBounds(197, 35, 113, 20);
		frame.getContentPane().add(Plaka_textField);
		Plaka_textField.setColumns(10);
		
		UniteSayisi_textField = new JTextField();
		UniteSayisi_textField.setBounds(197, 179, 113, 20);
		frame.getContentPane().add(UniteSayisi_textField);
		UniteSayisi_textField.setColumns(10);
		
		JComboBox<String> OtobusunBulunduguIl_List = new JComboBox<>();
		OtobusunBulunduguIl_List.setBounds(197, 60, 113, 20);
		OtobusunBulunduguIl_List.addItem("Ankara");
		frame.getContentPane().add(OtobusunBulunduguIl_List);
		
		JComboBox<String> OtobusunBulunduguIlce_List = new JComboBox<>();
		OtobusunBulunduguIlce_List.setBounds(322, 60, 113, 20);
		OtobusunBulunduguIlce_List.addItem("Akyurt");
		OtobusunBulunduguIlce_List.addItem("Altýndað");
		OtobusunBulunduguIlce_List.addItem("Ayaþ");
		OtobusunBulunduguIlce_List.addItem("Bala");
		OtobusunBulunduguIlce_List.addItem("Beypazarý");
		OtobusunBulunduguIlce_List.addItem("Çamlýdere");
		OtobusunBulunduguIlce_List.addItem("Çankaya");
		OtobusunBulunduguIlce_List.addItem("Çubuk");
		OtobusunBulunduguIlce_List.addItem("Elmadað");
		OtobusunBulunduguIlce_List.addItem("Etimesgut");
		OtobusunBulunduguIlce_List.addItem("Evren");
		OtobusunBulunduguIlce_List.addItem("Gölbaþý");
		OtobusunBulunduguIlce_List.addItem("Güdül");
		OtobusunBulunduguIlce_List.addItem("Haymana");
		OtobusunBulunduguIlce_List.addItem("KahramanKazan");
		OtobusunBulunduguIlce_List.addItem("Kalecik");
		OtobusunBulunduguIlce_List.addItem("Keçiören");
		OtobusunBulunduguIlce_List.addItem("Kýzýlcahamam");
		OtobusunBulunduguIlce_List.addItem("Mamak");
		OtobusunBulunduguIlce_List.addItem("Nallýhan");
		OtobusunBulunduguIlce_List.addItem("Polatlý");
		OtobusunBulunduguIlce_List.addItem("Pursaklar");
		OtobusunBulunduguIlce_List.addItem("Sincan");
		OtobusunBulunduguIlce_List.addItem("Þereflikoçhisar");
		OtobusunBulunduguIlce_List.addItem("Yenimahalle");
		frame.getContentPane().add(OtobusunBulunduguIlce_List);
		
		OtobusunBulunduguAdres_textField = new JTextField();
		OtobusunBulunduguAdres_textField.setBounds(197, 84, 112, 20);
		frame.getContentPane().add(OtobusunBulunduguAdres_textField);
		OtobusunBulunduguAdres_textField.setColumns(10);
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DonorPage donorPage = new DonorPage();
				donorPage.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(49, 243, 83, 25);
		frame.getContentPane().add(Geri_Button);
		
		JRadioButton ZeroPos_RadioButton = new JRadioButton("0Rh+");
		ZeroPos_RadioButton.setBounds(197, 119, 62, 23);
		frame.getContentPane().add(ZeroPos_RadioButton);
		
		JRadioButton ZeroNeg_RadioButton = new JRadioButton("0Rh-");
		ZeroNeg_RadioButton.setBounds(269, 119, 62, 23);
		frame.getContentPane().add(ZeroNeg_RadioButton);
		
		JRadioButton APos_RadioButton = new JRadioButton("ARh+");
		APos_RadioButton.setBounds(344, 119, 62, 23);
		frame.getContentPane().add(APos_RadioButton);
		
		JRadioButton ANeg_RadioButton = new JRadioButton("ARh-");
		ANeg_RadioButton.setBounds(49, 145, 62, 23);
		frame.getContentPane().add(ANeg_RadioButton);
		
		JRadioButton BPos_RadioButton = new JRadioButton("BRh+");
		BPos_RadioButton.setBounds(121, 145, 62, 23);
		frame.getContentPane().add(BPos_RadioButton);
		
		JRadioButton BNeg_RadioButton = new JRadioButton("BRh-");
		BNeg_RadioButton.setBounds(197, 146, 62, 23);
		frame.getContentPane().add(BNeg_RadioButton);
		
		JRadioButton ABPos_RadioButton = new JRadioButton("ABRh+");
		ABPos_RadioButton.setBounds(269, 146, 70, 23);
		frame.getContentPane().add(ABPos_RadioButton);
		
		JRadioButton ABNeg_RadioButton = new JRadioButton("ABRh-");
		ABNeg_RadioButton.setBounds(344, 145, 70, 23);
		frame.getContentPane().add(ABNeg_RadioButton);
		
		JButton Kaydet_Button = new JButton("Deðiþtir/Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				int flagNum = 2;
				//int telephone
				//String email
				String fname = KizilayOtobusAdi_textField.getText().toString();
				// mname
				//String userPassword = HastaneSifreEkle_textField.toString();
				// sex
				// age
				String city = OtobusunBulunduguIl_List.getSelectedItem().toString();
				String town = OtobusunBulunduguIlce_List.getSelectedItem().toString();
				// report
				String bloodType="";
				if(ZeroPos_RadioButton.isSelected()) bloodType += "0Rh+ ";  
				if(ZeroNeg_RadioButton.isSelected()) bloodType += "0Rh- ";  
				if(APos_RadioButton.isSelected()) bloodType += "ARh+ ";  
				if(ANeg_RadioButton.isSelected()) bloodType += "ARh- ";  
				if(BPos_RadioButton.isSelected()) bloodType += "BRh+ ";  
				if(BNeg_RadioButton.isSelected()) bloodType += "BRh- ";  
				if(ABPos_RadioButton.isSelected()) bloodType += "ABRh+ ";  
				if(ABNeg_RadioButton.isSelected()) bloodType += "ABRh- ";	
				String plaka = Plaka_textField.getText().toString();
				String bloodTypeNum = UniteSayisi_textField.getText().toString();
				
				String address = OtobusunBulunduguAdres_textField.getText().toString();
				
				// Bilgiler UPDATE edilecek veritabanýnda
			}
		});
		Kaydet_Button.setBounds(296, 244, 139, 23);
		frame.getContentPane().add(Kaydet_Button);
		
	}}
