public class Kecebong extends Katak{
	private double panjangEkor;

	public Kecebong(int umur, String nama, double panjang){
		super(umur, nama);
		this.panjangEkor = panjang;
	}

	public String caraBergerak(){
		return "berenang";
	}

	public double getPanjangEkor(){
		return panjangEkor;
	}
}