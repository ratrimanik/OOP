public class Sgtga{
	private int alas;
	private int tinggi;
	private double luas;

	public void setAlas(int alas){
		this.alas=alas;
	}
	public int getAlas(){
		return alas;
	}
	public void setTinggi(int tinggi){
		this.tinggi = tinggi;
	}
	public int getTinggi(){
		return tinggi;
	}
	public void setLuas(int alas, int tinggi){
		this.luas = 0.5 * (double)(alas * tinggi);
	}
	public double getLuas(){
		return luas;
	}
}