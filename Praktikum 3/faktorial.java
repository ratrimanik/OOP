import java.util.Scanner;
public class faktorial {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah bilangan : ");

		int bil=scan.nextInt(), total=1;

		System.out.println("n n!");
		System.out.println("-------------------");

		for (int i = 1; i <= bil; i++) {
			total*=i;
			System.out.println(i+" "+total);
		}
	}
}