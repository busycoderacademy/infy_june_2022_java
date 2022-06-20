
public class A_DemoArray {

	public static void main(String[] args) {
		//how u can use array
		
	//	int x[]=new int[4];
		int x[]= {3,5,-1,66};
		
//		for(int i=0;i<x.length; i++) {
//			System.out.print(x[i]+" ");
//		}
		
		//java 5: enhance for loop
		for(int i: x) {
			System.out.print(i+" ");
		}
	}
}
