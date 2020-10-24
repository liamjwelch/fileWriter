package fileWriter;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class ClassHandler {
	
	
	public static void WriteObjectToFile(Student student) {
		
		PrintWriter outputStream = null;
		
		try {
			
			//this refers to the functionality of appending to a file or not 
			outputStream = new PrintWriter(new FileOutputStream("I_wanna_boogie.txt", true));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file stuff.txt.");
			System.exit(0);
		}
		
		System.out.println("Writing to file.");
		
		
		String studentName = student.getName();
		String id = student.getId();
		char grade = student.getGrade();
		
		
		outputStream.println(studentName);
		outputStream.println(id);
		outputStream.println(grade);
	
		outputStream.close();
		
		System.out.println("end of the line");
		
		
	}
	
	public Student ReadObjectFromFile() {
		return null;
	}

}
