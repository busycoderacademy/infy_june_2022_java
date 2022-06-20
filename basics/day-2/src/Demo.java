
public class Demo {
	private static Demo demo=new Demo();
	
	private Demo() {
		System.out.println("dare to call me!");
	}
	
	public void doWork() {
		System.out.println("dowork is called");
	}
	public static Demo getDemoObject() {
		return demo;
	}
}
