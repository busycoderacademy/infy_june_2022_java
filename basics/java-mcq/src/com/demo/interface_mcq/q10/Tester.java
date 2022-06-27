package com.demo.interface_mcq.q10;
@FunctionalInterface
interface Operation { 
    public abstract int add(int num1, int num2) ;
} 
interface Math extends Operation{
	
}
class Tester implements Math{ 
	@Override
	public int add(int num3 , int num4) {
		return num3+num4;
	}
    public static void main(String args[]){
    	Math obj = new Tester();
        System.out.println(obj.add(9,45)); 
    } 
}