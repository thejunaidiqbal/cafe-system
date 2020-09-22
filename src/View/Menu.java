package View;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.C_Menu;
import Controller.Customer;
import Controller.CustomerAccount;
import Controller.Order;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame implements ActionListener{
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox_2 = new JComboBox();
	JComboBox comboBox_6 = new JComboBox();
	JComboBox comboBox_3 = new JComboBox();
	JComboBox comboBox_4 = new JComboBox();
	JComboBox comboBox_5 = new JComboBox();
	JTextPane textPane = new JTextPane();
	JLabel lblNewLabel_6 = new JLabel("");
	DefaultListModel demoList = new DefaultListModel();
	JList list_1 = new JList(demoList);
	
	View obj_View = new View();
	//public String customerId;
	private static String[] array_itemName = new String[20];
	private static String[] array_itemQuantity = new String[20];
	private int arrayIndex = 0; 
	
	C_Menu obj_Menu = new C_Menu();
	//Customer obj_Customer = new Customer();
	CustomerAccount obj_CustomerAccount = new CustomerAccount();
	Order obj_Order = new Order();
	
	private int i = 0;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Lava Java Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(Color.BLACK);
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 40));
		tabbedPane.setBounds(0, 0, 1370, 703);
		contentPane.add(tabbedPane);
		
		ResultSet rs = obj_Menu.displaySnacks();
		
		try {
			while (rs.next()) {
		    String itemName = rs.getString("Item_Name");
		    comboBox.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}  
		
		ResultSet rs1 = obj_Menu.displayJunkFood();
		
		try {
			while (rs1.next()) {
				String itemName = rs1.getString("Item_Name");
				comboBox_1.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}
		
		ResultSet rs2 = obj_Menu.displayMeal();
		
		try {
			while (rs2.next()) {
				String itemName = rs2.getString("Item_Name");
				comboBox_2.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}  
		
		ResultSet rs3 = obj_Menu.displayDessert();
		
		try {
			while (rs3.next()) {
				String itemName = rs3.getString("Item_Name");
				comboBox_6.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}  
		
		ResultSet rs4 = obj_Menu.displayJuice();
		
		try {
			while (rs4.next()) {
				String itemName = rs4.getString("Item_Name");
				comboBox_3.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}  
		
		ResultSet rs5 = obj_Menu.displayShake();
		
		try {
			while (rs5.next()) {
				String itemName = rs5.getString("Item_Name");
				comboBox_4.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}  
		
		ResultSet rs6 = obj_Menu.displayOthers();
		
		try {
			while (rs6.next()) {
				String itemName = rs6.getString("Item_Name");
				comboBox_5.addItem(itemName);
		    }
		}catch(Exception e) {System.out.println(e);}  
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(153, 153, 102));
		tabbedPane.addTab("Menu", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setForeground(new Color(255, 255, 255));
		tabbedPane_1.setBackground(Color.BLACK);
		tabbedPane_1.setFont(new Font("Calibri", Font.PLAIN, 30));
		tabbedPane_1.setBounds(0, 60, 1365, 615);
		panel_7.add(tabbedPane_1);
		 comboBox.setForeground(Color.BLACK);
		 comboBox.setBackground(new Color(204, 204, 153));
		
		// Initialize all combo boxes using database when page is open 
		 comboBox.addItem("Select");
		
		
		// ------------------------------------------ First Panel - Snacks --------------------------------------------
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 102));
		tabbedPane_1.addTab("Snacks", null, panel, null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(new Color(250, 250, 210));
		Image image12 = new ImageIcon(this.getClass().getResource("/chips.PNG")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(image12));
		lblNewLabel_12.setBounds(1125, 177, 235, 172);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		Image image13 = new ImageIcon(this.getClass().getResource("/Biscuits.png")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(image13));
		lblNewLabel_13.setBounds(1125, -11, 235, 225);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBackground(Color.WHITE);
		Image image15 = new ImageIcon(this.getClass().getResource("/Chocolates.jpg")).getImage();
		lblNewLabel_15.setIcon(new ImageIcon(image15));
		lblNewLabel_15.setBounds(1125, 333, 235, 205);
		panel.add(lblNewLabel_15);
		
			textField_4 = new JTextField();
			textField_4.setBounds(172, 184, 219, 36);
			panel.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblItemNames = new JLabel("Item Names");
			lblItemNames.setForeground(Color.BLACK);
			lblItemNames.setFont(new Font("Calibri", Font.PLAIN, 20));
			lblItemNames.setBounds(172, 144, 117, 29);
			panel.add(lblItemNames);
			
			JLabel lblQuantity_2 = new JLabel("Quantity");
			lblQuantity_2.setForeground(Color.BLACK);
			lblQuantity_2.setFont(new Font("Calibri", Font.PLAIN, 20));
			lblQuantity_2.setBounds(468, 144, 89, 29);
			panel.add(lblQuantity_2);
			comboBox.setFont(new Font("Calibri", Font.PLAIN, 20));
			
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Lays", "Oye hoye", "Kurleez", "Kurkure", "Rio Biscuits", "Super Biscuits", "Candies", "Dairy Milk Chocolate", "Bounty"}));		
			comboBox.setToolTipText("");
			comboBox.setSelectedIndex(0);
			comboBox.setBounds(172, 274, 220, 36);
			panel.add(comboBox);
			panel.add(textField_4);
			
			JSpinner spinner_4 = new JSpinner();
			spinner_4.setModel(new SpinnerNumberModel(1, 1, 10, 1));
			spinner_4.setFont(new Font("Calibri", Font.PLAIN, 18));
			spinner_4.setBounds(468, 184, 54, 36);
			panel.add(spinner_4);
			
			
			JButton btnConfirm = new JButton("Confirm");
			btnConfirm.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			btnConfirm.setFont(new Font("Calibri", Font.BOLD, 20));
			btnConfirm.setForeground(Color.WHITE);
			btnConfirm.setBackground(Color.BLACK);
			btnConfirm.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					//if(textField_4.getText() != "")
					
					textField_4.setText(comboBox.getSelectedItem().toString());
					
					// for adding values in order detail table
					
					array_itemName[arrayIndex] = textField_4.getText();
					array_itemQuantity[arrayIndex] = spinner_4.getValue().toString();
					arrayIndex++;
					////////////////////////////////////////////////////////////////////
					
					String item = textField_4.getText().toString();
					String price = obj_Menu.displayPrice(item);
					textField_1.setText(price);
					int price_number = Integer.parseInt(price);
					int quantity = (Integer) spinner_4.getValue();
					int totalPrice = quantity*price_number; 
					String  total_price = Integer.toString(totalPrice);
					textField_10.setText(total_price);
					textPane.setText(textPane.getText() + "\n" + textField_4.getText());				
					// printing Final total bill.
					String value = textField_10.getText();
					String value1 = textField_15.getText();
					int total_bill = 0;
					if(value1.equals("")){

						int bill_1 = Integer.parseInt(value);
						total_bill = bill_1;
					}
					else {
						
						int bill_1 = Integer.parseInt(value);
						int bill_2 = Integer.parseInt(value1);
						total_bill = bill_1 + bill_2;
					}
					
					String Bill = Integer.toString(total_bill);
					textField_15.setText(Bill);
				}
			});
			btnConfirm.setBounds(356, 360, 117, 44);
			panel.add(btnConfirm);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Calibri", Font.PLAIN, 18));
			textField_1.setBounds(468, 274, 54, 38);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblPrice = new JLabel("Price");
			lblPrice.setForeground(Color.BLACK);
			lblPrice.setFont(new Font("Calibri", Font.PLAIN, 20));
			lblPrice.setBounds(470, 242, 70, 21);
			panel.add(lblPrice);
			
			textField_10 = new JTextField();
			textField_10.setFont(new Font("Calibri", Font.PLAIN, 18));
			textField_10.setBounds(602, 184, 54, 36);
			panel.add(textField_10);
			textField_10.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Total Price");
			lblNewLabel_2.setForeground(Color.BLACK);
			lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(602, 148, 117, 21);
			panel.add(lblNewLabel_2);
				comboBox_1.setBackground(new Color(204, 204, 153));
			
				comboBox_1.addItem("Select");
				
				// ------------------------------------------ Second Panel - Junk Food ----------------------------------------------
				
				JPanel panel_5 = new JPanel();
				tabbedPane_1.addTab("Junk Food", null, panel_5, null);
				panel_5.setBackground(new Color(255, 255, 255));
				panel_5.setLayout(null);
				comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 18));
				comboBox_1.setBounds(160, 256, 208, 38);
				comboBox_1.setSelectedIndex(0);
				panel_5.add(comboBox_1);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(160, 168, 208, 36);
				panel_5.add(textField_6);
				
				JLabel lblNewLabel = new JLabel("");
				Image image16 = new ImageIcon(this.getClass().getResource("/JunkFood.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(image16));
				lblNewLabel.setBounds(1152, 0, 208, 554);
				panel_5.add(lblNewLabel);
				
				JLabel lblItemName_3 = new JLabel("Item name");
				lblItemName_3.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblItemName_3.setBounds(160, 134, 142, 23);
				panel_5.add(lblItemName_3);
				
				JLabel lblQuantity_4 = new JLabel("Quantity");
				lblQuantity_4.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblQuantity_4.setBounds(423, 131, 96, 29);
				panel_5.add(lblQuantity_4);
				
				JSpinner spinner_3 = new JSpinner();
				spinner_3.setFont(new Font("Calibri", Font.PLAIN, 18));
				spinner_3.setModel(new SpinnerNumberModel(1, 1, 10, 1));
				spinner_3.setBounds(423, 168, 45, 36);
				panel_5.add(spinner_3);
				
				JButton button_4 = new JButton("Confirm");
				button_4.setFont(new Font("Calibri", Font.BOLD, 20));
				button_4.setForeground(Color.WHITE);
				button_4.setBackground(Color.BLACK);
				button_4.setBounds(316, 345, 116, 45);
				panel_5.add(button_4);
				
				JLabel label = new JLabel("Price");
				label.setFont(new Font("Calibri", Font.PLAIN, 20));
				label.setBounds(417, 232, 70, 21);
				panel_5.add(label);
				
				textField_3 = new JTextField();
				textField_3.setFont(new Font("Calibri", Font.PLAIN, 18));
				textField_3.setColumns(10);
				textField_3.setBounds(417, 258, 56, 36);
				panel_5.add(textField_3);
				
				JLabel lblNewLabel_3 = new JLabel("Total Price");
				lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblNewLabel_3.setBounds(586, 127, 116, 36);
				panel_5.add(lblNewLabel_3);
				
				textField_11 = new JTextField();
				textField_11.setBounds(586, 168, 61, 36);
				panel_5.add(textField_11);
				textField_11.setColumns(10);
					comboBox_2.setBackground(new Color(204, 204, 153));
				
					
					comboBox_2.addItem("Select");
					//Image image22 = new ImageIcon(this.getClass().getResource("/fried chicken.jpg")).getImage();
					
					JPanel panel_1 = new JPanel();
					tabbedPane_1.addTab("Meals", null, panel_1, null);
					panel_1.setBackground(new Color(255, 255, 255));
					panel_1.setLayout(null);
					
					
					comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 18));
					//comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Biryani", "Chicken Karahi", "Daal", "Chicken Boneless"}));
					comboBox_2.setBounds(492, 258, 224, 39);
					panel_1.add(comboBox_2);
					
					textField_7 = new JTextField();
					textField_7.setBounds(492, 170, 224, 37);
					panel_1.add(textField_7);
					textField_7.setColumns(10);
					
					JLabel lblItemName_2 = new JLabel("Item Name");
					lblItemName_2.setFont(new Font("Calibri", Font.PLAIN, 20));
					lblItemName_2.setBounds(492, 130, 124, 29);
					panel_1.add(lblItemName_2);
					
					JLabel lblQuantity_3 = new JLabel("Quantity");
					lblQuantity_3.setFont(new Font("Calibri", Font.PLAIN, 20));
					lblQuantity_3.setBounds(823, 132, 81, 24);
					panel_1.add(lblQuantity_3);
					
					JSpinner spinner = new JSpinner();
					spinner.setFont(new Font("Calibri", Font.PLAIN, 18));
					spinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
					spinner.setBounds(823, 171, 54, 37);
					panel_1.add(spinner);
					
					JButton button_5 = new JButton("Confirm");
					button_5.setFont(new Font("Calibri", Font.BOLD, 20));
					button_5.setForeground(Color.WHITE);
					button_5.setBackground(Color.BLACK);
					button_5.setBounds(675, 343, 104, 45);
					panel_1.add(button_5);
					
					JLabel label_1 = new JLabel("Price");
					label_1.setFont(new Font("Calibri", Font.PLAIN, 20));
					label_1.setBounds(823, 235, 70, 21);
					panel_1.add(label_1);
					
					textField_5 = new JTextField();
					textField_5.setFont(new Font("Calibri", Font.PLAIN, 18));
					textField_5.setColumns(10);
					textField_5.setBounds(823, 259, 72, 37);
					panel_1.add(textField_5);
					
					JLabel lblTotalPrice = new JLabel("Total Price");
					lblTotalPrice.setFont(new Font("Calibri", Font.PLAIN, 20));
					lblTotalPrice.setBounds(999, 130, 114, 29);
					panel_1.add(lblTotalPrice);
					
					textField_12 = new JTextField();
					textField_12.setBounds(999, 172, 70, 35);
					panel_1.add(textField_12);
					textField_12.setColumns(10);
						comboBox_6.setBackground(new Color(204, 204, 153));
					
					
						comboBox_6.addItem("Select");
						
						// --------------------------------------------------- Sixth Panel  - Dessert ------------------------------------------------
						
						JPanel panel_4 = new JPanel();
						tabbedPane_1.addTab("Dessert", null, panel_4, null);
						panel_4.setBackground(new Color(255, 255, 255));
						panel_4.setLayout(null);
						
						JLabel lblItemName_1 = new JLabel("Item Name");
						lblItemName_1.setFont(new Font("Calibri", Font.PLAIN, 20));
						lblItemName_1.setBounds(260, 64, 101, 28);
						panel_4.add(lblItemName_1);
						
						textField_2 = new JTextField();
						textField_2.setBounds(260, 92, 212, 33);
						panel_4.add(textField_2);
						textField_2.setColumns(10);
						
						JLabel lblQuantity_1 = new JLabel("Quantity");
						lblQuantity_1.setFont(new Font("Calibri", Font.PLAIN, 20));
						lblQuantity_1.setBounds(561, 66, 83, 24);
						panel_4.add(lblQuantity_1);
						
						JLabel lblNewLabel_8 = new JLabel("");
						Image image8 = new ImageIcon(this.getClass().getResource("/Dessert1.png")).getImage();
						lblNewLabel_8.setIcon(new ImageIcon(image8));
						lblNewLabel_8.setBounds(1191, -20, 169, 543);
						panel_4.add(lblNewLabel_8);
						
						JLabel lblNewLabel_9 = new JLabel("");
						Image image9 = new ImageIcon(this.getClass().getResource("/Dessert2.png")).getImage();
						lblNewLabel_9.setIcon(new ImageIcon(image9));
						lblNewLabel_9.setBounds(0, 341, 893, 188);
						panel_4.add(lblNewLabel_9);
						
						JSpinner spinner_2 = new JSpinner();
						spinner_2.setModel(new SpinnerNumberModel(1, 1, 10, 1));
						spinner_2.setFont(new Font("Calibri", Font.PLAIN, 18));
						spinner_2.setBounds(561, 92, 61, 33);
						panel_4.add(spinner_2);
						
						
						//comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Select", "Mango Icecream", "Strawbery Icecream", "Chocolate Icecream", "Brownies", "Chocolate Cake"}));
						comboBox_6.setFont(new Font("Calibri", Font.PLAIN, 18));
						comboBox_6.setBounds(260, 160, 218, 41);
						panel_4.add(comboBox_6);
						
						JButton button_6 = new JButton("Confirm");
						button_6.setFont(new Font("Calibri", Font.BOLD, 20));
						button_6.setForeground(Color.WHITE);
						button_6.setBackground(Color.BLACK);
						button_6.setBounds(429, 245, 108, 42);
						panel_4.add(button_6);
						
						JLabel label_2 = new JLabel("Price");
						label_2.setFont(new Font("Calibri", Font.PLAIN, 20));
						label_2.setBounds(561, 143, 70, 21);
						panel_4.add(label_2);
						
						textField_8 = new JTextField();
						textField_8.setFont(new Font("Calibri", Font.PLAIN, 18));
						textField_8.setColumns(10);
						textField_8.setBounds(561, 164, 72, 33);
						panel_4.add(textField_8);
						
						JLabel lblTotalPrice_1 = new JLabel("Total Price");
						lblTotalPrice_1.setFont(new Font("Calibri", Font.PLAIN, 20));
						lblTotalPrice_1.setBounds(745, 66, 108, 25);
						panel_4.add(lblTotalPrice_1);
						
						textField_13 = new JTextField();
						textField_13.setBounds(748, 92, 72, 33);
						panel_4.add(textField_13);
						textField_13.setColumns(10);
						
						JLabel lblNewLabel_7 = new JLabel("");
						Image image = new ImageIcon(this.getClass().getResource("/6.PNG")).getImage();
						lblNewLabel_7.setIcon(new ImageIcon(image));
						lblNewLabel_7.setBounds(745, 341, 480, 331);
						panel_4.add(lblNewLabel_7);
							comboBox_3.setBackground(new Color(204, 204, 153));
						
							
							comboBox_3.addItem("Select");
								comboBox_4.setBackground(new Color(204, 204, 153));
							
							
								comboBox_4.addItem("Select");
									comboBox_5.setBackground(new Color(204, 204, 153));
								
									
									comboBox_5.addItem("Select");
									
										
										// ----------------------------------------------- Fourth Panel - Beverages ----------------------------------------------
										
										JPanel panel_2 = new JPanel();
										tabbedPane_1.addTab("Beverages", null, panel_2, null);
										panel_2.setBackground(new Color(255, 255, 255));
										panel_2.setLayout(null);
										
										
										textField = new JTextField();
										textField.setFont(new Font("Calibri", Font.PLAIN, 18));
										textField.setColumns(10);
										textField.setBounds(177, 85, 237, 36);
										panel_2.add(textField);
										
										
										JLabel lblJuices = new JLabel("Juices:");
										lblJuices.setBackground(Color.LIGHT_GRAY);
										lblJuices.setOpaque(true);
										lblJuices.setFont(new Font("Calibri", Font.BOLD, 22));
										lblJuices.setBounds(10, 211, 80, 36);
										panel_2.add(lblJuices);
										
										JLabel lblShakes = new JLabel("Shakes:");
										lblShakes.setFont(new Font("Calibri", Font.BOLD, 22));
										lblShakes.setOpaque(true);
										lblShakes.setBackground(Color.LIGHT_GRAY);
										lblShakes.setBounds(10, 288, 80, 36);
										panel_2.add(lblShakes);
										
										
										
										JLabel lblOther = new JLabel("Other:");
										lblOther.setFont(new Font("Calibri", Font.BOLD, 22));
										lblOther.setOpaque(true);
										lblOther.setBackground(Color.LIGHT_GRAY);
										lblOther.setBounds(10, 368, 80, 35);
										panel_2.add(lblOther);
										
										JLabel lblNewLabel_4 = new JLabel("");
										Image image4 = new ImageIcon(this.getClass().getResource("/Beverages.png")).getImage();
										lblNewLabel_4.setIcon(new ImageIcon(image4));
										lblNewLabel_4.setBounds(1069, -21, 291, 542);
										panel_2.add(lblNewLabel_4);
										
										JLabel lblQuantity = new JLabel("Quantity");
										lblQuantity.setForeground(Color.BLACK);
										lblQuantity.setFont(new Font("Calibri", Font.PLAIN, 20));
										lblQuantity.setBounds(498, 50, 99, 28);
										panel_2.add(lblQuantity);
										
										JLabel lblItemName = new JLabel("Item Name");
										lblItemName.setForeground(Color.BLACK);
										lblItemName.setFont(new Font("Calibri", Font.PLAIN, 20));
										lblItemName.setBounds(177, 54, 128, 20);
										panel_2.add(lblItemName);
										
										JSpinner spinner_1 = new JSpinner();
										spinner_1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
										spinner_1.setFont(new Font("Calibri", Font.PLAIN, 18));
										spinner_1.setBounds(498, 85, 54, 36);
										panel_2.add(spinner_1);
										
										
										comboBox_3.setFont(new Font("Calibri", Font.PLAIN, 18));
										//comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "Orange Juice", "Carrot Juice", "Apple Juice", "Nestle Mango Juice", "Nestle Apple Juice"}));
										comboBox_3.setBounds(177, 274, 237, 36);
										panel_2.add(comboBox_3);
										
										comboBox_4.setFont(new Font("Calibri", Font.PLAIN, 18));
										//comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select", "Apple Shake", "Chocolate Shake", "Banana Shake", "Pineapple Shake"}));
										comboBox_4.setBounds(177, 321, 237, 36);
										panel_2.add(comboBox_4);
										
										
										comboBox_5.setFont(new Font("Calibri", Font.PLAIN, 18));
										//comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea", "Green tea", "Hot Coffee", "Cold Coffee", "Water"}));
										comboBox_5.setBounds(177, 368, 237, 36);
										panel_2.add(comboBox_5);
										
										JButton button_7 = new JButton("Confirm");
										button_7.setFont(new Font("Calibri", Font.BOLD, 20));
										button_7.setForeground(Color.WHITE);
										button_7.setBackground(Color.BLACK);
										button_7.setBounds(498, 274, 111, 40);
										panel_2.add(button_7);
										button_7.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												textField.setText(comboBox_3.getSelectedItem().toString());
												// for adding values in order detail table
												
												array_itemName[arrayIndex] = textField.getText();
												array_itemQuantity[arrayIndex] = spinner_1.getValue().toString();
												arrayIndex++;
												String item = textField.getText();
												String price = obj_Menu.displayPrice(item);
												textField_9.setText(price);
												int price_number = Integer.parseInt(price);
												int quantity = (Integer) spinner_1.getValue();
												int totalPrice = quantity*price_number; 
												String  total_price = Integer.toString(totalPrice);
												textField_14.setText(total_price);
												textPane.setText(textPane.getText() + "\n" + textField.getText());
												//Calculating and printing final total bill.
												String value = textField_14.getText();
												String value1 = textField_15.getText();
												int total_bill = 0;
												if(value1.equals("")){

													int bill_1 = Integer.parseInt(value);
													total_bill = bill_1;
												}
												else {
													
													int bill_1 = Integer.parseInt(value);
													int bill_2 = Integer.parseInt(value1);
													total_bill = bill_1 + bill_2;
												}
												
												String Bill = Integer.toString(total_bill);
												textField_15.setText(Bill);

											}
										});
										JButton button_8 = new JButton("Confirm");
										button_8.setFont(new Font("Calibri", Font.BOLD, 20));
										button_8.setForeground(Color.WHITE);
										button_8.setBackground(Color.BLACK);
										button_8.setBounds(498, 321, 111, 39);
										panel_2.add(button_8);
										button_8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												textField.setText(comboBox_4.getSelectedItem().toString());
												array_itemName[arrayIndex] = textField.getText();
												array_itemQuantity[arrayIndex] = spinner_1.getValue().toString();
												arrayIndex++;
												String item = textField.getText();
												String price = obj_Menu.displayPrice(item);
												textField_9.setText(price);
												int price_number = Integer.parseInt(price);
												int quantity = (Integer) spinner_1.getValue();
												int totalPrice = quantity*price_number; 
												String  total_price = Integer.toString(totalPrice);
												textField_14.setText(total_price);
												textPane.setText(textPane.getText() + "\n" + textField.getText());
												
												// Calculating and printing final total bill.
												String value = textField_14.getText();
												String value1 = textField_15.getText();
												int total_bill = 0;
												if(value1.equals("")){

													int bill_1 = Integer.parseInt(value);
													total_bill = bill_1;
												}
												else {
													
													int bill_1 = Integer.parseInt(value);
													int bill_2 = Integer.parseInt(value1);
													total_bill = bill_1 + bill_2;
												}
												
												String Bill = Integer.toString(total_bill);
												textField_15.setText(Bill);

											}
										});
										JButton button_9 = new JButton("Confirm");
										button_9.setFont(new Font("Calibri", Font.BOLD, 20));
										button_9.setForeground(Color.WHITE);
										button_9.setBackground(Color.BLACK);
										button_9.setBounds(498, 368, 111, 36);
										panel_2.add(button_9);
										
										JLabel label_3 = new JLabel("Price");
										label_3.setFont(new Font("Calibri", Font.PLAIN, 18));
										label_3.setBounds(416, 172, 70, 21);
										panel_2.add(label_3);
										
										textField_9 = new JTextField();
										textField_9.setFont(new Font("Calibri", Font.PLAIN, 18));
										textField_9.setColumns(10);
										textField_9.setBounds(416, 204, 63, 36);
										panel_2.add(textField_9);
										
										JLabel lblTotalPrice_2 = new JLabel("Total Price");
										lblTotalPrice_2.setFont(new Font("Calibri", Font.PLAIN, 20));
										lblTotalPrice_2.setBounds(665, 50, 119, 24);
										panel_2.add(lblTotalPrice_2);
										
										textField_14 = new JTextField();
										textField_14.setBounds(665, 85, 70, 36);
										panel_2.add(textField_14);
										textField_14.setColumns(10);
										
										JButton button_17 = new JButton("Back");
										button_17.setBounds(1147, 0, 110, 52);
										panel_7.add(button_17);
										button_17.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												setVisible(false);
												dispose();
											}
										});
										button_17.setForeground(Color.WHITE);
										button_17.setFont(new Font("Calibri", Font.BOLD, 20));
										button_17.setBackground(Color.BLACK);
										
										JButton btnNewButton = new JButton("Home");
										btnNewButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
												dispose();
												form1 obj_customer = new form1();
												obj_customer.setVisible(true);
												
											}
										});
										btnNewButton.setBounds(1026, -1, 122, 53);
										panel_7.add(btnNewButton);
										btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
										btnNewButton.setForeground(Color.WHITE);
										btnNewButton.setBackground(Color.BLACK);
										btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
										
										JButton btnExit = new JButton("Exit");
										btnExit.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												System.exit(0);
											}
										});
										btnExit.setBounds(1255, -2, 110, 54);
										panel_7.add(btnExit);
										btnExit.setForeground(Color.WHITE);
										btnExit.setFont(new Font("Calibri", Font.BOLD, 20));
										btnExit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
										btnExit.setBackground(Color.BLACK);
										
										JLabel lblNewLabel_10 = new JLabel("Lava Java Cafe");
										lblNewLabel_10.setForeground(Color.BLACK);
										lblNewLabel_10.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 51));
										lblNewLabel_10.setBounds(291, -1, 580, 69);
										panel_7.add(lblNewLabel_10);
										button_9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												textField.setText(comboBox_5.getSelectedItem().toString());
												array_itemName[arrayIndex] = textField.getText();
												array_itemQuantity[arrayIndex] = spinner_1.getValue().toString();
												arrayIndex++;
												String item = textField.getText();
												String price = obj_Menu.displayPrice(item);
												textField_9.setText(price);
												int price_number = Integer.parseInt(price);
												int quantity = (Integer) spinner_1.getValue();
												int totalPrice = quantity*price_number; 
												String  total_price = Integer.toString(totalPrice);
												textField_14.setText(total_price);
												textPane.setText(textPane.getText() + "\n" + textField.getText());
												
												// calculating and printing final total bill.
												String value = textField_14.getText();
												String value1 = textField_15.getText();
												int total_bill = 0;
												if(value1.equals("")){

													int bill_1 = Integer.parseInt(value);
													total_bill = bill_1;
												}
												else {
													
													int bill_1 = Integer.parseInt(value);
													int bill_2 = Integer.parseInt(value1);
													total_bill = bill_1 + bill_2;
												}
												
												String Bill = Integer.toString(total_bill);
												textField_15.setText(Bill);

											}
										});
						button_6.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								textField_2.setText(comboBox_6.getSelectedItem().toString());
								// for adding values in order detail table
								
								array_itemName[arrayIndex] = textField_2.getText();
								array_itemQuantity[arrayIndex] = spinner_2.getValue().toString();
								arrayIndex++;
								String item = textField_2.getText();
								String price = obj_Menu.displayPrice(item);
								textField_8.setText(price);
								int price_number = Integer.parseInt(price);
								int quantity = (Integer) spinner_2.getValue();
								int totalPrice = quantity*price_number; 
								String  total_price = Integer.toString(totalPrice);
								textField_13.setText(total_price);
								textPane.setText(textPane.getText() + "\n" + textField_2.getText());
								
								// calculating and printing final total bill.
								String value = textField_13.getText();
								String value1 = textField_15.getText();
								int total_bill = 0;
								if(value1.equals("")){

									int bill_1 = Integer.parseInt(value);
									total_bill = bill_1;
								}
								else {
									
									int bill_1 = Integer.parseInt(value);
									int bill_2 = Integer.parseInt(value1);
									total_bill = bill_1 + bill_2;
								}
								
								String Bill = Integer.toString(total_bill);
								textField_15.setText(Bill);

							}
						});
					button_5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							textField_7.setText(comboBox_2.getSelectedItem().toString());
							// for adding values in order detail table
							
							array_itemName[arrayIndex] = textField_7.getText();
							array_itemQuantity[arrayIndex] = spinner.getValue().toString();
							arrayIndex++;
							String item = textField_7.getText();
							String price = obj_Menu.displayPrice(item);
							textField_5.setText(price);
							int price_number = Integer.parseInt(price);
							int quantity = (Integer) spinner.getValue();
							int totalPrice = quantity*price_number; 
							String  total_price = Integer.toString(totalPrice);
							textField_12.setText(total_price);
							textPane.setText(textPane.getText() + "\n" + textField_7.getText());
							// calculating and printing final total bill.
							String value = textField_12.getText();
							String value1 = textField_15.getText();
							int total_bill = 0;
							if(value1.equals("")){

								int bill_1 = Integer.parseInt(value);
								total_bill = bill_1;
							}
							else {
								
								int bill_1 = Integer.parseInt(value);
								int bill_2 = Integer.parseInt(value1);
								total_bill = bill_1 + bill_2;
							}
							
							String Bill = Integer.toString(total_bill);
							textField_15.setText(Bill);

						}
					});
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
						textField_6.setText(comboBox_1.getSelectedItem().toString());
						
						// for adding values in order detail table
						
						array_itemName[arrayIndex] = textField_6.getText();
						array_itemQuantity[arrayIndex] = spinner_3.getValue().toString();
						arrayIndex++;
						
						String item = textField_6.getText();
						String price = obj_Menu.displayPrice(item);
						textField_3.setText(price);
						int price_number = Integer.parseInt(price);
						int quantity = (Integer) spinner_3.getValue();
						int totalPrice = quantity*price_number; 
						String  total_price = Integer.toString(totalPrice);
						textField_11.setText(total_price);
						textPane.setText(textPane.getText() + "\n" + textField_6.getText());
						
						// calculating and printing final total bill.
						String value = textField_11.getText();
						String value1 = textField_15.getText();
						int total_bill = 0;
						if(value1.equals("")){

							int bill_1 = Integer.parseInt(value);
							total_bill = bill_1;
						}
						else {
							
							int bill_1 = Integer.parseInt(value);
							int bill_2 = Integer.parseInt(value1);
							total_bill = bill_1 + bill_2;
						}
						
						String Bill = Integer.toString(total_bill);
						textField_15.setText(Bill);

					}
				});
			comboBox.addActionListener(this);
		
		Image image14 = new ImageIcon(this.getClass().getResource("/candies.jpg")).getImage();
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(189, 183, 107));
		tabbedPane.addTab("Order Food", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String orderId = obj_Order.orderFood(obj_View.customerId, textField_15.getText());
				
				obj_Order.addOrderDetails(orderId, array_itemName, array_itemQuantity);
				
				ResultSet rs = null;
				rs = obj_Order.viewBill(obj_View.customerId);
				dispose();
				SubmitOrder obj_submit = new SubmitOrder(rs);
				obj_submit.setVisible(true);
				//obj_submit.customerId = customerId;
				
			}
		});
		btnOrder.setForeground(Color.WHITE);
		btnOrder.setFont(new Font("Calibri", Font.BOLD, 22));
		btnOrder.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnOrder.setBackground(Color.BLACK);
		btnOrder.setBounds(705, 452, 118, 62);
		panel_3.add(btnOrder);
		
		JButton button_11 = new JButton("Home");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				form1 obj_customer = new form1();
				obj_customer.setVisible(true);
			}
		});
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Calibri", Font.BOLD, 22));
		button_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button_11.setBackground(Color.BLACK);
		button_11.setBounds(0, 11, 118, 51);
		panel_3.add(button_11);
		
		JButton button_12 = new JButton("Exit");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Calibri", Font.BOLD, 22));
		button_12.setBackground(Color.BLACK);
		button_12.setBounds(1222, 11, 107, 51);
		panel_3.add(button_12);
		textPane.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		textPane.setBounds(472, 102, 351, 307);
		panel_3.add(textPane);
		
		textField_15 = new JTextField();
		textField_15.setBounds(482, 472, 89, 42);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Total Bill");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(472, 432, 100, 29);
		panel_3.add(lblNewLabel_5);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnBack_1.setForeground(Color.WHITE);
		btnBack_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnBack_1.setBackground(Color.BLACK);
		btnBack_1.setBounds(1105, 11, 107, 51);
		panel_3.add(btnBack_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(189, 183, 107));
		tabbedPane.addTab("Search Food", null, panel_6, null);
		panel_6.setLayout(null);
		
		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent arg0) {
				// -----------------------------------------------------------------
				//  Search food from menu.
				// -----------------------------------------------------------------
				demoList.clear();
				
				try {
					
					//list_1.add("");
					ResultSet rs = obj_Menu.SearchFood(textField_16.getText());
						String name = "", price = "";

						//JList list = new JList(demoList);
						
						while(rs.next()) {		
							name = rs.getString("Item_Name");
							price = rs.getString("Item_Price");
						}
						if(name == "") {
							int i=0;
							rs = obj_Menu.SearchFood_List(textField_16.getText());
							if(rs == null){
								// do nothing.
							}
							else {
								while(rs.next()) {
									name = rs.getString("Item_Name");
									demoList.addElement(name);
									list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
								}
							}
							
						}
						else {
							lblNewLabel_6.setText("1 Item found");
							textField_17.setText(price);
						}	
				}catch(Exception e) {System.out.println(e);}
				// --------------------------------------------------------------------------------------------
			}
		});
		textField_16.setBounds(135, 137, 207, 34);
		panel_6.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(406, 136, 74, 37);
		panel_6.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setForeground(Color.BLACK);
		lblPrice_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPrice_1.setBounds(407, 100, 56, 29);
		panel_6.add(lblPrice_1);
		
		
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(135, 217, 268, 29);
		panel_6.add(lblNewLabel_6);
		
		textField_18 = new JTextField();
		textField_18.setBounds(377, 358, 67, 41);
		panel_6.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblPrice_2 = new JLabel("Total Price");
		lblPrice_2.setForeground(Color.BLACK);
		lblPrice_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblPrice_2.setBounds(377, 318, 103, 29);
		panel_6.add(lblPrice_2);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		spinner_5.setBounds(175, 356, 56, 44);
		panel_6.add(spinner_5);
		
		JLabel lblQuantity_5 = new JLabel("Quantity");
		lblQuantity_5.setForeground(Color.BLACK);
		lblQuantity_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblQuantity_5.setBounds(175, 318, 83, 29);
		panel_6.add(lblQuantity_5);
		
		JButton btnConfirm_1 = new JButton("Confirm");
		btnConfirm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ---------------------------------------------------------------
				// Order food after searching food.
				// ---------------------------------------------------------------
	     		if(textField_16.getText() != "")
				{
					String price = textField_17.getText();		
					int price_number = Integer.parseInt(price);
					int quantity = (Integer) spinner_5.getValue();
					int totalPrice = quantity*price_number; 
					String  total_price = Integer.toString(totalPrice);
					
					array_itemName[arrayIndex] = textField_16.getText();
					array_itemQuantity[arrayIndex] = spinner_5.getValue().toString();
					arrayIndex++;
					textField_18.setText(total_price);
					textPane.setText(textPane.getText() + "\n" + textField_16.getText());				
					// printing Final total bill.
					String value = textField_18.getText();
					String value1 = textField_15.getText();
					int total_bill = 0;
					if(value1.equals("")){
						int bill_1 = Integer.parseInt(value);
						total_bill = bill_1;
					//	System.out.println(total_bill);
					}
					else {
						
						int bill_1 = Integer.parseInt(value);
						int bill_2 = Integer.parseInt(value1);
						total_bill = bill_1 + bill_2;
					}
					
					String Bill = Integer.toString(total_bill);
					textField_15.setText(Bill);
				}
			}
		});
		btnConfirm_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnConfirm_1.setForeground(Color.WHITE);
		btnConfirm_1.setBackground(Color.BLACK);
		btnConfirm_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnConfirm_1.setBounds(249, 445, 114, 51);
		panel_6.add(btnConfirm_1);
		
		JLabel lblSearchFood = new JLabel("Search Food:");
		lblSearchFood.setForeground(Color.BLACK);
		lblSearchFood.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSearchFood.setBounds(135, 100, 148, 29);
		panel_6.add(lblSearchFood);
		list_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		list_1.setBackground(Color.WHITE);
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String selectedItem = list_1.getSelectedValue().toString();
				textField_16.setText(selectedItem);
				ResultSet rs1 = obj_Menu.SearchFood(textField_16.getText());
				String name = "", price = "";
				try {
				while(rs1.next()) {		
					name = rs1.getString("Item_Name");
					price = rs1.getString("Item_Price");
				}
				}catch(Exception e) {System.out.println(e);};
				textField_17.setText(price);
			}
		});
		
		list_1.setBounds(604, 49, 327, 266);
		panel_6.add(list_1);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				form1 obj_customer = new form1();
				obj_customer.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Calibri", Font.BOLD, 22));
		button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		button.setBackground(Color.BLACK);
		button.setBounds(10, 9, 118, 51);
		panel_6.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Calibri", Font.BOLD, 22));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(1215, 461, 107, 51);
		panel_6.add(button_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Calibri", Font.BOLD, 22));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(1085, 461, 107, 51);
		panel_6.add(btnBack);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
};

