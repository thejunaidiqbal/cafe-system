package Controller;
import java.sql.ResultSet;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import net.proteanit.sql.DbUtils;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JTable;
import Model.M_OrderList;

public class OrderList {
	
	M_OrderList obj_M_orderList = new M_OrderList();
	
	public ResultSet viewOrderList() {
		ResultSet rset = obj_M_orderList.viewOrderList();
		return rset;
	}
	public void ChangeOrder_Status(String value_orderId, int value_bill){
		
		obj_M_orderList.ChangeOrder_Status(value_orderId, value_bill);
		
	}
   public void CancelOrder(String value_orderId, int value_bill){
		
		obj_M_orderList.CancelOrder(value_orderId, value_bill);
		
	}
   public void UpdateQuantity(String value_orderId){
		
		obj_M_orderList.UpdateQuantity(value_orderId);
		
	}
	public ResultSet viewOrderDetails(){
		ResultSet rs = obj_M_orderList.viewOrderDetails();
		return rs;
	}
	public void ChangeOrderDetail_Status(String value_orderId){
		obj_M_orderList.ChangeOrderDetail_Status(value_orderId);
	}
	public ResultSet orderItemDetails(String orderId){
		ResultSet rs = obj_M_orderList.orderItemDetails(orderId);
		return rs;
	}
	
}
