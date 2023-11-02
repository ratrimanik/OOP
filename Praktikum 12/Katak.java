public class Katak{
	private int umur;
	private String nama;

	public Katak(int umur, String nama){
		this.umur = umur;
		this.nama = nama;
	}

	public String caraBergerak(){
		return "melompat";
	}

	public int getUmur(){
		return umur;
	}

	public String getNama(){
		return nama;
	}
}