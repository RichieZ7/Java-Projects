//Aaron's Code
import java.util.Scanner;

public class GpaCalculator{

    static Scanner keyboard = new Scanner(System.in);
    static int classNumber;
    static double totalCreditsAttempted, GPA;
    static double totalGradePoints = 0;
    static int[] gradePositions;
    static double totalPoints[];
    static double gpaWeight[] = {4.33, 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.33, 1.00, 0.67, 0.00};
    static String grades[] = {"A+", "A", "A-","B+","B","B-", "C+", "C", "C-", "D+", "D", "D-", "U" };
    //corresponding grade and GPA grade points, for Academic classes
    //weighting for Honors and AP are accounted for in other code; +1.00 for AP, +0.67 for Honors


    /*public gpaCalculator(int classAmount){
        classAmount = classNumber;
    }*/
    static String[] arrayGrades;//letter grade for each class
    static double[] arrayCredits;//credits for that course
    static String[]  classType;//stores academic, honors, or ap
    public static void initialize() {
        System.out.println("How many classes are you submitting?: ");
        classNumber = keyboard.nextInt();
        arrayGrades = new String[classNumber];
        arrayCredits = new double[classNumber];
        classType = new String[classNumber];
        totalPoints = new double[classNumber];
        gradePositions = new int[classNumber];//stores positions of arrayGrades so that calculating total grades points is easier.
        //the grade position corresponds to GPA weighting
    }


    public static void askForClassesAndGrades(){
        for(int i =0; i<classNumber; i++){
            System.out.print("Please enter the " + (i+1) + " class's type (Academic, Honors, or AP) and please spell it right: ");
            classType[i] = keyboard.next();
            keyboard.nextLine();
            System.out.print("Enter final grade for that class: ");
            arrayGrades[i] = keyboard.next();
            //keyboard.nextLine();
            System.out.print("How many credits is this class?: ");
            arrayCredits[i]  = keyboard.nextDouble();
            //keyboard.nextDouble();

            if(!classType[i].equalsIgnoreCase("academic") && !classType[i].equalsIgnoreCase("honors") && !classType[i].equalsIgnoreCase("ap")){
                System.out.println("Oops! Looks like you spelled a word wrong! Please reinput your information for the previous class.");
                i--;
            }
        }
    }


    public static void gradeIndex(){
        //will show index of grade in grades[] array
        for(int i=0; i<arrayGrades.length; i++){
            for(int x=0; x<grades.length; x++){
                if(arrayGrades[i].equals(grades[x])){
                    gradePositions[i] = x;
                }
            }
        }
    }


    public static double getTotalGradePoints(){
        for(int i=0; i<arrayCredits.length; i++){
            switch(classType[i].toLowerCase()) {

                case "academic":
                    //gradePositions[i] = gpaWeight[i];
                    totalPoints[i] = gpaWeight[gradePositions[i]] * arrayCredits[i];
                    break;

                case "honors":
                    //gradePositions[i] = (gpaWeight[i] + 0.67);
                    totalPoints[i] = (gpaWeight[gradePositions[i]] + 0.67) * arrayCredits[i];
                    break;

                case "ap":
                    //gradePositions[i] = gpaWeight[i]+1.0;
                    totalPoints[i] = (gpaWeight[gradePositions[i]] + 1.00) * arrayCredits[i];
                    break;
            }

        }

        for(int i=0; i<totalPoints.length; i++){
            totalGradePoints+=totalPoints[i];
        }
        return totalGradePoints;
    }


    public static double getTotalCredits(){
        for(int i=0; i<arrayCredits.length; i++){
            totalCreditsAttempted+=arrayCredits[i];
        }

        return totalCreditsAttempted;
    }


    public static double calculateFinalGPA(){
        GPA = totalGradePoints/totalCreditsAttempted;

        return GPA;
    }

    public static void main(String args[]){
        // gpaCalculator calculate = new gpaCalculator();
        GpaCalculator.initialize();
        GpaCalculator.askForClassesAndGrades();
        GpaCalculator.gradeIndex();
        GpaCalculator.getTotalGradePoints();
        GpaCalculator.getTotalCredits();
        System.out.println("Your GPA is " + GpaCalculator.calculateFinalGPA() + "!");
        System.out.println("It's decent, but I'm sorry to say that it's NOT GOOD ENOUGH!");
    }
}