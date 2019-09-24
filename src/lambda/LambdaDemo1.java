package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo1 {

	public static void main(String[] args) {
		
		// Polymorphic Way.
		Cab cab1 = new Uber();
		System.out.print("Polymorphic Way :: ");
		cab1.bookCab();

		// Anonymous Way
		Cab cab2 = new Cab() {

			@Override
			public void bookCab() {
				System.out.println("Anonymous Way:: UBER Booked ! Arriving SOON!!");
			}
		};
		cab2.bookCab();

		// Lambda Expression
		Cab cab3 = () -> {
			System.out.println("Lambda :: UBER Booked ! Arriving SOON!!");
		};
		cab3.bookCab();
	}

}

class Uber implements Cab {

	@Override
	public void bookCab() {
		System.out.println("UBER Booked ! Arriving SOON!!");
	}

}

interface Cab {
	void bookCab(); // -> Default Signature : public, abstract.
}