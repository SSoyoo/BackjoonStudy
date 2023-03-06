package B04_1차원배열;

import java.util.*;


public class B_3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		for(int i = 0; i<10 ; i++) {
			arr[i] = (sc.nextInt())%42;
		}
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0 ; i < arr.length ; i++) {
			hs.add(arr[i]);
		}
		

		System.out.println(hs.size());
	}

}
