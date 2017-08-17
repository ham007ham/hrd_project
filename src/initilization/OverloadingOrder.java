package initilization;

import static mindView.base.Print.print;
public class OverloadingOrder { 
	  static void f(String s, int i) { 
	    print("String: " + s + ", int: " + i); 
	  } 
	  static void f(int i, String s) { 
	    print("int: " + i + ", String: " + s); 
	  } 
	  public static void main(String[] args) { 
	    f("String first", 11); 
	    f(99, "Int first"); 
	    print();
	    f(919, "Int first");
	    f("Int first",888);
	  } 
	}