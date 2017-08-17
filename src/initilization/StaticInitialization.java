package initilization;
import static mindView.base.Print.print;
class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        print("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        print("f2(" + marker + ")");
    }   //后面2段全提前执行
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
     Bowl bowl3 = new Bowl(3);      //static 前面加静态方法，就会提前
    // non-static Bowl bowl3 prior to the static definitions.
    static Bowl bowl4 = new Bowl(4);        //类中 static方法，优先运行，打印
    Cupboard() {
        print("Cupboard()");
        bowl4.f1(2);    //静态bowl4  f1()函数
    }
    void f3(int marker) {
        print("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    static Table table = new Table();       // 这边初始申明，不是应该放在前面的吗。-=外圈 先走
    // -= 前面有静态方法，被提前执行
    static Cupboard cupboard = new Cupboard();
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupboard();
        print("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

}
/* Output:
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
f2(1)
f3(1)
*///:~
