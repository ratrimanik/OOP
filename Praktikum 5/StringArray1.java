public class StringArray1{
	public static void main(String args[]){
		String kalimat[] = {"P", "o", "l", "i", "t", "e", "k", "n", "i", "k", "E", "l", "e", "k", "t", "r", "o", "n", "i", "k", "a", "N", "e", "g", "e", "r", "i", "S", "u", "r", "a", "b", "a", "y", "a"};
		
		boolean x = false; 
		int in = 0;
		String kar = "o";

		for(int i = 0; i <kalimat.length; i++){
			if(kar.equals(kalimat[i])){
				in = i;
				x = true;
				i++;
			}
		}
		if(x){
			System.out.println("karakter " + kar + " terdapat pada indeks " + in);
		}
		else{
			System.out.println("karakter " + kar + " tidak terdapat dalam indeks");
		}
	}
}