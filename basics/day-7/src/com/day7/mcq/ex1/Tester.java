package com.day7.mcq.ex1;

@FunctionalInterface
interface Operation { 
    public abstract int add(int num1, int num2) ;
} 
interface Math extends Operation{
	public abstract int mul(int num1, int num2) ;
}
 class Tester implements Math{ 
	@Override
	public int add(int num3 , int num4) {
		return num3+num4;
	}
	@Override
	public int mul(int num1, int num2) {
		return num1+num2;
	} 
	
    public static void main(String args[]){
 	 	Tester obj = new Tester();
        System.out.println(obj.add(9,45)); 
    }
	
}