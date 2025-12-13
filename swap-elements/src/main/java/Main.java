import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(swapElements(arr)));
	}
	
	private static int[] swapElements(int[] arr) {
		int temp = arr[0]; // 1
		arr[0] = arr[arr.length - 1]; // 4
		arr[arr.length - 1] = temp; // 1
		
		return arr;
	}
}
