package B03_반복문;

import java.util.Scanner;

public class B_8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0 ;
		
		for(int i =0; i<n; i++) {
			result = result+(1+i);
			
		}
		System.out.println(result);
	}

}
