package Controller;

import java.sql.ResultSet;

import Model.M_Menu;

public class C_Menu {
	
	M_Menu obj_M_Menu = new M_Menu();
	public ResultSet SearchFood_List(String item_name){
		ResultSet rs = obj_M_Menu.SearchFood_List(item_name);
		return rs;
	}
	
	public boolean AddMenuItem( String Item_Name, int Item_Price, int Quantity, String Catagory) {
		boolean result = obj_M_Menu.AddMenuItem( Item_Name, Item_Price, Quantity, Catagory);
		if(result == true) {
			return true;		
		}
		return false;
	}
	public boolean DeleteMenuItem( String Item_Name, int Item_Price) {
		boolean result = obj_M_Menu.DeleteMenuItem( Item_Name, Item_Price);
		if(result == true) {
			return true;		
		}
		return false;
	}
	
	public boolean UpdatePrice(String Item_Name, int Item_Price) {
		boolean result = obj_M_Menu.UpdatePrice (Item_Name, Item_Price);
		if(result == true) {
			return true;		
		}
		return false;
	}
	
	public ResultSet displaySnacks() {
		ResultSet rs = obj_M_Menu.displaySnacks();
		return rs;
	}
	public ResultSet displayJunkFood() {
		ResultSet rs = obj_M_Menu.displayJunkFood();
		return rs;
	}
	public ResultSet displayMeal() {
		ResultSet rs = obj_M_Menu.displayMeal();
		return rs;
	}
	public ResultSet displayDessert() {
		ResultSet rs = obj_M_Menu.displayDessert();
		return rs;
	}
	public ResultSet displayJuice() {
		ResultSet rs = obj_M_Menu.displayJuice();
		return rs;
	}
	public ResultSet displayShake() {
		ResultSet rs = obj_M_Menu.displayShake();
		return rs;
	}
	public ResultSet displayOthers() {
		ResultSet rs = obj_M_Menu.displayOthers();
		return rs;
	}
	public String displayPrice(String item) {
		String price = obj_M_Menu.displayPrice(item);
		return price;
	}
	public ResultSet SearchFood(String itemName) {
		ResultSet rs = obj_M_Menu.SearchFood(itemName);
		return rs;
	}
	public ResultSet viewMenu() {
		ResultSet rs = obj_M_Menu.viewMenu();
		return rs;
	}
}

