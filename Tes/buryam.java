import java.util.Scanner;

public class buryam{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String nama;
		String pndpt = "suka";
		char type;
	
		System.out.println("Pendapat penyuka buryam");
		System.out.println("Nama : ");
		nama = input.nextLine();
		System.out.println("Pendapat (suka / tidak) : ");
		pndpt = input.nextLine();

		if(pndpt.equals("suka")){
			System.out.println("aduk (y) / tdk (n) ? ");
			type = input.next().charAt(0);
			if(type == 'y'){
				System.out.print("Ntaps");
			} else if(type == 'n'){
				System.out.print("ga kerasa");
			} else {
				System.out.print("serius!!!");
			}
		}
		else if(pndpt.equals("tidak")){
			System.out.println("Cobain");
		}
		else{
			System.out.println("pndpt anda tdk sesuai");
		}
	}
}