package B01_입출력과사칙연산;
import java.util.Scanner;

public class B_3003_02 {

	public static void main(String[] args) {
		int[] chess = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("킹:");
		chess[0] = sc.nextInt();
		
		System.out.println("퀸:");
		chess[1] = sc.nextInt();
		
		System.out.println("룩:");
		chess[2] = sc.nextInt();
		
		System.out.println("비숍:");
		chess[3] = sc.nextInt();
		
		System.out.println("나이트:");
		chess[4] = sc.nextInt();
		
		System.out.println("폰:");
		chess[5] = sc.nextInt();
		
		System.out.println((1-chess[0])+" "+(1-chess[1]+" ")+(2-chess[2]+" ")+(2-chess[3]+" ")+(2-chess[4]+" ")+(8-chess[5]));
		
		

	}

}
