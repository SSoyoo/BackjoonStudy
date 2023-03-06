package B04_1차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class B_5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> students = new ArrayList<>();
		ArrayList<Integer> submit = new ArrayList<>();
		
		for(int i = 0; i < 30 ; i++) {
			students.add(i+1);
		}
		
		System.out.println(students);
		
		for(int i = 0 ; i <28 ; i++) {
			submit.add(sc.nextInt());
		}
		
		System.out.println(submit);
		
		for(int i = 0; i<students.size() ; i++) {
			for(int j = 0; j<submit.size()	; j++) {
				if(students.get(i) == submit.get(j)) {
					students.remove(i);
					
				}
				
			}
		}
		
		System.out.println(students.toString());
	}

}
