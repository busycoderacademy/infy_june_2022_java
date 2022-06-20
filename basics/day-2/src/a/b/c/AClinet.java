package a.b.c;

public class AClinet {

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.j);
		
		System.out.println(a.k);
		
		System.out.println(a.m);
		
		a.fooDefault();
		a.fooProtected();
		a.fooPublic();
	}
}
