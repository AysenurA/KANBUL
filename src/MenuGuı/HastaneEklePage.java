package MenuGu�;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HastaneEklePage {

	private JFrame frame;
	private JTextField HastaneSifreEkle_textField;
	private JTextField HastaneTelEkle_textField;
	private JTextField HastaneEmailEkle_textField;
	private JTextField UniteSayisi_textField;
	private JTextField HastaneAdresEkle_textField;

	/**
	 * Launch the application.
	 */
	public void newScreen() {  // Uye ile ilgili spesifik bilgiler ekrana verilecek
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HastaneEklePage window = new HastaneEklePage();
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
	public HastaneEklePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel HastaneAdiEkle_Label = new JLabel("Hastane Ad\u0131 Ekle:");
		HastaneAdiEkle_Label.setBounds(52, 12, 113, 14);
		frame.getContentPane().add(HastaneAdiEkle_Label);
		
		JLabel HastaneAdresiIlIlceEkle_Label = new JLabel("Hastane Adresi-�l �l�e Ekle:");
		HastaneAdresiIlIlceEkle_Label.setBounds(52, 38, 134, 14);
		frame.getContentPane().add(HastaneAdresiIlIlceEkle_Label);
		
		JComboBox<String> HastaneAdiEkle_List = new JComboBox<String>();
		HastaneAdiEkle_List.setBounds(199, 9, 113, 20);
		frame.getContentPane().add(HastaneAdiEkle_List);
		
		JComboBox<String> HastaneAdresiIlEkle_List = new JComboBox<String>();
		HastaneAdresiIlEkle_List.setBounds(199, 35, 113, 20);
		HastaneAdresiIlEkle_List.addItem("Ankara");
		frame.getContentPane().add(HastaneAdresiIlEkle_List);
		
		JComboBox<String> HastaneAdresiIlceEkle_List = new JComboBox<String>();
		HastaneAdresiIlceEkle_List.setBounds(325, 35, 113, 20);
		HastaneAdresiIlceEkle_List.addItem("Akyurt");
		HastaneAdresiIlceEkle_List.addItem("Alt�nda�");
		HastaneAdresiIlceEkle_List.addItem("Aya�");
		HastaneAdresiIlceEkle_List.addItem("Bala");
		HastaneAdresiIlceEkle_List.addItem("Beypazar�");
		HastaneAdresiIlceEkle_List.addItem("�aml�dere");
		HastaneAdresiIlceEkle_List.addItem("�ankaya");
		HastaneAdresiIlceEkle_List.addItem("�ubuk");
		HastaneAdresiIlceEkle_List.addItem("Elmada�");
		HastaneAdresiIlceEkle_List.addItem("Etimesgut");
		HastaneAdresiIlceEkle_List.addItem("Evren");
		HastaneAdresiIlceEkle_List.addItem("G�lba��");
		HastaneAdresiIlceEkle_List.addItem("G�d�l");
		HastaneAdresiIlceEkle_List.addItem("Haymana");
		HastaneAdresiIlceEkle_List.addItem("KahramanKazan");
		HastaneAdresiIlceEkle_List.addItem("Kalecik");
		HastaneAdresiIlceEkle_List.addItem("Ke�i�ren");
		HastaneAdresiIlceEkle_List.addItem("K�z�lcahamam");
		HastaneAdresiIlceEkle_List.addItem("Mamak");
		HastaneAdresiIlceEkle_List.addItem("Nall�han");
		HastaneAdresiIlceEkle_List.addItem("Polatl�");
		HastaneAdresiIlceEkle_List.addItem("Pursaklar");
		HastaneAdresiIlceEkle_List.addItem("Sincan");
		HastaneAdresiIlceEkle_List.addItem("�erefliko�hisar");
		HastaneAdresiIlceEkle_List.addItem("Yenimahalle");
		frame.getContentPane().add(HastaneAdresiIlceEkle_List);
		
		JLabel HastaneifresiEkle_Label = new JLabel("Hastane �ifresi Ekle");
		HastaneifresiEkle_Label.setBounds(52, 89, 134, 15);
		frame.getContentPane().add(HastaneifresiEkle_Label);
		
		HastaneSifreEkle_textField = new JTextField();
		HastaneSifreEkle_textField.setBounds(199, 87, 113, 19);
		frame.getContentPane().add(HastaneSifreEkle_textField);
		HastaneSifreEkle_textField.setColumns(10);
		
		JLabel HastaneTelefonEkle_Label = new JLabel("Hastane Telefon Ekle");
		HastaneTelefonEkle_Label.setBounds(52, 64, 134, 15);
		frame.getContentPane().add(HastaneTelefonEkle_Label);
		
		HastaneTelEkle_textField = new JTextField();
		HastaneTelEkle_textField.setBounds(199, 62, 113, 19);
		frame.getContentPane().add(HastaneTelEkle_textField);
		HastaneTelEkle_textField.setColumns(10);
		
		JLabel HastaneEmailEkle_Label = new JLabel("Hastane Email Ekle");
		HastaneEmailEkle_Label.setBounds(52, 116, 134, 15);
		frame.getContentPane().add(HastaneEmailEkle_Label);
		
		HastaneEmailEkle_textField = new JTextField();
		HastaneEmailEkle_textField.setBounds(199, 114, 113, 19);
		frame.getContentPane().add(HastaneEmailEkle_textField);
		HastaneEmailEkle_textField.setColumns(10);
		
		JRadioButton ZeroPos_RadioButton = new JRadioButton("0Rh+");
		ZeroPos_RadioButton.setBounds(52, 139, 62, 23);
		frame.getContentPane().add(ZeroPos_RadioButton);
		
		JRadioButton ZeroNeg_RadioButton = new JRadioButton("0Rh-");
		ZeroNeg_RadioButton.setBounds(118, 139, 62, 23);
		frame.getContentPane().add(ZeroNeg_RadioButton);
		
		JRadioButton APos_RadioButton = new JRadioButton("ARh+");
		APos_RadioButton.setBounds(184, 139, 62, 23);
		frame.getContentPane().add(APos_RadioButton);
		
		JRadioButton ANeg_RadioButton = new JRadioButton("ARh-");
		ANeg_RadioButton.setBounds(250, 139, 62, 23);
		frame.getContentPane().add(ANeg_RadioButton);
		
		JRadioButton BPos_RadioButton = new JRadioButton("BRh+");
		BPos_RadioButton.setBounds(52, 168, 62, 23);
		frame.getContentPane().add(BPos_RadioButton);
		
		JRadioButton BNeg_RadioButton = new JRadioButton("BRh-");
		BNeg_RadioButton.setBounds(118, 168, 62, 23);
		frame.getContentPane().add(BNeg_RadioButton);
		
		JRadioButton ABPos_RadioButton = new JRadioButton("ABRh+");
		ABPos_RadioButton.setBounds(184, 168, 70, 23);
		frame.getContentPane().add(ABPos_RadioButton);
		
		JRadioButton ABNeg_RadioButton = new JRadioButton("ABRh-");
		ABNeg_RadioButton.setBounds(250, 168, 70, 23);
		frame.getContentPane().add(ABNeg_RadioButton);
		
		JLabel UniteSaylariEkle_Label = new JLabel("�nite Say�lar� Ekle");
		UniteSaylariEkle_Label.setBounds(52, 196, 148, 15);
		frame.getContentPane().add(UniteSaylariEkle_Label);
		
		UniteSayisi_textField = new JTextField();
		UniteSayisi_textField.setBounds(199, 194, 114, 19);
		frame.getContentPane().add(UniteSayisi_textField);
		UniteSayisi_textField.setColumns(10);
		
		JLabel HastaneAddressEkle_Label = new JLabel("Hastane Adres Ekle");
		HastaneAddressEkle_Label.setBounds(52, 223, 134, 15);
		frame.getContentPane().add(HastaneAddressEkle_Label);
		
		HastaneAdresEkle_textField = new JTextField();
		HastaneAdresEkle_textField.setBounds(199, 221, 114, 19);
		frame.getContentPane().add(HastaneAdresEkle_textField);
		HastaneAdresEkle_textField.setColumns(10);
		
		JButton Kaydet_Button = new JButton("Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flagNum = 2;
				int telephone = Integer.parseInt(HastaneTelEkle_textField.toString());
				String email = HastaneEmailEkle_textField.toString();
				String fname = HastaneAdiEkle_List.getSelectedItem().toString();
				// mname
				String userPassword = HastaneSifreEkle_textField.toString();
				// sex
				// age
				String city = HastaneAdresiIlEkle_List.getSelectedItem().toString();
				String town = HastaneAdresiIlceEkle_List.getSelectedItem().toString();
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
				// plaka
				String bloodTypeNum = UniteSayisi_textField.toString();
				String address = HastaneAdresEkle_textField.toString();
				
				// Zaten ayn�s� var m� ?INSERT edilecek kan verici tablosuna
				// getText().toString() olabilir emin de�ilim
				// frame.dispose();
			}
		});
		Kaydet_Button.setBounds(364, 266, 89, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KizilayPage kizilayPage = new KizilayPage();
				kizilayPage.backScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(10, 266, 89, 23);
		frame.getContentPane().add(Geri_Button);
	}
}