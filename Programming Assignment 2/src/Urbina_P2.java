import java.util.Scanner;
public class Urbina_P2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double bmi1 = person(console);
	    report(bmi1);
}

	public static double person(Scanner console) {
		System.out.println("Please enter your weight in pounds.");
	    double weight = console.nextDouble();
	    System.out.println("Please enter your height in inches.");
	    double height = console.nextDouble();

	    return bmi(height, weight);
}

	public static double bmi(double height, double weight) {
	    return (weight * 703 / height / height);
}

	public static void report(double bmi) {
		System.out.printf("Your BMI is = %f\n",bmi);
	        if (bmi < 18.5) {
	            System.out.println("Your BMI indicates you are underweight.");
	        } else if (bmi < 25) {
	            System.out.println("Your BMI is considered normal.");
	        } else if (bmi < 30) {
	            System.out.println("Your BMI indicates you are overweight");
	        } else {
	            System.out.println("Your BMI indicates you are obese.");
	        }
}
}
