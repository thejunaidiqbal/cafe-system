package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class M_CustomerAccount {
	public boolean createAccount(String customerName, String customerID, String password) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
		Statement stmt = con.createStatement();
		//System.out.println(customerID+" "+ customerName+" "+ password);
		String sql = "Insert INTO customer(Customer_ID, Name, Password) Values('"+ customerID + "','" +  customerName + "','" + password +"');"; 
		
		int a = stmt.executeUpdate(sql);
		if(a == 1) {
			return true;
		}
		
		}catch(Exception e) {System.out.print(e);}
		return false;
	}
	public boolean checkAccount(String customerID) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select Customer_ID From customer Where Customer_ID = '"+customerID+"'";
			ResultSet rs = stmt.executeQuery(query);
			String arr = null;
			while (rs.next()) {
			    String id = rs.getString("Customer_ID");
			    	return true;
			}
			
		}catch(Exception e) {System.out.println(e);}
		
		return false;
	}
	public boolean login(String customerId, String password) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select Customer_ID, Password From customer Where Customer_ID = '"+customerId+"'";
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())
			{
			    String id = rs.getString("Customer_ID");
			    String pwd = rs.getString("Password");
			    
			    if(id != "" && pwd != "") {	
			    	if (customerId.equals(id) && password.equals(pwd)){
			    		return true;
			    	}
			    	return false;
			    }
			} 
			
		}catch(Exception e) {System.out.println(e);}
		
		return false;
	}
	public boolean giveFeedback(String feedback, String customerId) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
		Statement stmt = con.createStatement();
		String sql = "Update customer Set Feedback = '"+ feedback +"' Where Customer_ID = '" + customerId + "'"; 
		int a = stmt.executeUpdate(sql);
	
	}catch(Exception e) {System.out.println(e);return false;}
		return true;
	}
	public boolean editSettings(String newPassword, String customerId) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String sql = "Update customer Set Password = '"+newPassword+"' Where Customer_ID = '" + customerId + "'"; 
			int a = stmt.executeUpdate(sql);
			return true;
		}catch(Exception e) {System.out.println(e); return false;}
	
	}
	
}
