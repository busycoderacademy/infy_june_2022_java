package com.day9.session1.stream_ex;

import java.util.List;
class MathLogic{
	public static boolean isPrime(int n) {
		///
		return true;
	}
}
public class B_SteamEx {
	
	public static void main(String[] args) {
//		List<String> names=List.of("raj","ekta","sumit","amit","foo","keshav","anita");
		
		List<Integer> nos=List.of(3,555,1,0,-99,2,6);
		//we want get listing of all even no
		nos.stream()
				.filter(MathLogic::isPrime)
				.forEach(no-> System.out.println(no));
//		long no=names
//		.stream()
//		.map(name-> name.length())
//		.count();
//		System.out.println(no);
	}

}
