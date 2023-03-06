package B03_반복문;

import java.util.Scanner;

public class B_10951_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { // hasNextInt() :정수이면 true, 정수가 아니면false를반환
			System.out.println(sc.nextInt()+sc.nextInt());
		}
				

	}

}
