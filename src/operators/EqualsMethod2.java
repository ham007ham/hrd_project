package operators;

class Value {
	int i;
}

public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
	}
}

/* Output:
false
---The result is false. This is because the default behavior of
equals( ) is to compare references. So unless you override equals( ) in your new class you
won’t get the desired behavior. Unfortunately, you won’t learn about overriding until the
Reusing Classes chapter and about the proper way to define equals( ) until the Containers
in Depth chapter, but being aware of the way equals( ) behaves might save you some grief in
the meantime.
*///:~
