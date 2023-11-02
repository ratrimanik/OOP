public class User{
	private String id;
	private String phone;
	private String username;
	private String password;

	public User(){
	}

	public User(String username, String password){
		this.username = username;
		this.password = password;
	}

	public boolean login(String username, String password){
		if(this.username == username && this.password == password){
			return true;
		}
		else{
			return false;
		}
	}
	
}