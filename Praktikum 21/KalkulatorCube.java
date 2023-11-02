public class KalkulatorCube implements Kalkulator{
	public Cube cube;

	@Override
	public void generateShape(long rusuk){
		this.cube = new Cube();
		this.cube.rusuk = rusuk;
	}

	@Override
	public long calculateVolume(){
		this.cube.volume = this.cube.rusuk * this.cube.rusuk * this.cube.rusuk;
		return this.cube.volume;
	}
}