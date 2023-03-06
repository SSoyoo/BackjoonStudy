package B05_함수;

class Dn{
	
	public static int dn(int n) {
		int sum = n;
		while(n !=0) {
			sum += n%10;
			n /= 10;
		}
		
		
		return sum;
	}
	
}

public class B_4673 {

	public static void main(String[] args) {
		
		boolean [] arr = new boolean[10001];
		
		for(int i = 1; i<10001 ; i++) {
			int n =Dn.dn(i);
			if(n<10001) {
				arr[n] = true;
				
			}
		}
		
		for(int i = 1; i<10001 ; i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}
		
		
	}

}
