public class Main {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		Result r = sumAvgArray(arr);
		System.out.println(r.sum);
		System.out.println(r.avg);
	}
	
	public static Result sumAvgArray(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / arr.length;
		return new Result(sum, avg);
	}
}
