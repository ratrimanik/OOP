import java.util.Scanner;

public class ViewBola implements View{
	public KalkulatorBola kalkulator = new KalkulatorBola();

	@Override
	public void inputData(Scanner input){
		try{
			System.out.println("Masukkan diameter : ");
			long diameter = Long.parseLong(input.nextLine());
			this.kalkulator.generateShape(diameter);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void showVolume(){
		System.out.printf("Volume bola : %d\n",
			this.kalkulator.calculateVolume());
	}
}