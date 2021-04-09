package week2;

public class Loops {

	public static void main(String[] args) {
int number; 
		
		// outputPrintCounter variable counts the number of outputs in a line. If the output count in a line 
		// is > 20 then we print the output in the next line to keep output more legible.
		int outputPrintCounter = 0;  
				
		//A while loop that prints all even numbers from 0 to 100
		System.out.println("\n" + "A while loop that prints all even numbers starting from 0 and ending at 100 are: ");
		number = 0;
		while(number <= 100)
		{	
			outputPrintCounter += 1; 
			if(number != 100)
			{
				if(outputPrintCounter < 20)
					System.out.print(number + ", ");
				else {
					System.out.print(number + ", \n");
					outputPrintCounter = 0;  // set the outputPrintCounter back to zero
				}
			} //if(number != 100) statement
			
			else System.out.print(number + "\n");
			number = number + 2;
		} // while() loop
		
		//A while loop that prints every 3rd number going backwards from 100 until we reach 0
		number = 100;
		System.out.println("\n" + "A while loop that prints every 3rd number going backwards from 100 until 0 are: ");
		while(number >= 0)
		{
			if(number >= 0 && (number -3) >= 0)
				System.out.print(number + ", ");
			else System.out.print(number + "\n");
			number = number - 3;
		}
		
		
		//A for loop that prints every other number from 1 to 100
		System.out.println("\n" + "A for loop that prints every other number starting from 1 and ending at 100 are: ");
		outputPrintCounter = 0; 
		for(number = 1; number <= 100; number += 2)
		{
			outputPrintCounter += 1; 
			if(number <= 100 && (number +2) <= 100)
			{
				if(outputPrintCounter < 20)
					System.out.print(number + ", ");
				else {
					System.out.print(number + "\n");
					outputPrintCounter = 0;  // set the outputPrintCounter back to zero
				}
			}
			else System.out.print(number + "\n");
			
		}
		
		//A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints 
		//“Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of 
		//the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number
		
		System.out.println("\n\n" + "A for loop that prints every number from 0 to 100 based on divisibility by 3, 5 or both or none: "); 
		for(number = 0; number <= 100; number += 1)
		{	
			
			if(number%3 == 0 && number%5 == 0 && number > 0)
			{
				if(number != 100)
					System.out.print("HelloWorld, " + "\n");
				else System.out.print("HelloWorld");
			}
			else if(number%3 == 0 && number > 0) 
			{
				if(number != 100)
					System.out.print("Hello, "); 
				else System.out.print("Hello"); 
			}
			else if(number%5 == 0 && number > 0)
			{
				if(number != 100)
					System.out.print("World, ");
				else System.out.print("World");
			}
			else {
				if(number != 100)
					System.out.print(number + ", ");
				else System.out.print(number);
			}
		}// for loop

	}

}
