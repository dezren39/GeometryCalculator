import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int choice = 0;
		double val1;
		double val2;
		String areaType = "";
		String area ="";

		while (choice !=4) {
			
			System.out.print("Geometry Calculator\n" +
					"	1. Calculate the Area of a Circle\n" +
					"	2. Calculate the Area of a Rectangle\n" +
					"	3. Calculate the Area of a Triangle\n" +
					"	4. Quit\n" +
					"Enter your choice (1-4): ");

			try {
				
				choice = Integer.valueOf(scan.next());
				
			}
			catch (Exception e) {
				
			}
			
			while (choice == 1 || choice == 2 || choice == 3) {
				
				System.out.println();
				
				try {
					
					if (choice == 1) {
						areaType = "Circle";
						
						System.out.print(areaType +"\nPlease enter the radius: ");
						val1 = Double.valueOf(scan.next());
						
						area = String.valueOf(Geometry.circ(val1));				
						
					} else if (choice == 2) {
						areaType = "Rectangle";
						
						System.out.print(areaType + "\nPlease enter the width: ");
						val1 = Double.valueOf(scan.next());
						
						System.out.print("Please enter the height: ");
						val2 = Double.valueOf(scan.next());
						
						area = String.valueOf(Geometry.rect(val1, val2));
						
					} else if (choice == 3) {
						areaType = "Triangle";
						
						System.out.print(areaType +"\nPlease enter the base: ");
						val1 = Double.valueOf(scan.next());
						
						System.out.print("Please enter the height: ");
						val2 = Double.valueOf(scan.next());
						
						area = String.valueOf(Geometry.tri(val1, val2));
					}
					
					System.out.println("\nThe " + areaType + "'s area is: " + area);
					System.out.print("Enter any value to continue: ");
					
					try {
						
						val1 = Integer.valueOf(scan.next());
						
					}
					catch (Exception e) {
						
					}	
					
				}
				catch (Exception e) {
					
					System.out.println("\nSomething went wrong. Please try again!");
					continue;
					
				}
				choice = 0;
				
			}	
			System.out.println();
			
		}	
		scan.close();
		
	}
	
}

