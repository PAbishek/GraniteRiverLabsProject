package speed;
import java.util.*;

public class Userinput extends Grl {
	Scanner sc=new Scanner(System.in);
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
}
