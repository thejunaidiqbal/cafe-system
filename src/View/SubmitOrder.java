package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Customer;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class SubmitOrder extends JFrame {

	private JPanel contentPane;
	private String orderId;
	private int bill;
	private String recv_time;
	private String time;
	public String customerId;
	View obj_View = new View();
	Customer obj_Customer = new Customer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubmitOrder frame = new SubmitOrder(null);
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
	public SubmitOrder(ResultSet rs) {
		try {
			while(rs.next()) {
				orderId = rs.getString("Order_ID");
				bill = rs.getInt("Bill");
				time = rs.getString("Ordering_time");
				recv_time = rs.getString("Recieving_Time");
				//System.out.println("Order id: " + orderId);
				//System.out.println("Bill: " + bill);
			}
		}catch(Exception e) {System.out.println(e);}
		
		JLabel lblNewLabel_3 = new JLabel("Your Order Id is " + orderId);
		JLabel lblTotalPrice = new JLabel("Your total Bill is " + bill);
		JLabel lblNewLabel_4 = new JLabel("Order Time: " + time);
		JLabel lblNewLabel_2 = new JLabel("You can take your order after "+ recv_time + " minutes");
		
		
		
		setTitle("Order Submitted");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bill");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel.setBounds(165, 152, 75, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblRateUs = new JLabel("Rate Us");
		lblRateUs.setFont(new Font("Calibri", Font.BOLD, 22));
		lblRateUs.setBounds(922, 158, 131, 29);
		contentPane.add(lblRateUs);
		
		JLabel lblNewLabel_1 = new JLabel("Order Submitted :)");
		lblNewLabel_1.setForeground(new Color(102, 0, 0));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel_1.setBounds(329, 91, 300, 67);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Excellent");
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 22));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 204));
		rdbtnNewRadioButton.setBounds(922, 240, 124, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPoor = new JRadioButton("Poor");
		rdbtnPoor.setFont(new Font("Calibri", Font.PLAIN, 22));
		rdbtnPoor.setBackground(new Color(255, 255, 204));
		rdbtnPoor.setBounds(922, 373, 124, 23);
		contentPane.add(rdbtnPoor);
		
		JRadioButton rdbtnGood = new JRadioButton("Good");
		rdbtnGood.setFont(new Font("Calibri", Font.PLAIN, 22));
		rdbtnGood.setBackground(new Color(255, 255, 204));
		rdbtnGood.setBounds(922, 283, 124, 23);
		contentPane.add(rdbtnGood);
		
		JRadioButton rdbtnFair = new JRadioButton("Fair");
		rdbtnFair.setFont(new Font("Calibri", Font.PLAIN, 22));
		rdbtnFair.setBackground(new Color(255, 255, 204));
		rdbtnFair.setBounds(922, 327, 124, 26);
		contentPane.add(rdbtnFair);
		
		
		lblTotalPrice.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblTotalPrice.setBounds(165, 279, 365, 29);
		contentPane.add(lblTotalPrice);
		
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(163, 373, 399, 36);
		contentPane.add(lblNewLabel_2);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setFont(new Font("Calibri", Font.BOLD, 22));
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setBackground(Color.BLACK);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Menu obj_menu = new Menu();
				obj_menu.setVisible(true);
			}
		});
		btnMenu.setBounds(309, 513, 109, 47);
		contentPane.add(btnMenu);
		dispose();
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Calibri", Font.BOLD, 22));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBackground(Color.BLACK);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				form1 obj_customerAccount = new form1();
				obj_customerAccount.setVisible(true);
				obj_customerAccount.customerId = customerId;
			}
		});
		btnHome.setBounds(165, 513, 109, 47);
		contentPane.add(btnHome);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(453, 513, 109, 47);
		contentPane.add(btnNewButton);
		
		JButton btnDone = new JButton("Done");
		btnDone.setForeground(Color.WHITE);
		btnDone.setBackground(Color.BLACK);
		btnDone.setFont(new Font("Calibri", Font.BOLD, 20));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String rate ="";
				if(rdbtnNewRadioButton.isSelected()){
					rate = rdbtnNewRadioButton.getActionCommand();
				}
				else if(rdbtnGood.isSelected()) {
					rate = rdbtnGood.getActionCommand();
				}
				else if(rdbtnFair.isSelected()) {
					rate = rdbtnFair.getActionCommand();
				}
				else if(rdbtnPoor.isSelected()) {
					rate = rdbtnPoor.getActionCommand();
				}
				obj_Customer.rateService(obj_View.customerId, rate);
			}
		});
		btnDone.setBounds(922, 439, 102, 41);
		contentPane.add(btnDone);
		
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(165, 222, 366, 29);
		contentPane.add(lblNewLabel_3);
		
		
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(165, 327, 278, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Lava Java Cafe");
		lblNewLabel_5.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 44));
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBounds(463, 11, 432, 59);
		contentPane.add(lblNewLabel_5);
	}
}
