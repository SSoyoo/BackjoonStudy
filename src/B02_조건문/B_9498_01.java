package B02_조건문;
import java.util.Scanner;
public class B_9498_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		String result = null;
		
		if(score>=90 && score<=100) {
			result ="A";		
		}else if(score>=80 && score<90) {
			result = "B";
		}else if(score>=70 && score<80) {
			result = "C";
		}else if(score>=60 && score<70) {
			result = "D";
		}else {
			result = "F";
		}
				
	  System.out.println(result);
	}

}
