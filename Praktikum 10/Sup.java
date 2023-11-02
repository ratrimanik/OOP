public class Sup extends Base{
	public static void main(String argv[]){
		Sup s= new Sup();
		s.derived(); //baris 1
	}

	Sup(){
		// baris 2
	}

	public void derived(){
		Base b = new Base(1); //baris 3
	}
}