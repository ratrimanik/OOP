import java.util.Scanner;

public class HbsBgiTiga{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Bilangan : ");

		int bil = input.nextInt();
		
		if(bil % 3 == 0){
			System.out.println("bilangan habis dibagi 3");
		}
	}
	
}