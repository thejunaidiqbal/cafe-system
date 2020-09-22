package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import Controller.Employe;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.JScrollPane;
public class Employee extends JFrame {

	Employe obj_Employe = new Employe();
	
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-8, -3, 1389, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.WHITE);
		tabbedPane.setBackground(new Color(51, 51, 51));
		tabbedPane.setFont(new Font("Calibri", Font.PLAIN, 35));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		
				panel.setBackground(new Color(210, 180, 140));
				tabbedPane.addTab("Add Employee", null, panel, null);
				panel.setLayout(null);
				
				textField_1 = new JTextField();
				textField_1.setBounds(542, 188, 179, 37);
				textField_1.setColumns(10);
				panel.add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setBounds(542, 241, 179, 37);
				textField_2.setColumns(10);
				panel.add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setBounds(542, 291, 179, 37);
				textField_3.setColumns(10);
				panel.add(textField_3);
				
				JLabel lblName = new JLabel("Name");
				lblName.setForeground(Color.BLACK);
				lblName.setBounds(375, 195, 56, 20);
				lblName.setHorizontalAlignment(SwingConstants.LEFT);
				lblName.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblName.setBackground(Color.WHITE);
				panel.add(lblName);
				
				JLabel lblContact = new JLabel("Contact");
				lblContact.setForeground(Color.BLACK);
				lblContact.setBounds(375, 247, 121, 20);
				lblContact.setHorizontalAlignment(SwingConstants.LEFT);
				lblContact.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblContact.setBackground(Color.WHITE);
				panel.add(lblContact);
				
				JLabel lblAge = new JLabel("Age");
				lblAge.setForeground(Color.BLACK);
				lblAge.setBounds(375, 298, 56, 20);
				lblAge.setHorizontalAlignment(SwingConstants.LEFT);
				lblAge.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblAge.setBackground(Color.WHITE);
				panel.add(lblAge);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblNewLabel_1.setBounds(542, 554, 286, 29);
				panel.add(lblNewLabel_1);
				
				JButton btnAdd = new JButton("Add");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//	int EmployeeID = Integer.parseInt(textField.getText());
						int Age = Integer.parseInt(textField_3.getText());
						int Salary = Integer.parseInt(textField_10.getText());
						boolean result = obj_Employe.AddEmployee(textField_1.getText(),textField_2.getText(),Age, textField_7.getText(), Salary);
						/*String ItemName = textField_1.getText();				
						System.out.println(ItemName);				
						Obj_M.comboBox.addItem(ItemName);*/
						System.out.println(result);
						
							if(result == true) {
								lblNewLabel_1.setText("Employee Added Successfully.");
							}
						
						else {
							lblNewLabel_1.setText("Addition Unsuccessful");
						}		}
					
				
					
				});
				btnAdd.setForeground(new Color(255, 255, 255));
				btnAdd.setFont(new Font("Calibri", Font.BOLD, 20));
				btnAdd.setBackground(new Color(0, 0, 0));
				btnAdd.setBounds(641, 471, 107, 47);
				panel.add(btnAdd);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(542, 339, 179, 37);
				panel.add(textField_7);
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(542, 390, 179, 37);
				panel.add(textField_10);
				
				JLabel lblSalary_1 = new JLabel("Duty");
				lblSalary_1.setForeground(Color.BLACK);
				lblSalary_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblSalary_1.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblSalary_1.setBackground(Color.WHITE);
				lblSalary_1.setBounds(375, 345, 56, 20);
				panel.add(lblSalary_1);
				
				JLabel lblSalary_2 = new JLabel("Salary");
				lblSalary_2.setForeground(Color.BLACK);
				lblSalary_2.setHorizontalAlignment(SwingConstants.LEFT);
				lblSalary_2.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblSalary_2.setBackground(Color.WHITE);
				lblSalary_2.setBounds(375, 396, 62, 20);
				panel.add(lblSalary_2);
				
				JLabel lblNewLabel_9 = new JLabel("Add New Employee");
				lblNewLabel_9.setForeground(Color.BLACK);
				lblNewLabel_9.setFont(new Font("Calibri", Font.BOLD, 31));
				lblNewLabel_9.setBounds(564, 30, 279, 37);
				panel.add(lblNewLabel_9);
				
				JButton btnExit = new JButton("Exit");
				btnExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				btnExit.setForeground(Color.WHITE);
				btnExit.setFont(new Font("Calibri", Font.BOLD, 20));
				btnExit.setBackground(Color.BLACK);
				btnExit.setBounds(1196, 530, 107, 47);
				panel.add(btnExit);
				
				JButton btnHome = new JButton("Back");
				btnHome.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						dispose();
					}
				});
				btnHome.setForeground(Color.WHITE);
				btnHome.setFont(new Font("Calibri", Font.BOLD, 20));
				btnHome.setBackground(Color.BLACK);
				btnHome.setBounds(1058, 530, 107, 47);
				panel.add(btnHome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(210, 180, 140));
		tabbedPane.addTab("Delete Employee", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setForeground(Color.BLACK);
		lblName_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblName_1.setBounds(351, 193, 89, 28);
		panel_1.add(lblName_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(519, 186, 223, 39);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(568, 344, 265, 39);
		panel_1.add(lblNewLabel_2);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//	int EmployeeID = Integer.parseInt(textField_4.getText());
					
					boolean result = obj_Employe.DeleteEmployee(textField_5.getText());
					System.out.println(result);
					
						if(result == true) {
							lblNewLabel_2.setText("Employee Deleted Successfully.");
						}
					
					else {
						lblNewLabel_2.setText("Deletion Unsuccessful");
					}		}
				
				
			
		});
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Calibri", Font.BOLD, 22));
		btnDelete.setBounds(640, 262, 102, 51);
		panel_1.add(btnDelete);
		
		JLabel lblNewLabel_5 = new JLabel("Delete Employee");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBackground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 31));
		lblNewLabel_5.setBounds(568, 36, 253, 39);
		panel_1.add(lblNewLabel_5);
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit_1.setForeground(Color.WHITE);
		btnExit_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit_1.setBackground(Color.BLACK);
		btnExit_1.setBounds(1169, 481, 102, 51);
		panel_1.add(btnExit_1);
		
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
		btnBack.setBounds(1032, 481, 102, 51);
		panel_1.add(btnBack);
		
		String[] duties = {"Select", "Chef","Delivery Boy","Receptionist"};	
		// JLabel lblText = new JLabel();
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(210, 180, 140));
		tabbedPane.addTab("Salary", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setForeground(Color.BLACK);
		lblEmployeeName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblEmployeeName.setBounds(293, 140, 153, 26);
		panel_3.add(lblEmployeeName);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setForeground(Color.BLACK);
		lblSalary.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSalary.setBounds(293, 201, 88, 26);
		panel_3.add(lblSalary);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(484, 134, 219, 40);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(484, 195, 219, 40);
		panel_3.add(textField_9);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(484, 377, 283, 33);
		panel_3.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox(duties);
		comboBox.setBackground(new Color(204, 204, 153));
		comboBox.setForeground(Color.BLACK);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			   //	 int EmployeeID = Integer.parseInt(textField_8.getText());
				int Salary = Integer.parseInt(textField_9.getText());
				
				boolean result = obj_Employe.UpdateSalary(textField_8.getText(),Salary);
				System.out.println(result);
				
					if(result == true) {
						lblNewLabel_7.setText("Salary Updated Successfully.");
					}
				
				else {
					lblNewLabel_7.setText("Updation Unsuccessful");
				}		
						
			}
		});
		button.setBackground(Color.BLACK);
		button.setFont(new Font("Calibri", Font.BOLD, 22));
		button.setForeground(Color.WHITE);
		button.setBounds(571, 281, 114, 59);
		panel_3.add(button);
		
		JLabel lblNewLabel_6 = new JLabel("Update Salary");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD, 31));
		lblNewLabel_6.setBounds(552, 42, 207, 40);
		panel_3.add(lblNewLabel_6);
		
		JButton btnExit_2 = new JButton("Exit");
		btnExit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit_2.setForeground(Color.WHITE);
		btnExit_2.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit_2.setBackground(Color.BLACK);
		btnExit_2.setBounds(1170, 495, 114, 59);
		panel_3.add(btnExit_2);
		
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
		btnBack_1.setBounds(1008, 495, 114, 59);
		panel_3.add(btnBack_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(210, 180, 140));
		tabbedPane.addTab("Assign Duty", null, panel_2, null);
		tabbedPane.setEnabledAt(3, true);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Employee ID");
		label.setForeground(Color.BLACK);
		label.setBounds(339, 154, 112, 26);
		label.setFont(new Font("Calibri", Font.PLAIN, 20));
		panel_2.add(label);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(501, 152, 224, 34);
		panel_2.add(textField_6);
		
		JLabel lblAssignDuty = new JLabel("Duty");
		lblAssignDuty.setForeground(Color.BLACK);
		lblAssignDuty.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAssignDuty.setBounds(339, 213, 69, 26);
		panel_2.add(lblAssignDuty);
		JLabel lblNewLabel_8 = new JLabel("");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	int EmployeeID = Integer.parseInt(textField_6.getText());
				
				boolean result = obj_Employe.AssignDuty(textField_6.getText(), comboBox.getSelectedItem().toString());
				System.out.println(result);
				
					if(result == true) {
						lblNewLabel_8.setText("Duty Updated Successfully.");
					}
				
				else {
					lblNewLabel_8.setText("Updation Unsuccessful");
				}		
						
			}
				
		});
		btnSubmit.setFont(new Font("Calibri", Font.BOLD, 22));
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBounds(580, 288, 112, 51);
		panel_2.add(btnSubmit);
		
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 18));
		comboBox.setBounds(501, 209, 224, 34);
		panel_2.add(comboBox);
		
		
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(501, 374, 245, 34);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("Update Duty");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 31));
		lblNewLabel_4.setBounds(545, 59, 263, 40);
		panel_2.add(lblNewLabel_4);
		
		JButton btnExit_3 = new JButton("Exit");
		btnExit_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit_3.setForeground(Color.WHITE);
		btnExit_3.setFont(new Font("Calibri", Font.BOLD, 22));
		btnExit_3.setBackground(Color.BLACK);
		btnExit_3.setBounds(1179, 505, 106, 51);
		panel_2.add(btnExit_3);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnBack_2.setForeground(Color.WHITE);
		btnBack_2.setFont(new Font("Calibri", Font.BOLD, 22));
		btnBack_2.setBackground(Color.BLACK);
		btnBack_2.setBounds(1041, 505, 106, 51);
		panel_2.add(btnBack_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(222, 184, 135));
		tabbedPane.addTab("View Employees", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(171, 167, 1008, 372);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		table.setRowHeight(25);
		JTableHeader obj = table.getTableHeader();
		obj.setFont(new Font("Calibri",Font.BOLD,22));
		

		ResultSet rs = obj_Employe.ViewEmployees();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
		JLabel lblNewLabel = new JLabel("Employees");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(570, 43, 273, 39);
		panel_4.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs = obj_Employe.ViewEmployees();
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.setBounds(37, 99, 124, 39);
		panel_4.add(btnNewButton);
		
		
	}
}
