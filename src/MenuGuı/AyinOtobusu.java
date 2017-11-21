package MenuGuý;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AyinOtobusu {

	private JFrame frame;
	private JTextField kizilayOtobusAdi_textField;
	private JTextField plaka_textField;
	private JTextField otobusunBulunduguIlilcetextField;
	private JTextField toplamUniteSayisi_textField;

	/**
	 * Launch the application.
	 */
	public void newScreen(String[] a) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AyinOtobusu window = new AyinOtobusu();
					
					window.kizilayOtobusAdi_textField.setText(a[0]);
					window.plaka_textField.setText(a[1]);
					window.otobusunBulunduguIlilcetextField.setText(a[2]+" / "+a[3]);
					window.toplamUniteSayisi_textField.setText(a[4]);


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
	public AyinOtobusu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel otobusunBulunduguIlilce = new JLabel("Otob\u00FCs\u00FCn Bulundu\u011Fu \u0130l/\u0130l\u00E7e :");
		otobusunBulunduguIlilce.setBounds(45, 189, 156, 14);
		frame.getContentPane().add(otobusunBulunduguIlilce);
		
		JLabel plaka = new JLabel("Plaka:");
		plaka.setBounds(45, 164, 113, 14);
		frame.getContentPane().add(plaka);
		
		JLabel kizilayOtobusuAdi = new JLabel("K\u0131z\u0131lay Otob\u00FCs\u00FC Ad\u0131:");
		kizilayOtobusuAdi.setBounds(45, 139, 113, 14);
		frame.getContentPane().add(kizilayOtobusuAdi);
		
		JLabel label_3 = new JLabel("En \u00C7ok Kan Toplayan Otob\u00FCs");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(45, 114, 199, 14);
		frame.getContentPane().add(label_3);
		
		kizilayOtobusAdi_textField = new JTextField();
		kizilayOtobusAdi_textField.setColumns(10);
		kizilayOtobusAdi_textField.setBounds(190, 136, 149, 20);
		frame.getContentPane().add(kizilayOtobusAdi_textField);
		
		plaka_textField = new JTextField();
		plaka_textField.setColumns(10);
		plaka_textField.setBounds(190, 161, 150, 20);
		frame.getContentPane().add(plaka_textField);
		
		otobusunBulunduguIlilcetextField = new JTextField();
		otobusunBulunduguIlilcetextField.setColumns(10);
		otobusunBulunduguIlilcetextField.setBounds(190, 186, 150, 20);
		frame.getContentPane().add(otobusunBulunduguIlilcetextField);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(116, 11, 139, 92);
		frame.getContentPane().add(label_4);
		
		JLabel uniteSayisi_Label = new JLabel("Toplam Unite Say\u0131s\u0131");
		uniteSayisi_Label.setBounds(45, 214, 139, 14);
		frame.getContentPane().add(uniteSayisi_Label);
		
		toplamUniteSayisi_textField = new JTextField();
		toplamUniteSayisi_textField.setBounds(190, 211, 149, 20);
		frame.getContentPane().add(toplamUniteSayisi_textField);
		toplamUniteSayisi_textField.setColumns(10);
		
		JButton kapat_Button = new JButton("Kapat");
		kapat_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		kapat_Button.setBounds(45, 241, 89, 23);
		frame.getContentPane().add(kapat_Button);
	}
}
