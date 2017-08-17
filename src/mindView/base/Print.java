package mindView.base;

//import static mindView.base.Print.print;

import java.io.PrintStream;

public class Print {
	public static void  print(Object obj) {
		System.out.println(obj);
	}
	// Print a newline by itself: 
	public static void print() { 
	    System.out.println(); 
	  } 
	public static void  printnb(Object obj) {
		System.out.print(obj);
	}
	// The new Java SE5 printf() (from C): 
	  public static PrintStream 
	  printf(String format, Object... args) { 
	    return System.out.printf(format, args); 
	  } 
	  
	  
	  public static void printBinaryInt(String s, int i) {
		print(s + ", int: " + i + ", binary:\n" + Integer.toBinaryString(i));
	}
	  public static void printBinaryLong(String s, long l) {
		print(s + ", long: " + l + ", binary:\n" + Long.toBinaryString(l));
	}
}