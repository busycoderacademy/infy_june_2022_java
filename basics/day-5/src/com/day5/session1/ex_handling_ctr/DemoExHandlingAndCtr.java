package com.day5.session1.ex_handling_ctr;
import java.io.FileNotFoundException;
import java.io.IOException;

class X {
	X() throws IOException
	{
		System.out.println("ctr of X");
	}
}

class Y extends X {
	Y() throws Exception
	{
		System.out.println("ctr of Y");
	}
}

public class DemoExHandlingAndCtr {

	public static void main(String[] args) {

		try {
			X x = new Y();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
