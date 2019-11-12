
public class AdminValidate {
	
	public static boolean validate(String username,String password) {
		
		Admin a = new Admin();
		if(a.getUsername().equals(username) && a.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
