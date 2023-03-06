package B03_반복문;

import java.util.Scanner;

public class B_2739_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<9 ; i++) {
			System.out.println(n + " * " +(i+1) +" = " + n*(i+1));
			
		}
	}

}
