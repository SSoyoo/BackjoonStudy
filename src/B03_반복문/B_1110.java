package B03_반복문;

import java.util.Scanner;

public class B_1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = n;
		int count = 0;
		
		while(true) {
			
			int a = t/10;
			int b = t%10;
			
			t = ((t%10)*10) + ((a+b)%10);
			
			count++;
			
			if(t == n) {
				break;
			}
			
		}
		System.out.println(count);
		
	}

}
