package initilization;
import static mindView.base.Print.print;
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        for(int i = 0; i < a1.length; i++)
            print("a1[" + i + "] = " + a1[i]);
        a2 = a1;    // = 赋值，会改变原数值值的
        /*Since a2 and a1 are then aliased to the same array, the changes made
        via a2 are seen in a1.*/
        for(int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        print("after the a2 changed...");
        for(int i = 0; i < a1.length; i++) {
            print("a1[" + i + "] = " + a1[i]);
            //print("a2[" + i + "] = " + a2[i]);
        }
    }
}