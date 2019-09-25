package lambda;

import java.util.function.BiConsumer;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo7 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int add = 5;
		int divide = 0;

		System.out.print("Original Array :: ");
		display(array);

		System.out.print("After Adding " + add + " to the Value :: ");
		processAddUsingBiConsumer(array, add, (k, v) -> System.out.print((k + v) + " "));

		System.out.println("Even after Lamda expression is for Divde it is overloaded by another Lambda For Addition.");
		System.out.print("Value :: ");
		processAddUsingBiConsumer(array, divide, processAdditionAfterDivide((k, v) -> System.out.print((k / v) + " ")));

		// Not Handling Exception
//		processAddUsingBiConsumer(array, divide,
//				processDivideUsingBiConsumerException((k, v) -> System.out.print((k / v) + " ")));

		// Handling Exception.
		processAddUsingBiConsumer(array, divide, wrapperLambda((k, v) -> System.out.print((k / v) + " ")));
	}

	private static void display(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void processAddUsingBiConsumer(int[] array, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : array) {
			biConsumer.accept(i, key);
		}
		System.out.println();
	}

	private static BiConsumer<Integer, Integer> processDivideUsingBiConsumerException(
			BiConsumer<Integer, Integer> biConsumer) {
		return biConsumer;
	}

	private static BiConsumer<Integer, Integer> processAdditionAfterDivide(BiConsumer<Integer, Integer> biConsumer) {
		return (k, v) -> System.out.print((k + v) + " ");
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (k, v) -> {
			try {
				biConsumer.accept(k, v);
			} catch (ArithmeticException e) {
				System.out.println("Exception Caught in Wrapper" + e);
			}
		};
	}
}
