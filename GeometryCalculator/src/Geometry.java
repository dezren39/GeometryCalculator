public class Geometry {
	
	public static double circ(double radius) {
		return Math.PI * radius * radius;
		
	}
	
	public static double rect(double base, double height) {
		return base * height;
		
	}
	
	public static double tri(double base, double height) {
		return rect(base, height)*0.5;
		
	}
	
}
