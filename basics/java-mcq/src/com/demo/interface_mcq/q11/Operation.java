package com.demo.interface_mcq.q11;
import java.math.*;
@FunctionalInterface
interface Operation 
{ 
    public abstract int add(int y, int z) ;
    public default int sum(int a, int b) {
    	return a+b;
    }
    public default int subtract(int c, int d) {
    	return Math.abs(c-d);
    }
    
     public static void main(String[] args) {
		System.out.println("where u are ?");
	}
}