import java.util.Scanner;

public class TesMultiTabungan{
	public static void main(String args[]){
		boolean status;
		MultiTabungan tabungan = new MultiTabungan(500000);
		System.out.println("Saldo : " + tabungan.getSaldo());

		System.out.println("1. US");
		System.out.println("2. AUD");
		System.out.println("3. IDR");

		Scanner sc = new Scanner(System.in);
		System.out.print("Pilih menu : ");
		int menu = sc.nextInt();
		System.out.print("Simpan uang : ");
		int simpan = sc.nextInt();
		
		tabungan.simpanUang(simpan, menu);
		System.out.println("Jumlah uang disimpan : " + tabungan.konvUang(simpan, menu));

		System.out.print("Ambil uang : ");
		int ambil = sc.nextInt();
		status = tabungan.ambilUang(ambil); 
		System.out.println("Jumlah uang diambil : " + ambil);

		if(status){
			System.out.println("Ok");
		} else {
			System.out.println("Gagal");
		}
		System.out.println("Saldo : " + tabungan.getSaldo());
		
	}
}