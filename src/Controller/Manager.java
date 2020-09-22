package Controller;

import java.sql.ResultSet;

import Model.M_Manager;

public class Manager {
	M_Manager obj_M_Manager = new M_Manager();
	
	public ResultSet viewSales() {
		
		ResultSet rs = obj_M_Manager.viewSales();
		return rs;
	}
}
