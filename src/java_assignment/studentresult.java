package java_assignment;

import java.util.Scanner;

public class studentresult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Advanced Student Result System ---");
            System.out.print("Enter the student's name (Type 'exit' to quit): ");
            String studentName = sc.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                // Taking marks input for all subjects
                System.out.print("Enter marks for English: ");
                int english = Integer.parseInt(sc.nextLine());

                System.out.print("Enter marks for Hindi: ");
                int hindi = Integer.parseInt(sc.nextLine());

                System.out.print("Enter marks for Maths: ");
                int maths = Integer.parseInt(sc.nextLine());

                System.out.print("Enter marks for Physics: ");
                int physics = Integer.parseInt(sc.nextLine());

                System.out.print("Enter marks for Chemistry: ");
                int chemistry = Integer.parseInt(sc.nextLine());

                System.out.print("Enter marks for Information Technology: ");
                int it = Integer.parseInt(sc.nextLine());

                // Calculating Total and Percentage
                int totalMarks = english + hindi + maths + physics + chemistry + it;
                double percentage = (totalMarks / 600.0) * 100;

                // Checking Pass or Fail condition (Assuming passing marks = 40 per subject)
                String resultStatus = "PASS";
                if (english < 40 || hindi < 40 || maths < 40 || physics < 40 || chemistry < 40 || it < 40) {
                    resultStatus = "FAIL (Marks < 40 in one or more subjects)";
                } 

                // Professional Report Card Output
                System.out.println("\n========================================");
                System.out.println("             REPORT CARD                ");
                System.out.println("========================================");
                System.out.println("Student Name           : " + studentName);
                System.out.println("----------------------------------------");
                System.out.println("English                : " + english + "/100");
                System.out.println("Hindi                  : " + hindi + "/100");
                System.out.println("Maths                  : " + maths + "/100");
                System.out.println("Physics                : " + physics + "/100");
                System.out.println("Chemistry              : " + chemistry + "/100");
                System.out.println("Information Technology : " + it + "/100");
                System.out.println("----------------------------------------");
                System.out.println("Total Marks            : " + totalMarks + "/600");
                System.out.printf("Percentage             : %.2f%%\n", percentage);
                System.out.println("Final Result           : " + resultStatus);
                System.out.println("========================================");

            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter numbers only.");
            }
        }

        sc.close();
    }
}