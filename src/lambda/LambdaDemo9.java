package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo9 {

	public static void main(String[] args) throws InterruptedException {

		// Lambda Expression.
		System.out.println("**********USING LAMBDA**********");
		System.out.println("--------USING THREAD----------");
		Thread thread = new Thread(() -> printMessage());
		thread.start();
		Thread.sleep(100);

		// Method Reference :: Reference to a static Method
		// SYNTAX :: CLASS_NAME::METHOD_NAME
		System.out.println();
		System.out.println("**********METHOD REFERENCE TO A STATIC METHOD**********");
		System.out.println("--------USING THREAD----------");
		Thread t1 = new Thread(LambdaDemo9::printMessage);
		t1.start();
		Thread.sleep(100);

		// Method Reference :: Reference to a static Method
		System.out.println("--------No Parameter----------");
		Sayable sayable = LambdaDemo9::printMessage;
		sayable.say();

		// Method Reference :: Reference to a static Method.
		System.out.println("--------With Parameter----------");
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(3, 4);
		System.out.println("Result :: " + result);

		// Method Reference :: Reference to a Instance Method
		System.out.println();
		System.out.println("**********METHOD REFERENCE TO A INSTANCE METHOD**********");
		System.out.println("--------No Parameter----------");
		LambdaDemo9 obj1 = new LambdaDemo9();
		Sayable say1 = obj1::printMessageNonStatic;
		say1.say();
		
		// Method Reference :: Reference to a Instance Method using Thread.
		System.out.println("--------USING THREAD----------");
		Thread t2 = new Thread(new LambdaDemo9()::printMessageNonStatic);
		t2.start();
		Thread.sleep(100);
		
		// Method Reference :: Reference to a Instance Method.
		System.out.println("--------Parameter----------");
		BiFunction<Integer, Integer, Integer> subtract = new Arithmetic()::subtract;
		result = subtract.apply(5, 2);
		System.out.println("Result :: " + result);
	}

	private static void printMessage() {
		System.out.println("Print Operations Static");
	}

	private void printMessageNonStatic() {
		System.out.println("Print Operations Non-Static");
	}
}

interface Sayable {
	void say();
}

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
}