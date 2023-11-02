public class Dosen extends Orang{
	private int nip;

	public Dosen(String nama){
		super(nama);
	}

	public Dosen(String nama, int nip){
		super(nama);
		this.nip = nip;
	}

	public Dosen(String nama, int nip, int umur){
		super(nama, umur);
		this.nip = nip;
	}

	public void Info(){
		System.out.println("Nama : " + nama);
		System.out.println("NIP : " + nip);
		System.out.println("Umur " + umur);
		
	}
	
}