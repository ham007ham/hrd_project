package initilization;

import static mindView.base.Print.print;
import static mindView.base.Print.printnb;

class Rock2 { 
	  Rock2(int i) { 
		  if (i/10 ==0)
			  printnb("Rock" + i + "  "); 
		  else
			  printnb("Rock" + i + " ");
	  } 
	} 
	 
	public class SimpleConstructor2 { 
	  public static void main(String[] args) { 
		  int i;
	    for( i = 0; i < 80; i++) {
	    	if(i!=0&&i%10==0) print();
	      new Rock2(i); 
	  } 
	}
}