package ExpandedStack;

//This class is obtained from the assignment 2 and is used for the implementation of stack for this assignment 3
public class StudentListings {
	private String studentName;  // student name is used as the key field for this class
	private String studentIdNumber; //store the student identification number
	private String gpa;
	
	public StudentListings () //default constructor that initializes the attributes
	  {  studentName = "None"; 
	     studentIdNumber = "N/A";
	     gpa = "N/A";
	  }
	
	public StudentListings(String name, String id, String grade) //constructor that take has 3 parameters to initialize the attributes
	  {  studentName = name;
	     studentIdNumber = id;
	     gpa = grade;
	  }
	
	public String toString() //this method is used to print out the student information
	   {   
		return("Name is " + studentName + "\nIdentification Number is " + studentIdNumber + 
			   	  "\nGrade Point Averages is " + gpa + "\n");
	   }
	
	public StudentListings deepCopy() //a method that make a deep copy of the node
	   {  StudentListings dCopy = new StudentListings(studentName, studentIdNumber, gpa);
	      return dCopy;
	   }
	
	public int compareTo(String key) //a method that is used to compare the key field
	   {  
		return(studentName.compareTo(key));
	   }
	
}
