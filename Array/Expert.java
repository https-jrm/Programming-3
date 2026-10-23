/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Mirabuenos
 */
public class Expert {
    public static void main(String[] args) {

        String[] names = {
            "Alex", "Bella", "Carlo", "Diana", "Ethan"
        };

        int[][] quizData = {
            {85, 90, 88, 92},
            {95, 90, 93, 92},
            {80, 85, 82, 83},
            {95, 90, 93, 92},
            {88, 86, 90, 84}
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s%n",
                "Rank", "Student", "Average");
        System.out.println("---------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                    students[i].getAverage()
                    != students[i - 1].getAverage()) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                    rank,
                    students[i].name,
                    students[i].getAverage());
        }

        String targetName = "Diana";
        int foundRank = -1;

        for (int i = 0; i < students.length; i++) {

            if (students[i].name.equalsIgnoreCase(targetName)) {

                int j = i;

                while (j > 0 &&
                        students[j - 1].getAverage()
                        == students[i].getAverage()) {
                    j--;
                }

                foundRank = j + 1;
                break;
            }
        }

        if (foundRank != -1) {
            System.out.println("\n" + targetName
                    + "'s rank: " + foundRank);
        } else {
            System.out.println("\nStudent not found: " + targetName);
        }
    }
}