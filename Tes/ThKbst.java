public class ThKbst{
	private int th = 0;
	private String cek;

	public void setTh(int th){
		this.th = th;
	}
	public int getTh(){
		return th;
	}
	public void setCek(int th){
		if(th <= 1900 || th > 2005){
			System.out.println("Tidak sesuai");
		}
		else if(th % 4 == 0){
			System.out.println(th + " thn kabisat");
		}
		else if(th % 100 == 0){
			System.out.println(th + " bkn kabisat");
		}
		else if(th % 400 == 0){
			System.out.println(th + "thn kabisat");
		}
		else{
			System.out.println(th + " bkn kabisat");
		}
	}
	public String getCek(){
		return cek;
	}
}