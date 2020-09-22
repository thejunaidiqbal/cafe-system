package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset; 

import Controller.OrderList;
import Controller.Manager;
import Controller.ManagerAccount;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import net.proteanit.sql.DbUtils;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.CompoundBorder;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.sql.*;
import javax.swing.JToggleButton;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Manager_Account extends JFrame implements ActionListener,MouseListener{

	OrderList obj_orderList = new OrderList();
	ManagerAccount obj_ManagerAccount = new ManagerAccount();
	Manager obj_Manager = new Manager();
	private static boolean remove_count = true;
	
	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTable table;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_Account frame = new Manager_Account();
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
	public Manager_Account() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(128, 128, 128));
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 35));
		tabbedPane.setBounds(0, 58, 1370, 645);
		contentPane.add(tabbedPane);
		Image image = new ImageIcon(this.getClass().getResource("/Home Page_pic.PNG")).getImage();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(0, 0, 999, 210);
		panel.add(lblNewLabel_1);
		
		JTextPane txtpnOurCommitmentTo = new JTextPane();
		txtpnOurCommitmentTo.setFont(new Font("Calibri", Font.PLAIN, 24));
		txtpnOurCommitmentTo.setBackground(new Color(253, 245, 230));
		txtpnOurCommitmentTo.setText("OUR COMMITMENT\r\n      TO QUALITY");
		txtpnOurCommitmentTo.setBounds(375, 246, 205, 65);
		panel.add(txtpnOurCommitmentTo);
		
		JTextPane txtpnAsACafe = new JTextPane();
		txtpnAsACafe.setBackground(new Color(253, 245, 230));
		txtpnAsACafe.setFont(new Font("Curlz MT", Font.BOLD, 22));
		txtpnAsACafe.setText("\r\nAs a cafe, we\u2019re proud to say we\u2019ve made some changes for you, our customers. Without you, there would be no us. So, we\u2019re making it our mission to be the best you want. One that\u2019s dedicated to improving the way we prepare our quality food and the ingredients that go into it. One that understands that what\u2019s good for you is good for us. That\u2019s why our food philosophy is this\u2014The Simpler The Better.");
		txtpnAsACafe.setBounds(130, 322, 755, 221);
		panel.add(txtpnAsACafe);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/1.PNG")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(998, 0, 367, 252);
		panel.add(lblNewLabel_3);
		
		JLabel label_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/2.PNG")).getImage();
		label_1.setIcon(new ImageIcon(img2));
		label_1.setBounds(998, 246, 367, 356);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Settings", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.BLACK);
		lblSettings.setFont(new Font("Calibri", Font.BOLD, 29));
		lblSettings.setBounds(624, 48, 147, 41);
		panel_1.add(lblSettings);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setForeground(Color.BLACK);
		lblChangePassword.setFont(new Font("Calibri", Font.BOLD, 24));
		lblChangePassword.setBounds(176, 119, 191, 28);
		panel_1.add(lblChangePassword);
		
		JLabel lblCurrentPassword = new JLabel("Current Password");
		lblCurrentPassword.setForeground(Color.BLACK);
		lblCurrentPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCurrentPassword.setBounds(352, 188, 161, 28);
		panel_1.add(lblCurrentPassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setForeground(Color.BLACK);
		lblNewPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewPassword.setBounds(352, 256, 147, 28);
		panel_1.add(lblNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(604, 251, 206, 41);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(604, 179, 206, 41);
		panel_1.add(passwordField_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(Color.BLACK);
		lblConfirmPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblConfirmPassword.setBounds(352, 331, 161, 28);
		panel_1.add(lblConfirmPassword);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(604, 326, 206, 40);
		panel_1.add(passwordField_2);
		
		JLabel lblNotePasswordMust = new JLabel("");
		lblNotePasswordMust.setForeground(Color.BLACK);
		lblNotePasswordMust.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNotePasswordMust.setBounds(584, 504, 578, 28);
		panel_1.add(lblNotePasswordMust);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(passwordField.getText().equals(passwordField_2.getText())) {
					boolean result = obj_ManagerAccount.editSettings(passwordField.getText(), "");
					if(result == true) {
						lblNotePasswordMust.setText("Save Settings");
					}
				}
				else {
					lblNotePasswordMust.setText("Password doesnot match"); 
				}
			}
		});
		btnSave.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSave.setBackground(Color.DARK_GRAY);
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setFont(new Font("Calibri", Font.BOLD, 20));
		btnSave.setBounds(655, 416, 107, 49);
		panel_1.add(btnSave);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("View orders", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblOrdersList = new JLabel("Orders List");
		lblOrdersList.setBounds(599, 11, 193, 38);
		lblOrdersList.setForeground(Color.BLACK);
		lblOrdersList.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrdersList.setFont(new Font("Calibri", Font.BOLD, 28));
		panel_4.add(lblOrdersList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 168, 1164, 356);
		panel_4.add(scrollPane);
		
		
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					ResultSet rs = obj_orderList.viewOrderList();
					table.setModel(DbUtils.resultSetToTableModel(rs));
		}});
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setRowHeight(25);
		JTableHeader obj = table.getTableHeader();
		obj.setFont(new Font("Calibri",Font.BOLD,22));
		btnView.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnView.setBackground(Color.GRAY);
		btnView.setForeground(Color.WHITE);
		btnView.setFont(new Font("Calibri", Font.BOLD, 22));
		btnView.setBounds(98, 92, 109, 47);
		panel_4.add(btnView);
		
		JButton btnDelete = new JButton("Change Status");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// -----------------------------------------------------------------------------
				// Change status from pending to paid.
				// -----------------------------------------------------------------------------
				
				int row = table.getSelectedRow();
				String value_orderId = table.getValueAt(row, 0).toString();
				String bill_value = table.getValueAt(row, 2).toString();
				int value_bill = Integer.parseInt(bill_value);
				
				obj_orderList.ChangeOrder_Status(value_orderId, value_bill);
				
				int row1 = table.getSelectedRow();
				String orderID = table.getValueAt(row, 0).toString();
				
				DefaultTableModel model_1 = (DefaultTableModel)table.getModel();
				try{
					model_1.removeRow(row);
					
				}
				catch(Exception e){
					System.out.println(e);
				}
				
			}
		});
		btnDelete.setFont(new Font("Calibri", Font.BOLD, 22));
		btnDelete.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.GRAY);
		btnDelete.setBounds(217, 92, 166, 47);
		panel_4.add(btnDelete);
		
		JButton btnCancelOrder = new JButton("Cancel Order");
		btnCancelOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = table.getSelectedRow();
				String value_orderId = table.getValueAt(row, 0).toString();
				String bill_value = table.getValueAt(row, 2).toString();
				int value_bill = Integer.parseInt(bill_value);
				
				obj_orderList.CancelOrder(value_orderId, value_bill);
				obj_orderList.UpdateQuantity(value_orderId);
				
				int row1 = table.getSelectedRow();
				String orderID = table.getValueAt(row, 0).toString();
				
				DefaultTableModel model_1 = (DefaultTableModel)table.getModel();
				try{
					model_1.removeRow(row);
					
				}
				catch(Exception e){
					System.out.println(e);
				}
				
			}
		});
		btnCancelOrder.setForeground(Color.WHITE);
		btnCancelOrder.setFont(new Font("Calibri", Font.BOLD, 22));
		btnCancelOrder.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCancelOrder.setBackground(Color.GRAY);
		btnCancelOrder.setBounds(393, 92, 149, 47);
		panel_4.add(btnCancelOrder);
		//----------------------------------------------------- call view rate service ------------------------------------------------------
			ResultSet rateService = obj_ManagerAccount.checkRateService();
		    String valueExcellent = "", valueFair ="", valueGood = "", valuePoor = ""; 
			try {
				while(rateService.next()) {
					String value  = rateService.getString("rate");
					String value_count  = rateService.getString("count_rate");
					if(value == null){
						//do nothing
					}
					else if(value.equals("Excellent")) {
						valueExcellent = value_count; 
					}
					else if(value.equals("Fair")) {
						valueFair = value_count;
					}
					else if(value.equals("Good")) {
						valueGood = value_count;
					}
					else if(value.equals("Poor")) {
						valuePoor = value_count;
					}
				}
				if(valueExcellent.equals("")){
					valueExcellent = "0";
				}
				if(valueFair.equals("")) {
					valueFair = "0";
				}
				if(valueGood.equals("")) {
					valueGood = "0";
				}
				if(valuePoor.equals("")) {
					valuePoor = "0";
				}
			}catch(Exception e) {System.out.println(e);}
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("View Sales", null, panel_5, null);
		JPanel panel_6 = new JPanel();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		ResultSet rs = obj_Manager.viewSales();
		String sale = "";
		int time = 0;
		String time1 = "";
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		try {
		
			while(rs.next()) {
				sale = rs.getString("Sale");
				time++;
				time1 = Integer.toString(time);
				dataset.setValue(new Double(sale), "Profit & Loss", time1);
			}
		} catch(Exception e) {System.out.println(e);}
		
		JFreeChart chart = ChartFactory.createLineChart("Sales VS. Time", "time", "Sale", dataset, PlotOrientation.VERTICAL, true, false, false);
		chart.setBackgroundPaint(Color.YELLOW);
		chart.getTitle().setPaint(Color.RED);
		CategoryPlot p = chart.getCategoryPlot();
		p.setRangeGridlinePaint(Color.BLUE);
		ChartPanel chart_panel = new ChartPanel(chart);
		panel_6.removeAll();
		panel_6.add(chart_panel, BorderLayout.CENTER);
		panel_6.validate(); 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		panel_5.setLayout(null);
		
		JButton btnView_1 = new JButton("Refresh");
		btnView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ------------------------------------------------------------
				// Make a graph for sales
				// ------------------------------------------------------------
				ResultSet rs = obj_Manager.viewSales();
				String sale = "";
				int time = 0;
				String time1 = "";
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				
				try {
				
					while(rs.next()) {
						sale = rs.getString("Sale");
						time++;
						time1 = Integer.toString(time);
						dataset.setValue(new Double(sale), "Profit & Loss", time1);
					}
				} catch(Exception e) {System.out.println(e);}
				
				JFreeChart chart = ChartFactory.createLineChart("Sales VS. Time", "time", "Sale", dataset, PlotOrientation.VERTICAL, true, false, false);
				chart.setBackgroundPaint(Color.YELLOW);
				chart.getTitle().setPaint(Color.RED);
				CategoryPlot p = chart.getCategoryPlot();
				p.setRangeGridlinePaint(Color.BLUE);
				ChartPanel chart_panel = new ChartPanel(chart);
				panel_6.removeAll();
				panel_6.add(chart_panel, BorderLayout.CENTER);
				panel_6.validate();
			}
		});
		btnView_1.setForeground(Color.WHITE);
		btnView_1.setBackground(Color.GRAY);
		btnView_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnView_1.setBounds(10, 11, 105, 42);
		panel_5.add(btnView_1);
		
		
		panel_6.setBounds(140, 51, 1062, 463);
		panel_5.add(panel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Check Feedback", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblFeedback = new JLabel("Feedback");
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setForeground(Color.BLACK);
		lblFeedback.setFont(new Font("Calibri", Font.BOLD, 33));
		lblFeedback.setBounds(595, 29, 163, 63);
		panel_2.add(lblFeedback);
		
		JLabel lblNewLabel = new JLabel("Comments");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNewLabel.setBounds(112, 357, 154, 25);
		panel_2.add(lblNewLabel);
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = obj_ManagerAccount.checkFeedback();
				textPane.setText("");
				try {
					while (rs.next())
					{
						String name = rs.getString("Name");
					    String feedback = rs.getString("Feedback");
					    
					    
					    textPane.setText(textPane.getText() +">> "+ name+": " + feedback + "\n");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.setBounds(533, 287, 102, 50);
		panel_2.add(btnNewButton);
		
		
		textPane.setBounds(112, 395, 1124, 99);
		panel_2.add(textPane);
		
		JButton btnNewButton_1 = new JButton("Mark Read\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obj_ManagerAccount.removeFeedback();
				remove_count = true;
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton_1.setBounds(718, 287, 123, 50);
		panel_2.add(btnNewButton_1);
		
		
		
		
		
		JLabel lblReviews = new JLabel("Reviews");
		lblReviews.setFont(new Font("Calibri", Font.BOLD, 25));
		lblReviews.setBounds(93, 108, 154, 30);
		panel_2.add(lblReviews);
		
		JLabel lblNewLabel_2 = new JLabel("Excellent: "+ valueExcellent);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(355, 180, 197, 30);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblFair = new JLabel("Fair: " + valueFair);
		lblFair.setForeground(Color.BLACK);
		lblFair.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblFair.setBounds(562, 183, 133, 25);
		panel_2.add(lblFair);
		
		JLabel lblGood = new JLabel("Good: " + valueGood);
		lblGood.setForeground(Color.BLACK);
		lblGood.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblGood.setBounds(718, 183, 145, 25);
		panel_2.add(lblGood);
		
		JLabel lblPoor = new JLabel("Poor: " + valuePoor);
		lblPoor.setForeground(Color.BLACK);
		lblPoor.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblPoor.setBounds(906, 179, 163, 32);
		panel_2.add(lblPoor);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("View Order Details", null, panel_7, null);
		
		JButton btnView_2 = new JButton("View");
		btnView_2.setForeground(Color.WHITE);
		btnView_2.setBackground(Color.GRAY);
		btnView_2.setFont(new Font("Calibri", Font.BOLD, 22));
		btnView_2.setBounds(135, 124, 102, 50);
		btnView_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = obj_orderList.viewOrderDetails();
				table_1.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		panel_7.setLayout(null);
		panel_7.add(btnView_2);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setBackground(Color.GRAY);
		btnDelete_1.setForeground(Color.WHITE);
		btnDelete_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnDelete_1.setBounds(263, 124, 102, 50);
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// -----------------------------------------------------------------------------
				// Change status from not prepare to prepare.
				// -----------------------------------------------------------------------------
				
				int row = table_1.getSelectedRow();
				String orderID = table_1.getValueAt(row, 0).toString();
				
				obj_orderList.ChangeOrderDetail_Status(orderID);
				DefaultTableModel model_1 = (DefaultTableModel)table_1.getModel();
				try{
					model_1.removeRow(row);
					
				}
				catch(Exception e){
					System.out.println(e);
				}
				
				DefaultTableModel model_2 = (DefaultTableModel)table_3.getModel();
				int rowCount = model_2.getRowCount();
				
				try{
					for(int i=rowCount-1; i>=0;i--)
					{
					model_2.removeRow(row);
					}
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		});
		panel_7.add(btnDelete_1);
		table_1 = new JTable();
		JScrollPane scrollPane_1 = new JScrollPane();
		table_1.setRowHeight(25);
		JTableHeader obj1 = table.getTableHeader();
		obj1.setFont(new Font("Calibri",Font.BOLD,22));
		table_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				int row = table_1.getSelectedRow();
				
				String orderID = table_1.getValueAt(row, 0).toString();
				
				ResultSet rs1 = obj_orderList.orderItemDetails(orderID);
				
				table_3.setModel(DbUtils.resultSetToTableModel(rs1));
				
				
			}
		});
		
		scrollPane_1.setBounds(135, 193, 305, 324);
		panel_7.add(scrollPane_1);
		
		
		table_1.setForeground(Color.BLACK);
		table_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_4 = new JLabel("Order Details");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel_4.setBounds(625, 39, 204, 38);
		panel_7.add(lblNewLabel_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(625, 193, 383, 324);
		panel_7.add(scrollPane_2);
		
		table_3 = new JTable();
		scrollPane_2.setViewportView(table_3);
		table_3.setRowHeight(25);
		JTableHeader obj3 = table.getTableHeader();
		obj3.setFont(new Font("Calibri",Font.BOLD,22));
		
		
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Update Menu", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel label = new JLabel("UPDATE MENU");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Calibri", Font.BOLD, 33));
		label.setBounds(569, 35, 221, 44);
		panel_8.add(label);
		
		JButton button_3 = new JButton("Add New Item");
		button_3.setBackground(Color.GRAY);
		button_3.setForeground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsertMenuItem obj_insertItem = new InsertMenuItem();
				obj_insertItem.setVisible(true);
			}
		});
		button_3.setFont(new Font("Calibri", Font.BOLD, 22));
		button_3.setBounds(541, 135, 265, 64);
		panel_8.add(button_3);
		
		JButton button_4 = new JButton("Delete Existing Item");
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(Color.GRAY);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteMenuItem obj_deleteItem = new DeleteMenuItem();
				obj_deleteItem.setVisible(true);	
			}
		});
		button_4.setFont(new Font("Calibri", Font.BOLD, 22));
		button_4.setBounds(541, 225, 265, 64);
		panel_8.add(button_4);
		
		JButton button_5 = new JButton("Update Price");
		button_5.setForeground(Color.WHITE);
		button_5.setBackground(Color.GRAY);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatePrice obj_updatePrice = new UpdatePrice();
				obj_updatePrice.setVisible(true);	
			}
		});
		button_5.setFont(new Font("Calibri", Font.BOLD, 22));
		button_5.setBounds(541, 321, 265, 64);
		panel_8.add(button_5);
		
		JButton button_6 = new JButton("Go to Menu");
		button_6.setForeground(Color.WHITE);
		button_6.setBackground(Color.GRAY);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Manager_Menu obj_managerMenu = new Manager_Menu();
				obj_managerMenu.setVisible(true);
				
			}
		});
		button_6.setFont(new Font("Calibri", Font.BOLD, 22));
		button_6.setBounds(596, 445, 145, 55);
		panel_8.add(button_6);
		
		JButton button_7 = new JButton("Log Out");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				View obj_v = new View();
				obj_v.setVisible(true);
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Calibri", Font.BOLD, 22));
		button_7.setBackground(new Color(128, 128, 128));
		button_7.setBounds(1246, 3, 107, 47);
		contentPane.add(button_7);
		
		JButton btnNewButton_2 = new JButton("Manage Employees");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton_2.setBounds(897, 4, 222, 47);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("Exit");
		button.setBounds(1129, 3, 107, 47);
		contentPane.add(button);
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Calibri", Font.BOLD, 22));
		button.setBackground(new Color(128, 128, 128));
		
		JLabel lblNewLabel_5 = new JLabel("Lava Java Cafe");
		lblNewLabel_5.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 31));
		lblNewLabel_5.setBounds(0, 3, 300, 38);
		contentPane.add(lblNewLabel_5);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Employee obj_Employee = new Employee();
				obj_Employee.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
