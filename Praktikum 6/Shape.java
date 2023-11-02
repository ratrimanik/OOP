public class Shape{
	public double length;
	public double width;
	public double height;
	public double volume;

	public Shape(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double compareTo(Shape shape){
		return (Math.abs(volume - (shape.length * shape.width * shape.height)));
	}
	
	public void calculateVolume(){
		volume = length * width * height;	
	}
	
	public void cetak(){
		System.out.printf("panjang x lebar x tinggi = %.0f x %.0f x %.0f\n", length, width, height );
		calculateVolume();
		System.out.println("Volume = " + volume);
	} 
}