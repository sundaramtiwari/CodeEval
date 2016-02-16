package easy;

/**
 * @author Sundaram
 *
 */
public class Test {

	public void method1() {
		System.out.println("Method1 A");
	}

	public void method2(){
		System.out.println("Method2 A");
	}
	private void method4() {
		System.out.println("4");
	}

	public static void main(String[] args) {
		Test b = new B();
		b.method4();
	}
}

class A {
	public void method1() {
		System.out.println("Method1 A");
	}
	public void method2(){
		System.out.println("Method2 A");
	}
}

class B extends Test {
	public void method2() {
		System.out.println("Method2 B");
	}
	public void method3() {
		System.out.println("Method3 B");
	}
}