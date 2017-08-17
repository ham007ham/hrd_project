package operators;

import static mindView.base.Print.print;

public class URShift {
	public static void main(String[] args) {
		int i = -1;
		int j = 1;
		print("j= " +Integer.toBinaryString(j));
		j <<= 4;
		print("j= " +Integer.toBinaryString(j));
		
		print(Integer.toBinaryString(i));	
		// -1 反码显示【11111111111111111111111111111111】
		i >>>= 10;
		print(Integer.toBinaryString(i));
		long l = -1;
		print(Long.toBinaryString(l));
		l >>>= 10;
		print(Long.toBinaryString(l));
		short s = -1;
		print(Integer.toBinaryString(s));
		s >>>= 10;
		print("short s:");
		print(Integer.toBinaryString(s));
		byte b = -1;
		print(Integer.toBinaryString(b));
		b >>>= 10;
		print("byte b >>>= 10 after:");
		print(Integer.toBinaryString(b));	// 二进制直接右移10位，没感觉出来
		print("");
		b = -1;
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b >>> 10));	
		//二进制里面的位移，可以看见 没用【=】；右移后，{小数点.]右边的被切除
		//符号操作位移 要带等号，后面加数字。 byte 值函数里面直接位移，不带【=】。 【>>>】是不影响符号【+-】操作
	}
}