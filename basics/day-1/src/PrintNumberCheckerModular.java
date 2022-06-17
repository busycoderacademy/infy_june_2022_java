import java.util.Scanner;

public class PrintNumberCheckerModular {

	public static int getInputFromTheUser() {
		System.out.println("PE a number");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		return no;
	}

	public static boolean checkForPrime(int no) {
		boolean isPrime = true;// let assume no is prime no

		for (int i = 2; i < no; i++) {

			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void printPrimeStatus(boolean isPrime) {

		if (isPrime) {
			System.out.println("it is a prime no");
		} else
			System.out.println("it is not a prime no");
	}

	public static void main(String[] args) {
		int no = getInputFromTheUser();

		boolean isPrime = checkForPrime(no);

		printPrimeStatus(isPrime);

	}
}
