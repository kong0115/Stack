package ExpandedStack;

/*
*Description: This program modifies and expands the implementation of class Stack presented in Figure 3.13 from the textbook,
*and four new methods are added to the class: method (resetStack) to reinitialize the stack to empty, 
*method (isEmpty) to test for an empty stack (underflow), method (isFull) to test for a full stack (overflow),
*and method (peek) that pop a node from a stack without deleting it from the stack.
*A driver program is created to test and verify the functionality of four newly added methods.		 
*Class: Summer - COSC 2436.86400
*Assignment3: Stack
*Date: 07/22/2018
*@author  Siang Swee Kong
*@version 0.0.0
*/ 

//Expanded version of stack
public class ExpandedStack
{  private StudentListings[] data;
   private int top; //store the index of the last node pushed 
   private int size; //store the size of the array
  
   //methods given from the textbook
   public ExpandedStack() //default constructor
   {  top = -1; //initial condition that indicates the stack is empty
      size = 100; //initialize the size of the array
      data = new StudentListings[100];  //create an array of StudentListings object
   }
   
   public ExpandedStack(int n) //constructor that takes one parameter to initialize the size of the array
   {  top = -1;
      size = n;
      data = new StudentListings[n];
   }
   
   public boolean push(StudentListings newNode) //push the newNode to the top of the stack
   {  if(top == size-1) //overflow condition
           return false;  
       else
       {  top = top +1; 
          data[top] = newNode.deepCopy(); //store a deep copy of the new node to the array at the current location
          return true;  // push operation successful
       }
   }
   
   public StudentListings pop() //fetch and delete the node from the stack
   {  int topLocation; //a temporary variable
       if(top == -1) //underflow condition
           return null;  
       else
       {  topLocation = top; 
           top = top -1; //delete the node
           return data[topLocation]; //return a shallow copy
       }
   }
   
   public void showAll() //method to print all the nodes' information 
   {  for(int i = top; i >= 0; i--)
         System.out.println(data[i].toString());
   }

   //new methods
   public void resetStack() //reinitialize the stack to empty
   {
	   top = -1;
   }
   
   public boolean isEmpty() //test if the stack is empty
   {
	   if(top != -1) //return false if the stack is not empty
		   return false;
	   else 
		   return true; //return true if the stack is empty
   }
   
   public boolean isFull() //test if the stack is full
   {
	   if (top < size - 1) //return false if the stack is not full
		   return false; 
	   else 
		   return true; //return true if the stack is full
   }
   
   public StudentListings peek() //a method to pop the last node without deleting it
   {  
       if(top != -1)
           return data[top]; //return the last node
       else
          return null; //underflow condition
   }

}


