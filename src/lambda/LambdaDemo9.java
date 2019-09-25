package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo9 {

	public static void main(String[] args) {

		// Lambda Expression.
		Thread thread = new Thread(() -> printMessage());
		thread.start();

		// Method Reference
		// SYNTAX :: CLASS_NAME::METHOD_NAME
		Thread t1 = new Thread(LambdaDemo9::printMessage);
		t1.start();

	}

	private static void printMessage() {
		System.out.println("Thread Operations");
	}

}
