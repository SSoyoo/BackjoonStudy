package B03_반복문;

import java.util.Scanner;

public class B_11022 {

	public static void main(String[] args) {
		
		/*
		 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
		 * x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		
		
		
		for (int i = 0 ; i<t ; i ++){
			
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = A+B;
		
		System.out.println("Case #"+(i+1)+":" + A+"+"+B + " = " + (A+B) );	
		
		}
	}

}
