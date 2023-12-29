import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Spring;

public class Java_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datatypes
		int num = 1000;
		String val = "Automation lecture 2";
		double d = 99.9;
		float f = 98;
		char c = 'H';
		
		System.out.println("String value:"+ val);
		System.out.println("Integer value:"+ num);
		System.out.print("Double value:"+ d);
		
		//SIMPLE ARRAY
		int [] array = new int[2];
		array[0] = 1;
		array[1] = 2;
		System.out.println(array[1]);
		
		//ARRAY LIST
		ArrayList<String> array_list = new ArrayList<String>();
		array_list.add("hiba");
		array_list.add("ahmed");
		System.out.println(array_list.get(0));
		System.out.println(array_list.get(1));
		
		ArrayList<String> arr_list = new ArrayList<String>();
		arr_list.add("genetech");
		System.out.println(arr_list.get(0));
		
		
	    //IF-ELSE
		int x = 10;
		if (x == 10 || x == 9)
		{
			
			System.out.println("the value of x is "+ x);
		}
		else
		{
			System.out.println("value is something else");
		}
		
		//LOOPS
		
		for (int y = 1; y< 10; y++) {
		    System.out.println("This loop should run till 9");
		}
		
		
	    //ARRAY
		int[] y = {2,4,6,8,10,12,14,16,18,20};
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		System.out.println(y[4]);
		System.out.println(y[5]);
		System.out.println(y[6]);
		System.out.println(y[7]);
		System.out.println(y[8]);
		System.out.println(y[9]);
	    
		String[] z = new String[5];
		z[0] = "hiba";
		z[2] = "ahmed";
		System.out.println(z[0] +" "+ z[2]);
		
		//METHOD CALLING
		Java_Concepts s = new Java_Concepts();
		s.getData();
		
	}
		//METHODS 
		 public void getData() {
		
			 System.out.println("This is a get data method");
			 
			//REVERSE STRING
			 
			// Create a Scanner object to take user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a string
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();

		        // Close the Scanner to prevent resource leaks
		        scanner.close();

		        // Call the reverseString method to reverse the input string
		        String reversedString = reverseString(inputString);

		        // Print the reversed string
		        System.out.println("Reversed string: " + reversedString);
		    }

		    // Method to reverse a string
		    private static String reverseString(String str) {
		        // Use StringBuilder to efficiently reverse the string
		        return new StringBuilder(str).reverse().toString();
			 }
             
			 
	}


