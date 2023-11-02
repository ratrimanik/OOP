public class Truk{
	private double muatan;
	private double muatanmaks;

	public Truk(double beratmaks){
		muatanmaks = beratmaks;
	}

	public double getMuatan(){
		return newtsToKilo(muatan);
	}
	
	public double getMuatanMaks(){
		return muatanmaks;
	}

	public boolean tambahMuatan(double berat){
		if((newtsToKilo(muatan) + berat) < muatanmaks){
			muatan = muatan + kiloToNewts(berat);
			return true;
		}
		else{
			return false;
		}
	}

	public double newtsToKilo(double berat){
		berat = berat /9.8;
		return berat;
	}

	public double kiloToNewts(double berat){
		berat = berat * 9.8;
		return berat;
	}
}