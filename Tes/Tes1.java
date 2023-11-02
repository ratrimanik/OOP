import java.util.Scanner;

public class Tes1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String pmbli = "ya";
		float lbr;
		float harga;

		System.out.println("Pelanggan (ya) / (tidak) ?  ");
		pmbli = input.nextLine();
		System.out.println("brp lbr ? ");
		lbr = input.nextFloat();

		if(pmbli.equals("ya")){
			harga = lbr * 75;
			System.out.println("harga = " + harga); 
		}
		else if(pmbli.equals("tidak")){
			if(lbr < 100){
				harga = lbr * 150;
				System.out.println("harga : " + harga);
			}
			else if(lbr >= 100 && lbr <= 200){
				harga = lbr * 100;
				System.out.println("harga : " + harga);
			}
			else{	
				harga = lbr * 200;
				System.out.println("harga : " + harga);
			}
		}
		else{
			System.out.println("Sesuaikan yaa luv!");
		}

	}
}