import java.util.Scanner;

public class bilPrima{
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan bilangan? ");

		int bil = userInput.nextInt();
		boolean bilprima = true;

		if(bil == 0 || bil == 1){
			bilprima = false;
		}
		else{
			for(int i = 2; i < bil; i++){
				if(bil % i == 0){
					bilprima = false;
					break;	
				}
			}
		}
		
		if(bilprima)
			System.out.println(bil + " adalah bilangan prima");
		else
			System.out.println(bil + " bukan termasuk bilangan prima");
	}
}