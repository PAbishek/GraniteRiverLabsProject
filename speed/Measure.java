package speed;

public class Measure extends Grl
{
	public void calculate() 
	{
		for(Dataset d:arr) {
			d.setSpeed(d.getDistance()/d.getTime());
		}
	}

}
