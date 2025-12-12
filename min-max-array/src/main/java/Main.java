import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = {7, 1, 2, 3, 4, 5, -1};
		System.out.println("Минимум: " + minArray(array));
		System.out.println("Максимум: " + maxArray(array));
	}
	
	public static int minArray(int[] nums) {
		if (nums.length == 0) {
			throw new IllegalArgumentException("Массив пустой");
		}
		
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	public static int maxArray(int[] nums) {
		if (nums.length == 0) {
			throw new IllegalArgumentException("Массив пустой");
		}
		
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

}
