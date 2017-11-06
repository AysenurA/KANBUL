package MenuGuý;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KisiPage {

	private JFrame frame;
	private JTextField Ad_textField;
	private JTextField Soyad_textField;
	private JTextField Telefon_textField;
	private JTextField Email_textField;
	private JTextField Sifre_textField;
	private JTextField Yas_textField;

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
					//Select ile databaseden ilgili kiþinin verilieri getirilir
					
					
					window.Telefon_textField.setText("0"+kullaniciPage.get(0));
					window.Email_textField.setText(kullaniciPage.get(1));
					window.Ad_textField.setText(kullaniciPage.get(2));
					window.Soyad_textField.setText(kullaniciPage.get(4));
					window.Sifre_textField.setText(kullaniciPage.get(6));
					window.Yas_textField.setText(kullaniciPage.get(5));
				//	window.Il_textField.setText(kullaniciPage.get(5));
					
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
		frame.setBounds(100, 100, 478, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Ad_Label = new JLabel("Ad:");
		Ad_Label.setBounds(44, 30, 59, 23);
		frame.getContentPane().add(Ad_Label);
		
		JLabel Soyad_Label = new JLabel("Soyad:");
		Soyad_Label.setBounds(44, 64, 59, 23);
		frame.getContentPane().add(Soyad_Label);
		
		Ad_textField = new JTextField();
		Ad_textField.setBounds(189, 30, 120, 23);
		frame.getContentPane().add(Ad_textField);
		Ad_textField.setColumns(10);
		
		JLabel Telefon_Label = new JLabel("Telefon:");
		Telefon_Label.setBounds(44, 98, 59, 23);
		frame.getContentPane().add(Telefon_Label);
		
		JLabel Ililce_Label = new JLabel("\u0130l/\u0130l\u00E7e:");
		Ililce_Label.setBounds(44, 132, 59, 23);
		frame.getContentPane().add(Ililce_Label);
		
		JComboBox<String> Il_List = new JComboBox<String>();
		Il_List.setBounds(189, 133, 120, 20);
		Il_List.addItem("Ankara");
		frame.getContentPane().add(Il_List);
		
		JComboBox<String> Ilce_List = new JComboBox<String>();
		Ilce_List.setBounds(319, 133, 120, 20);
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
		
		Soyad_textField = new JTextField();
		Soyad_textField.setColumns(10);
		Soyad_textField.setBounds(189, 64, 120, 23);
		frame.getContentPane().add(Soyad_textField);
		
		Telefon_textField = new JTextField();
		Telefon_textField.setColumns(10);
		Telefon_textField.setBounds(189, 98, 120, 23);
		frame.getContentPane().add(Telefon_textField);
		
		JLabel Email_Label = new JLabel("E-mail:");
		Email_Label.setBounds(44, 164, 59, 23);
		frame.getContentPane().add(Email_Label);
		
		Email_textField = new JTextField();
		Email_textField.setColumns(10);
		Email_textField.setBounds(189, 164, 120, 23);
		frame.getContentPane().add(Email_textField);
		
		JButton Kaydet_Button = new JButton("De\u011Fi\u015Ftir/Kaydet");
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flagNum = 1;
				int telephone=Integer.parseInt(Telefon_textField.getText().toString());
				String email= Email_textField.getText().toString();
				String fname = Ad_textField.getText().toString();
				// mname
				String lname = Soyad_textField.getText().toString();
				String userPassword = Sifre_textField.toString();
				// sex
				int age = Integer.parseInt(Yas_textField.getText().toString());
				String city = Il_List.getSelectedItem().toString();
				String town = Ilce_List.getSelectedItem().toString();
				// report
				//String bloodType 
				// plaka
				//String bloodTypeNum 
				//String address
				
				// Bilgiler UPDATE edilecek veritabanýnda
				//frame.dispose();
			}
		});
		Kaydet_Button.setBounds(332, 261, 120, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DonorPage dp=new DonorPage();
				dp.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(22, 261, 69, 23);
		frame.getContentPane().add(Geri_Button);
		
		JLabel Sifre_Label = new JLabel("\u015Eifre:");
		Sifre_Label.setBounds(44, 227, 59, 23);
		frame.getContentPane().add(Sifre_Label);
		
		Sifre_textField = new JTextField();
		Sifre_textField.setColumns(10);
		Sifre_textField.setBounds(189, 193, 120, 23);
		frame.getContentPane().add(Sifre_textField);
		
		JLabel Yas_Label = new JLabel("Ya\u015F:");
		Yas_Label.setBounds(44, 193, 59, 23);
		frame.getContentPane().add(Yas_Label);
		
		Yas_textField = new JTextField();
		Yas_textField.setColumns(10);
		Yas_textField.setBounds(189, 227, 120, 23);
		frame.getContentPane().add(Yas_textField);
	}
}
