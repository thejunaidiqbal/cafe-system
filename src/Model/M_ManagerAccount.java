package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

public class M_ManagerAccount {
	public boolean login(String managerId, String managerPassword) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select Password From manager Where Manager_ID = '"+managerId+"'";
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())
			{
			    String pwd = rs.getString("Password");
			    
			    if(pwd != "") {
			    	if (managerPassword.equals(pwd)){
			    		return true;
			    	}
			    	return false;
			    }
			} 
			
		}catch(Exception e) {System.out.println(e);}
		
		
		return false;
	}
	public ResultSet checkFeedback() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query3 = "Select Name, Feedback From customer Where Feedback != '"+ null +"'";
			ResultSet rs = stmt.executeQuery(query3);
			return rs;
			//table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e) {System.out.println(e);}
		return null;
		
	}
	public void removeFeedback() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Update customer Set Feedback = '"+ null +"' Where Feedback != '"+ null +"'";
			int a = stmt.executeUpdate(query);
		}catch(Exception ex) {System.out.println(ex);}
	}
	public boolean editSettings(String newPassword, String managerId) {
	try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String sql = "Update manager Set Password = '"+newPassword+"' Where Manager_ID = '" + managerId + "'"; 
			int a = stmt.executeUpdate(sql);
			return true;
		}catch(Exception e) {System.out.println(e); return false;}
	
	}
	
	// ------------------------------------ View Rate Service -------------------------------------------
	//---------------------------------------------------------------------------------------------------
	
	public ResultSet checkRateService() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select rate, Count(rate) AS Count_rate From customer Group By rate";
			ResultSet rs = stmt.executeQuery(query);
			/*while(rs.next()) {
				String Rate = rs.getString("rate");
				String count_Rate = rs.getString("Count_rate") ;
				if(Rate == null){
					// do nothing
				}
				else {
					System.out.println(Rate + " "+ count_Rate);
				}
			}*/
			return rs;
		}
			catch(Exception e) {System.out.println(e);}
		
		return null;
	}
	
	
};
