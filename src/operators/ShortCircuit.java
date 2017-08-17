package operators;

import static mindView.base.Print.print;

public class ShortCircuit {
	static boolean test1(int val) {
		print("test1(" + val + ")");
		print("result: " + (val < 1));
		return val < 1;
	}

	static boolean test2(int val) {
		print("test2(" + val + ")");
		print("result: " + (val < 2));
		return val < 2;
	}

	static boolean test3(int val) {
		print("test3(" + val + ")");
		print("result: " + (val < 3));
		return val < 3;
	}

	public static void main(String[] args) {
		boolean b = test1(6) || test2(2) ||test3(2);
		//boolean b = test1(0) && test2(2) && test3(2);	---【&&】直接执行遇到false后，跳过后面的
		print("expression is " + b);
	}
}