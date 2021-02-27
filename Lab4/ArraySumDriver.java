/**
 * Recursion Lab
 * @author anabaide
 *
 */

public class ArraySumDriver {

	private final static int ARRAY_SIZE = 8;

	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];

		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;

		System.out.println("Sum of Array");

		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);

		myArray[index++] = 7;
		myArray[index++] = 1;

		sum = sumOfArray(myArray, 5);
		System.out.println(sum);

		myArray[index++] = 2;
		myArray[index++] = 1;

		sum = sumOfArray(myArray, 7);
		System.out.println(sum);

		System.out.println("Fibonacci");

		int result = fibonacci(18);
		System.out.println(result);

		result = fibonacci(8);
		System.out.println(result);
	}

	public static int sumOfArray(Integer[] arr, int num) {
		int index = num;
		if (index == 0) {
			return arr[index];
		}
		return arr[index] + sumOfArray(arr, --index);
	}

	/**
	 * Recursive method for generating sum of values in array
	 * 
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static <E extends Number> E sumOfArray(E[] arr, int num) {
		int index = num;
		if (index == 0) {
			return arr[index];
		}

		Double sum = arr[index].doubleValue() + sumOfArray(arr, --index).doubleValue();
		return (E) sum;
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

}