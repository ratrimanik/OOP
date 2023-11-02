import java.util.Scanner;

public class ViewCube implements View{
	public KalkulatorCube kalkulator = new KalkulatorCube();

	@Override
	public void inputData(Scanner input){
		try{
			System.out.println("Masukkan rusuk : ");
			long rusuk = Long.parseLong(input.nextLine());
			this.kalkulator.generateShape(rusuk);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void showVolume(){
		System.out.printf("Volume kubus : %d\n",
			this.kalkulator.calculateVolume());
	}
}