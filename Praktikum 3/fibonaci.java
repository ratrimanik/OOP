import java.util.Scanner;
public class fibonaci{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		int bil, hasil;
		int f1=0, f2=1;

		System.out.print("Masukkan bilangan ");
		bil = scan.nextInt();

		System.out.println("\n Bilangan fibonaci  dari " + bil);
		System.out.print(" = 0, 1");

		while(true){
			hasil = f2 + f1;
			if(hasil > bil){
			
				break;
			}

			System.out.print(", " + hasil);
			f1 = f2;
			f2 = hasil;
		}
	}
}