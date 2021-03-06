package MenuGu�;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sqlTable.KanVerici;
import sqlTable.Rapor;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class KisiPage {

	private JFrame frame;
	private JTextField Ad_textField;
	private JTextField Soyad_textField;
	private JTextField Telefon_textField;
	private JTextField Yas_textField;
	private JTextField Sifre_textField;
	JComboBox<String> Il_List = new JComboBox<String>();
	JComboBox<String> Ilce_List = new JComboBox<String>();
	ArrayList<Boolean> kanBagisFormu=new ArrayList<Boolean>();
	public static String EmailKey="";
	public Rapor rapor;
	boolean sagl�kRaporunaGirildi=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KisiPage window = new KisiPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public  void newScreen(ArrayList <String> kullaniciPage) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KisiPage window = new KisiPage();
					//Select ile databaseden ilgili ki�inin verilieri getirilir
					
					System.out.println(kullaniciPage.toString());
					
					for (int i = 0 ; i<kullaniciPage.size() ; i++) {
						if(kullaniciPage.get(i)==null)
							kullaniciPage.set(i,"");
					}	
					window.Telefon_textField.setText(kullaniciPage.get(0));
					EmailKey=kullaniciPage.get(1);
					System.out.println(EmailKey);
					window.Ad_textField.setText(kullaniciPage.get(2));
					window.Soyad_textField.setText(kullaniciPage.get(4));
					window.Yas_textField.setText(kullaniciPage.get(6));
					window.Sifre_textField.setText(kullaniciPage.get(5));
					window.Il_List.setSelectedItem(kullaniciPage.get(7));
					window.Ilce_List.setSelectedItem(kullaniciPage.get(8));
					
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
	public KisiPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Ad_Label = new JLabel("Ad:");
		Ad_Label.setBounds(44, 11, 59, 23);
		frame.getContentPane().add(Ad_Label);
		
		JLabel Soyad_Label = new JLabel("Soyad:");
		Soyad_Label.setBounds(44, 45, 59, 23);
		frame.getContentPane().add(Soyad_Label);
		
		Ad_textField = new JTextField();
		Ad_textField.setBounds(184, 11, 120, 23);
		frame.getContentPane().add(Ad_textField);
		Ad_textField.setColumns(10);
		
		JLabel Telefon_Label = new JLabel("Telefon:");
		Telefon_Label.setBounds(44, 79, 59, 23);
		frame.getContentPane().add(Telefon_Label);
		
		JLabel Ililce_Label = new JLabel("\u0130l/\u0130l\u00E7e:");
		Ililce_Label.setBounds(44, 113, 59, 23);
		frame.getContentPane().add(Ililce_Label);
		
				Il_List.setBounds(184, 114, 120, 20);
		Il_List.addItem("Ankara");
		frame.getContentPane().add(Il_List);
		
		
		Ilce_List.setBounds(184, 137, 120, 20);
		Ilce_List.addItem("Akyurt");
		Ilce_List.addItem("Alt�nda�");
		Ilce_List.addItem("Aya�");
		Ilce_List.addItem("Bala");
		Ilce_List.addItem("Beypazar�");
		Ilce_List.addItem("�aml�dere");
		Ilce_List.addItem("�ankaya");
		Ilce_List.addItem("�ubuk");
		Ilce_List.addItem("Elmada�");
		Ilce_List.addItem("Etimesgut");
		Ilce_List.addItem("Evren");
		Ilce_List.addItem("G�lba��");
		Ilce_List.addItem("G�d�l");
		Ilce_List.addItem("Haymana");
		Ilce_List.addItem("KahramanKazan");
		Ilce_List.addItem("Kalecik");
		Ilce_List.addItem("Ke�i�ren");
		Ilce_List.addItem("K�z�lcahamam");
		Ilce_List.addItem("Mamak");
		Ilce_List.addItem("Nall�han");
		Ilce_List.addItem("Polatl�");
		Ilce_List.addItem("Pursaklar");
		Ilce_List.addItem("Sincan");
		Ilce_List.addItem("�erefliko�hisar");
		Ilce_List.addItem("Yenimahalle");
		frame.getContentPane().add(Ilce_List);
		
		Soyad_textField = new JTextField();
		Soyad_textField.setColumns(10);
		Soyad_textField.setBounds(184, 45, 120, 23);
		frame.getContentPane().add(Soyad_textField);
		
		Telefon_textField = new JTextField();
		Telefon_textField.setColumns(10);
		Telefon_textField.setBounds(184, 79, 120, 23);
		frame.getContentPane().add(Telefon_textField);
		
		JButton Kaydet_Button = new JButton("De\u011Fi\u015Ftir/Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flagNum = 1;
				String telephone=Telefon_textField.getText();
		
				String fname = Ad_textField.getText().toString();
				// mname
				String lname = Soyad_textField.getText().toString();
				String userPassword = Sifre_textField.getText().toString();
				System.out.println(userPassword);
				// sexSifre_textField
				int age = Integer.parseInt(Yas_textField.getText().toString());
				String city = Il_List.getSelectedItem().toString();
				String town = Ilce_List.getSelectedItem().toString();
				boolean report = false;
				if(kanBagisFormu.contains(true)) 
					report=false;
				//String bloodType 
				// plaka
				//String bloodTypeNum 
				//String address
				
				// Bilgiler UPDATE edilecek veritaban�nda
				//frame.dispose();
				if(sagl�kRaporunaGirildi==false) {
					
				}
				try {
					System.out.println(kanBagisFormu.toString());
					Update(EmailKey,telephone,fname,lname,userPassword,age,city,town);
					rapor=new Rapor();
					if(sagl�kRaporunaGirildi==true) {
					rapor.Update(telephone, EmailKey, report, kanBagisFormu);
					}
					EmailKey="";
					
					OnayPage window = new OnayPage();
					window.newScreen("Ki�i ba�ar�yla g�ncellendi",true,false);
					frame.dispose();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		Kaydet_Button.setBounds(147, 316, 120, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		JButton Cikis_Button = new JButton("\u00C7\u0131k\u0131\u015F");
		Cikis_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DonorPage dp=new DonorPage();
				dp.newScreen();
				frame.dispose();
			}
		});
		Cikis_Button.setBounds(30, 316, 75, 23);
		frame.getContentPane().add(Cikis_Button);
		
		JLabel Sifre_Label = new JLabel("\u015Eifre:");
		Sifre_Label.setBounds(44, 193, 59, 23);
		frame.getContentPane().add(Sifre_Label);
		
		Yas_textField = new JTextField();
		Yas_textField.setColumns(10);
		Yas_textField.setBounds(184, 163, 120, 23);
		frame.getContentPane().add(Yas_textField);
		
		JLabel Yas_Label = new JLabel("Ya\u015F:");
		Yas_Label.setBounds(44, 159, 59, 23);
		frame.getContentPane().add(Yas_Label);
		
		Sifre_textField = new JTextField();
		Sifre_textField.setColumns(10);
		Sifre_textField.setBounds(184, 193, 120, 23);
		frame.getContentPane().add(Sifre_textField);
		
		JButton SaglikRapor_Button = new JButton("Sa\u011Fl\u0131k Raporu");
		
		SaglikRapor_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportPage reportPage=new ReportPage();
				Rapor rapor = new Rapor();
				try {
					kanBagisFormu=reportPage.newScreen(rapor.Search(EmailKey));
					System.out.println("KisiPage"+kanBagisFormu.toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				sagl�kRaporunaGirildi=true;
			}
		});
		SaglikRapor_Button.setBounds(44, 227, 135, 23);
		frame.getContentPane().add(SaglikRapor_Button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\hand_heart_donate_icon_red-1.png"));
		lblNewLabel.setBounds(267, -7, 316, 291);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u015Eimdi Kan Ver!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setBounds(332, 291, 172, 23);
		frame.getContentPane().add(btnNewButton);
	}
	public void Update(String Email,String telephone,String fname,String lname,String userPassword,int age,String city,String town ) throws SQLException { 
		
		KanVerici person = new KanVerici();
		person.UpdatePerson(Email, telephone, fname, lname, userPassword, age, city, town);
				
		
	}
}
