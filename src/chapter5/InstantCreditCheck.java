package chapter5;
/*
* variable scope
* write an instant credit check program that approves
* anyone who makes more than $25000 and has a credit score
* of 700 or better. Reject all the other */
import java.util.Scanner;
public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Initialize what we know
        // Get what we do not know
        double salary = getSalary();
        int creditScore = getCreditScore();
        isUserQualified(creditScore , salary);
        scanner.close();
        // check if the user is qualified
        boolean qualified = isUserQualified(creditScore , salary);
        // Notify the user
        notifyUser(qualified);
    }
    public static boolean isUserQualified(int creditScore , double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }else {
            return false;
        }
    }
    public static double getSalary(){
        System.out.println("Enter your salary:");

        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats");
        }
        else {
            System.out.println("Sorry");
        }
    }
}
