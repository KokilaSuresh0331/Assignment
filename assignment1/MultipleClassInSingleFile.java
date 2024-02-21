package assignment1;

public class MultipleClassInSingleFile {
	
public static void main(String[] args) {
	System.out.println("Main Class");
	A a=new A();
	a.call1();
	B b=new B();
	b.call2();
	C c=new C();
	c.call3();
	
}
}

class A{
	public void call1() {
		System.out.println("Class A");

	}
}
class B{
	public void call2() {
		System.out.println("Class B");

	}
}
class C{
	public void call3() {
		System.out.println("Class C");

	}
}