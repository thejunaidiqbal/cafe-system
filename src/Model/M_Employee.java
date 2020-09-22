package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class M_Employee {
	public boolean AddEmployee( String Name, String Contact, int Age, String Duty,  int Salary) {	
		String Emp_ID="";
		int Emp_ID_1 = 1;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
				Statement stmt = con.createStatement();
				String query = "Select Emp_ID From employee Order By Emp_ID DESC Limit 1";
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next()) {
					Emp_ID = rs.getString("Emp_ID");
				}
				if(Emp_ID.equals("")){
					Emp_ID = "1";
				}
				else {
					Emp_ID_1 = Integer.parseInt(Emp_ID);
					Emp_ID_1++;
				
			}
			}catch(Exception e) {System.out.println(e);}
		
		
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Insert INTO employee(Emp_ID, Name, Contact, Age, Duty, Salary) Values('"+ Emp_ID_1 +"','" +  Name + "','" + Contact + "','" + Age + "','" + Duty +"','" + Salary + "');"; 			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				
				return true;
			}	
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}
	
	public boolean DeleteEmployee( String Name ) {		   
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Delete From employee Where Name = '"+ Name +"'" ;			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				return true;
			}			
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}
	
	 public boolean UpdateSalary(String Name, int Salary) {		   
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Update employee SET Salary = '"+ Salary +"' Where Name = '"+ Name +"'";			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				return true;
			}			
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}
	 
	 public boolean AssignDuty(String Name, String Duty) {		   
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Update employee SET Duty = '"+ Duty +"' Where Name = '"+ Name +"'";			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				return true;
			}			
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}
	 
	 public ResultSet ViewEmployees(){
		 try{
			 Class.forName("com.mysql.jdbc.Driver");
		 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select * From employee";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		 }catch(Exception e){System.out.println(e);}
		 return null;
	 }	 
}