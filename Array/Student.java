/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Jerome
 */
class Student {
    String name;
    int[] quizzes;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }

    public double getAverage() {
        int sum = 0;

        for (int i = 0; i < quizzes.length; i++) {
            sum += quizzes[i];
        }

        return (double) sum / quizzes.length;
    }
}