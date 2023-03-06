package B02_조건문;
import java.util.Scanner;
public class B_2884_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); 
		int m = sc.nextInt();
		
		if(m<45) {
			m =m+15;
			h --;
			
            if(h<0) {
                h=23;
			}
		}else m = m-45;
		
		System.out.println(h+" "+m);
	}

}
