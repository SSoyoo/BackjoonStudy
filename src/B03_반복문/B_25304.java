package B03_반복문;

import java.util.Scanner;

public class B_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영수증의 총 금액 입력 : ");
		int x = sc.nextInt();
		System.out.println("구매한 총 개수 입력: ");
		int y = sc.nextInt();
		
		int [] a = new int[y];
		int [] b = new int[y];
		
		int total = 0;
		
		for (int i = 0; i<y; i++) {
			
			System.out.println(i+1 +"번째 물건의 가격");
			a[i] = sc.nextInt();
			System.out.println(i+1 +"번째 물건의 개수");
			b[i] = sc.nextInt();
			
			total += a[i]*b[i];
			System.out.println("현재까지의 합계:" + total);
		}

				
		if(total == x) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
	}

}
