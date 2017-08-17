package operators;

import java.util.Random;

import static mindView.base.Print.print;

public class Bool {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i = " + i);
		print("j = " + j);
		print("i > j is " + (i > j));
		print("i < j is " + (i < j));
		print("i >= j is " + (i >= j));
		print("i <= j is " + (i <= j));
		print("i == j is " + (i == j));
		print("i != j is " + (i != j));
		// Treating an int as a boolean is not legal Java:
		// ! print("i && j is " + (i && j));	---int 类型，不能直接比较，bool操作
		// ! print("i || j is " + (i || j));
		// ! print("!i is " + !i);
		
		print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 60)));
		print("(i < 10) || (j < 100) is " + ((i < 10) || (j < 100)));
	}
}