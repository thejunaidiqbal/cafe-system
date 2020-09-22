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
public class UpdatePrice extends JFrame {
	
	C_Menu obj_Menu = new C_Menu();

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdatePrice frame = new UpdatePrice();
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
	public UpdatePrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdatePrice = new JLabel("Update Price");
		lblUpdatePrice.setForeground(Color.BLACK);
		lblUpdatePrice.setFont(new Font("Calibri", Font.BOLD, 30));
		lblUpdatePrice.setBounds(605, 59, 182, 53);
		contentPane.add(lblUpdatePrice);
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setBackground(Color.BLACK);
		lblItemName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblItemName.setBounds(318, 241, 97, 32);
		contentPane.add(lblItemName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(479, 238, 210, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(479, 304, 210, 41);
		contentPane.add(textField_2);
		
		JLabel lblNewPrice = new JLabel("New Price");
		lblNewPrice.setBackground(Color.BLACK);
		lblNewPrice.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewPrice.setBounds(318, 307, 97, 32);
		contentPane.add(lblNewPrice);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		label_1.setBounds(372, 510, 317, 32);
		contentPane.add(label_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Calibri", Font.BOLD, 22));
		btnUpdate.setBounds(605, 397, 127, 58);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// int ItemID = Integer.parseInt(textField.getText());
				int ItemPrice = Integer.parseInt(textField_2.getText());
				boolean result = obj_Menu.UpdatePrice(textField_1.getText(),ItemPrice);
					System.out.println(result);
					if(result == true) {
						label_1.setText("Price Updated Successfully.");
					}
				
				else {
					    label_1.setText("Updation Unsuccessful");
				}		
			}
		});
		contentPane.add(btnUpdate);
		
		JButton btnExit = new JButton("Back");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnExit.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit.setBounds(995, 535, 127, 53);
		contentPane.add(btnExit);
		
		JButton button = new JButton("Exit");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFont(new Font("Calibri", Font.BOLD, 22));
		button.setBounds(1157, 535, 127, 53);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("Lava Java Cafe");
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 182, 32);
		contentPane.add(lblNewLabel);
		
		
	}

}
