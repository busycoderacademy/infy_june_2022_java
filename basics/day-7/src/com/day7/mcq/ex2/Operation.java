package com.day7.mcq.ex2;
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
}