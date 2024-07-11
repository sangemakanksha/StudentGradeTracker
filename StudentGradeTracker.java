import java.io.*;
import java.util.*;

public class CodeAlpha1 {
    public static int max(ArrayList<Integer> std_grade) {
        int max = 0;
        for (int i = 0; i < std_grade.size(); i++) {
            if (std_grade.get(i) > max)
                max = std_grade.get(i);

        }
        return max;
    }

    public static int min(ArrayList<Integer> std_grade) {
        int min = std_grade.get(0);
        for (int i = 0; i < std_grade.size(); i++) {
            if (std_grade.get(i) < min)
                min = std_grade.get(i);
        }
        return min;
    }

    public static float avg(ArrayList<Integer> std_grade) {
        int avg = 0;
        int n = std_grade.size();
        for (int i = 0; i < std_grade.size(); i++) {
            avg = avg + std_grade.get(i);
        }
        float avgm = avg / n;

        return avgm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> std_name = new ArrayList<String>();
        ArrayList<Integer> std_rollno = new ArrayList<Integer>();
        ArrayList<Integer> std_grade = new ArrayList<Integer>();
        System.out.println("Enter the number of Students ");
        int n = sc.nextInt();
        System.out.println("Enter List Of Students Details:");
        System.out.println("Name\t|\t" + "" + "RollNo\t|" + "" + "\tGrade");
        System.out.println("-------------------------------------");
        for (int i = 0; i < n; i++) {
            std_name.add(sc.next());

            std_rollno.add(sc.nextInt());

            std_grade.add(sc.nextInt());

        }
        System.out.println("Students List:");

        System.out.println("--------------");
        System.out.println();
        System.out.println("NAME\t" + "|\t" + "RollNo\t" + "|" + "\tGrade");
        System.out.println("--------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(std_name.get(i) + "\t" + std_rollno.get(i) + "\t" + std_grade.get(i));
        }

        System.out.println();
        System.out.println();

        // System.out.print("Highest grade in the class:\t");
        System.out.println("Highest grade in the class:\t" + max(std_grade));
        System.out.println();
        // System.out.print("Lowest grade in the class:\t");
        System.out.println("Lowest grade in the class:\t" + min(std_grade));
        System.out.println();
        // System.out.print("Average grade in the class:\t");
        System.out.println("Average grade in the class:\t" + avg(std_grade));

    }
}
