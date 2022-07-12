package speed;
import java.util.*;
public class Grl {
	static ArrayList<Dataset> arr=new ArrayList<>();
	public static void main(String[] args) {
		Measure m=new Measure();
		Userinput a=new Userinput();
		ShowResults s=new ShowResults();
		a.getInput();
		m.calculate();
		s.printCsv();
	}

}
