package streamsJava;

import java.util.Arrays;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo5 {

	public static void main(String[] args) {
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::print);

	}

}
