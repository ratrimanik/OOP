public class Child extend Parent{
	public String merk = "Lenovo";
	public String milik = "Fitri";

	public void info(){
		System.out.println("Merk : " + this.merk);
		System.out.println("Milik : " + super.milik);
	}
}