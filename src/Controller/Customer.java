package Controller;

import Model.M_Customer;

public class Customer {
	//Customer obj_Customer = new Customer();
	Order order = new Order();
	M_Customer obj_M_Customer = new M_Customer();
	
	public Customer(){
		this.order = order;
	}
	public void rateService(String customerId, String rate) {
		obj_M_Customer.rateService(customerId, rate);
	}
	public void order(String customerId, String Bill) {
		//obj_Order.orderFood(customerId, Bill);
	}
}
