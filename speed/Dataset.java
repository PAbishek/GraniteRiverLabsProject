package speed;

public class Dataset {
	private double distance;
	private double time;
	private double speed;


	public Dataset() {
		distance=0;
		time=0;
		speed=0;
	}
	
	public Dataset(double dist,double tim) {
		distance=dist;
		time=tim;
		speed=0;
	}

	public double getDistance() {
		return distance;
	}

	public double getTime() {
		return time;
	}

	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double sp) {
		if(sp<0)
			System.out.println("invalid value "+sp);
		else
			speed=sp;
	}
}
