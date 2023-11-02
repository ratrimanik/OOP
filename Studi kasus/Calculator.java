import java.util.Math;
import java.lang.Math;

public class Calculator extends View{
	public double Ball(){
		return(4/3) * Math.PI*Math.pow(getDiameter()/2, 2);
	}

	public double Cube(){
		return Math.pow(getDiameter(), 3);
	}
}