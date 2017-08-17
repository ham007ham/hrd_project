package mindView;
//import java.io.*;
//import java.util.*;
//import static  mindView.base.Print.*;  // [.*] err

import static mindView.base.Print.print;
//import static hrdProject.mindView.base.Print;	// ---err
// can't directly import. it need put in the class method
 class Letter {
	char c;
}
public class PassObject {
	private char c;
	static void f(PassObject y) {
		y.c='z';
	}
	public static void main(String[] args) {
		Letter x=new Letter();
		x.c='a';
//		System.out.println("1:x.c: "+x.c);
		PassObject x1= new PassObject();
//		//System.out.println("2:x.c: "+f(x));
//		System.out.print("2:x.c: "+x1);
		print("1:x.c: "+x.c);
		// x1.f(x);
		//f(PassObject x); 
		//mindView.base.Print.print("2:x.c: "+x.c);
		print("2:x.c: "+x.c);
	}
//	private static void print(String string) {
//		// TODO Auto-generated method stub
//		
//	}
}

