import java.util.Scanner;

public class String5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String kal;
		String kal1;
		String kal2;				

		System.out.print("String kalimat utama : ");
		kal = sc.nextLine();
		System.out.print("String yang diganti : ");
		kal1 = sc.nextLine();
		System.out.print("String pengganti : ");
		kal2 = sc.nextLine();

		kal = kal.replace(kal1, kal2);
		System.out.println("Kalimat utama menjadi : " + kal);
	} 
}