package schoolFinance;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		
		Teacher amy = new Teacher( 1,  "Amy", (double) 5000);
		Teacher ben = new Teacher( 2,  "Benjamin", (double) 4500);
		Teacher cori = new Teacher (3, "Coriander", (double)4570);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(amy);
		teacherList.add(ben);
		teacherList.add(cori);
		
		do {
			
		System.out.print("\nManage student or teachers?\n1 for student\n2 for teacher\nanything else to quit\n");
		Scanner in = new Scanner(System.in);
		var response = in.next();
				
		if (response.matches("1")) {
			int response1;
			do
			{
			System.out.print("\nView or modify students?\n1 to view student's names\n2 to enroll new\n3 view specific student\n4 to exit level\n");
			response1 = in.nextInt();
				switch (response1) {
					case 1:  
						for (int i = 0; i < studentList.size(); i++) 
						{System.out.print(studentList.get(i).getName()+"\n");}
						break;
					case 2:
						//request # of students to enroll
						System.out.print("Enter number of students to enroll: ");
						int toEnroll = in.nextInt();
				
						//	create n number of students & add to arraylist
						while (toEnroll >0) {
							Student placeholder = new Student();
							studentList.add(placeholder);
							toEnroll--;
						}
						break;
					case 3: 
					

						System.out.print("Select student to modify:\n" );
						for (int i = 0; i < studentList.size(); i++) 
						{System.out.print(i+1+" "+studentList.get(i).getName()+"\n");}						
						while (!in.hasNextInt()) { 
							String input = in.next();
							System.out.printf("\"%s\" is not a valid option. Please select student to modify.\n",input);
							for (int i = 0; i < studentList.size(); i++) 
							{System.out.print(i+1+" "+studentList.get(i).getName()+"\n");}
						}
						int modifyStudent = in.nextInt();
						
						int action;
						
						do 
						{
						System.out.print("Modifying: " +studentList.get(modifyStudent-1).getName()+
								": Select options: \n1 View Status\n2 Enroll Class\n3 Pay Fees\n4 Exit\n");
							while (!in.hasNextInt()) { 
							String input = in.next();
							System.out.printf("\"%s\" is not a valid option. Please select modification.\n",input);
							}
						action = in.nextInt();
							switch (action) {
							case 1: 
								System.out.print(studentList.get(modifyStudent-1).toString());
								break;
							case 2:
								studentList.get(modifyStudent-1).enroll();
								break;
							case 3:
								studentList.get(modifyStudent-1).paidFee();
								break;
							case 4:
								action = 0;
								break;
							}
						}while (action != 0);
							break;

					case 4: 
						response1 = 0; 
						break;
				}
			}while (response1 != 0);
		}
		
		else if (response.matches("2")) {
			// TODO some functions for teachers
		}
		
		else {
			in.close();
			break;
		}
		}while (true);


		
		
		
		
		School schoolName = new School(teacherList, studentList);
		
		System.out.println("School treasury has $"+schoolName.getTreasury());
		amy.receiveSalary(amy.getSalary());
		System.out.println("School treasury has $"+schoolName.getTreasury());
		System.out.println(amy);
		
	}

}
