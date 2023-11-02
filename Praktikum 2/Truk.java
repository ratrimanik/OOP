public class Truk{
	public double muatan;
	public double muatanmaks;
	public Truk(double beratmaks){
		muatanmaks=beratmaks;
	}
	public double getMuatan(){
		return muatan;
	}
	public double getMuatanMaks(){
		return muatanmaks;
	}
	public void tambahMuatan(double berat){
		muatan=muatan+berat;
	}
}