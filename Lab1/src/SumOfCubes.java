import java.util.Scanner;
public class SumOfCubes {
	public static int sumOfCube(int number) {
		int result = 0;
		for(int i = 0;i<=number;i++) {
			int rem = number % 10;
			result += rem * rem * rem;
			number = number / 10;
			}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int res = sumOfCube(number);
		System.out.println("Result : "+res);

	}

}
