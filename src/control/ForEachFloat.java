package control;

import java.util.Random;

public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random(47);
		float f[] = new float[30];
		for (int i = 0; i < 30; i++)
			f[i] = rand.nextFloat()+8;
		for (float x : f)		//Foreach syntax :for (float x : f),x����f���飻
			System.out.println(x);
		System.out.println("----------------------"); 
		for(char c : "An African Swallow".toCharArray() ) 
		      System.out.print(c + " "); 
		  
	}
}