public class Dosen extends User{
	private String pangkat;
	private String golongan;
	private String key;

	public Dosen(){}

	public Dosen(String username, String password, String key){
		super(username, password);
		this.key = key;
	}

	public boolean login(String username, String password){
		if(super.login(username, password)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean login(String username, String password, String key){
		if(super.login(username, password) && this.key == key){
			return true;
		}
		else{
			return false;
		}
	}
}