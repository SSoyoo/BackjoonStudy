package B03_반복문;

import java.util.Scanner;

public class B_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수입력");
		int t = sc.nextInt();
		for(int i = 0 ; i <t; i++) {
			System.out.println("a와 b값을 입력");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
	

	}

}
