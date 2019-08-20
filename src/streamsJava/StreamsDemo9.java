package streamsJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Streams rows from CSV File and count.
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo9 {

	public static void main(String[] args) throws IOException {
		Stream<String> rows = Files.lines(Paths.get("C:\\newCoLogs\\SampleCsv.csv"));
		int numberOfRows = (int) rows.map(x -> x.split(",")).filter(x -> x.length == 17).count();
		System.out.println("Number of Rows :: " + numberOfRows);
		rows.close();
	}
}
