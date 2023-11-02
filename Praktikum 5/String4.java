import java.util.Scanner;

public class String4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String kal1;
		String kal2;
		String kal3;
		String kal4;
				

		System.out.print("Kalimat 1 : ");
		kal1 = sc.nextLine();
		System.out.print("Kalimat 2 : ");
		kal2 = sc.nextLine();
		kal3 = kal1.substring((kal1.indexOf(" ")),kal1.length());
		kal4 = kal2.substring((kal2.indexOf(" ")),kal2.length());
		
		kal1 = kal1.replace(kal3, kal4);
		kal2 = kal2.replace(kal4, kal3);

		System.out.println(kal1);
		System.out.println(kal2);
	}
}