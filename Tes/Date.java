import java.util.Scanner;

public class Date{
	public static void main(String args[]){
		String tanggal;

		Scanner input = new Scanner(System.in);

		System.out.print("Tanggal ? ");
      	tanggal = input.nextLine();

		System.out.println("Tanggal ? " + tanggal);	
	}
}