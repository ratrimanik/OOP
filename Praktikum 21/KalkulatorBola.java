public class KalkulatorBola implements Kalkulator{
	public Bola bola;

	@Override
	public void generateShape(long diameter){
		this.bola = new Bola();
		this.bola.diameter = diameter;
	}

	@Override
	public long calculateVolume(){
		double radius = 0.5 * this.bola.diameter;
		this.bola.volume = (long) (long) (4/3) * Math.PI * radius * radius * radius);
		return this.bola.volume;
	}
}