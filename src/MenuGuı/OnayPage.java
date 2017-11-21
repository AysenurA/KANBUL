package MenuGuý;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OnayPage {
    
	private JFrame frame;
	private JTextField Onay_textField;
	public static boolean openDonorPage;
	public static boolean openKizilayPage;
	OnayPage window;



	/**
	 * Launch the application.
	 */
	public  void newScreen(String message,boolean donorPage,boolean kizilayPage) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					window=new OnayPage();
					window.Onay_textField.setText(message);
					window.frame.setVisible(true);
					window.openDonorPage=false;
					window.openKizilayPage=false;
					
					if(donorPage==true){
						window.openDonorPage=true;
					}
													
					if(kizilayPage==true){
						window.openKizilayPage=true;
					}
					
					System.out.println(donorPage +" orasý"+  kizilayPage);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public OnayPage() {
		initialize();
	}

	/*
	   Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 382, 177);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Geri_Button = new JButton("Tamam");
		Geri_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(window.openDonorPage +" burasý "+  window.openKizilayPage);

				
				if(window.openDonorPage==true){
					DonorPage dp = new DonorPage();
					dp.newScreen();
					System.out.println("donorpage");
				}
				
				if(window.openKizilayPage==true){
					KizilayPage kp = new KizilayPage();
					kp.newScreen();
					System.out.println("kizilaypage");

				}
				
				openDonorPage=false;
				openKizilayPage=false;
				
				frame.dispose();
			}
		});
		Geri_Button.setBounds(271, 105, 85, 23);
		frame.getContentPane().add(Geri_Button);
		
		Onay_textField = new JTextField();
		Onay_textField.setBackground(SystemColor.menu);
		Onay_textField.setBounds(10, 40, 346, 35);
		frame.getContentPane().add(Onay_textField);
		Onay_textField.setColumns(10);
	}
}
