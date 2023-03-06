package B04_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class B_10807 {

	public static void main(String[] args) {
		/*
		 * 첫째줄에 정수 n이 주어짐
		 * 둘째줄에는 정수가 공백으로 구분되어져있고
		 * 셋째줄에 찾으려고 하는 정수 v가 몇개인지 출력한다
		 */
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("n을 입력하세요");
	int n = sc.nextInt();
	int [] numbers = new int [n];
	
	System.out.println("숫자 입력하세요");
	for(int i =0 ; i< n ; i++) {
		numbers[i]= sc.nextInt();
	}
	
	System.out.println(Arrays.toString(numbers));
	
	System.out.println("찾을 숫자 입력");
	int v= sc.nextInt();
	int c =0;
	for(int i = 0; i<n; i++) {
		if(numbers[i] == v) {
			c++;
		}
		
	}
	System.out.println(c);
	
	
	}

}
