package B03_반복문;

import java.util.StringTokenizer;
import java.io.*;


public class B_10951 {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	StringTokenizer st;
	String s;
	
	while( (s = br.readLine())!=null ) {
		st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
	}
			
	br.close();
					
		
	}

}
