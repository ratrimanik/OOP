public class Karyawan extends Pegawai{
	public void bekerja(){
		System.out.println("Karyawan " + super.nama + "bekerja");
	}

	public void menerimaJabatan(Jabatan jabatan){
		if(jabatan instanceof KepalaBagian){
			this.jabatan = jabatan;
		}
	}
}