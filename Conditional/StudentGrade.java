package Conditional;

import java.util.*;

public class StudentGrade {
    public static void main(String args[]) {
        Grade.Grade();
    }
}

class Grade {

    public static void Grade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        sc.close();
        String Res = "";
        if (marks >= 80 && marks <= 100) {
            Res = "Topper";
        } else if (marks < 80 && marks >= 60) {
            Res = "First division";
        }

        else if (marks < 60 && marks >= 45) {
            Res = "Second division";
        }

        else if (marks >= 30 && marks < 45) {
            Res = "Third divison";
        } else {
            Res = "Fail";
        }
        System.out.println(Res);
    }

}
