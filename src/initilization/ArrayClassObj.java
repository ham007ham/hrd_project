package initilization;

import java.util.Arrays;
import java.util.Random;

import static mindView.base.Print.print;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];    //Integer(20), 就是有18个值被填充
        print("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); // Autoboxing
        print(Arrays.toString(a));  //Arrays.toString(a) 打印数组a  所有值
        print("10 28");
    }
}
/* Output:
length of a = 18
[55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128, 51, 89, 309, 278, 498, 361, 20]
*///:~  ---感觉 rand 是固定的值了
