import java.util.Scanner;

public class Kabisat{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Tahun (1900 - 2005) : ");

		int th = input.nextInt();
		if(th <= 1900 || th > 2005){
			System.out.println("Tidak Sesuai");
		}
		else if(th % 4 == 0){
			System.out.println(th + " thn kabisat");
		}
		else if(th % 100 == 0){
			System.out.println(th + " bkn kabisat");
		}
		else if(th % 400 == 0){
			System.out.println(th + "thn kabisat");
		}
		else{
			System.out.println(th + " bkn kabisat");
		}
	}
}