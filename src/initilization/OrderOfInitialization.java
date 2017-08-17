package initilization;
import static mindView.base.Print.print;
class Window {
    Window(int marker) { print("Window(" + marker + ")"); }
}

class House {
    Window w1 = new Window(1); // Before constructor
    House() {
        // Show that we’re in the constructor:
        print("House()");
        w3 = new Window(33); // Reinitialize w3,从下面的w3 调用，重新赋值
    }
    Window w2 = new Window(2); // After constructor
    void f() { print("f()"); }
    Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }
}
/* Output:
Window(1)
Window(2)
Window(3)
House()         //print("House()"); 为什么后面才调用
Window(33)
f()
*///:~
