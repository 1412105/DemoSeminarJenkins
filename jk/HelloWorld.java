package jk;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld, Welcome to Jenkins, TEST POLL SCM");
		TestClass t = new TestClass();
		System.out.println(t.value.charAt(0));
	}
}

class TestClass {
	String value;
}
