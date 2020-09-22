package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.C_Menu;
import java.awt.Color;
public class DeleteMenuItem extends JFrame {
	
	C_Menu obj_Menu = new C_Menu();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_1;
	private JButton btnDelete;
	private JLabel lblNewLabel;
	private JButton btnExit;
	private JButton btnNewButton;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteMenuItem frame = new DeleteMenuItem();
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
	public DeleteMenuItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteItemFrom = new JLabel("Delete Item from Menu");
		lblDeleteItemFrom.setForeground(Color.BLACK);
		lblDeleteItemFrom.setFont(new Font("Calibri", Font.BOLD, 30));
		lblDeleteItemFrom.setBounds(556, 72, 318, 53);
		contentPane.add(lblDeleteItemFrom);
		
		JLabel lblItemPrice = new JLabel("Item Price");
		lblItemPrice.setForeground(Color.BLACK);
		lblItemPrice.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblItemPrice.setBounds(289, 281, 103, 32);
		contentPane.add(lblItemPrice);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(439, 216, 234, 40);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(439, 278, 234, 40);
		contentPane.add(textField_1);
		
		label_1 = new JLabel("Item Name");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		label_1.setBounds(289, 219, 103, 32);
		contentPane.add(label_1);
		

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(585, 455, 289, 32);
		contentPane.add(lblNewLabel);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Calibri", Font.BOLD, 22));
		btnDelete.setBounds(648, 360, 128, 60);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ItemPrice = Integer.parseInt(textField_1.getText());
				boolean result = obj_Menu.DeleteMenuItem( textField.getText(), ItemPrice);
					System.out.println(result);
					if(result == true) {
						lblNewLabel.setText("Item Removed Successfully.");
					}
				
				else {
					lblNewLabel.setText("Deletion Unsuccessful");
				}		
			}
		});
		contentPane.add(btnDelete);
		
		btnExit = new JButton("Back");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnExit.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit.setBounds(973, 564, 111, 53);
		contentPane.add(btnExit);
		
		btnNewButton = new JButton("Exit");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.setBounds(1124, 564, 111, 53);
		contentPane.add(btnNewButton);
		
		label = new JLabel("Lava Java Cafe");
		label.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		label.setBounds(10, 11, 182, 32);
		contentPane.add(label);
		
	}

}
