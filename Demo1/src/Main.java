import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Student studObj1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student1 Details of Id,Name,Marks ");
		
		studObj1.studentId = sc.nextInt(); //input of student id
		studObj1.studentName = sc.next(); //input of student name
		studObj1.studentMarks = sc.nextInt(); //input of student marks
		
		Student studObj2 = new Student();
		
		System.out.println("Student2 Details of Id,Name,Marks ");
		
		studObj2.studentId = sc.nextInt(); //input of student id
		studObj2.studentName = sc.next(); //input of student name
		studObj2.studentMarks = sc.nextInt(); //input of student marks
		
		if(studObj1.studentMarks > studObj2.studentMarks) {
			
			System.out.println("First Ranker: "+studObj1.studentName);
		} 
		
		else {
			System.out.println("First Ranker: "+studObj2.studentName);
		}
		
		
	
		sc.close();
		}
	
}
