package B06_문자열;

import java.util.Scanner;

public class B_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int sum = 0 ;
		
		for(int i = 0; i < s.length() ; i++) {
			
			int a = Integer.parseInt(s.substring(i,i+1));
			sum += a;
			
		}
		
		
		System.out.println(sum);
		
	}

}
