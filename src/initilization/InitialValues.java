package initilization;

import static mindView.base.Print.print;
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
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
        InitialValues iv = new InitialValues();
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
