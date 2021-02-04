/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;

/**
 *
 * @author Takuto
 */
public class Marks {
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
        String arr[]= {"john","mary","susan","George"};
	double marks= 0.0;
	int marksCount=0;
	double sum= 0.0;
	double avg = 0.0;
	int studentsCount=0;
        
	while (studentsCount <4) {
            sum= 0.0;
            avg = 0.0;
            marksCount=0;
            
            while (marksCount < 5){
		System.out.print("Enter marks for "+ arr[studentsCount]+": ");
		marks = input.nextDouble();	       	
		//System.out.println(arr[studentsCount]);
		sum=sum + marks;//running total
		marksCount++;//updating the counter
            }
	
            System.out.print("the sum of "+arr[studentsCount]+ "'s marks is: "+ sum +"\n");
            avg = sum/5;
            System.out.println("the avg of "+ arr[studentsCount]+ " is "+ avg);
            System.out.println();
            studentsCount++;//updating the student's counter
	}
    }
}
