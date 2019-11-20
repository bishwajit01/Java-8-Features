package streamsJava;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Bishwajit.
 *
 */
public class StreamsDemo14 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

		System.out.println("List String Element  :: " + strings);

		// Count of Empty String.
		long count = strings.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Count of Empty String :: " + count);

		// Count of String With Length more than 2.
		count = strings.stream().filter(s -> s.length() > 2).count();
		System.out.println("Count of String with length more than 2 :: " + count);

		// Filtered Elements.
		List<String> filteredElements = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered Stream :: " + filteredElements);

		// Merging the List.
		String mergedString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged List seprated by Comma :: " + mergedString);

		// Square of Numbers.
		List<Integer> squareNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("List Integer Element  :: " + numbers);
		System.out.println("Square of Numbers of List" + squareNumbers);

		// IntSummaryStatistics Calculations.
		IntSummaryStatistics stats = integers.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println("Highest Number ::" + stats.getMax());
		System.out.println("Minimum Number ::" + stats.getMin());
		System.out.println("Sum of All Number ::" + stats.getSum());
		System.out.println("Average of all Number ::" + stats.getAverage());

		// Random Number.
		Random random = new Random();
		System.out.println("Random Number Genearted :: ");
		random.ints().limit(10).sorted().forEach(System.out::println);

		// Parallel Process
		count = strings.parallelStream().filter(s -> s.isEmpty()).count();
		System.out.println("Empty String using Parallel Stream :: " + count);
	}

}
