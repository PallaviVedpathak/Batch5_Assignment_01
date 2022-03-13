package com.company;
import java.util.Scanner;
public class Question_02_Grades_Average {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int noofStudents;
			int marks;
			System.out.println("Enter number of students: ");
			noofStudents= scanner.nextInt();
			double average=0.0;
			double total=0.0;
			int grades[]=new int[noofStudents];
			int counter=0;
			while(counter<noofStudents) {
				System.out.println("Enter the grade for student  "+ (counter+1));
				marks=scanner.nextInt();
				if(marks>100 || marks<0 ) {
					System.out.println("Invalid grade, try again...");
					continue;
				}
				grades[counter++]= marks;
			}
			for(int grade: grades) {
				total=total+grade;
			}
			System.out.println("total marks: "+ total);
			
			average=total/grades.length;
			
			System.out.println("The average is: "+ average);
			scanner.close();
		}
	}






