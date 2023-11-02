public class TestLogin{
	public static void main(String arguments[]){
		Mahasiswa fadilah = new Mahasiswa("Fadilah", "123456");
		boolean result = fadilah.login("083853501388", "123456");
		if(result)
			System.out.println("Login berhasil");
		else	   
			System.out.println("Login gagal");

		Dosen fahrul = new Dosen("fahrul","123456", "19990129");
		result = fahrul.login("fahrul", "123456", "19990129");
		if(result)
			System.out.println("Login berhasil");
		else	   
			System.out.println("Login gagal");
	}
}