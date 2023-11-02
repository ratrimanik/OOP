public abstract class Weapon{
	public abstract void attack();
	public void info(){
		System.out.println("Senjata");
	}
}

class Knife extends Weapon{
	public String knifeEdge;

	public void attack(){
		System.out.println("Menyayat dan menusuk musuh");
	}
}

class Gun extends Weapon{
	public int bullets;

	public Gun(int bullets){
		this.bullets = bullets;
	}

	public void attack(){
		super.info();
		System.out.println("Menembakkan peluru");
		this.bullets -= 1;
		System.out.println("Sisa peluru : " + this.bullets);
	}
}