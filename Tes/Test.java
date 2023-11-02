public class Test {
	public static void main(String args[]){
		Player player1 = new Player("Hero");
		Netizen player2 = new Netizen();
 
		System.out.println("\nTurn 1 ...");
		player1.attack(new Weapon());
		player2.attack();
 
		System.out.println("\n\nTurn 2 ...");
		player1.attack(new Firearm());
		player2.attack();
 
		System.out.println("\n\nTurn 3 ...");
		player1.attack(new Shotgun());
		player2.attack("You are cheating. You use a weapon.");
 
		System.out.println("\nTurn 4 ...");
		player1.attack(new MachineGun());
		player2.attack("You are cheating");
	}	 
}