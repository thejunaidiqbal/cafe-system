package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.M_Menu;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import Controller.C_Menu;

import java.awt.Color;
public class InsertMenuItem extends JFrame {

	C_Menu obj_Menu = new C_Menu();
	Menu Obj_M = new Menu();
	
	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblPrice_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnExit;
	private JButton btnExit_1;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertMenuItem frame = new InsertMenuItem();
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
	public InsertMenuItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertNewItem = new JLabel("Add New Item in Menu");
		lblInsertNewItem.setForeground(Color.BLACK);
		lblInsertNewItem.setFont(new Font("Calibri", Font.BOLD, 30));
		lblInsertNewItem.setBounds(570, 45, 302, 53);
		contentPane.add(lblInsertNewItem);
		
		JLabel lblPrice = new JLabel("Item Name");
		lblPrice.setForeground(Color.BLACK);
		lblPrice.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPrice.setBounds(308, 216, 103, 27);
		contentPane.add(lblPrice);
		
		textField_1 = new JTextField();
		textField_1.setBounds(456, 211, 209, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblPrice_1 = new JLabel("Price");
		lblPrice_1.setForeground(Color.BLACK);
		lblPrice_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPrice_1.setBounds(308, 278, 80, 27);
		contentPane.add(lblPrice_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(456, 271, 209, 42);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(352, 527, 394, 27);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Add");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// int ItemID = Integer.parseInt(textField.getText());
				int ItemPrice = Integer.parseInt(textField_2.getText());
				int Qty = Integer.parseInt(textField_3.getText());
				boolean result = obj_Menu.AddMenuItem(textField_1.getText(),ItemPrice, Qty ,textField_4.getText());
				/*String ItemName = textField_1.getText();				
				System.out.println(ItemName);				
				Obj_M.comboBox.addItem(ItemName);*/
				System.out.println(result);
				
					if(result == true) {
						lblNewLabel.setText("Item Added Successfully.");
					}
				
				else {
					lblNewLabel.setText("Addition Unsuccessful");
				}		}
			
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.setBounds(652, 486, 108, 53);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(456, 333, 209, 39);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(456, 395, 209, 39);
		contentPane.add(textField_4);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(Color.BLACK);
		lblQuantity.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblQuantity.setBounds(308, 338, 103, 27);
		contentPane.add(lblQuantity);
		
		JLabel lblCatagory = new JLabel("Catagory");
		lblCatagory.setForeground(Color.BLACK);
		lblCatagory.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCatagory.setBounds(308, 400, 103, 27);
		contentPane.add(lblCatagory);
		
		btnExit = new JButton("Back");
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		
		btnExit.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit.setBounds(1076, 573, 103, 53);
		contentPane.add(btnExit);
		
		btnExit_1 = new JButton("Exit");
		btnExit_1.setBackground(Color.BLACK);
		btnExit_1.setForeground(Color.WHITE);
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit_1.setFont(new Font("Calibri", Font.BOLD, 20));
		btnExit_1.setBounds(1216, 573, 103, 53);
		contentPane.add(btnExit_1);
		
		label = new JLabel("Lava Java Cafe");
		label.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		label.setBounds(10, 11, 182, 32);
		contentPane.add(label);
		
		
		
	}
}
