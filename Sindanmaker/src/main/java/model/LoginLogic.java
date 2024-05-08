package model;

public class LoginLogic {
	public boolean execute(User user) {
		if (user.getName() != null) {return true;}
		return false;
	}
}
