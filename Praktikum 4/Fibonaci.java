import java.util.Scanner;

public class Fibonaci{
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan jumlah deretan fibonacci? ");
		
		int n = userInput.nextInt();
		int bilFib[] =  new int[n];
		bilFib[0] = 0;
		bilFib[1] = 1;

		for(int i = 2; i < n; i++){
			bilFib[i] = bilFib[i-1] + bilFib[i-2];
		}
		for(int i = 0; i < n; i++){
			System.out.print(bilFib[i] + " ");
		}	
	}
}