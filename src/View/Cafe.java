package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cafe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe frame = new Cafe();					
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cafe() {
		setTitle("Lava Java Cafe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Image image = new ImageIcon(this.getClass().getResource("/map2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(1056, 419, 314, 284);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lava Java Cafe");
		lblNewLabel_1.setBorder(new CompoundBorder());
		lblNewLabel_1.setBackground(new Color(165, 42, 42));
		lblNewLabel_1.setForeground(new Color(250, 250, 210));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 60));
		lblNewLabel_1.setBounds(0, 0, 1131, 210);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		Image image2 = new ImageIcon(this.getClass().getResource("/image5.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image2));
		lblNewLabel_3.setBounds(1130, 0, 240, 210);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/image7.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(image3));
		lblNewLabel_4.setBounds(0, 192, 426, 526);
		contentPane.add(lblNewLabel_4);
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				View obj_login = new View();
				obj_login.setVisible(true);
				 
			}
		});
		btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 23));
		btnLogin.setBackground(new Color(153, 51, 51));
		btnLogin.setBounds(685, 322, 176, 70);
		contentPane.add(btnLogin);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAccount obj_createAccount = new CreateAccount();
				obj_createAccount.setVisible(true);
			}
		});
		btnCreateAccount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCreateAccount.setForeground(new Color(255, 255, 255));
		btnCreateAccount.setFont(new Font("Calibri", Font.BOLD, 23));
		btnCreateAccount.setBackground(new Color(153, 51, 51));
		btnCreateAccount.setBounds(685, 442, 176, 75);
		contentPane.add(btnCreateAccount);
	}
}
