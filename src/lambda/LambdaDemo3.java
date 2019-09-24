package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo3 {

	public static void main(String[] args) {
		Cab3 cab = (distance, rate) -> {
			return (distance * rate);
		};
		System.out.println("Rate as per distance travelled : " + Math.round(cab.uberFare(4.01, 20)));
	}

}

// With a return type.
interface Cab3 {
	double uberFare(double distance, double rate);
}