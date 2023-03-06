package B05_함수;

import java.util.Scanner;

public class B_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <=n ; i++) {
			if(Hansu.isHansu(i)) {
				count ++;
			}
		}
		
		System.out.println(count);
	}

}


class Hansu{
	
	public static boolean isHansu(int n) {
		
		int digits = (int)Math.log10(n)+1;
		
		if(digits < 3) {
			return true;
		}
		
		int [] arr = new int[digits];
		int i = 0; 
		while(n > 0) {
			arr[i++] = n % 10; 
			n /= 10;
		}
		
		int diff = arr[1]- arr[0];
		for(i = 1; i<digits-1 ; i++) {
			if(arr[i+1] - arr[i] != diff) {
				return false;
				
			}
		}
		return true	;
		
	}
}	

		

	