package B04_1차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class B_5597_02 {

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
		
		for(int i = 0; i<submit.size() ; i++) {
			if(students.contains(submit.get(i))) {
				students.remove(submit.get(i));
			}

		}
		
		if(students.get(0) < students.get(1)) {
			System.out.println(students.get(0) + "\n"+students.get(1));
		}else {
			System.out.println(students.get(1) + "\n"+students.get(0));
		}
	}

}
