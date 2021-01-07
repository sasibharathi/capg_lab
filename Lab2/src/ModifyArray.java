import java.util.Arrays;
import java.util.Scanner;
public class ModifyArray {
	private static int[] sorted(int arr[]) {
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		int sortarr[] = new int[j];
		for (int i1 = 0; i1 < j; i1++) {
			sortarr[i1] = temp[i1];
		}
		
		return sortarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : of elements");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		int array[] = new int[n];
		for (int index = 0; index < n; index++) {
			array[index] = sc.nextInt();
		}
		System.out.println("-------------");
		int[] result = sorted(array);
		for(int i = result.length-1;i >=0;i--) {
			System.out.println(result[i]);
		}
	}

}
