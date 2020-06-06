import java.util.Arrays;
import java.util.Scanner;

public class GradeCalculator {
	
	static Scanner scanner = new Scanner(System.in);
	static double markingPeriodWeight;
	static double midtermWeight;
	static double finalWeight;
	static double endGrade;
	static double[] markingPeriodGrades = new double[4];
	static double midtermGrade;
	static double finalGrade;
	static double calculationForMarkingPeriods;
	
	public static void calculateFinalGrade() {
		System.out.println("Welcome to the final grade calculator!");
		System.out.print("Please enter the weight for each marking period (%)\n> ");
		markingPeriodWeight = scanner.nextDouble();
		System.out.print("Please enter the weight for your midterm (%)\n> ");
		midtermWeight = scanner.nextDouble();
		System.out.print("Please enter the weight for your final (%)\n> ");
		finalWeight = scanner.nextDouble();
		for (int i = 1; i<= 4; i++) {
			System.out.print("Marking Period " + i + " (%): ");
			markingPeriodGrades[i-1] = scanner.nextDouble();
		}
		System.out.print("Midterm (%): ");
		midtermGrade = scanner.nextDouble();
		System.out.print("Final (%): ");
		finalGrade = scanner.nextDouble();
		calculationForMarkingPeriods = markingPeriodWeight * Arrays.stream(markingPeriodGrades).sum();
		endGrade = 0.01 * ((midtermGrade * midtermWeight) + (finalGrade * finalWeight) + calculationForMarkingPeriods);
		System.out.println("Your final grade is " + Math.round(endGrade * 100.0) / 100.0 + "%");
	}
	
	public static void main(String[] args) {
		GradeCalculator.calculateFinalGrade();
	}
}
