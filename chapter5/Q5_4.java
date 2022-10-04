package chapter5;

public class Q5_4 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10, 5);
		double circleArea = calcCircleArea(5);
		
		System.out.println(triangleArea);
		System.out.println(circleArea);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
