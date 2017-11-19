package MenuGu�;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class KanArayanPage {

	private JFrame frame;
	private JTextField Ad_textField;
	private JTextField Soyad_textField;
	private JTextField TelNo_textField;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KanArayanPage window = new KanArayanPage();
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
	public KanArayanPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel HastaninBulunduguIl_Label = new JLabel("Hastan\u0131n Bulundu\u011Fu  \u0130l:");
		HastaninBulunduguIl_Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		HastaninBulunduguIl_Label.setBounds(36, 103, 172, 29);
		frame.getContentPane().add(HastaninBulunduguIl_Label);
		
		JComboBox<String> HastaninBulunduguIl_List = new JComboBox<>();
		HastaninBulunduguIl_List.setBounds(200, 107, 130, 20);
		HastaninBulunduguIl_List.addItem("Ankara");
		frame.getContentPane().add(HastaninBulunduguIl_List);
		
		JLabel HastaninBulunduguIlce_Label = new JLabel("Hastan\u0131n Bulundu\u011Fu \u0130l\u00E7e:");
		HastaninBulunduguIlce_Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		HastaninBulunduguIlce_Label.setBounds(36, 129, 172, 29);
		frame.getContentPane().add(HastaninBulunduguIlce_Label);
		
		JComboBox<String> HastaninBulunduguIlce_List = new JComboBox<>();
		HastaninBulunduguIlce_List.setBounds(200, 133, 130, 20);
		HastaninBulunduguIlce_List.addItem("Akyurt");
		HastaninBulunduguIlce_List.addItem("Alt�nda�");
		HastaninBulunduguIlce_List.addItem("Aya�");
		HastaninBulunduguIlce_List.addItem("Bala");
		HastaninBulunduguIlce_List.addItem("Beypazar�");
		HastaninBulunduguIlce_List.addItem("�aml�dere");
		HastaninBulunduguIlce_List.addItem("�ankaya");
		HastaninBulunduguIlce_List.addItem("�ubuk");
		HastaninBulunduguIlce_List.addItem("Elmada�");
		HastaninBulunduguIlce_List.addItem("Etimesgut");
		HastaninBulunduguIlce_List.addItem("Evren");
		HastaninBulunduguIlce_List.addItem("G�lba��");
		HastaninBulunduguIlce_List.addItem("G�d�l");
		HastaninBulunduguIlce_List.addItem("Haymana");
		HastaninBulunduguIlce_List.addItem("KahramanKazan");
		HastaninBulunduguIlce_List.addItem("Kalecik");
		HastaninBulunduguIlce_List.addItem("Ke�i�ren");
		HastaninBulunduguIlce_List.addItem("K�z�lcahamam");
		HastaninBulunduguIlce_List.addItem("Mamak");
		HastaninBulunduguIlce_List.addItem("Nall�han");
		HastaninBulunduguIlce_List.addItem("Polatl�");
		HastaninBulunduguIlce_List.addItem("Pursaklar");
		HastaninBulunduguIlce_List.addItem("Sincan");
		HastaninBulunduguIlce_List.addItem("�erefliko�hisar");
		HastaninBulunduguIlce_List.addItem("Yenimahalle");
		frame.getContentPane().add(HastaninBulunduguIlce_List);
		
		JComboBox<String> ArananKanGrubu_List = new JComboBox<String>();
		ArananKanGrubu_List.setBounds(200, 83, 130, 20);
		ArananKanGrubu_List.addItem("0Rh+");
		ArananKanGrubu_List.addItem("0Rh-");
		ArananKanGrubu_List.addItem("ARh+");
		ArananKanGrubu_List.addItem("ARh-");
		ArananKanGrubu_List.addItem("BRh+");
		ArananKanGrubu_List.addItem("BRh-");
		ArananKanGrubu_List.addItem("ABRh+");
		ArananKanGrubu_List.addItem("ABRh-");


		frame.getContentPane().add(ArananKanGrubu_List);
		
		JButton KanAra_Button = new JButton("Kan Ara");
		KanAra_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String bloodType = ArananKanGrubu_List.getSelectedItem().toString();
			String city = HastaninBulunduguIl_List.getSelectedItem().toString();
			String town = HastaninBulunduguIlce_List.getSelectedItem().toString();
			
			// Yukar�daki 3 bilgiye g�re Kan Verici tablosuna query g�nderilecek
			
			// Gelen Bilgiler yeni bir ekran �zerinde g�sterilecek.
			//frame.dispose();
			}
		});
		KanAra_Button.setBounds(200, 174, 130, 23);
		frame.getContentPane().add(KanAra_Button);
		
		JLabel Ad_Label = new JLabel("Ad:");
		Ad_Label.setBounds(36, 11, 46, 14);
		frame.getContentPane().add(Ad_Label);
		
		Ad_textField = new JTextField();
		Ad_textField.setBounds(200, 8, 130, 20);
		frame.getContentPane().add(Ad_textField);
		Ad_textField.setColumns(10);
		
		JLabel Soyad_Label = new JLabel("Soyad:");
		Soyad_Label.setBounds(36, 36, 46, 14);
		frame.getContentPane().add(Soyad_Label);
		
		Soyad_textField = new JTextField();
		Soyad_textField.setBounds(200, 33, 130, 20);
		frame.getContentPane().add(Soyad_textField);
		Soyad_textField.setColumns(10);
		
		JLabel TelNo_Label = new JLabel("Telefon Numaras\u0131:");
		TelNo_Label.setBounds(36, 61, 95, 14);
		frame.getContentPane().add(TelNo_Label);
		
		TelNo_textField = new JTextField();
		TelNo_textField.setBounds(200, 58, 130, 20);
		frame.getContentPane().add(TelNo_textField);
		TelNo_textField.setColumns(10);
		
		JLabel ArananKanGrubu_Label = new JLabel("Aranan Kan Grubu:");
		ArananKanGrubu_Label.setBounds(36, 86, 95, 14);
		frame.getContentPane().add(ArananKanGrubu_Label);
		
		
		
		JButton Geri_Button = new JButton("Geri");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ApplicationPage appPage = new ApplicationPage();
				appPage.newScreen();
				frame.dispose();
			}
		});
		Geri_Button.setBounds(12, 235, 85, 25);
		frame.getContentPane().add(Geri_Button);
	}
	
	private Object makeObj(final String item)  {
	     return new Object() { public String toString() { return item; } };
	   }
}