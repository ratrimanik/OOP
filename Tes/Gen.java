import java.util.Scanner;

public class Gen{
	public static void main(String args[]){
		String nama;
		int th;

		Scanner input = new Scanner(System.in);
		System.out.println("Nama : ");
		nama = input.nextLine();
		System.out.println("Th Lahir : ");
		th = input.nextInt();

		if(th >= 1944 && th <= 1964){
			System.out.println(nama + " tergolong baby boomer");
		}
		else if(th >= 1965 && th <= 1979){
			System.out.println(nama + " tergolong generasi x");
		}
		else if(th >= 1980 && th <= 1994){
			System.out.println(nama + " tergolong generasi y");
		}
		else if(th >= 1995 && th <= 2015){
			System.out.println(nama + " tergolong generasi z");
		}
		else{
			System.out.println("th tidak ada");
		}
	}
}