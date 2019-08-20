package streamsJava;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo4 {
	static List<String> list;
	static String[] arr = { "Bishwajit", "Abhijit", "Chhotu", "Anushree", "Aamini" };

	public static void main(String[] args) {
		sortedArray();
		System.out.println();
		filterArray();
		System.out.println();
		sortedList();
	}

	private static void filterArray() {
		// TODO Auto-generated method stub
		for (String s : arr)
			System.out.print(s + " ");
		System.out.println();
		Arrays.stream(arr) // same as --> Stream.of(arr)
				.filter(x -> x.startsWith("A")).sorted() // for reverse .sorted(Comparator.reverseOrder())
				.forEach(System.out::print);
	}

	private static void sortedList() {
		list = new ArrayList<String>();
		list.add("Bishu");
		list.add("Abhi");
		Stream.of(list).sorted().findFirst().ifPresent(System.out::print);
	}

	private static void sortedArray() {
		Stream.of(arr).sorted().findFirst().ifPresent(System.out::print);
	}
}
