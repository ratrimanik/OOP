import java.util.Scanner;

public class String1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String kalimat;
		char kar;

		System.out.print("Masukkan kalimat : ");
		kalimat = sc.nextLine();
		System.out.print("Karakter ? ");;
		kar = sc.nextLine().charAt(0);

		System.out.println("Karakter " + kar + " terdapat pada indeks ke ");
		for(int i = 0; i < kalimat.length(); i++){
			if(kalimat.charAt(i) == kar){
				System.out.print(i + " ");
			}
		}
		
	}
}