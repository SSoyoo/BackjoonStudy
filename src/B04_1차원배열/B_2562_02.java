package B04_1차원배열;
import java.util.ArrayList;
import java.util.Scanner;

public class B_2562_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		int max =0;
		
		for(int i = 0; i <9 ; i++) {
			arr.add(sc.nextInt());
		}
		
		for(int i = 0; i<arr.size() ; i++) {
			if(max < arr.get(i)) {
				max = arr.get(i);
			}
		}
	
		System.out.println(max);
		System.out.println(arr.indexOf(max)+1);
	}

}