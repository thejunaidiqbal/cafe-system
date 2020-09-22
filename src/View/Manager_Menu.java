package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.C_Menu;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager_Menu extends JFrame {

	C_Menu obj_C_Menu = new C_Menu();
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_Menu frame = new Manager_Menu();
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
	public Manager_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(738, 37, 149, 52);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 35));
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(50, 50));
		scrollPane.setViewportBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		scrollPane.setToolTipText("");
		scrollPane.setBounds(434, 129, 758, 374);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new CompoundBorder(new LineBorder(new Color(171, 173, 179)), null));
		table.setToolTipText("");
		table.setFont(new Font("Calibri", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		ResultSet rs = obj_C_Menu.viewMenu();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Lays Masala", new Integer(30), new Integer(36), "Snacks"},
				{"Chicken Burger", new Integer(120), new Integer(12), "Junk Food"},
				{"Chicken korma", new Integer(80), new Integer(9), "Meal"},
				{"Chocolate Icecream", new Integer(25), new Integer(6), "Dessert"},
				{"Apple Juice (Fresh)", new Integer(60), new Integer(12), "Juice"},
				{"Nestle Mango Juice", new Integer(25), new Integer(9), "Juice"},
				{"Banana Shake", new Integer(50), new Integer(25), "Shake"},
				{"Aquafina (water)", new Integer(35), new Integer(12), "Other"},
				{"Dairy Milk", new Integer(60), new Integer(20), "Snacks"},
			},
			new String[] {
				"Item_Name", "Item_Price", "Quantity", "Category"
			}
		));
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/6.PNG")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(-111, -11, 377, 345);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/5.PNG")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(0, 328, 266, 221);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/4.PNG")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		lblNewLabel_3.setBounds(0, 549, 266, 154);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.setBounds(1104, 549, 103, 44);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit.setBounds(1234, 549, 103, 44);
		contentPane.add(btnExit);
		
		    
		
	}
	}
