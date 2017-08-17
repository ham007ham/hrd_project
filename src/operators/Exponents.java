package operators;

public class Exponents {
	public static void main(String[] args) {
		// Uppercase and lowercase ‘e’ are the same:
		float expFloat = 1.39e-43f;
		//expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d; // ‘d’ is optional	---[f/e/d] 在数字后面是关键字，不区分大小写，可省略
		double expDouble2 = 47e57; // Automatically double
		System.out.println(expDouble);
		System.out.println(expDouble2);
	}
}