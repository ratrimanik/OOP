public class TesTugas2{
	public static void main(String[] args){
		System.out.println("\nObjek \tumur \tnama \t\tpanjangEkor \tcaraBergerak");
		System.out.println("============================================================");
		Katak O1 = new Katak(5, "Froggy");
		System.out.printf("O1 \t%-7d %-15s %-15s %s\n", O1.getUmur(), O1.getNama(), "", O1.caraBergerak());

		Kecebong O2 = new Kecebong(2, "Junior Frog", 10);
		System.out.printf("O2 \t%-7d %-15s %-15.0f %s\n", O2.getUmur(), O2.getNama(), O2.getPanjangEkor(), O2.caraBergerak());

		System.out.println("============================================================");

	}
}