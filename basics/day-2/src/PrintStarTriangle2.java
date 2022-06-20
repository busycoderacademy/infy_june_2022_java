import java.util.Scanner;
public class PrintStarTriangle2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("PE enter no of steps ....");
		int value = scanner.nextInt();

		for (int i = 0; i < value; i++){

			for (int j = value; j > i; j--)
				System.out.print(" ");

			for (int j = 0; j < (2 * i + 1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}