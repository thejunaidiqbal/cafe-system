package Controller;

import java.sql.ResultSet;

import Model.M_Employee;

public class Employe {
	M_Employee obj_M_Employee = new M_Employee();
	
	public boolean AddEmployee( String Name, String Contact, int Age, String Duty,  int Salary) {
		
			boolean result = obj_M_Employee.AddEmployee( Name, Contact, Age, Duty, Salary);
			if(result == true) {
				return true;		
			}
			return false;
		}
		
	public boolean DeleteEmployee( String Name) {
		boolean result = obj_M_Employee.DeleteEmployee( Name);
		if(result == true) {
			return true;		
		}
		return false;
	}
	public boolean UpdateSalary(String Name, int Salary) {
		boolean result = obj_M_Employee.UpdateSalary(Name, Salary);
		if(result == true) {
			return true;		
		}
		return false;
	}
	public boolean AssignDuty(String Name, String Duty) {
		boolean result = obj_M_Employee.AssignDuty(Name, Duty);
		if(result == true) {
			return true;		
		}
		return false;
	}
	public ResultSet ViewEmployees(){
		ResultSet rs = obj_M_Employee.ViewEmployees();
		return rs;
	}
}
