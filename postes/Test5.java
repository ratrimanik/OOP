public class Test5{
	public static void main(String args[]){
		Vehicle car = new Vehicle();
		Truck truck = new Truck();
		
		car.transport(new Character());
		truck.transport(new Player());
		car.transport(new Player());
		truck.transport(new NonPlayerCharacter());
	}
}