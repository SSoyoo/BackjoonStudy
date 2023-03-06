package B04_1차원배열;

import java.util.Scanner;

public class B_1546_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] score = new int [n];
		int max = 0;
		int sum = 0;
		double a = 0;



		for(int i = 0 ; i< n ; i++) {
			score[i] = sc.nextInt();
			if(max < score[i]) {
				max = score[i];
			}
			
			sum += score[i];
		}
	
		
		a = ((sum/max)*100)/n;
		
		
		System.out.println(a);
	}

}
