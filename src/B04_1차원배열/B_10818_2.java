package B04_1차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class B_10818_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		for (int i = 0 ; i< n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int num : arr) {
			if(max < num ) {
				max = num; 
			}if(min > num) {
				min = num;
			}
		}
		
		System.out.println(min+" "+max);
		
	}
}