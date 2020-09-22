package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class M_Customer {
	
	public void rateService(String customerId, String rate) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String sql = "Update customer Set rate = '"+ rate +"' Where Customer_ID = '" + customerId + "'"; 
			int a = stmt.executeUpdate(sql);
			
		
		}catch(Exception e) {System.out.println(e);}
	}
}
