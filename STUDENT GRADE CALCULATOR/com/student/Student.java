//Student Grade Calculator
package com.student;

import java.util.Scanner;

public class Student{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t*********************************************");
        System.out.println("\t*\t\t Student Grade Calculator \t\t\t*");
        System.out.println("\t*********************************************");


        System.out.println("\n Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("\n Enter Student Roll No: ");
        int rollno = sc.nextInt();

        System.out.println("\n Enter Number of Subjects: ");
        int subjects  = sc.nextInt();

        int total = 0;
        for(int i =0; i<subjects; i++){

            System.out.println("\n Enter Marks Obtained in Subject "+(i+1)+" : ");
            int marks = sc.nextInt();
            total+=marks;
        }

        double avgP = (double)total / subjects;

        String grade;
        if(avgP >= 91){
            grade = "A+";

        } else if (avgP >= 80 && avgP <= 90) {
            grade = "A";
        }
        else if (avgP >= 65 && avgP <= 79 ) {
            grade = "B";
        }
        else if (avgP >=50 && avgP <=64) {
            grade = "C";
        }
        else{
            grade = "F";
        }


        System.out.println("\n\t\tStudents Result is - ");
        System.out.println("\n\t\t-------------------------------------------------------------------------");
        System.out.printf( "%15s %15s %15s  %15s  %15s","Roll No", " Name "," Total "," Grade " , " AvgP " );
        System.out.println("\n\t\t-------------------------------------------------------------------------");


        System.out.printf("\n %15d%15s%15d%15s%15sf%% \n",rollno, name, total, grade, avgP);
        System.out.println("\n\t\t-------------------------------------------------------------------------");


    }
}
