package B02_조건문;
import java.util.Scanner;

public class B_2884_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt()-45;
		
		if(m<0) {
			h --;
			m = m+60;
			if(h<0) {
				h = h+24;
			}
		}
		
		System.out.println(h +"" + m);
		
	}

}
