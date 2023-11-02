public class Test{
	public static void main(String args[]){
		Pegawai peg1 = new Pegawai("Fitri");
		Pegawai peg2 = new Manajer("Amelia");
		Pegawai peg3 = new Kurir("Nadra");

		peg1.info(peg1);
		peg2.info(peg2);
		peg3.info(peg3);	
	}
}