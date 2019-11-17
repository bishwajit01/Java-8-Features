package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo11 {

	public static void main(String[] args) {

		// With Type Declaration
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println("Addition :: " + operator(5, 10, addition));

		// With Type Declaration
		MathOperation substraction = (int a, int b) -> a - b;
		System.out.println("Substraction :: " + operator(5, 10, substraction));

		MathOperation multiply = (int a, int b) -> {
			return a * b;
		};
		System.out.println("Multiply :: " + operator(5, 10, multiply));

		// Without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;
		System.out.println("Division :: " + operator(50, 10, division));

		// Without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		greetService1.greet("Vikram");

		// With parenthesis
		GreetingService greetService2 = message -> {
			System.out.println("Hello " + message);
		};
		greetService2.greet("Bishwajit");

	}

	private static int operator(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

@FunctionalInterface
interface GreetingService {
	void greet(String msg);
}