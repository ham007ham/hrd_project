package operators;

//import static mindView.base.Print.print;

import java.util.Random;

import static mindView.base.Print.printBinaryLong;

public class BitManipulation {
	public static void main(String[] args) {
		Random rand = new Random(47);
//		int i = rand.nextInt();
//		int j = rand.nextInt();
////		printBinaryInt("-1", -1);
////		print("printBinaryLong");
////		printBinaryLong("-1", -1);	//long :64bit, 64个 1
////		print("");
////		printBinaryInt("+1", +1);
////		int maxpos = 2147483647;
////		printBinaryInt("maxpos", maxpos);
////		int maxneg = -2147483648;
////		printBinaryInt("maxneg", maxneg);
////		print("");print("");
//		printBinaryInt("i", i);
//		printBinaryInt("~i", ~i);	//按位取反，补码
//		printBinaryInt("-i", -i);	// -i就是正数，补码+1
//		printBinaryInt("j", j);
//		printBinaryInt("i & j", i & j);
//		printBinaryInt("i | j", i | j);
//		printBinaryInt("i ^ j", i ^ j);		//相反取1，相同得0
//		printBinaryInt("i << 5", i << 5);
//		printBinaryInt("i >> 5", i >> 5);
//		printBinaryInt("(~i) >> 5", (~i) >> 5);
//		printBinaryInt("i >>> 5", i >>> 5);
//		printBinaryInt("(~i) >>> 5", (~i) >>> 5);
		long l = rand.nextLong();
		long m = rand.nextLong();
		printBinaryLong("-1L", -1L);	//-1 长整形 二进制 是反码【64个1】
		printBinaryLong("+1L", +1L);
		long ll = 9223372036854775807L;
		printBinaryLong("maxpos", ll);	//二进制【0111...111, [...] 64-7个1】
		long lln = -9223372036854775808L;
		printBinaryLong("maxneg", lln);
		printBinaryLong("l", l);
		printBinaryLong("~l", ~l);
		printBinaryLong("-l", -l);
		printBinaryLong("m", m);
		printBinaryLong("l & m", l & m);
		printBinaryLong("l | m", l | m);
		printBinaryLong("l ^ m", l ^ m);
		printBinaryLong("l << 5", l << 5);
		printBinaryLong("l >> 5", l >> 5);
		printBinaryLong("(~l) >> 5", (~l) >> 5);
		printBinaryLong("l >>> 5", l >>> 5);
		printBinaryLong("(~l) >>> 5", (~l) >>> 5);
	}
/*
Shifts can be combined with the equal sign (<<= or >>= or >>>=).
however, with the unsigned right shift combined with assignment. If you use it with byte or short, 
you don’t get the correct results.
Instead, these are promoted to int and right shifted, but then truncated as they are assigned
back into their variables, so you get -1 in those cases.

i, int: -1172028779, binary:
10111010001001000100001010010101
i >>> 5, int: 97591828, binary:
101110100010010001000010100
 --- 负数右移【>>>】符号 有变化，变正数
*/
	
//	static void printBinaryInt(String s, int i) {
//		print(s + ", int: " + i + ", binary:\n" + Integer.toBinaryString(i));
//	}

//	static void printBinaryLong(String s, long l) {
//		print(s + ", long: " + l + ", binary:\n" + Long.toBinaryString(l));
//	}

}
