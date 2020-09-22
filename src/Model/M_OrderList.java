package Model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import net.proteanit.sql.DbUtils;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
public class M_OrderList {
	
	public ResultSet viewOrderList() {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String view = "SELECT * FROM orders Where Order_Status = '"+ "pending" +"'"; 
			ResultSet rs = stmt.executeQuery(view);
			return rs;
		}catch(Exception e) {System.out.println(e);}  	
		return null;
	}

	public void ChangeOrder_Status(String value_orderId, int value_bill){
		// change the status of order from pending to paid.
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String sql = "Update orders Set Order_Status = '"+ "paid" +"' Where Order_ID = '" + value_orderId + "'"; 
			int a = stmt.executeUpdate(sql);
		
		}catch(Exception e) {System.out.println(e);}
		
		// ------------------------------------------------------------------------
		// fill the sale table 
		// ------------------------------------------------------------------------
		int saleId = 0, id_1;
		String id = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select Sale_ID From sale Order By Sale_ID DESC Limit 1";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
					id = rs.getString("Sale_ID");
				}
			if(id.equals("")){
				saleId = 10001;
			}
			else {
				saleId = Integer.parseInt(id);
				saleId++;
			}
		}catch(Exception e) {System.out.println(e);}
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
		Statement stmt = con.createStatement();
		String sql = "Insert INTO sale(Sale_ID, Order_ID, Sale) Values('"+ saleId + "','" + value_orderId + "','" + value_bill +"');"; 
		int a = stmt.executeUpdate(sql);
		}catch(Exception e) {System.out.print(e);}
			
	}
	
	public ResultSet viewOrderDetails(){
	/*	String[] id = new String[80];
		int i=0;
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String view = "SELECT Order_ID FROM orders Where Order_Status = '"+ "pending" +"' "; 
			ResultSet rs = stmt.executeQuery(view);
			while(rs.next()){
				id[i]  = rs.getString("Order_ID");
				i++;
			}
		}catch(Exception e) {System.out.println(e);}  	
		*/
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String view = "SELECT Order_ID FROM order_detail Where Status = '"+ "not prepare" +"'  Group By Order_ID"; 
			ResultSet rs = stmt.executeQuery(view);
			return rs;
		}catch(Exception e) {System.out.println(e);}  	
		return null;
	}
	public void ChangeOrderDetail_Status(String value_orderId){
		// change the status of order from not prepare to prepared.
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
					Statement stmt = con.createStatement();
					String sql = "Update order_detail Set Status = '"+ "prepared" +"' Where Order_ID = '" + value_orderId + "'"; 
					int a = stmt.executeUpdate(sql);
				
				}catch(Exception e) {System.out.println(e);}
	}
	
	public void CancelOrder(String value_orderId, int value_bill){
		// change the status of order from pending to paid.
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String sql = "Update orders Set Order_Status = '"+ "cancel" +"' Where Order_ID = '" + value_orderId + "'"; 
			int a = stmt.executeUpdate(sql);
		
		}catch(Exception e) {System.out.println(e);}
		
}
	public void UpdateQuantity(String value_orderId){
		 String [] name = new String[100];
		 String [] quantity = new String[100];
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String view = "SELECT ItemName, quantity FROM order_detail Where Order_ID = '"+ value_orderId +"'"; 
			ResultSet rs = stmt.executeQuery(view);
			int x=0;
			while(rs.next())
			{
				name[x]= rs.getString("ItemName");
				quantity[x] = rs.getString("quantity");
				x++;
				
			}
		}catch(Exception e) {System.out.println(e);}  	
		
		for(int i = 0; i < name.length; i++) {
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
			    Statement stmt = con.createStatement();			
			String sql = "Update menu SET Quantity = Quantity + '"+quantity[i] +"' Where Item_Name = '"+ name[i] +"'";			
			int x = stmt.executeUpdate(sql);
			
			
			}catch(Exception e ) {System.out.print(e);}
			
			
		}
		
	}
	public ResultSet orderItemDetails(String orderID) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select ItemName, quantity From order_detail Where Order_ID = '" + orderID + "'";
			ResultSet rs = stmt.executeQuery(query);
			
			
			return rs;
		}catch(Exception e) {System.out.println(e);}
	return null;
}
}
