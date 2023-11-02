public class TesDate{
	public static void main(String args[]){
		Date birthday = new Date();
		birthday.day = 28;
		birthday.month = 12;
		birthday.year = 2003;

		System.out.println("Day : " + birthday.getDay());
		System.out.println("Month : " + birthday.getMonth());
		System.out.println("Year : " + birthday.getYear());
	}
}