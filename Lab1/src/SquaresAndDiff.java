import java.util.Scanner;
public class SquaresAndDiff {

		public static int calculateDiff(int number) {
			int sum1 =0,sum2 = 0,result =0;
			for(int i =0;i<=number;i++) {
				sum1 += i * i;
				sum2 += i;
				result = sum1 + (sum2 * sum2);
			}
			return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = calculateDiff(num);
		System.out.println(res);
		sc.close();
	}

}
