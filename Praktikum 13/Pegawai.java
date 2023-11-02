public class Pegawai{
	public String nama;
	
	public Pegawai(String nama){
		this.nama = nama;
	}

	public void info(Pegawai pegawai) {
		if (pegawai instanceof Manajer)
			System.out.println(this.nama + " adalah Manajer");
		else if (pegawai instanceof Kurir)
			System.out.println(this.nama + " adalah Kurir");
		else	
			System.out.println(this.nama + " adalah Pegawai");
	}
}