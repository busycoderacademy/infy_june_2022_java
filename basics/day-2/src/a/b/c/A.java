package a.b.c;

public class A {

	private int i=11;
	int j=23;
	public int k=56;
	
	protected int m=100;
	
	private void foo() {
		System.out.println("private void foo()");
	}

	void fooDefault() {
		System.out.println(" void fooDefault() ");
	}
	
	protected void fooProtected() {
		System.out.println(" protected void fooProtected ");
	}
	
	public void fooPublic() {
		System.out.println(" public void fooPublic ");
	}
	
}
