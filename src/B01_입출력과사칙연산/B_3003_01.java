package B01_입출력과사칙연산;
import java.util.Scanner;

public class B_3003_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int king = scanner.nextInt();
		int queen = scanner.nextInt();
		int rook = scanner.nextInt();
		int bishope = scanner.nextInt();
		int kinght = scanner.nextInt();
		int pawn = scanner.nextInt();

		System.out.println(
			""+(1-king) +
			""+(1-queen) +
			""+(2-rook) +
			""+(2-bishope)+
			""+(2- kinght)+
			""+(8-pawn)
				
				);
	}

}
