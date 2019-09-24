/**
 * 
 */
package lambda;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Method Reference.
		// 1. Referring to a static Method.
		Calculator cal = Calculate::addSomething;
		cal.add(4, 9);

		// 2. Referring to a static Method.
		Calculate calci = new Calculate();
		Calculator cRef = calci::letsAdd;
		cRef.add(6, 9);
	}

}

class Calculate {
	public static void addSomething(int n, int m) {
		System.out.println("Addition of " + n + " and " + m + " is : " + (n + m));
	}

	public void letsAdd(int n, int m) {
		System.out.println("Addition of " + n + " and " + m + " is : " + (n + m));
	}
}

interface Calculator {
	void add(int a, int b);
}