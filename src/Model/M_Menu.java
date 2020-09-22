package Model;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import net.proteanit.sql.DbUtils;

public class M_Menu {
	public ResultSet displaySnacks(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Snacks" +"' AND Quantity > 0";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
	return null;
	}
	
	public ResultSet displayJunkFood(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Junk Food" +"' AND Quantity > 0";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
	return null;
	}
	public ResultSet displayMeal(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Meal" +"' AND Quantity > 0";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
	return null;
	}
	
	public ResultSet displayDessert(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Dessert" +"' AND Quantity > 0" ;
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	public ResultSet displayJuice(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Juice" +"' AND Quantity > 0";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	public ResultSet displayShake(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Shake" +"' AND Quantity > 0";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	public ResultSet displayOthers(){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name From menu Where Category = '"+ "Other" +"' AND Quantity > 0";
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	public String displayPrice(String item){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Price From menu Where Item_Name = upper('"+ item +"') OR Item_Name = lower('"+ item +"')";
			ResultSet rs = stmt.executeQuery(query);
			String price = "";
			while(rs.next()) {
				price = rs.getString("Item_Price");
			}
			return price;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	public ResultSet SearchFood(String item_name) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
			Statement stmt = con.createStatement();
			String query = "Select Item_Name, Item_Price From menu Where Item_Name = '"+ item_name +"'";
			ResultSet rs = stmt.executeQuery(query);
			return rs; 
		
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	public ResultSet SearchFood_List(String item_name){
		
		if(item_name.equals("")) {
			return null;
		}
		else {
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", ""); 
				Statement stmt = con.createStatement();
				String query = "Select Item_Name From menu Where Item_Name like'"+ item_name+"%' AND Quantity > 0;";
				ResultSet rs = stmt.executeQuery(query);
				return rs; 
		
			}catch(Exception e) {System.out.println(e);}
		}
		return null;			
	}
	
	public boolean AddMenuItem( String Item_Name, int Item_Price, int Quantity, String Catagory ) {
		String Item_ID="";
		int Item_ID_1 = 1;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
				Statement stmt = con.createStatement();
				String query = "Select Item_ID From menu Order By Item_ID DESC Limit 1";
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next()) {
					Item_ID = rs.getString("Item_ID");
				}
				if(Item_ID.equals("")){
					Item_ID = "1";
				}
				else {
					Item_ID_1 = Integer.parseInt(Item_ID);
					Item_ID_1++;
				
			}
			}catch(Exception e) {System.out.println(e);}
		
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Insert INTO menu(Item_ID, Item_Name, Item_Price, Quantity, Category) Values('"+ Item_ID_1 + "','" +  Item_Name + "','" + Item_Price + "','" + Quantity + "','" + Catagory +"');"; 			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				
				return true;
			}	
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}

	public boolean DeleteMenuItem( String Item_Name, int Item_Price) {		   
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Delete From menu Where Item_Name = '"+ Item_Name +"' AND Item_Price = '"+ Item_Price +"'";			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				return true;
			}			
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}

	 public boolean UpdatePrice(String Item_Name, int Item_Price) {		   
		 try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Update menu SET Item_Price = '"+ Item_Price +"' Where Item_Name = '"+ Item_Name +"' ";			
			int x = stmt.executeUpdate(sql);
			if(x == 1) {
				return true;
			}			
			
			}catch(Exception e ) {System.out.print(e);}
			
			return false;
		}

	 public ResultSet viewMenu() {
			try { 
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
				Statement stmt = con.createStatement();
				String view = "SELECT Item_Name, Item_Price, Quantity, Category FROM menu"; 
				ResultSet rs = stmt.executeQuery(view);
				return rs;
			}catch(Exception e) {System.out.println(e);}  	
			return null;
		}

};