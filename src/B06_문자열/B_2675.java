package B06_문자열;

import java.util.Scanner;

public class B_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		String [] arr = new String[t];
		
		
		StringBuilder p = new StringBuilder();
	
	

		for(int i = 0 ; i<arr.length ;i++) {
			System.out.println("반복할 횟수 : ");
			int s = sc.nextInt();
			sc.nextLine();
			System.out.println("반복할 단어 : ");
			arr[i] = sc.nextLine();
			p = null;
			for(int j = 0  ; j<arr[i].length() ; j++) {
				for(int k = 0 ; k<s ; k++) {
					p.append(arr[i].substring(j,j+1));
				}
			}
			System.out.println(p);
			
		}
		
		
		
		
		
		
		
	}
}
