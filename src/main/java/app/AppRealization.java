package app;

import exam.Exam;
import exam.Exams;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppRealization {

    public void startApp() {
        System.out.println("Выберите должность: ");
        System.out.println("1 - Студент");
        System.out.println("2 - Преподаватель");

        checkChoice();
    }

    private void checkChoice() {
        try {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            showInterface(choice);
        } catch (InputMismatchException exception) {
            showErrorMessage();
        }

    }

    private void showInterface(int choice) {
        switch (choice) {
            case 1 -> showStudentForm();
            case 2 -> showTeacherForm();
            default -> showErrorMessage();
        }
    }

    private void showStudentForm() {
        showExamList();
    }

    private void showExamList() {
        var i = 1;
        for (var discipline : Exams.disciplines) {
            System.out.println(i + " - " + discipline);
            i++;
        }

        getExamChoice();
    }

    private void getExamChoice() {
        try {
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            showExamInfo(choice);
        } catch (InputMismatchException exception) {
            showErrorMessage();
        }
    }

    private void showExamInfo(int choice) {
        choice--;
        if (choice >= 0 && choice < Exams.exams.length) {
            System.out.println(Exams.exams[choice].getDiscipline());
            System.out.println(Exams.exams[choice].getDate());
            System.out.println(Exams.exams[choice].getTimeInMinutes());
            System.out.println(Exams.exams[choice].getTeacher().getNAME());
            System.out.println(Exams.exams[choice].getTeacher().getSURNAME());
        } else {
            System.out.println("Неправильно введён номер дисциплины. " +
                    "Попробуйте ещё раз");
            getExamChoice();
        }
    }

    private void showTeacherForm() {
    }

    private void showErrorMessage() {
        System.out.println("Неправильный ввод выбора. " +
                "Попробуйте ещё.");

        checkChoice();
    }
}
