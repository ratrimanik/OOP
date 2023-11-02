public class TesMobil{
	public static void main(String srt[]){
		Mobil mobil1, mobil2, mobil3, mobil4;
		mobil1 = new Mobil("Toyota", "Biru", "Minibus", 2000, 7);
		mobil2 = new Mobil("Daihatsu", "Hitam", "Pickup", 1500, 2);
		mobil3 = new Mobil("Suzuki", "Silver", "SUV", 1800, 5);	
		mobil4 = new Mobil("Honda", "Merah", "Sedan", 1300, 5);
		mobil1.inpoMobil();	
		mobil2.inpoMobil();
		mobil3.inpoMobil();
		mobil4.inpoMobil();
	}
}