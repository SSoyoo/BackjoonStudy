package B04_1차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class B_10871_01 {

	public static void main(String[] args) {
		/*
		 * 숫자 n입력 
		 * 숫자 x입력
		 * 
		 * n에서 입력받은 수 만큼의 숫자 입력 =  배열
		 * 
		 * 배열중에서 x보다 적은숫자들 출력 =>새로운 배열에 저장.어레이리스트
		 * 
		 */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("n입력");
	int n = sc.nextInt();
	int [] numbers = new int[n];
	System.out.println("n배열에 들어갈 값 입력");
	for(int i = 0; i<n ; i++) {
		numbers[i] = sc.nextInt();
	}
	
	System.out.println("x값입력");
	int x = sc.nextInt();
	
	
	for(int i = 0; i<n; i++) {
		if(numbers[i]< x) {
			System.out.println(numbers[i]);
		}
		
	
	
	}
	}
}
