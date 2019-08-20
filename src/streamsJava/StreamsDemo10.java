/**
 * 
 */
package streamsJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Bishwajit.
 *
 */
public class StreamsDemo10 {

	public static void main(String[] args) throws IOException {
		Stream<String> rows = Files.lines(Paths.get("C:\\newCoLogs\\SampleCsv.txt"));
		rows.map(x -> x.split(",")).filter(x -> x.length == 4).filter(x -> Integer.parseInt(x[1]) > 55)
				.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows.close();
	}

}
