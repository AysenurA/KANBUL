package MenuGuý;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import sqlTable.Rapor;

import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;


public class ReportPage {
	
	JComboBox<String> comboBox1,comboBox2,comboBox3,comboBox4,comboBox5,comboBox6,comboBox7,comboBox8,comboBox9,comboBox10,comboBox11;
	JComboBox<String> comboBox12,comboBox13,comboBox14,comboBox15,comboBox16,comboBox17,comboBox18,comboBox19,comboBox20,comboBox21,comboBox22,comboBox23;
	JComboBox<String> comboBox24,comboBox25,comboBox26,comboBox27,comboBox28,comboBox29,comboBox30,comboBox31,comboBox32,comboBox33,comboBox34;
	
	JFrame frame;
	ArrayList<Boolean> kanBagisFormu=new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public  ArrayList<Boolean> newScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	ReportPage window = new ReportPage();
					//window.
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return kanBagisFormu;
	}
	
	public  ArrayList<Boolean> newScreen(ArrayList<Boolean> kanBagisFormu){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					try {
					ArrayList<Integer> kanBagisFormuInt=new ArrayList<>();	
					ReportPage window = new ReportPage();					
					for(int i=0 ; i<kanBagisFormu.size();i++) {
						if(kanBagisFormu.get(i) == false)
							kanBagisFormuInt.add(i,1);
						else
							kanBagisFormuInt.add(i,0);
					}
					
					System.out.println("Report Page"+kanBagisFormu.toString());
					System.out.println("Report Page"+kanBagisFormuInt.toString());
					
					window.comboBox1.setSelectedIndex(kanBagisFormuInt.get(0));
					window.comboBox2.setSelectedIndex(kanBagisFormuInt.get(1));
					window.comboBox3.setSelectedIndex(kanBagisFormuInt.get(2));
					window.comboBox4.setSelectedIndex(kanBagisFormuInt.get(3));
					window.comboBox5.setSelectedIndex(kanBagisFormuInt.get(4));
					window.comboBox6.setSelectedIndex(kanBagisFormuInt.get(5));
					window.comboBox7.setSelectedIndex(kanBagisFormuInt.get(6));
					
					window.comboBox8.setSelectedIndex(kanBagisFormuInt.get(7));
					window.comboBox9.setSelectedIndex(kanBagisFormuInt.get(8));
					window.comboBox10.setSelectedIndex(kanBagisFormuInt.get(9));
					window.comboBox11.setSelectedIndex(kanBagisFormuInt.get(10));
					window.comboBox12.setSelectedIndex(kanBagisFormuInt.get(11));
					window.comboBox13.setSelectedIndex(kanBagisFormuInt.get(12));
					window.comboBox14.setSelectedIndex(kanBagisFormuInt.get(13));
					
					window.comboBox15.setSelectedIndex(kanBagisFormuInt.get(14));
					window.comboBox16.setSelectedIndex(kanBagisFormuInt.get(15));
					window.comboBox17.setSelectedIndex(kanBagisFormuInt.get(16));
					window.comboBox18.setSelectedIndex(kanBagisFormuInt.get(17));
					window.comboBox19.setSelectedIndex(kanBagisFormuInt.get(18));
					window.comboBox20.setSelectedIndex(kanBagisFormuInt.get(19));
					window.comboBox21.setSelectedIndex(kanBagisFormuInt.get(20));
					
					window.comboBox22.setSelectedIndex(kanBagisFormuInt.get(21));
					window.comboBox23.setSelectedIndex(kanBagisFormuInt.get(22));
					window.comboBox24.setSelectedIndex(kanBagisFormuInt.get(23));
					window.comboBox25.setSelectedIndex(kanBagisFormuInt.get(24));
					window.comboBox26.setSelectedIndex(kanBagisFormuInt.get(25));
					window.comboBox27.setSelectedIndex(kanBagisFormuInt.get(26));
					window.comboBox28.setSelectedIndex(kanBagisFormuInt.get(27));
					
					window.comboBox29.setSelectedIndex(kanBagisFormuInt.get(28));
					window.comboBox30.setSelectedIndex(kanBagisFormuInt.get(29));
					window.comboBox31.setSelectedIndex(kanBagisFormuInt.get(30));
					window.comboBox32.setSelectedIndex(kanBagisFormuInt.get(31));
					window.comboBox33.setSelectedIndex(kanBagisFormuInt.get(32));
					window.comboBox34.setSelectedIndex(kanBagisFormuInt.get(33));
					
					if(comboBox1.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox2.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox3.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox4.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox5.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox6.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox7.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox8.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox9.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox10.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox11.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox12.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox13.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox14.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox15.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox16.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox17.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox18.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox19.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox20.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox21.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox22.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox23.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox24.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox25.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox26.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox27.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox28.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox29.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox30.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox31.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox32.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox33.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
					
					if(comboBox34.getSelectedIndex()==0) 
						kanBagisFormu.add(true);
					else
						kanBagisFormu.add(false);
			
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("new screen2"+kanBagisFormu.toString());
		return kanBagisFormu;
	}

	/**
	 * Create the application.
	 */
	public ReportPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("KAN BA\u011EI\u015E\u00C7ISI SORGULAMA FORMU ");
		lblNewLabel.setBounds(486, 4, 326, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel NewLabel_1 = new JLabel("1-Kendinizi sa\u011Fl\u0131ks\u0131z/halsiz/bitkin hissediyor musunuz?");
		NewLabel_1.setBounds(8, 40, 448, 11);
		NewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_2 = new JLabel("2-Daha \u00F6nce yapt\u0131\u011F\u0131n\u0131z bir kan ba\u011F\u0131\u015F\u0131 m\u00FCracaat\u0131 herhangi bir nedenle geri \u00E7evrildi mi?");
		NewLabel_2.setBounds(8, 59, 448, 11);
		NewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_3 = new JLabel("3-Prostat b\u00FCy\u00FCmesi, sivilce, sedef hastal\u0131\u011F\u0131 veya kellik i\u00E7in herhangi bir ila\u00E7 kullan\u0131yor?");
		NewLabel_3.setBounds(8, 78, 448, 11);
		NewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_4 = new JLabel("4-Herhangi bir enfeksiyon hastal\u0131\u011F\u0131 i\u00E7in ila\u00E7 (Antibiyotik, Ate\u015F d\u00FC\u015F\u00FCr\u00FCc\u00FC gibi) ald\u0131n\u0131z m\u0131?");
		NewLabel_4.setBounds(8, 97, 448, 11);
		NewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_5 = new JLabel("5-Son 5 g\u00FCn i\u00E7inde aspirin, herhangi bir a\u011Fr\u0131 kesici veya romatizma ilac\u0131 ald\u0131n\u0131z m\u0131?");
		NewLabel_5.setBounds(8, 116, 448, 14);
		NewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_6 = new JLabel("6-Allerjik reaksiyon ge\u00E7irdiniz mi, buna y\u00F6nelik tedavi ald\u0131n\u0131z m\u0131?");
		NewLabel_6.setBounds(8, 138, 448, 14);
		NewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_7 = new JLabel("7-Son 12 ay i\u00E7inde di\u015F tedavisi oldunuz mu?");
		NewLabel_7.setBounds(8, 160, 448, 11);
		NewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_8 = new JLabel("8-Son 1 hafta i\u00E7inde ishal (Diare) oldunuz mu?");
		NewLabel_8.setBounds(8, 179, 448, 11);
		NewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_9 = new JLabel("9-Son 1 ay i\u00E7inde herhangi bir a\u015F\u0131 oldunuz mu?");
		NewLabel_9.setBounds(8, 198, 448, 11);
		NewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_10 = new JLabel("10-Kad\u0131nlar i\u00E7in;  hamilelik ge\u00E7irdiniz mi veya \u015Fuan hamile misiniz?(Erkekler bu kutuyu bo\u015F b\u0131rakacakt\u0131r)");
		NewLabel_10.setBounds(8, 217, 502, 14);
		NewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_11 = new JLabel("11-Kronik (M\u00FCzmin) bir hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_11.setBounds(8, 239, 448, 11);
		NewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_12 = new JLabel("12-Frengi (Sifiliz) veya bel so\u011Fuklu\u011Fu (Gonore) nedeni ile tedavi oldunuz mu?");
		NewLabel_12.setBounds(8, 258, 448, 11);
		NewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_13 = new JLabel("13-AIDS hastal\u0131\u011F\u0131n\u0131z var m\u0131, kendiniz de b\u00F6yle bir hastal\u0131k oldu\u011Funa dair bir \u015F\u00FCpheniz var?");
		NewLabel_13.setBounds(8, 277, 448, 11);
		NewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_14 = new JLabel("14-AIDS hastas\u0131 oldu\u011Funu bildi\u011Finiz biri ile cinsel ili\u015Fkiniz oldu mu?");
		NewLabel_14.setBounds(8, 296, 448, 11);
		NewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_15 = new JLabel("15-Kan ve kan \u00FCr\u00FCn\u00FC alan, diyalize giren veya hemofili hastas\u0131 biri ile cinsel ili\u015Fkiniz oldu?");
		NewLabel_15.setBounds(8, 315, 448, 14);
		NewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_16 = new JLabel("16-Hi\u00E7 uyu\u015Fturucu kulland\u0131n\u0131z m\u0131?");
		NewLabel_16.setBounds(8, 337, 448, 11);
		NewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_17 = new JLabel("17-\u0130ns\u00FClin, b\u00FCy\u00FCme hormonu, imm\u00FCnglobulin, tamoksifen kulland\u0131n\u0131z m\u0131?");
		NewLabel_17.setBounds(8, 356, 448, 14);
		NewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_18 = new JLabel("18-Son 12 ay i\u00E7inde ameliyat veya endoskopik muayene oldunuz mu?");
		NewLabel_18.setBounds(655, 36, 448, 11);
		NewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_19 = new JLabel("19-Kalp-damar, akci\u011Fer, mide \u2013 ba\u011F\u0131rsak, b\u00F6brek hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_19.setBounds(655, 55, 448, 14);
		NewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_20 = new JLabel("20-Bug\u00FCne kadar hi\u00E7 n\u00F6bet, sara (Epilepsi) krizi veya fel\u00E7 ge\u00E7irdiniz mi?");
		NewLabel_20.setBounds(655, 77, 448, 11);
		NewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_21 = new JLabel("21-Bug\u00FCne kadar hi\u00E7 kanser tan\u0131s\u0131 ald\u0131n\u0131z m\u0131, kanser tedavisi g\u00F6rd\u00FCn\u00FCz m\u00FC?");
		NewLabel_21.setBounds(655, 96, 448, 11);
		NewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_22 = new JLabel("22-\u015Eeker hastal\u0131\u011F\u0131n\u0131z ya da yayg\u0131n romatizmal bir hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_22.setBounds(655, 115, 448, 11);
		NewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_23 = new JLabel("23-Kanamal\u0131 bir hastal\u0131k veya kan hastal\u0131\u011F\u0131n\u0131z var m\u0131?");
		NewLabel_23.setBounds(655, 134, 448, 14);
		NewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_24 = new JLabel("24-S\u0131tma (malarya), Verem (t\u00FCberk\u00FCloz), Malta hummas\u0131 (peynir hastal\u0131\u011F\u0131, brucella),");
		NewLabel_24.setBounds(655, 156, 448, 11);
		NewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_5 = new JLabel("Kemik iltihab\u0131 (osteomyelit) veya Kara humma (kala\u2013azar) ge\u00E7irdiniz mi?");
		lblNewLabel_5.setBounds(655, 175, 448, 11);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_25 = new JLabel("25-Hepatit (Sar\u0131l\u0131k) olan biriyle ayn\u0131 evde ya\u015F\u0131yor musunuz veya cinsel ili\u015Fkiniz oldu mu?");
		NewLabel_25.setBounds(655, 194, 448, 11);
		NewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_26 = new JLabel("26-Toksoplazma ge\u00E7irdiniz mi?");
		NewLabel_26.setBounds(655, 213, 448, 11);
		NewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_27 = new JLabel("27-Kamerun, Orta Afrika, \u00C7ad, Kongo, Ekvatoryal Gine, Gabon, Nijer ya da Nijerya\u2019da hi\u00E7 bulundunuz mu?");
		NewLabel_27.setBounds(655, 232, 513, 11);
		NewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_28 = new JLabel("28-Son 3 y\u0131l i\u00E7inde yukar\u0131daki \u00FClkeler d\u0131\u015F\u0131nda ba\u015Fka \u00FClkelerde bulundunuz mu?");
		NewLabel_28.setBounds(655, 251, 448, 14);
		NewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_29 = new JLabel("29-Ailenizde Deli Dana Hastal\u0131\u011F\u0131 (Creutzfeldt \u2013 Jacob Hastal\u0131\u011F\u0131) olan birisi oldu mu?");
		NewLabel_29.setBounds(655, 273, 448, 11);
		NewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_30 = new JLabel("30-Size dura mater (Beyin zar\u0131) veya kornea nakli yap\u0131ld\u0131 m\u0131?");
		NewLabel_30.setBounds(655, 292, 448, 11);
		NewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_31 = new JLabel("31-Son 12 ay i\u00E7inde size kan, doku veya organ nakli yap\u0131ld\u0131 m\u0131?");
		NewLabel_31.setBounds(655, 311, 448, 11);
		NewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_32 = new JLabel("32-Son 12 ay i\u00E7inde bir ba\u015Fkas\u0131n\u0131n kan\u0131 ile temas\u0131n\u0131z oldu mu?");
		NewLabel_32.setBounds(655, 330, 448, 14);
		NewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_33 = new JLabel("33-Son 12 ay i\u00E7inde hayvan \u0131s\u0131r\u0131\u011F\u0131 nedeni ile kuduz a\u015F\u0131s\u0131 oldunuz mu?");
		NewLabel_33.setBounds(655, 352, 448, 14);
		NewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_34 = new JLabel("34-Son 12 ay i\u00E7inde akupunktur, botoks, d\u00F6vme, hacamat,");
		NewLabel_34.setBounds(655, 374, 448, 11);
		NewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel NewLabel_34d = new JLabel("tak\u0131 i\u00E7in cilt deldirme, sa\u00E7 ekimi veya estetik m\u00FCdahaleler yapt\u0131rd\u0131n\u0131z m\u0131?");
		NewLabel_34d.setBounds(655, 393, 448, 14);
		NewLabel_34d.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		comboBox1 = new JComboBox<String>();
		comboBox1.setBounds(540, 38, 80, 15);
		comboBox1.addItem("Evet");
		comboBox1.addItem("Hayýr");
		
		comboBox2 = new JComboBox<String>();
		comboBox2.setModel(new DefaultComboBoxModel<String>(new String[] {"Evet", "Hay\u0131r"}));
		comboBox2.setBounds(540, 55, 80, 16);
		
		comboBox3 = new JComboBox<String>();
		comboBox3.setBounds(540, 75, 80, 15);
		comboBox3.addItem("Evet");
		comboBox3.addItem("Hayýr");
		
		comboBox4 = new JComboBox<String>();
		comboBox4.setBounds(540, 94, 80, 15);
		comboBox4.addItem("Evet");
		comboBox4.addItem("Hayýr");
		
		comboBox5 = new JComboBox<String>();
		comboBox5.setBounds(540, 115, 80, 15);
		comboBox5.addItem("Evet");
		comboBox5.addItem("Hayýr");
		
		comboBox6= new JComboBox<String>();
		comboBox6.setBounds(540, 137, 80, 15);
		comboBox6.addItem("Evet");
		comboBox6.addItem("Hayýr");
		
		comboBox7= new JComboBox<String>();
		comboBox7.setBounds(540, 157, 80, 15);
		comboBox7.addItem("Evet");
		comboBox7.addItem("Hayýr");
		
		comboBox8 = new JComboBox<String>();
		comboBox8.setBounds(540, 176, 80, 15);
		comboBox8.addItem("Evet");
		comboBox8.addItem("Hayýr");
		
		comboBox9 = new JComboBox<String>();
		comboBox9.setBounds(540, 195, 80, 15);
		comboBox9.addItem("Evet");
		comboBox9.addItem("Hayýr");
		
		comboBox10 = new JComboBox<String>();
		comboBox10.setBounds(540, 216, 80, 15);
		comboBox10.addItem("Evet");
		comboBox10.addItem("Hayýr");
		
		comboBox11 = new JComboBox<String>();
		comboBox11.setBounds(540, 236, 80, 15);
		comboBox11.addItem("Evet");
		comboBox11.addItem("Hayýr");
		
		comboBox12= new JComboBox<String>();
		comboBox12.setBounds(540, 255, 80, 15);
		comboBox12.addItem("Evet");
		comboBox12.addItem("Hayýr");
		
		comboBox13 = new JComboBox<String>();
		comboBox13.setBounds(540, 274, 80, 15);
		comboBox13.addItem("Evet");
		comboBox13.addItem("Hayýr");
		
		comboBox14 = new JComboBox<String>();
		comboBox14.setBounds(540, 293, 80, 15);
		comboBox14.addItem("Evet");
		comboBox14.addItem("Hayýr");
		
		comboBox15 = new JComboBox<String>();
		comboBox15.setBounds(540, 314, 80, 15);
		comboBox15.addItem("Evet");
		comboBox15.addItem("Hayýr");
		
		comboBox16 = new JComboBox<String>();
		comboBox16.setBounds(540, 334, 80, 15);
		comboBox16.addItem("Evet");
		comboBox16.addItem("Hayýr");
		
		comboBox17= new JComboBox<String>();
		comboBox17.setBounds(540, 355, 80, 15);
		comboBox17.addItem("Evet");
		comboBox17.addItem("Hayýr");
		
		comboBox18 = new JComboBox<String>();
		comboBox18.setBounds(1181, 35, 80, 15);
		comboBox18.addItem("Evet");
		comboBox18.addItem("Hayýr");
		
		comboBox19 = new JComboBox<String>();
		comboBox19.setBounds(1181, 56, 80, 15);
		comboBox19.addItem("Evet");
		comboBox19.addItem("Hayýr");
		
		comboBox20 = new JComboBox<String>();
		comboBox20.setBounds(1181, 76, 80, 15);
		comboBox20.addItem("Evet");
		comboBox20.addItem("Hayýr");
		
		comboBox21 = new JComboBox<String>();
		comboBox21.setBounds(1181, 95, 80, 15);
		comboBox21.addItem("Evet");
		comboBox21.addItem("Hayýr");
		
		comboBox22 = new JComboBox<String>();
		comboBox22.setBounds(1181, 114, 80, 15);
		comboBox22.addItem("Evet");
		comboBox22.addItem("Hayýr");
		
		comboBox23 = new JComboBox<String>();
		comboBox23.setBounds(1181, 135, 80, 15);
		comboBox23.addItem("Evet");
		comboBox23.addItem("Hayýr");

		
		comboBox24 = new JComboBox<String>();
		comboBox24.setBounds(1181, 155, 80, 15);
		comboBox24.addItem("Evet");
		comboBox24.addItem("Hayýr");
		
		comboBox25 = new JComboBox<String>();
		comboBox25.setBounds(1181, 193, 80, 15);
		comboBox25.addItem("Evet");
		comboBox25.addItem("Hayýr");
		
		comboBox26 = new JComboBox<String>();
		comboBox26.setBounds(1181, 212, 80, 15);
		comboBox26.addItem("Evet");
		comboBox26.addItem("Hayýr");
		
		comboBox27 = new JComboBox<String>();
		comboBox27.setBounds(1181, 231, 80, 15);
		comboBox27.addItem("Evet");
		comboBox27.addItem("Hayýr");
		
		comboBox28 = new JComboBox<String>();
		comboBox28.setBounds(1181, 252, 80, 15);
		comboBox28.addItem("Evet");
		comboBox28.addItem("Hayýr");
		
		comboBox29 = new JComboBox<String>();
		comboBox29.setBounds(1181, 272, 80, 15);
		comboBox29.addItem("Evet");
		comboBox29.addItem("Hayýr");
		
		comboBox30 = new JComboBox<String>();
		comboBox30.setBounds(1181, 291, 80, 15);
		comboBox30.addItem("Evet");
		comboBox30.addItem("Hayýr");
		
		comboBox31 = new JComboBox<String>();
		comboBox31.setBounds(1181, 310, 80, 15);
		comboBox31.addItem("Evet");
		comboBox31.addItem("Hayýr");
		
		comboBox32 = new JComboBox<String>();
		comboBox32.setBounds(1181, 331, 80, 15);
		comboBox32.addItem("Evet");
		comboBox32.addItem("Hayýr");
		
		comboBox33 = new JComboBox<String>();
		comboBox33.setBounds(1181, 353, 80, 15);
		comboBox33.addItem("Evet");
		comboBox33.addItem("Hayýr");
		
		comboBox34 = new JComboBox<String>();
		comboBox34.setBounds(1181, 374, 80, 15);
		comboBox34.addItem("Evet");
		comboBox34.addItem("Hayýr");
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(NewLabel_1);
		frame.getContentPane().add(NewLabel_2);
		frame.getContentPane().add(NewLabel_3);
		frame.getContentPane().add(NewLabel_4);
		frame.getContentPane().add(NewLabel_5);
		frame.getContentPane().add(NewLabel_6);
		frame.getContentPane().add(NewLabel_7);
		frame.getContentPane().add(NewLabel_8);
		frame.getContentPane().add(NewLabel_9);
		frame.getContentPane().add(NewLabel_10);
		frame.getContentPane().add(NewLabel_11);
		frame.getContentPane().add(NewLabel_12);
		frame.getContentPane().add(NewLabel_13);
		frame.getContentPane().add(NewLabel_14);
		frame.getContentPane().add(NewLabel_15);
		frame.getContentPane().add(NewLabel_16);
		frame.getContentPane().add(NewLabel_17);
		frame.getContentPane().add(NewLabel_18);
		frame.getContentPane().add(NewLabel_19);
		frame.getContentPane().add(NewLabel_20);
		frame.getContentPane().add(NewLabel_21);
		frame.getContentPane().add(NewLabel_22);
		frame.getContentPane().add(NewLabel_23);
		frame.getContentPane().add(NewLabel_24);
		frame.getContentPane().add(lblNewLabel_5);
		frame.getContentPane().add(NewLabel_25);
		frame.getContentPane().add(NewLabel_26);
		frame.getContentPane().add(NewLabel_27);
		frame.getContentPane().add(NewLabel_28);
		frame.getContentPane().add(NewLabel_29);
		frame.getContentPane().add(NewLabel_30);
		frame.getContentPane().add(NewLabel_31);
		frame.getContentPane().add(NewLabel_32);
		frame.getContentPane().add(NewLabel_33);
		frame.getContentPane().add(NewLabel_34);
		frame.getContentPane().add(NewLabel_34d);
		frame.getContentPane().add(comboBox1);
		frame.getContentPane().add(comboBox2);
		frame.getContentPane().add(comboBox3);
		frame.getContentPane().add(comboBox4);
		frame.getContentPane().add(comboBox5);
		frame.getContentPane().add(comboBox6);
		frame.getContentPane().add(comboBox7);
		frame.getContentPane().add(comboBox8);
		frame.getContentPane().add(comboBox9);
		frame.getContentPane().add(comboBox10);
		frame.getContentPane().add(comboBox11);
		frame.getContentPane().add(comboBox12);
		frame.getContentPane().add(comboBox13);
		frame.getContentPane().add(comboBox14);
		frame.getContentPane().add(comboBox15);
		frame.getContentPane().add(comboBox16);
		frame.getContentPane().add(comboBox17);
		frame.getContentPane().add(comboBox18);
		frame.getContentPane().add(comboBox19);
		frame.getContentPane().add(comboBox20);
		frame.getContentPane().add(comboBox21);
		frame.getContentPane().add(comboBox22);
		frame.getContentPane().add(comboBox23);
		frame.getContentPane().add(comboBox24);
		frame.getContentPane().add(comboBox25);
		frame.getContentPane().add(comboBox26);
		frame.getContentPane().add(comboBox27);
		frame.getContentPane().add(comboBox28);
		frame.getContentPane().add(comboBox29);
		frame.getContentPane().add(comboBox30);
		frame.getContentPane().add(comboBox31);
		frame.getContentPane().add(comboBox32);
		frame.getContentPane().add(comboBox33);
		frame.getContentPane().add(comboBox34);
		
		
		
		JButton Kaydet_Button = new JButton("De\u011Fi\u015Ftir/Kaydet");
		Kaydet_Button.setBounds(1089, 421, 172, 23);
		frame.getContentPane().add(Kaydet_Button);
		
		Kaydet_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox1.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox2.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox3.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox4.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox5.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox6.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox7.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox8.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox9.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox10.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox11.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox12.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox13.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox14.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox15.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox16.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox17.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox18.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox19.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox20.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox21.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox22.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox23.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox24.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox25.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox26.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox27.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox28.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox29.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox30.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox31.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox32.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox33.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				if(comboBox34.getSelectedIndex()==0) 
					kanBagisFormu.add(true);
				else
					kanBagisFormu.add(false);
				
				/*EnrollPage enrollPage=new EnrollPage();
				enrollPage.newScreen();
				*/
				
				System.out.println("Report Page Form Doldurulmasý "+kanBagisFormu.toString());
				frame.dispose();
			}
		});
	
	}
}
