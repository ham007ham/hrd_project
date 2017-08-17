package initilization;

import java.util.Arrays;
import java.util.Random;

import static mindView.base.Print.print;
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];  // nextInt(60) length is 38,nextInt(20) length is 18
        //nextInt(20) 中间数据整数 控制不准
        print("length of a = " + a.length);
        print("a : " + a);   // [I@74a14482  为什么是这个值
        print(Arrays.toString(a));
    }
}
