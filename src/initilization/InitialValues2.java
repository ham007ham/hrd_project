package initilization;

import static mindView.base.Print.print;

public class InitialValues2 {
    boolean t=true;
    char c='x';
    byte b=47;
    short s=0xff;
    int i=99;
    long l=1;
    float f=3.1415f;
    double d=3.1415926;
    InitialValues2 reference;
    void printInitialValues() {
        print("Data type      Initial value");
        print("boolean        " + t);
        print("char           [" + c + "]");
        print("byte           " + b);
        print("short          " + s);
        print("int            " + i);
        print("long           " + l);
        print("float          " + f);
        print("double         " + d);
        print("reference      " + reference);       //打印各种 变量 初始化值，对齐ok
/*        print("Data type\t\t\t\t Initial value");
        print("boolean\t\t\t\t " + t);
        print("char\t\t\t\t [" + c + "]");
        print("byte\t\t\t\t " + b);
        print("short\t\t\t\t " + s);
        print("int\t\t\t\t \t\t\t\t " + i);
        print("long\t\t\t\t " + l);
        print("float\t\t\t\t " + f);
        print("double\t\t\t\t " + d);
        print("reference\t\t\t\t " + reference);   //打印各种 变量 初始化值  ,对齐还是没有做好*/
    }
    public static void main(String[] args) {
        InitialValues2 iv = new InitialValues2();
        iv.printInitialValues();
    /* You could also say:
    new InitialValues().printInitialValues();
    */
    }
}
/* Output:
Data type      Initial value
boolean        false
char           [ ]
byte           0
short          0
int            0
long           0
float          0.0
double         0.0
reference      null
*///:~
