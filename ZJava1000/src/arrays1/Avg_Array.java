package arrays1;

public class Avg_Array {

	public static void main(String[] args) {
		int sum = 0;
		int values[] = { 10, 20, 30, 40, 50, 60 };
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		System.out.println("sum of array elements is " + sum);
		System.out.println("Total no of elements in array is " + values.length);
		double avg = sum / values.length;
		System.out.println("Avarage of all the values in array is " + avg);

	}

}
