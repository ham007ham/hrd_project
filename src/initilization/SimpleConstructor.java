package initilization;

import static mindView.base.Print.print;
class Rock { 
	  Rock() { // This is the constructor 
	    System.out.print("Rock "); 
	  } 
	} 
	 
	public class SimpleConstructor { 
	  public static void main(String[] args) { 
		  int i;
	    for( i = 0; i < 100; i++) {
	    	if(i!=0&&i%10==0) print();
	    	new Rock();	    	
	    
	    }
	  } 
	}