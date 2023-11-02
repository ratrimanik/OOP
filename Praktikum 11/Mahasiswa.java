public class Mahasiswa extends User{
	private Dosen dosenWali;
	private String kelas;

	public Mahasiswa(){} 
	
	public Mahasiswa(String username, String password){
		super(username, password);
	}	
}