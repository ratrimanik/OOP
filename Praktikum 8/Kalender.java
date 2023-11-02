public class Kalender{
	private int tanggal = 1;
	private int bulan = 1;
	private int tahun = 2000;

	public Kalender(int tanggal){
		this.tanggal = tanggal;
	}
	
	public Kalender(int bulan, int tahun){
		this.bulan = bulan;
		this.tahun = tahun;
	}

	public Kalender(int tanggal, int bulan, int tahun){
		this.tanggal = tanggal;
		this.bulan = bulan;
		this.tahun = tahun;
	}
	
	public void setTanggal(int tanggal){
		this.tanggal = tanggal;
	}	

	public int getTanggal(){
		return tanggal;
	}

	public void setBulan(int bulan){
		this.bulan = bulan;
	}	

	public int getBulan(){
		return bulan;
	}

	public void setTahun(int tahun){
		this.tahun = tahun;
	}

	public int getTahun(){
		return tahun;
	}
}