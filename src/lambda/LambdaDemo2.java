package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo2 {

	public static void main(String[] args) {
		
		// Multiple Inputs
		Cab2 cab = (source, time) -> System.out
				.println("UBER Booked at " + source + "! Arriving SOON in " + time + " Minutes");
		cab.bookCab("Basapura", "5");
	}

}

// Interface with Multiple Input
interface Cab2 {
	void bookCab(String source, String time);
}
