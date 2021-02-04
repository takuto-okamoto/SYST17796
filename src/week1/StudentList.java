/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;
import java.util.Scanner;

/**
 *
 * @author Takuto
 */
public class StudentList {
    public static void main(String[] args) {
        String[] students;
        students = new String[6];
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the student name: ");
            students[i] = input.nextLine();
        }
        
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        
        System.out.println("Change here");
    }
}
