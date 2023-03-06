package B02_조건문;
import java.util.Scanner;
public class B_2525_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int hour = sc.nextInt();
		int minuet =sc.nextInt();
		int time = sc.nextInt();
		int temp;
		
		minuet += time ;
		
		if(minuet>60) { 
			temp = minuet/60;
			minuet = minuet-(temp*60);
			hour = temp+ hour;
					if(hour>=24) {
						hour = 24-hour;
					}
			
		}
	}

}
