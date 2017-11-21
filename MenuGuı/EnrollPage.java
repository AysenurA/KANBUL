package MenuGuý;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import sqlTable.KanVerici;
import sqlTable.Rapor;


@SuppressWarnings("unused")
public class EnrollPage {

	private JFrame frame;
	private JTextField Ad_textField;
	private JTextField Soyad_textField;
	private JTextField Yas_textField;
	private JTextField TelNo_textField;
	private JTextField Email_textField;
	private JTextField Sifre_textField;
	ArrayList<Boolean> kanBagisFormu=new ArrayList<Boolean>();
	public KanVerici person =new KanVerici();
	public ErrorPage window=new ErrorPage();
	public Rapor rapor;
	public boolean raporuDoldurunuzGirildi=false;
	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnrollPage window = new EnrollPage();
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
	public EnrollPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 561, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Ad_Label = new JLabel("Ad:");
		Ad_Label.setBounds(40, 11, 92, 14);
		frame.getContentPane().add(Ad_Label);
		
		Ad_textField = new JTextField();
		Ad_textField.setBounds(191, 8, 140, 20);
		frame.getContentPane().add(Ad_textField);
		Ad_textField.setColumns(10);
		
		JLabel Soyad_Label = new JLabel("Soyad:");
		Soyad_Label.setBounds(40, 36, 92, 14);
		frame.getContentPane().add(Soyad_Label);
		
		Soyad_textField = new JTextField();
		Soyad_textField.setBounds(191, 33, 140, 20);
		frame.getContentPane().add(Soyad_textField);
		Soyad_textField.setColumns(10);
		
		JLabel Cinsiyet_Label = new JLabel("Cinsiyet:");
		Cinsiyet_Label.setBounds(40, 61, 92, 14);
		frame.getContentPane().add(Cinsiyet_Label);
		
		JLabel Yas_Label = new JLabel("Ya\u015F:");
		Yas_Label.setBounds(40, 86, 92, 14);
		frame.getContentPane().add(Yas_Label);
		
		Yas_textField = new JTextField();
		Yas_textField.setBounds(191, 84, 140, 20);
		frame.getContentPane().add(Yas_textField);
		Yas_textField.setColumns(10);
		
		JLabel KanGrubu_Label = new JLabel("Kan Grubu:");
		KanGrubu_Label.setBounds(40, 111, 92, 14);
		frame.getContentPane().add(KanGrubu_Label);
		
		JLabel TelNo_Label = new JLabel("Telefon Numaras\u0131:");
		TelNo_Label.setBounds(40, 136, 141, 14);
		frame.getContentPane().add(TelNo_Label);
		
		TelNo_textField = new JTextField();
		TelNo_textField.setBounds(191, 134, 140, 20);
		frame.getContentPane().add(TelNo_textField);
		TelNo_textField.setColumns(10);
		
		JLabel Email_Label = new JLabel("E-mail:");
		Email_Label.setBounds(40, 161, 46, 14);
		frame.getContentPane().add(Email_Label);
		
		Email_textField = new JTextField();
		Email_textField.setBounds(191, 158, 140, 20);
		frame.getContentPane().add(Email_textField);
		Email_textField.setColumns(10);
		
		JLabel Il_Label = new JLabel("\u0130l:");
		Il_Label.setBounds(40, 186, 92, 14);
		frame.getContentPane().add(Il_Label);
		
		JLabel Ilce_Label = new JLabel("\u0130l\u00E7e:");
		Ilce_Label.setBounds(40, 211, 92, 14);
		frame.getContentPane().add(Ilce_Label);
		
		JLabel Sifre_Label = new JLabel("\u015Eifre:");
		Sifre_Label.setBounds(40, 236, 92, 14);
		frame.getContentPane().add(Sifre_Label);
		
		Sifre_textField = new JTextField();
		Sifre_textField.setBounds(191, 236, 140, 20);
		frame.getContentPane().add(Sifre_textField);
		Sifre_textField.setColumns(10);
		
		JComboBox<String> Cinsiyet_List = new JComboBox<>();
		Cinsiyet_List.setBounds(191, 58, 140, 20);
		Cinsiyet_List.addItem("Kadýn");
		Cinsiyet_List.addItem("Erkek");
		

		frame.getContentPane().add(Cinsiyet_List);
		
		JComboBox<String> Il_List = new JComboBox<>();
		Il_List.setBounds(191, 183, 140, 20);
		Il_List.addItem("Ankara");
		frame.getContentPane().add(Il_List);
		
		JComboBox<String> Ilce_List = new JComboBox<>();
		Ilce_List.setBounds(191, 208, 140, 20);
		Ilce_List.addItem("Akyurt");
		Ilce_List.addItem("Altýndað");
		Ilce_List.addItem("Ayaþ");
		Ilce_List.addItem("Bala");
		Ilce_List.addItem("Beypazarý");
		Ilce_List.addItem("Çamlýdere");
		Ilce_List.addItem("Çankaya");
		Ilce_List.addItem("Çubuk");
		Ilce_List.addItem("Elmadað");
		Ilce_List.addItem("Etimesgut");
		Ilce_List.addItem("Evren");
		Ilce_List.addItem("Gölbaþý");
		Ilce_List.addItem("Güdül");
		Ilce_List.addItem("Haymana");
		Ilce_List.addItem("KahramanKazan");
		Ilce_List.addItem("Kalecik");
		Ilce_List.addItem("Keçiören");
		Ilce_List.addItem("Kýzýlcahamam");
		Ilce_List.addItem("Mamak");
		Ilce_List.addItem("Nallýhan");
		Ilce_List.addItem("Polatlý");
		Ilce_List.addItem("Pursaklar");
		Ilce_List.addItem("Sincan");
		Ilce_List.addItem("Þereflikoçhisar");
		Ilce_List.addItem("Yenimahalle");
		frame.getContentPane().add(Ilce_List);
		
		JComboBox<String> KanGrubu_List = new JComboBox<String>();
		KanGrubu_List.setBounds(191, 108, 140, 20);
		
		KanGrubu_List.addItem("0Rh+");
		KanGrubu_List.addItem("0Rh-");
		KanGrubu_List.addItem("ARh+");
		KanGrubu_List.addItem("ARh-");
		KanGrubu_List.addItem("BRh+");
		KanGrubu_List.addItem("BRh-");
		KanGrubu_List.addItem("ABRh+");
		KanGrubu_List.addItem("ABRh-");
		frame.getContentPane().add(KanGrubu_List);
		
		JButton Kaydet_Button = new JButton("Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try{
			int flagNum = 1;
			int age = 0;
			String telephone = (TelNo_textField.getText().toString());
			String email = Email_textField.getText().toString();
			String fname = Ad_textField.getText().toString();
			String lname = Soyad_textField.getText().toString();
			String userPassword = Sifre_textField.getText().toString();
			char cinsiyet = (Cinsiyet_List.getSelectedItem().toString()).charAt(0);
			if(cinsiyet =='E') {
				cinsiyet ='M';
			}
			else
				cinsiyet ='F';
			// E ise MALE , K ise FEMALE check et.
			
			for (int i = 0; i < Yas_textField.getText().trim().toString().length(); i++) {
		        char charAtYas = Yas_textField.getText().trim().toString().charAt(i);
		        if (!Character.isDigit(charAtYas)) {
					throw new SQLException();
		            }
		     }
	         age = Integer.parseInt(Yas_textField.getText().trim().toString());
			

			//int age = Integer.parseInt(Yas_textField.getText().toString());
			String city = Il_List.getSelectedItem().toString();
			String town = Ilce_List.getSelectedItem().toString();
			
			System.out.println(kanBagisFormu.toString()+"Enroll Page Action Performed");
			
			if(cinsiyet=='M') {
				kanBagisFormu.set(10, false);
			}
			boolean report=true;
			if(kanBagisFormu.contains(true)) {
			report = false;
					//Evet_RadioButton.isSelected() ? 0 : 1	;	
			}
			System.out.println(kanBagisFormu.toString());
			
			
			String bloodType = KanGrubu_List.getSelectedItem().toString();
			int report_int=0;
			if(report==true) 
				report_int = 1;

					if(hataKontrolu(flagNum,telephone,email,fname,lname,userPassword,bloodType,town,city,report_int,cinsiyet,age)==true){
						
						if(person.Exist(email)) {
							window.newScreen("Bu email adresi ile daha önce kayýt olundu.");
							System.out.println("Hata kontrolü");
						}
						else{
						Insert(flagNum,telephone,email,fname,lname,userPassword,bloodType,town,city,report_int,cinsiyet,age);
						OnayPage window = new OnayPage();
			    		window.newScreen("Kiþi baþarýyla eklendi",true,false);
			    		frame.dispose();
						}
					}
					else
						window.newScreen("Hatalý bilgi girdiniz/Lütfen bilgilerinizi kontrol ediniz...");
					

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				window.newScreen("Hatalý bilgi girdiniz/Lütfen bilgilerinizi kontrol ediniz...");
				e1.printStackTrace();
			}

			
			}
		});
		Kaydet_Button.setBounds(375, 357, 140, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		JButton btnGeri = new JButton("Geri");
		btnGeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DonorPage donorPage = new DonorPage();
				donorPage.newScreen();
				frame.dispose();
			}
		});
		btnGeri.setBounds(40, 357, 60, 23);
		frame.getContentPane().add(btnGeri);
		
		JButton btnRapor = new JButton("L\u00FCtfen Raporu Doldurunuz...");
		btnRapor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportPage reportPage=new ReportPage();
				kanBagisFormu=reportPage.newScreen();
				raporuDoldurunuzGirildi=true;
				
			}
		});
		btnRapor.setBounds(40, 279, 230, 23);
		frame.getContentPane().add(btnRapor);
		
		
	}
	public void Insert(int flagNum,String telephone,String email,String fname,String lname,String userPassword, String bloodType,String town,String city,int report,char cinsiyet,int age) {
		
		
		try {
			 if (!person.Exist(telephone,email)) {
				 	person = new KanVerici(flagNum,telephone,email,fname," ",lname,userPassword,bloodType,town,city,report,cinsiyet,age);
			 }
			 else {
		    // ayný kiþi varsa uyarý mesajý çýkýcaktýr.
			 System.out.println("Kiþi Mevcut From enrollPage");
			 }
		} catch (SQLException e1) {
			System.out.println("EnrollPage INSERT exception");
			e1.getMessage();
			e1.printStackTrace();
		}
	}
	
		
	
	public boolean hataKontrolu(int flagNum, String telephone, String email, String fname, String lname, String userPassword, String bloodType, String town, String city, int report_int, char cinsiyet, int age){
		
		
		if(!email.contains("@")&&(!email.contains(".com"))){
			return false;
		}
		
				for (int i = 0; i < fname.length(); i++) {
			        char charAtFname = fname.charAt(i);
			        if (!Character.isLetter(charAtFname)) {
			        	System.out.println("1");
			        	return false;
			            }
			    }
				for (int i = 0; i < lname.length(); i++) {
			        char charAtLname = lname.charAt(i);
			        if (!Character.isLetter(charAtLname)) {
			        	System.out.println("2");

			        	return false;
			            }
			    }
				
				
				for (int i = 0; i < telephone.length(); i++) {
			        char charAtTel = telephone.charAt(i);
			        if (!Character.isDigit(charAtTel)) {
			        	System.out.println("3");
			        	return false;
			            }
			    	}
				
				if(telephone.length()>10){
					return false;
				}
				
				if(!(age<=110)){
		        	System.out.println("4");

						 return false;
						 }		
			
		return true;
	
	}
}
	
		
