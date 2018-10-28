package ExpandedStack;

//A driver program is created to test and verify the functionality of four newly added methods.

public class ExpandedStackDemo
{   public static void main(String[] args) 
    {
		boolean value; //to store a boolean value
        ExpandedStack student = new ExpandedStack(3); //create an instance of ExpandedStack with size of 3
        StudentListings temp; //used to store temporary StudentListings object
        
        //create 4 instances of StudentListings object that represent 4 different students
        StudentListings s1 = new StudentListings("Raymond","0001", "4.0");
	    StudentListings s2 = new StudentListings("Yohan", "0002" , "3.5");
	    StudentListings s3 = new StudentListings("Justin", "0003", "3.3");
	    StudentListings s4 = new StudentListings("David", "0004", "3.7");
	    
	    value = student.isEmpty(); //a method to test if the stack is empty
	    System.out.println(value);//true (indicates that the stack is empty) because no push operation is called 
	    value = student.isFull(); //a method to test if the stack is full
	    System.out.println(value + "\n");//false (indicates that the stack is not full) because the stack is empty
        
        System.out.println(student.pop());//pop operation on an initialized (empty) stack will return null
	    System.out.println(student.push(s1)); //true means the student 1 is successfully inserted to the top of the stack
	    System.out.println(student.push(s2)); //true means the student 2 is successfully inserted to the top of the stack
	    System.out.println(student.push(s3)); //true means the student 3 is successfully inserted to the top of the stack
	    //false means the student 4 is not successfully inserted to the top of the stack because the stack is full(overflow condition)
	    System.out.println(student.push(s4) + "\n"); 
	    student.showAll(); //output from the top of the stack to the bottom of the stack
	    
	    value = student.isEmpty(); //a method to test if the stack is empty
	    System.out.println(value);//false (indicates that the stack is not empty) because there are 3 nodes in the stack
	    value = student.isFull(); //a method to test if the stack is full
	    System.out.println(value + "\n");//true (indicates that the stack is full) because the size of the stack is 3 and there are 3 nodes in the stack
	    
	    //perform three peek operations that pop the last node without deleting the node
	    temp = student.peek(); //output the student 3 info
	    System.out.println(temp.toString());
	    temp = student.peek(); //output the student 3 info
	    System.out.println(temp.toString());
	    temp = student.peek(); //output the student 3 info
	    System.out.println(temp.toString());
        
	    //perform three pop operations to empty the stack
        temp = student.pop(); //output the student 3 info and delete the node
        System.out.println(temp.toString());
        temp = student.pop(); //output the student 2 info and delete the node
        System.out.println(temp.toString());
        temp = student.pop(); //output the student 1 info and delete the node
        System.out.println(temp.toString());
        //the stack is empty now
        
        //peek operation on an empty stack will return null (underflow condition)
        temp = student.peek();
        System.out.println(temp);
        
        
        //Perform three push operations
	    System.out.println(student.push(s1)); //true means the student 1 is successfully inserted to the top of the stack
	    System.out.println(student.push(s2)); //true means the student 2 is successfully inserted to the top of the stack
	    System.out.println(student.push(s3)); //true means the student 3 is successfully inserted to the top of the stack
	    value = student.isFull();
	    System.out.println(value); //true indicates that the stack is full
	    
	    //reinitialize the stack to empty
	    student.resetStack();
	    value = student.isEmpty(); //check for an empty stack
	    System.out.println(value); //true means that the stack is empty. This proves that the stack is reinitialize to an empty stack
	    System.exit(0);//end the program
    }
}

