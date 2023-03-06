package B04_1차원배열;

import java.util.Scanner;

public class B_5597_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] students = new int[30];
	
		
		for(int i = 0; i<28 ; i++) {
			int submit = sc.nextInt();
			students[submit-1] = 1;
		}
		
		
		for(int i = 0 ; i<30 ; i++) {
			if(students[i] != 1) {
				System.out.println(i+1);
			}
		}
		
		
	}

}
