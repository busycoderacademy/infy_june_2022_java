package com.demo.interface_mcq.q1;
interface Lab { 
    public abstract void experiment1();
    public abstract void experiment2();
} 
class Tester implements Lab{ 
	@Override
	public void experiment1() {
		System.out.println("Eureka");
	}
	@Override
	public void experiment2() {
		System.out.println("Bazinga");
	}
    public static void main(String args[]){
 	 	Tester obj = new Tester();
    	obj.experiment1();
    } 
}	
