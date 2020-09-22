package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class M_Order {
	public ResultSet viewBill(String customerId) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
				Statement stmt = con.createStatement();
				String query = "Select Order_ID, Bill, Ordering_Time, Recieving_Time From orders Where Customer_ID = '" + customerId + "'AND Order_Status = '"+ "pending" +"'";
				ResultSet rs = stmt.executeQuery(query);
				return rs;
			}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	
	public String orderFood(String customerId, String Bill){
		String id = "", orderId = "", t1 = "";
		int id_1 = 0, t2 = 0;
		String receivingTime = "5";
		
		// -----------------------------------------------------------
		// get current time.
		// -----------------------------------------------------------
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String orderTime = sdf.format(cal.getTime());
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select Order_ID From orders Order By Order_ID DESC Limit 1";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				id = rs.getString("Order_ID");
			}
			if(id.equals("")){
				orderId = "1001";
			}
			else {
			id_1 = Integer.parseInt(id);
			id_1++;
			orderId = Integer.toString(id_1);
		}
		}catch(Exception e) {System.out.println(e);}
		
		int TotalBill = Integer.parseInt(Bill);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
		Statement stmt = con.createStatement();
		String sql = "Insert INTO orders(Order_ID, Customer_ID, Bill, Order_Status, Ordering_Time, Recieving_Time) Values('"+ orderId +"','"+ customerId +"','" +  TotalBill + "','" + "pending" +"','"+ orderTime +"','"+ receivingTime +"');"; 
		int a = stmt.executeUpdate(sql);	
		}catch(Exception e) {System.out.print(e);}
		
		return orderId;
	}
	public void addOrderDetails(String orderId, String[] array_itemName, String[] array_itemQuantity) {
	String id="";
	int id_1 = 1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
			Statement stmt = con.createStatement();
			String query = "Select id From order_detail Order By id DESC Limit 1";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				id = rs.getString("id");
			}
			if(id.equals("")){
				id = "1";
			}
			else {
			id_1 = Integer.parseInt(id);
			id_1++;
			//orderId = Integer.toString(id_1);
		}
		}catch(Exception e) {System.out.println(e);}
		int i;
		
		for(i = 0; i < array_itemName.length; i++) {
			try
			{
				if(array_itemQuantity[i]== null)
				{
					
				}
				else
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
				Statement stmt = con.createStatement();
				String sql = "Insert into order_detail(id, Order_ID, ItemName, quantity, Status) Values('"+ id_1 +"','"+ orderId +"','" +  array_itemName[i] + "','" + array_itemQuantity[i] +"','"+ "not prepare" +"');"; 
				
				int a = stmt.executeUpdate(sql);	}
			}catch(Exception e) {System.out.print(e);}
			id_1++;
		}
		for(i = 0; i < array_itemName.length; i++) {
		try
		{
			if(array_itemQuantity[i]== null)
			{
				
			}
			else {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system","root","");
		    Statement stmt = con.createStatement();			
		String sql = "Update menu SET Quantity = Quantity - '"+array_itemQuantity[i] +"' Where Item_Name = '"+ array_itemName[i] +"'";			
		int x = stmt.executeUpdate(sql);
		
			}
		}catch(Exception e ) {System.out.print(e);}
		
		
	   }

	}
	
	
	/*public ResultSet view_All_Bills(String customerId){
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_management_system", "root", "");
				Statement stmt = con.createStatement();
				String query = "Select Order_ID, Bill, Ordering_Time, Recieving_Time From orders Where Customer_ID = '" + customerId + "'AND Order_Status = '"+ "pending" +"'";
				ResultSet rs = stmt.executeQuery(query);
				return rs;
			}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
		
	}*/
}

