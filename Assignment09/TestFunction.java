package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestFunction {

	public static void main(String[] args) {
		
		List<Student_Data> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students (Using Iterator)");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
            	case 1:
            		System.out.println("Enter roll No:");
            		int roll = sc.nextInt();
            		sc.nextLine();
            		System.out.println("Enter name");
            		String name = sc.next();
            		System.out.println("Enter marks: ");
            		double marks = sc.nextDouble();
            		
            		studentList.add(new Student_Data(roll, name, marks));
            		System.out.println("Student added successfully");
            		break;
            		
            	case 2:
            		if(studentList.isEmpty()) {
            			System.out.println("The student data empty");
            		} else {
            			System.out.println("\n --- student list -----");
            			Iterator<Student_Data> itr = studentList.iterator();
            			while(itr.hasNext()) {
            				System.out.println(itr.next());
            			}
            		}
            		break;
            		
            	case 3:
            		System.out.println("Enter roll no to search");
            		int searchRoll = sc.nextInt();
            		boolean found = false;
            		
            		for(Student_Data s:studentList) {
            			if(s.getRollNo() == searchRoll) {
            				System.out.println("Student found! " + s);
            				found = true;
            				break;
            			}
            		}
            		if(!found) {
            			System.out.println("Student with roll no " + searchRoll + " not found");
            		}
            		break;
            		
            	case 4:
            		Collections.sort(studentList, new Comparator<Student_Data>() {
            			@Override
            			public int compare(Student_Data s1, Student_Data s2) {
            				// TODO Auto-generated method stub
            				return Integer.compare(s1.getRollNo(), s2.getRollNo());
            			}
            		});
            		System.out.println("Students sorted by roll number successfully");
            		break;
            		
            	case 5:
            		Collections.sort(studentList, new Comparator<Student_Data>() {
					@Override
					public int compare(Student_Data s1, Student_Data s2) {
						// TODO Auto-generated method stub
						return s1.getName().compareToIgnoreCase(s2.getName());
					}
            		});
            		System.out.println("Student sorted alphabetically");
            		break;
            		
            	case 6:
            		Collections.sort(studentList, new Comparator<Student_Data>() {
					@Override
					public int compare(Student_Data s1, Student_Data s2) {
						// TODO Auto-generated method stub
						return Double.compare(s2.getMarks(), s1.getMarks());
					}
            		});
            		System.out.println("students sorted by marks");
            		break;
            	
            	case 7:
            		System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 7.");
            }
        } while (choice != 7);
            }
		
		
	}

