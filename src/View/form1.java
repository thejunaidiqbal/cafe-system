package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import Controller.CustomerAccount;
import Controller.Order;
import net.proteanit.sql.DbUtils;
import Controller.C_Menu;

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.sql.ResultSet;
import java.awt.event.AdjustmentEvent;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTable;

public class form1 extends JFrame {
	
	CustomerAccount obj_customerAccount = new CustomerAccount();
	C_Menu obj_Menu = new C_Menu();
	Order obj_Order = new Order();
	View obj_View = new View();
	
	private boolean menuCount = true;
	public String customerId;
	
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private String orderId;
	private String bill;
	private String time;
	private String recv_time;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					form1 frame = new form1();
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
	public form1() {
		
		setTitle("Lava Java Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 133, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 35));
		tabbedPane.setForeground(new Color(102, 0, 0));
		tabbedPane.setBackground(new Color(238, 232, 170));
		tabbedPane.setBounds(0, 43, 1370, 670);   // Size of tab
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 153));
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JTextPane txtpnAsARestaurant = new JTextPane();
		txtpnAsARestaurant.setBackground(new Color(255, 255, 224));
		txtpnAsARestaurant.setFont(new Font("Curlz MT", Font.BOLD, 22));
		txtpnAsARestaurant.setText("\r\nAs a cafe, we\u2019re proud to say we\u2019ve made some changes for you, our customers. Without you, there would be no us. So, we\u2019re making it our mission to be the best you want. One that\u2019s dedicated to improving the way we prepare our quality food and the ingredients that go into it. One that understands that what\u2019s good for you is good for us. That\u2019s why our food philosophy is this\u2014The Simpler The Better.");
		txtpnAsARestaurant.setBounds(136, 302, 728, 252);
		panel.add(txtpnAsARestaurant);
		
		JTextPane txtpnOurCommitmentTo = new JTextPane();
		txtpnOurCommitmentTo.setBackground(new Color(255, 255, 224));
		txtpnOurCommitmentTo.setFont(new Font("Calibri", Font.PLAIN, 24));
		txtpnOurCommitmentTo.setText("OUR COMMITMENT\r\n      TO QUALITY");
		txtpnOurCommitmentTo.setBounds(399, 215, 205, 76);
		panel.add(txtpnOurCommitmentTo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/Home Page_pic.PNG")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image3));
		lblNewLabel_1.setBounds(0, 0, 992, 198);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/1.PNG")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(img1));
		lblNewLabel_12.setBounds(991, 0, 374, 257);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/2.PNG")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(img2));
		lblNewLabel_13.setBounds(991, 248, 374, 358);
		panel.add(lblNewLabel_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		tabbedPane.addTab("Feedback", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblIfYouHave = new JLabel("If you have any problem in ordering the food or with the quality of food, then comment it. We will try to resolve the issue.");
		lblIfYouHave.setForeground(Color.BLACK);
		lblIfYouHave.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblIfYouHave.setBounds(31, 162, 1113, 25);
		panel_2.add(lblIfYouHave);
		
		JLabel lblNewLabel = new JLabel("Comment");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblNewLabel.setBounds(31, 217, 183, 25);
		panel_2.add(lblNewLabel);
		
		JLabel lblFeedback = new JLabel("Feedback");
		lblFeedback.setBackground(Color.BLACK);
		lblFeedback.setForeground(Color.BLACK);
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setFont(new Font("Calibri", Font.BOLD, 30));
		lblFeedback.setBounds(590, 41, 183, 43);
		panel_2.add(lblFeedback);
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		JLabel lblNewLabel_7 = new JLabel("");
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean result  = obj_customerAccount.giveFeedback(textPane.getText(), obj_View.customerId);
				if(result = true) {
					lblNewLabel_7.setText("Feedback submitted");
				}
			}
		});
		btnSubmit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Calibri", Font.BOLD, 21));
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setBounds(622, 406, 128, 51);
		panel_2.add(btnSubmit);
		
		textPane.setBounds(62, 253, 1235, 113);
		panel_2.add(textPane);
		
		
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(567, 488, 257, 33);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(238, 232, 170));
		tabbedPane.addTab("Settings", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setBackground(Color.BLACK);
		lblSettings.setForeground(Color.BLACK);
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setFont(new Font("Calibri", Font.BOLD, 30));
		lblSettings.setBounds(606, 44, 131, 49);
		panel_1.add(lblSettings);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setForeground(Color.BLACK);
		lblChangePassword.setFont(new Font("Calibri", Font.BOLD, 24));
		lblChangePassword.setBounds(214, 110, 234, 32);
		panel_1.add(lblChangePassword);

		JLabel lblNotePasswordMust = new JLabel("");
		lblNotePasswordMust.setForeground(Color.BLACK);
		lblNotePasswordMust.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNotePasswordMust.setBounds(540, 506, 376, 32);
		panel_1.add(lblNotePasswordMust);
		
		JButton btnEdit = new JButton("Save");
		btnEdit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(passwordField_1.getText().equals(passwordField_2.getText())) {
					boolean result = obj_customerAccount.editSettings(passwordField_1.getText(), obj_View.customerId);
					if(result == true) {
						lblNotePasswordMust.setText("Save Settings");
					}
				}
				else {
					lblNotePasswordMust.setText("Password doesnot match"); 
				}
			}
		});
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBackground(Color.BLACK);
		btnEdit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnEdit.setFont(new Font("Calibri", Font.BOLD, 20));
		btnEdit.setBounds(623, 421, 114, 49);
		panel_1.add(btnEdit);
		
		JLabel lblCurrentPassword = new JLabel("Current Password");
		lblCurrentPassword.setForeground(Color.BLACK);
		lblCurrentPassword.setBackground(Color.BLACK);
		lblCurrentPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCurrentPassword.setBounds(356, 175, 163, 26);
		panel_1.add(lblCurrentPassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setForeground(Color.BLACK);
		lblNewPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewPassword.setBounds(356, 249, 148, 28);
		panel_1.add(lblNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(Color.BLACK);
		lblConfirmPassword.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblConfirmPassword.setBounds(356, 323, 148, 28);
		panel_1.add(lblConfirmPassword);
		///////////////////////////////////////////
		
		passwordField = new JPasswordField();
		passwordField.setBounds(568, 175, 206, 41);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(568, 249, 206, 41);
		panel_1.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(568, 323, 206, 41);
		panel_1.add(passwordField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 204, 153));
		tabbedPane.addTab("Menu", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setForeground(Color.BLACK);
		lblMenu.setFont(new Font("Calibri", Font.BOLD, 30));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(624, 26, 111, 46);
		panel_4.add(lblMenu);
		
		JTextPane txtpnMeals = new JTextPane();
		txtpnMeals.setForeground(Color.BLACK);
		txtpnMeals.setBackground(new Color(255, 255, 224));
		txtpnMeals.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnMeals.setText("\r\n* Meals\r\n* Junk Food\r\n* Snacks\r\n* Beverages\r\n* Dessert");
		txtpnMeals.setBounds(193, 75, 966, 199);
		panel_4.add(txtpnMeals);
		
		JButton btnViewFullMenu = new JButton("View full menu");
		btnViewFullMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Menu obj_menu = new Menu();
				obj_menu.setVisible(true);
				//obj_menu.customerId = customerId;
			}
		});
		btnViewFullMenu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnViewFullMenu.setBackground(Color.BLACK);
		btnViewFullMenu.setForeground(Color.WHITE);
		btnViewFullMenu.setFont(new Font("Calibri", Font.BOLD, 22));
		btnViewFullMenu.setBounds(597, 305, 169, 61);
		panel_4.add(btnViewFullMenu);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Fast\\Desktop\\Capture1.png"));
		Image img3 = new ImageIcon(this.getClass().getResource("/16.jpg")).getImage();
		lblNewLabel_8.setIcon(new ImageIcon(img3));
		lblNewLabel_8.setBounds(-12, 423, 812, 196);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_14 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/vegetais-ajustados-a-esquerda-de-uma-ardosia-preta_1220-685.jpg")).getImage();
		lblNewLabel_14.setIcon(new ImageIcon(img4));
		lblNewLabel_14.setBounds(422, 423, 626, 183);
		panel_4.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/4.PNG")).getImage();
		lblNewLabel_15.setIcon(new ImageIcon(img5));
		lblNewLabel_15.setBounds(1045, 393, 320, 239);
		panel_4.add(lblNewLabel_15);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 0, 0));
		tabbedPane.addTab("Info", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblYouCanContact = new JLabel("You can contact us on our contact No.");
		lblYouCanContact.setForeground(Color.WHITE);
		lblYouCanContact.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblYouCanContact.setBounds(61, 105, 422, 39);
		panel_3.add(lblYouCanContact);
		
		JLabel label = new JLabel("0123-4567890");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Calibri", Font.PLAIN, 20));
		label.setBounds(61, 155, 422, 39);
		panel_3.add(label);
		
		JLabel lblTimingsam = new JLabel("Timings: 9:00AM - 5:00PM");
		lblTimingsam.setForeground(Color.WHITE);
		lblTimingsam.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblTimingsam.setBounds(61, 205, 422, 39);
		panel_3.add(lblTimingsam);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setForeground(Color.WHITE);
		lblInfo.setFont(new Font("Calibri", Font.BOLD, 23));
		lblInfo.setBounds(602, 24, 89, 39);
		panel_3.add(lblInfo);
		
		JLabel lblProfiles = new JLabel("Profiles:");
		lblProfiles.setForeground(Color.WHITE);
		lblProfiles.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblProfiles.setBounds(61, 271, 102, 32);
		panel_3.add(lblProfiles);
		
		JLabel lblTwitter = new JLabel("Facebook         Instagram             Youtube            ");
		lblTwitter.setForeground(Color.WHITE);
		lblTwitter.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblTwitter.setBounds(59, 450, 554, 44);
		panel_3.add(lblTwitter);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/facebook.PNG")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(image));
		lblNewLabel_2.setBounds(65, 400, 46, 39);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/Instagram.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image1));
		lblNewLabel_3.setBounds(175, 400, 51, 39);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/Youtube.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(image2));
		lblNewLabel_4.setBounds(292, 400, 53, 39);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblYouCanContact_1 = new JLabel("You can contact us on these");
		lblYouCanContact_1.setForeground(Color.WHITE);
		lblYouCanContact_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblYouCanContact_1.setBounds(61, 325, 449, 32);
		panel_3.add(lblYouCanContact_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 204, 102));
		tabbedPane.addTab("View Bill", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Bill");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel_5.setBounds(599, 27, 122, 51);
		panel_5.add(lblNewLabel_5);
		
		
		// -------------------------------------------------------------------
		// View Bill
		// -------------------------------------------------------------------
		//System.out.println("qwertty: "+ obj_View.customerId);
	//	System.out.println("qwerty: "+ customerId);
		
		//ResultSet rs = obj_Order.viewBill(obj_View.customerId);
		/*try {
			while(rs.next()) {
				orderId = rs.getString("Order_ID");
				bill = rs.getString("Bill");
				time = rs.getString("Ordering_Time");
				recv_time = rs.getString("Recieving_Time");
			}
		
		}catch(Exception e) {System.out.println(e);}
		
		JLabel lblOrderId = new JLabel("Your Order ID is " + orderId);
		JLabel lblT = new JLabel("Your Bill is " + bill);
		JLabel lblNewLabel_11 = new JLabel("Order Time: " + time );
		JLabel lblRecievingTime = new JLabel("You can receive your order after " + recv_time + " minutes");		
		*/
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setRowHeight(25);
		JTableHeader obj = table.getTableHeader();
		obj.setFont(new Font("Calibri",Font.BOLD,22));
		ResultSet rs = obj_Order.viewBill(obj_View.customerId);
		
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
	/*	
		lblT.setForeground(new Color(0, 0, 0));
		lblT.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblT.setBounds(10, 48, 418, 30);
		panel_5.add(lblT);
		
		
		lblRecievingTime.setForeground(new Color(0, 0, 0));
		lblRecievingTime.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblRecievingTime.setBounds(10, 100, 418, 30);
		panel_5.add(lblRecievingTime);*/		
		JLabel lblNewLabel_9 = new JLabel("");
		Image img6 = new ImageIcon(this.getClass().getResource("/1.PNG")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img6));
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Fast\\Desktop\\Capture1.png"));
		lblNewLabel_9.setBounds(51, 349, 1205, 246);
		panel_5.add(lblNewLabel_9);
		
		
	/*	lblOrderId.setForeground(new Color(0, 0, 0));
		lblOrderId.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblOrderId.setBounds(10, 27, 418, 30);
		panel_5.add(lblOrderId);
		
		
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(0, 68, 340, 33);
		panel_5.add(lblNewLabel_11);
		*/
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 162, 669, 305);
		panel_5.add(scrollPane);
		
		
		scrollPane.setViewportView(table);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBackground(Color.BLACK);
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Calibri", Font.BOLD, 22));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				View obj_cafe1 = new View();
				obj_cafe1.setVisible(true);
				
				/*Cafe obj_cafe = new Cafe();
				obj_cafe.setVisible(false);
				dispose();
				CreateAccount obj_CreateAccount = new CreateAccount();
				obj_CreateAccount.setVisible(false);
				dispose();*/
				/*form1 obj_form1 = new form1();
				obj_form1.setVisible(false);
				dispose();*/
				/*Manager_Account obj_ManagerAccount = new Manager_Account();
				obj_ManagerAccount.setVisible(false);
				dispose();*/
			/*	Menu obj_menu = new Menu();
				obj_menu.setVisible(false);
				dispose();*/
				/*SubmitOrder obj_submitOrder = new SubmitOrder(null);
				obj_submitOrder.setVisible(false);
				dispose();*/
				
			}
		});
		btnLogOut.setBounds(1238, 0, 116, 42);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel_16 = new JLabel("Lava Java Cafe");
		lblNewLabel_16.setForeground(new Color(0, 0, 0));
		lblNewLabel_16.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 38));
		lblNewLabel_16.setBounds(527, 0, 414, 42);
		contentPane.add(lblNewLabel_16);
		
		JButton button_1 = new JButton("Exit");
		button_1.setBounds(1124, 0, 104, 42);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Calibri", Font.BOLD, 22));
		button_1.setBackground(Color.BLACK);
		
		//JScrollPane scrl = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//tabbedPane.add(scrl);
	}
}
