package initilization;

class Person { 
	  public void eat(Apple apple) {   //调用第3个类Apple
	    Apple peeled = apple.getPeeled(); 
	    System.out.println("Yummy"); 
	  } 
	} 
	 
	class Peeler { 
	  static Apple peel(Apple apple) { 
	    // ... remove peel 
	    return apple; // Peeled 
	  } 
	} 
	 
	class Apple { 
	  Apple getPeeled() { return Peeler.peel(this); }  
	  //调用第2个类Peeler
	} 
	 
	public class PassingThis { 
	  public static void main(String[] args) { 
	    new Person().eat(new Apple()); 
	    new Person().eat(new Apple()); 
	  } 
	} 