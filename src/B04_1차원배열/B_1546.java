package B04_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class B_1546 {

	public static void main(String[] args) {
		
		//과목갯수을 입력받을 변수 N
		//그 변수갯수만큼의 배열 score []
		//그 중에 최대값을 담을 변수 M
		//0번인덱스/M*100 으로 배열의 값 순서대로 변경하기
		
		// 변경하고 나서다시 배열의 값으로 평균 구해서 출력하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double [] score = new double [n];
		double max = 0;
		double temp = 0;
		
		//배열에 점수 담고 최대값 구하기
		for(int i = 0; i < n ; i++) {
			score[i] = sc.nextDouble();
		}
		

		for(int i = 0; i < n ; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.println(Arrays.toString(score));
		System.out.println(max);
		
		//조작한 점수 배열에 다시 담기
		
		for(int i = 0; i < n ; i++) {
			score[i] = score[i]/max * 100 ;
		}
		
		System.out.println(Arrays.toString(score));
		
		// 배열에 있는 점수 다 더하기
		for(int i = 0; i < n ; i++) {
			temp += score[i];
		}
		//n으로 나누어서 조작한 평균 출력
		System.out.println(temp/n);
		
	}

}
