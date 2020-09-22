package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.CustomerAccount;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount extends JFrame {
//create  obj.
	CustomerAccount obj_customerAccount = new CustomerAccount();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount frame = new CreateAccount();
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
	public CreateAccount() {
		setTitle("Lava Java Create Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 180, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");		
		Image image = new ImageIcon(this.getClass().getResource("/image12.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 530, 275, 183);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/image11.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image1));
		lblNewLabel_1.setBounds(0, 384, 275, 147);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(image2));
		lblNewLabel_2.setBounds(0, 219, 275, 164);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setBackground(new Color(165, 42, 42));
		lblCreateAccount.setForeground(new Color(255, 102, 153));
		lblCreateAccount.setOpaque(true);
		lblCreateAccount.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 24));
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setBounds(0, 0, 1370, 88);
		contentPane.add(lblCreateAccount);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(153, 0, 51));
		lblName.setFont(new Font("Calibri", Font.BOLD, 20));
		lblName.setBounds(567, 178, 96, 35);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(746, 175, 191, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(153, 0, 51));
		lblId.setFont(new Font("Calibri", Font.BOLD, 20));
		lblId.setBounds(567, 254, 96, 30);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(153, 0, 51));
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 20));
		lblPassword.setBounds(565, 324, 132, 32);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(746, 249, 191, 42);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(746, 320, 191, 42);
		contentPane.add(passwordField);

		JLabel lblAccountIsCreated = new JLabel("");
		lblAccountIsCreated.setForeground(new Color(153, 0, 51));
		lblAccountIsCreated.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblAccountIsCreated.setBounds(672, 626, 313, 28);
		contentPane.add(lblAccountIsCreated);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String checkId = textField_1.getText();
				char[] checkId1 = checkId.toCharArray();
				int i = 0;
				boolean create = false;
				while(i< checkId.length()) {
					System.out.println(checkId1[i]+"\n");
					if(checkId1[i] == 'm') {
						lblAccountIsCreated.setText("Account can not created for Manager");
						create = false;
						break;
					}
					else {
						create = true;
					}
					i++;
				}
				if(create == true) {
					boolean result = obj_customerAccount.checkAccount(textField_1.getText());
					if (result == false) {
						boolean result1 = obj_customerAccount.createAccount(textField.getText(), textField_1.getText(), passwordField.getText());
						System.out.println(result1);
						if(result1 == true) {
							lblAccountIsCreated.setText("Account created.");
						}
					}
					else {
						lblAccountIsCreated.setText("Account exist. Do you want to login account?");
					}
				}
			}
		});
		btnCreate.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCreate.setForeground(new Color(255, 204, 255));
		btnCreate.setBackground(new Color(102, 51, 51));
		btnCreate.setFont(new Font("Calibri", Font.BOLD, 20));
		btnCreate.setBounds(683, 454, 130, 50);
		contentPane.add(btnCreate);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				View obj_login = new View();
				obj_login.setVisible(true);
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 20));
		btnLogin.setForeground(new Color(255, 204, 255));
		btnLogin.setBackground(new Color(102, 51, 51));
		btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnLogin.setBounds(683, 530, 132, 50);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img8 = new ImageIcon(this.getClass().getResource("/5.PNG")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img8));
		lblNewLabel_3.setBounds(0, 11, 275, 213);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
