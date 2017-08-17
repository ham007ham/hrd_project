package initilization;
import static mindView.base.Print.print;
class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
   static void Cups() {     //static void 方法必须是静态的，才能被引用
        print("Cups(hrd is greatman!)");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99);  // (1)
        Cups.Cups();   //Cups.
    }
    // static Cups cups1 = new Cups();  // (2)
    // static Cups cups2 = new Cups();  // (2)
}
/* Output:
Inside main()
Cup(1)
Cup(2)
f(99)
*///:~
