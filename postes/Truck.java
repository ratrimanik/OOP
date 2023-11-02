public class Truck extends Vehicle{
	public void transport(Character character){
		System.out.print("Kendaraan membawa penumpang ke tempat ");
		character.move();
		System.out.println(" ");
	}
}