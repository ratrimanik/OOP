import java.util.Scanner;

public class cariBil{
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan bilangan? ");

		int bilangan = userInput.nextInt();
		boolean huruf = false;

		int[][] arrayOfInts = {
			{32, 87, 3, 589},
			{12, 1076, 2000, 8},
			{622, 127, 77, 955}
		};

		for(int i = 0; i < arrayOfInts.length; i++){
			for(int j = 0; j < arrayOfInts.length; j++){
				if(arrayOfInts[i][j] == bilangan){
					System.out.println("found " + bilangan + " at " + i +", "+ j);
				}
			}
		}
	}
}