package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import Controller.CustomerAccount;
import Controller.ManagerAccount;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class View extends JFrame {
	
	ManagerAccount obj_ManagerAccount = new ManagerAccount();
	CustomerAccount obj_CustomerAccount = new CustomerAccount();
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public static String customerId = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setTitle("Lava Java Cafe Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/about-img.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(34, 11, 411, 476);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
		label.setIcon(new ImageIcon(image1));
		label.setBounds(0, 559, 350, 144);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
		label_1.setIcon(new ImageIcon(image2));
		label_1.setBounds(341, 559, 361, 144);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image3));
		lblNewLabel_1.setBounds(683, 559, 350, 144);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Calibri", Font.BOLD, 22));
		lblId.setBounds(718, 130, 125, 28);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(892, 127, 188, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 22));
		lblPassword.setBounds(718, 195, 125, 28);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(153, 102, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(837, 464, 178, 23);
		contentPane.add(lblNewLabel_2);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("m_001")) {
					boolean result = obj_ManagerAccount.login(textField.getText(), passwordField.getText());
					if(result == true) {
						dispose();
						Manager_Account manager_Account_view = new Manager_Account();
						manager_Account_view.setVisible(true);
					}
					else {
						lblNewLabel_2.setText("Login failed");
					}
				}
				else {
					boolean result = obj_CustomerAccount.checkAccount(textField.getText());
					if(result == false) {
						lblNewLabel_2.setText("Account not exist");
					}
					else {
						boolean result1 = obj_CustomerAccount.login(textField.getText(), passwordField.getText());
						if(result1 == true) {
							lblNewLabel_2.setText("Login Successful");
							customerId = textField.getText();  // get login customer id
							
							//System.out.println("Login Customer ID: " + customerId);
							dispose();
							form1 obj_form1 = new form1();
							obj_form1.setVisible(true);
							obj_form1.customerId = customerId;
							//System.out.println("Login customer id go to form1 customer id: "+ customerId);
						}
						else {
							lblNewLabel_2.setText("Login failed");
						}
					}
				}
			}
		});
		btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.BLACK);
		//btnLogi//Image image4 = new ImageIcon(this.getClass().getResource("/Ok-icon.png")).getImage();
		//btnLogin.setIcon(new ImageIcon(image4));
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 20));
		btnLogin.setBounds(844, 273, 159, 53);
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
		btnCreateAccount.setBackground(Color.BLACK);
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setFont(new Font("Calibri", Font.BOLD, 20));
		btnCreateAccount.setBounds(844, 371, 159, 60);
		contentPane.add(btnCreateAccount);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(892, 192, 188, 39);
		contentPane.add(passwordField);
		
		JLabel label_2 = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
		label_2.setIcon(new ImageIcon(img9));
		label_2.setBounds(1025, 559, 367, 144);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lava Java Cafe");
		lblNewLabel_3.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 40));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(590, 11, 377, 53);
		contentPane.add(lblNewLabel_3);
	}
	
}
