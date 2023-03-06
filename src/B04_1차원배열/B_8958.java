package B04_1차원배열;

import java.util.Scanner;


public class B_8958 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] arr = new String [n];
	
		sc.nextLine();
		
	for(int i = 0; i<arr.length ; i++) {
		arr[i] = sc.nextLine();
	} //ox 를 n개만큼 입력받았음
	
	for(int i = 0; i<arr.length ; i++) {
		int count = 0 ; 
		int sum = 0 ;
		for(int j = 0; j<arr[i].length() ; j++) {
			if(arr[i].charAt(j) == 'O') {
				count ++;
			}
			else {
				count = 0;
			}
			sum += count;
		}
		System.out.println(sum);
	}
	
	
	}
}
