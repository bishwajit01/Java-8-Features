package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo12 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(System.out::print);
		
		System.out.println();
		evalution(list, n -> n % 2 == 0);
		
		System.out.println();
		evalution(list, n -> true);
		
		System.out.println();
		evalution(list, n -> n > 3);
	}

	public static void evalution(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.print(n + " ");
			}
		}
	}

}