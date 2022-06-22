package com.day4.doubts_oops;

class Point {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Method to obtain distance of a point w.r.t origin
	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

	// Method to obtain distance of a point w.r.t another point

	// p1.distance(p2);

	public double distance(Point point) {
		// u have to pass only one point another pointer is this : this refer to current
		// object

		return Math.sqrt(Math.pow((point.getX() - this.getX()), 2) +
				Math.pow((point.getY() - this.getY()), 2));

	}

}
