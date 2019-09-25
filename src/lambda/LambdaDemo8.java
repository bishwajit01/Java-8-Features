package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo8 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, (num) -> System.out.println("Sum :: " + (a + b)));
	}

	private static void doProcess(int num, Process p) {
		p.perform(num);
	}

}

interface Process {
	void perform(int num);
}