package control;

public class CommaOperator { 
	  public static void main(String[] args) { 
	    for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) { 
	    	//[j = i + 10]ֻ��1�Σ�����ֱ�Ӹ�i��
	      System.out.println("i = " + i + " j = " + j); 
	    } 
	  } 
	}