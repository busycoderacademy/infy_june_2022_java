
public class B_FunctionReturnsArray {
	
	public static void main(String[] args) {
		
		int x[]= {3,5,-1,66,53,671};
		//i want to find max of that array
		
		int nos=findTheMaxFromArray(x);
		
		System.out.println(nos);
		
		//a function can return a array also
		//WAP to pass a array to a method and return another array that contain double of each element
		// {3,5,-1,66}==>  {6,10,-2,132}
		
		int newArr[]=getDoubleOfEachElemnt(x);
		
		for(int val: newArr) {
			System.out.print(val+" ");
		}
	}

	public static int[] getDoubleOfEachElemnt(int x[]) {
		int newArray[]=new int[x.length];
		
		//double each elemnt from x array and then assigned to the newArray and then return that newArray
		for(int i=0;i<x.length; i++) {
			newArray[i]=x[i]*2;
		}
		
		return newArray;
	}
	
	
	public static int findTheSumOfAllElementArray(int x[]) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		
		return sum;
	}

	public static int findTheMinFromArray(int x[]) {
		int min=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]<min) {
				min=x[i];
			}
		}
		
		return min;
	}
	
	
	
	public static int findTheMaxFromArray(int x[]) {
		int max=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) {
				max=x[i];
			}
		}
		
		return max;
	}
}
