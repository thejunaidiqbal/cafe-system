package Controller;

import java.sql.ResultSet;

import Model.M_Order;

public class Order {
	M_Order obj_M_Order = new  M_Order();
	
	public String orderFood(String customerId, String Bill) {
	
	String orderId = obj_M_Order.orderFood(customerId, Bill);
		return orderId;
	}
	public void addOrderDetails(String orderId, String[] array_itemName, String[] array_itemQuantity) {
		obj_M_Order.addOrderDetails(orderId, array_itemName, array_itemQuantity);
	}
	public ResultSet viewBill(String customerId){
		ResultSet rs = obj_M_Order.viewBill(customerId);
		return rs;
	}
	/*public ResultSet view_All_Bills(String customerId){
		ResultSet rs = obj_M_Order.view_All_Bills(customerId);
		return rs;
	}*/
}
