package com.day3.session1.doubts;

public class DemoClassNotFoundEx {

	public static void main(String[] args) {
		//if u are trying to load a class dynamically and it is not found
		
		try {
			Class.forName("com.day3.session1.doubts.Demo");
			System.out.println("class is loaded...");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found ex happens" + e);
		}
		
	}
}
