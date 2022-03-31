package array;
import java.util.*;
public class arrayProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of days");
		int numDays = sc.nextInt();
		int [] temps = new int[numDays];
		int sum = 0;
		for(int i=0; i<numDays; i++) {
		   temps[i] = sc.nextInt();
			sum += temps[i];
		}
		float avg = sum/numDays;		
		
		int above =0;
		for(int j=0; j<temps.length; j++) {
			if(temps[j] > avg) {
				above++;
			}
		}
		System.out.println(avg);
		System.out.println(above + " " + "is above average");

	}

}
