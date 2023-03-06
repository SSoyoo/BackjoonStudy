package B04_1차원배열;
import java.io.*;
import java.util.*;
public class B_10807_02_BufferedReader {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("n입력: ");
		int n = Integer.parseInt(br.readLine());
		int [] numbers = new int[n];
		
		int count = 0;
		System.out.println("배열에 들어갈 숫자들 입력");
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n ; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println("찾을 숫자 입력");
		int v = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			if(numbers[i] == v) {
				count ++;
			}
		}
		
		System.out.println(count);
		br.close();
	

	}

}
