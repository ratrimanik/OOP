public class Fans{
	private String name;

	public Fans(){
		name = "noname";
	}

	public Fans(String name){
		this.name = name;
	}

	public void showName(){
		System.out.print("\n" + name + " : ");
	}

	public void watchingPerformance(){
		System.out.println(this.name + " : " + "melihat idolanya dari youtube");
	}

	public void watchingPerformance(Musician musician){
		showName();
		System.out.print("melihat idolanya");
		musician.perform();
	}
}