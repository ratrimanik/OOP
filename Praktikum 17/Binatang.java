public abstract class Binatang {
	public void bernafas(){
		System.out.println("semua binatang bernafas");
	}

	public void makan(){
		System.out.println("semua binatang makan");
	}

	public void berkembangBiak(){
	}
}

class Burung extends Binatang{

	public void makan(){

		super.makan();
		System.out.println("burung makan biji-bijian");
	}

	public void berkembangBiak(){
		System.out.println("burung berkembang biak dengan cara bertelur");
	}
}


class Mamalia extends Binatang{
	public void berkembangBiak(){
		System.out.println("mamalia berkembang biak dengan cara melahirkan");
	}
}