import java.util.Scanner;
public class PrimeUptoaNumber {
	public static void primeornot(int number) {
		int n, i;

		for (n = 1; n <= number; n++) {
			int flag = 0;
			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag++;
					break;
				}

			}

			if (flag == 0 && n != 1) {
				System.out.println(n);

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int num = sc.nextInt();
		primeornot(num);
		sc.close();

	}

}
