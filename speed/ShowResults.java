package speed;

import java.io.*;

public class ShowResults extends Grl {

	public void printCsv() {
		try {
			String s1="Distance";
			String s2="Time";
			String s3="Speed";
			File csvFile=new File("output.csv");
			PrintWriter pw=new PrintWriter(csvFile);
			pw.printf("%s, %s, %s",s1,s2,s3);
			pw.println();
			for(Dataset d:arr) {
				pw.printf("%f, %f, %f",d.getDistance(),d.getTime(),d.getSpeed());
				pw.println();
			}
			pw.close();
			System.out.println("File created");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
