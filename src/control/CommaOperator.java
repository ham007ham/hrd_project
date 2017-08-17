package control;

public class CommaOperator { 
	  public static void main(String[] args) { 
	    for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) { 
	    	//[j = i + 10]只走1次，后面直接跟i走
	      System.out.println("i = " + i + " j = " + j); 
	    } 
	  } 
	}