public class Dosen extends Pegawai{
	public void mengajar(){
		System.out.println("Dosen " + super.nama + "sedang mengajar");
	}

	public void mengabdi(){
		System.out.println("Dosen " + super.nama + "sedang mengabdi");
	}

	public void meneliti(){
		System.out.println("Dosen " + super.nama + "sedang meneliti");
	}

	public void menerimaJabatan(Jabatan jabatan){
		this.jabatan = jabatan;
	}
}