package B01_입출력과사칙연산;
import java.util.Scanner;
public class B_3003_03 {

	public static void main(String[] args) {
		
		int [] chess = {1,1,2,2,2,8};
		int [] pieces = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<pieces.length; i++) {
			pieces[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<6 ; i++) {
			System.out.println(chess[i]-pieces[i]);
		}
	}

}
