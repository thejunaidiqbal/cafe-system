package Controller;

import java.sql.ResultSet;

import Model.M_CustomerAccount;

public class CustomerAccount implements Account{
	
	public static String id;
	public String ID = id;
	M_CustomerAccount obj_M_customerAccount = new M_CustomerAccount();
	
	@Override
	public boolean createAccount(String customerName, String cutomerID, String password) {
		boolean result = obj_M_customerAccount.createAccount(customerName, cutomerID, password);
		if(result == true) {
			return true;
			
		}
		return false;
	}

	@Override
	public boolean login(String customerId, String password) {
		
			boolean result = obj_M_customerAccount.login(customerId, password);
			id = customerId;
			if(result == true) {
				id = customerId;
				return true;
			}
			return false;
		
	}
	

	@Override
	public boolean editSettings(String newPassword, String customerId) {
		boolean result = obj_M_customerAccount.editSettings(newPassword, id);
		if(result == true) {
			return true;
		}
		return false;
	}
	public boolean giveFeedback(String feedback, String cust_id) {
		boolean result = obj_M_customerAccount.giveFeedback(feedback, id);
		if(result == true) {
			return true;
		}
		return false;
	}
	public boolean checkAccount(String customerID) {
		boolean result = obj_M_customerAccount.checkAccount(customerID);
		if(result == true) {
			return true;
		}
		return false;
	}
}
