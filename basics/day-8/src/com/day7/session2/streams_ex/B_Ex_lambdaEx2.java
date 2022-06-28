package com.day7.session2.streams_ex;

interface StringProceesor {
	public boolean isContainRaj(String name);
}

public class B_Ex_lambdaEx2 {

	public static void main(String[] args) {
//		StringProceesor proceesor=new StringProceesor() {
//			
//			@Override
//			public boolean isContainRaj(String name) {
//				return name.contains("raj");
//			}
//		};

		StringProceesor proceesor =  name-> name.contains("raj");
			
		System.out.println(proceesor.isContainRaj("teena"));
		
	}
}
