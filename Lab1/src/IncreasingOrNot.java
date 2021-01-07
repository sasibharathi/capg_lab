import java.util.Scanner;
public class IncreasingOrNot {
	public static boolean checkNumber(int num) {
	       boolean flag = false;
	       int currentDigit = num % 10;
	       num = num/10;
	       while(num>0){
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }
	           currentDigit = num % 10;
	           num = num/10;
	       }      
	       if(flag){
	           return false;
	       }else{
	           return true;
	       }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean res = checkNumber(num);
		System.out.println(res);
		sc.close();
	}

}
