package assignment_7_4;
import java.util.*; 

public class Assignment_7_4 {
	//This Assignment helped me to master the concepts of String Handling.		 
	// print n! permutation of the characters of the string s (in order)
		private static void stringPermutation(String prefString, String originalString)
		{
		int stringLength = originalString.length();     //int variable to store the length of original string.
				
				//Checking that originalString is empty or not.
				if(stringLength == 0)   
					System.out.println(prefString);     //if it is empty, then print the prefString which is created in the below step.
				else          //if originalString is not Empty.
				{
					for(int i = 0 ; i < stringLength ; i++)    //for loop to traverse to the String.
					{
						/*
						 * Recursive Approach to traverse through the String, we are incrementing Number of characters of prefString, and when original String 
						 * length is zero, we are printing the prefString. This is recursive algorithm to find all anagrams of String.
						 */ 
						stringPermutation(prefString + originalString.charAt(i), originalString.substring(0,i) + originalString.substring(i+1,stringLength));
						//In each level of recursion, originalString size reduces by one and prefString size increases by one character.
					}
				}
			}    //End of stringPermutation function.
			
			
public static void main(String[] args)       //main function declaration. and because it is static, program execution starts from main function.
			{
//We will find anagrams for words ->  Hello, How, Short, Long, Happen, silent, top, this, Love, Hadoop, what, NPSC 
				
				Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
				
				System.out.print("Please provide input \n\n");    //Printing Statement.
				
				//for loop to take the input from console.
				for(int i = 0 ; i < 10 ; i++)
				{
					System.out.print("Enter the String : ");
					String inputString = sc.next() ;      //String which will store the input String.
					
					char[] charArray = inputString.toCharArray();    //creating character array out of String.
					
					Arrays.sort(charArray);    //Sorting the elements of String.
					
					String stringToPermute = new String(charArray);    //Creating new String from character array.
					
					System.out.println("Anagrams for the String "+inputString+" are :");    //Printing Statement.
					stringPermutation("",stringToPermute);     //String is passed to function and prefString is by default an empty String initially.
					
					System.out.println("\n");      //Line break.
				}   //End of for loop
				
				sc.close();   //Closing object of Scanner class.
				
			}   //End of main function.

		}    //End of class.
