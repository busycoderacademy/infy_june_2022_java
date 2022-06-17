import java.util.Scanner;

public class PrintNumberChecker {

	public static void main(String[] args) {
		System.out.println("PE a number");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();

		boolean isPrime = true;// let assume no is prime no

		for (int i = 2; i < no; i++) {

			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("it is a prime no");
		} else
			System.out.println("it is not a prime no");

	}
}
