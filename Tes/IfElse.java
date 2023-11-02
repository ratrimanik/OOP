import java.util.Scanner;

public class IfElse{
	public static void main(String args[]){
		String nama;
		String jk ;		

		Scanner input = new Scanner(System.in);
		System.out.print("Nama : ");
		nama = input.nextLine();
		System.out.print("JK(pria / wanita) : ");
		jk = input.nextLine();

		if(jk == pria)
			System.out.println("halo bro");
		else{
			System.out.println("halo sis");
		}
			
	}
}