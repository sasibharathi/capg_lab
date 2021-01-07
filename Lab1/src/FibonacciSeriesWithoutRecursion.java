import java.util.Scanner;
public class FibonacciSeriesWithoutRecursion {
	public static int fibonacci(int number){
		for(int i=0; i<= number; i++){ 
			System.out.print(getFibonacci(i) + " "); 
			}
		return number;
		} 
	public static int getFibonacci(int n){
		if (n == 0) { 
			return 0;
			} 
		if (n == 1){ 
			return 1; 
			} 
		int first = 0; int second = 1; int nth = 1;
			for (int i = 2; i <= n; i++) {
				nth = first + second;
				first = second;
				second = nth;
				}
			return nth;
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fib = sc.nextInt();
		fibonacci(fib);
		
		sc.close();
		

	}

}
