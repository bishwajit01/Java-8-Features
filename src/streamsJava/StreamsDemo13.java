/**
 * 
 */
package streamsJava;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * @author Bishwajit.
 *
 */
public class StreamsDemo13 {

	public static void main(String[] args) {
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 72, 4, 20).summaryStatistics();
		System.out.println(summary);
	}

}
