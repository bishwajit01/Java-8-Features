package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo6 {

	public static void main(String[] args) {
		// Primitive RUNNABLE
		primitiveWay();

		// LAMBDA RUNNABLE
		usingLambda();
	}

	private static void usingLambda() {
		Thread thread = new Thread(() -> System.out.println("LAMBDA RUNNABLE"));
		thread.run();
	}

	private static void primitiveWay() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("PRIMTIVE RUNNABLE");
			}
		});
		thread.run();
	}

}
