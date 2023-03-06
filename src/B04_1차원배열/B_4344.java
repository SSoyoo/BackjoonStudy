package B04_1차원배열;

import java.util.Scanner;

public class B_4344 {
	
	public static void main(String[] args) {
	
		/*
		 * 테스트 케이스가 주어진다 (스캐너)
		 * 배열의 크기는 n+1이 되어야한다 -> 첫번째 인덱스는 과목의 갯수이기때문에
		 * 1번 인덱스부터 점수가 입력된다
		 * 
		 * 인덱스 [0] 에는 n이 들어갈것이고
		 * for문은 1부터 돌려야 하나?
		 * 
		 */
		
		 Scanner sc = new Scanner(System.in);
		
		 int t = sc.nextInt();
		 
		 for(int i = 0 ; i< t ; i++) {
			 int n = sc.nextInt();
			 int [] a = new int[n];
			 int sum =0 ;
			 for(int j = 0 ; j< n ; j++) {
				 a[j] = sc.nextInt();
				 sum += a[j];
			 }
			 
			 double avg = (double)sum / n;
			 int cnt = 0; // 평균보다 점수가 높은 학생 수 
			 for(int j = 0 ; j < n ; j++) {
				 if(a[j] > avg) {
					 cnt++;
				 }
			 }
			 
			 double result = (double)cnt/n*100;
			 System.out.println(result);
		 }
		
		
	}

}
