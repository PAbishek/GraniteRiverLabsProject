package speed;
import java.util.*;

public class Userinput {
	Scanner sc=new Scanner(System.in);
	static ArrayList<Dataset> arr=new ArrayList<>();
	public void getInput() {
		int n=1;
		while(n<11) {
			System.out.println("Enter distance in km and time in hrs:");
			double dist=sc.nextDouble();
			double time=sc.nextDouble();
			arr.add(new Dataset(dist,time));
			n++;
		}
	}
	public void calculate() {
		for(Dataset d:arr) {
			double t=Measure.calc(d.getDistance(),d.getTime());
			d.setSpeed(t);
		}
	}
	public void print(){
		ShowResults.printCsv(arr);
	}
}
