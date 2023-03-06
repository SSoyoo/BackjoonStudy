package B06_문자열;

import java.util.Scanner;

public class B_10809 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String a = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i<a.length() ; i++) {
			System.out.print(s.indexOf(a.substring(i, i+1))+" ");
		}
		
	}

}
