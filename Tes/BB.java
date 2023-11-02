import java.util.Scanner;

public class BB{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		float bb;
		float tb;
		float meter;
		float bmi;
		
		System.out.println("BB (kg) : ");
		bb = input.nextFloat();
		System.out.println("TB (cm) : ");
		tb = input.nextFloat();
		meter = tb / 100;

		bmi = (bb/(meter * meter));
		System.out.print("BMI : " + bmi + "");

		if(bmi < 18.5){
			System.out.println("\nterlalu kurus");
		}
		else if(bmi >= 18.5  && bmi <= 25){
			System.out.println("\nlangsing/sehat");
		}
		else{
			System.out.println("\ngemuk");
		}
	}
}