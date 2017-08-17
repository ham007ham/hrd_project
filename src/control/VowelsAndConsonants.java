package control;

import java.util.Random;

import static mindView.base.Print.print;
import static mindView.base.Print.printnb;
 
public class VowelsAndConsonants { //Ԫ�� ���� ��ĸʶ��
  public static void main(String[] args) { 
    Random rand = new Random(47); 
    for(int i = 0; i < 100; i++) { 
      int c = rand.nextInt(26) + 'a'; 
      // Random.nextInt(26) generates a value between 0 and 26,
      printnb((char)c + ", " + c + ": "); 
      switch(c) { 
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u': print("vowel"); 
                  break; 
        case 'y': 
        case 'w': print("Sometimes a vowel"); 
                  break; 
        default:  print("consonant"); //consonant ����
      } 
    } 
  } 
}