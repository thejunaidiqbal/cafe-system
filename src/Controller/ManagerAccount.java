package Controller;

import java.sql.ResultSet;

import Model.M_ManagerAccount;
import net.proteanit.sql.DbUtils;

public class ManagerAccount implements Account{
	
	M_ManagerAccount obj_ManagerAccount = new M_ManagerAccount();
	@Override
	public boolean createAccount(String managerName, String managerID, String managerPassword) {
		return false;
	}

	@Override
	public boolean login(String managerId, String managerPassword) {
		if(obj_ManagerAccount.login(managerId, managerPassword) == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean editSettings(String newPassword, String managerId) {
		boolean result = obj_ManagerAccount.editSettings(newPassword, "m_001");
		if(result == true) {
			return true;
		}
		return false;
	}
	public ResultSet checkFeedback() {
		ResultSet rs = obj_ManagerAccount.checkFeedback();
		return rs;
	}
	public void removeFeedback(){
		obj_ManagerAccount.removeFeedback();
	}
	
	public ResultSet checkRateService() {
		ResultSet rs = obj_ManagerAccount.checkRateService();
		return rs;
	}
}
