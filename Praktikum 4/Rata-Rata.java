import java.text.NumberFormat;

public class RataRata{
	public static void main(String args[]){
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);

		int nilai[][] = new int[4][3];
		nilai[0][0] = 81;
   		nilai[0][1] = 90;
   		nilai[0][2] = 62;
   		nilai[1][0] = 50;
   		nilai[1][1] = 83;
   		nilai[1][2] = 87;
  	 	nilai[2][0] = 89;
   		nilai[2][1] = 55;
   		nilai[2][2] = 65;
   		nilai[3][0] = 77;
   		nilai[3][1] = 70;
   		nilai[3][2] = 92;

		String NRP[] = {"1","2","3","4"};
		double ratarataMK[] = new double[nilai.length];

		for(int i = 0; i < nilai.length; i++){
			for(int j = 0; j < nilai[0].length; j++){
				ratarataMK[i] += nilai[i][j];	
			}
			ratarataMK[i] /= nilai[0].length;
		}
		System.out.println("NRP Rata-rata")
		System.out.println("----------------------");

		for(int i = 0; i < nilai.length; i++){
			System.out.print(NRP[i] + "\t");
			for(int j = 0; j < nilai[0]; j++){
				
			}
			System.out.print(nf.format(ratarataMK[i])+"\n");
		}
	}
}