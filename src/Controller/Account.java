package Controller;

public interface Account {
	public boolean createAccount(String name, String ID, String password);
	public boolean login(String Id, String password);
	public boolean editSettings(String NewPassword, String Id);
}
