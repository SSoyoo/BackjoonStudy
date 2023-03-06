package B02_조건문;

import java.util.Scanner;

public class B_2480_01 {

	public static void main(String[] args) {
		/*
		 * 주사위를 3개 굴린다
		 * 같은 눈이 3개가 나오면 10000+(같은눈)*1000원의 상금
		 * 같은 눈이 2개만 나오면 1000원+(같은눈)*100원의 상금
		 * 모두 다른 눈이 나오면 (가장 큰 눈)*100원의 상금
		 * 
		 * 같은 눈은 어떻게 찾는
		 */
		
		
		/*
		 * 1) 세개의 값 주어짐
		 * 2)같은 거 카운트 하기 ->변수하나 만들기
		 * 
		 * 조건문에서 
		 * if(카운트가 3이면){
		 * 	상금계산~
		 * }else if(카운트가 2이면){
		 *  상금계산
		 * }else if(카운트가 2미만이면){
		 * 	최대수 비교해서 곱하기
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int max =0;
		
		
		if(a>max) {
			max = a;
		}else if(b>max) {
			max = b;
		}if(c>max) {
			max = c;
		}
		
		if(a == b && b==c) {
			System.out.println(10000 + (a*1000));
		}else if ( a !=b && b!=c && c!=a) {
			System.out.println(max*100);
		}else if (a == b || a == c) {
			System.out.println(1000+ (a*100));
			//b랑 c가 같은 경우를 생각안함
		}
	}
}
