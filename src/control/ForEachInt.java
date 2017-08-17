package control;

import static mindView.base.Print.print;
import static mindView.base.Print.printnb;
import static mindView.base.Range.range;

//import static mindView.base.Print.print;

public class ForEachInt { 
	  public static void main(String[] args) { 
		  for(int i : range(10)) // 0..9 
		      printnb(i + " "); 
		    print(); 
		    for(int i : range(5, 10)) // 5..9 
		      printnb(i + " "); 
		    //print(); ��print()�����Ų���Ϊ�վͱ���-= print(""); 
		    print(); 
		    for(int i : range(5, 20, 3)) // 5..20 step 3 
		      printnb(i + " "); 
		    print(); 
	  } 
	}
