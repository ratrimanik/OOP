public class Mobil{
	public int D, E;
	public String A, B, C;
	public Mobil(String A, String B, String C, int D, int  E){
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
		this.E=E;
	}
	public void inpoMobil(){
		System.out.println("A : " + A + " | B : " + B + " | C : " + C + " | D : " + D + " | E : " + E);
	}
}