package perbankan;

public class PengambilanUang extends Tabungan{
	private int proteksi;

	public PengambilanUang(int saldo){
		this.saldo = saldo;
	}

	public PengambilanUang(int saldo, int tingkatBunga){
		this.saldo = saldo;
		this.proteksi = tingkatBunga;
	}

	public int getSaldo(){
		return saldo;
	}

	public boolean ambilUang(int jumlah){
		if(jumlah > saldo - proteksi){
			return false;
		}
		else{
			saldo -= jumlah;
			return true;
		}
	}
}