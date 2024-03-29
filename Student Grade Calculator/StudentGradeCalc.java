package codsoft;

import java.util.Scanner;

public class StudentGradeCalc {

    public static void main(String[] args) {
        int i;
        char grade;
        float percent, total = 0;
        float[] marks = new float[5];
        try (Scanner sc = new Scanner(System.in);) {
            for (i = 0; i < 5; i++) {
                System.out.println("Enter the marks of " + (i + 1) + " th subject ");
                marks[i] = sc.nextFloat();
                total += marks[i];
            }
            percent = total / 5;
            if (percent > 90 && percent < 100) {
                grade = 'O';// Outsatnding
            } else if (percent > 80 && percent < 90) {
                grade = 'A';// Grade A
            } else if (percent > 70 && percent < 80) {
                grade = 'B';// Grade B
            } else if (percent > 60 && percent < 70) {
                grade = 'C';// Grade C
            } else if (percent > 40 && percent < 60) {
                grade = 'D';// grade D
            } else {
                grade = 'F';// Fail
            }
            System.out.println("\nReport card of the student is:");
            for (i = 0; i < 5; i++) {
                System.out.println("Subject " + (i + 1) + "= " + marks[i]);
            }
            System.out.println("Total =" + total);
            System.out.println("Percentage =" + percent);
            System.out.println("Grade = " + grade);
            sc.close();
        }
    }
}
