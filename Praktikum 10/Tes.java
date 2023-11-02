public class Tes{
	public static void main(String args[]){
		Truk truk1 = new Truk();
		truk1.setJmlRoda(4);
		truk1.setWarna("Kuning");
		truk1.setBahanBakar("Solar");
		truk1.setKapasitasMesin(1500);
		truk1.setMuatanMaks(1000);

		Truk truk2 = new Truk();
		truk2.setJmlRoda(6);
		truk2.setWarna("Merah");
		truk2.setBahanBakar("Solar");
		truk2.setKapasitasMesin(2000);
		truk2.setMuatanMaks(5000);

		Taksi taksi1 = new Taksi();
		taksi1.setJmlRoda(4);
		taksi1.setWarna("Orange");
		taksi1.setBahanBakar("Bensin");
		taksi1.setKapasitasMesin(1500);
		taksi1.setTarifAwal(10000);
		taksi1.setTarifPerKm(5000);

		Taksi taksi2 = new Taksi();
		taksi2.setJmlRoda(4);
		taksi2.setWarna("Biru");
		taksi2.setBahanBakar("Bensin");
		taksi2.setKapasitasMesin(1300);
		taksi2.setTarifAwal(7000);
		taksi2.setTarifPerKm(3500);

		Sepeda sepeda1 = new Sepeda();
		sepeda1.setJmlRoda(3);
		sepeda1.setWarna("Hitam");
		sepeda1.setJmlSadel(1);
		sepeda1.setJmlGir(2);

		Sepeda sepeda2 = new Sepeda();
		sepeda2.setJmlRoda(2);
		sepeda2.setWarna("Putih");
		sepeda2.setJmlSadel(2);
		sepeda2.setJmlGir(5);

		System.out.println("\nTruk 1");
		System.out.println("jmlRoda : " + truk1.getJmlRoda());
		System.out.println("warna : " + truk1.getWarna());
		System.out.println("bahanBakar : " + truk1.getBahanBakar());
		System.out.println("kapasitasMesin : " + truk1.getKapasitasMesin());
		System.out.println("muatanMaks : " + truk1.getMuatanMaks());
		System.out.println("----------------------");

		System.out.println("\nTruk 2");
		System.out.println("jmlRoda : " + truk2.getJmlRoda());
		System.out.println("warna : " + truk2.getWarna());
		System.out.println("bahanBakar : " + truk2.getBahanBakar());
		System.out.println("kapasitasMesin : " + truk2.getKapasitasMesin());
		System.out.println("muatanMaks : " + truk2.getMuatanMaks());
		System.out.println("----------------------");

		System.out.println("\nTaksi 1");
		System.out.println("jmlRoda : " + taksi1.getJmlRoda());
		System.out.println("warna : " + taksi1.getWarna());
		System.out.println("bahanBakar : " + taksi1.getBahanBakar());
		System.out.println("kapasitasMesin : " + taksi1.getKapasitasMesin());
		System.out.println("tarifAwal : " + taksi1.getTarifAwal());
		System.out.println("tarifPerKm : " + taksi1.getTarifPerKm());
		System.out.println("----------------------");

		System.out.println("\nTaksi 2");
		System.out.println("jmlRoda : " + taksi2.getJmlRoda());
		System.out.println("warna : " + taksi2.getWarna());
		System.out.println("bahanBakar : " + taksi2.getBahanBakar());
		System.out.println("kapasitasMesin : " + taksi2.getKapasitasMesin());
		System.out.println("tarifAwal : " + taksi2.getTarifAwal());
		System.out.println("tarifPerKm : " + taksi2.getTarifPerKm());
		System.out.println("----------------------");

		System.out.println("\nSepeda 1");
		System.out.println("jmlRoda : " + sepeda1.getJmlRoda());
		System.out.println("warna : " + sepeda1.getWarna());
		System.out.println("jmlSadel : " + sepeda1.getJmlSadel());
		System.out.println("jmlGir : " + sepeda1.getJmlGir());
		System.out.println("----------------------");

		System.out.println("\nSepeda 2");
		System.out.println("jmlRoda : " + sepeda2.getJmlRoda());
		System.out.println("warna : " + sepeda2.getWarna());
		System.out.println("jmlSadel : " + sepeda2.getJmlSadel());
		System.out.println("jmlGir : " + sepeda2.getJmlGir());
		System.out.println("----------------------");
	}
}