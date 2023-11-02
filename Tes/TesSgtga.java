public class TesSgtga{
	public static void main(String args[]){
		Sgtga isi = new Sgtga();
		isi.setAlas(3);
		isi.setTinggi(5);
			System.out.println("Alas : " + isi.getAlas());
			System.out.println("Tinggi : " + isi.getTinggi());
			isi.setLuas(isi.getAlas() , isi.getTinggi());
			System.out.println("Luas : " + isi.getLuas());
	}
}