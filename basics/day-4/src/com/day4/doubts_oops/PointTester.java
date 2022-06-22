package com.day4.doubts_oops;

public class PointTester {
	public static void main(String[] args) {
	    //code here
		Point point1 =new Point(2,3);
		double distanceFromOrigin= point1.distance();
		System.out.println(distanceFromOrigin);
		
		//find distance bw two point
		Point point2 = new Point(5,6);
		
		double distanceBetweenTwoPoints=point1.distance(point2);
		System.out.println(distanceBetweenTwoPoints);
	
	}

}