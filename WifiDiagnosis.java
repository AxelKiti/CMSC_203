/*
 * Class: CMSC203 CRN 23999
 * Instructor: Prof. Eivazi
 * Description: WiFiDignosis class guide the user through a diagnosis to fix a Wifi  issue 
 * Due: 09/22/2022
 * Platform/compiler: Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Axel Kiti
*/


import java.util.Scanner;

public class WifiDiagnosis 
{
	public static void main(String args [])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.\n");
		
		System.out.println("Reboot the computer and try to connect\nDid that fix the problem?");
		String answer = keyboard.nextLine();
		if (answer.equals("No") || answer.equals("no") || answer.equals("NO"))
		{
				//if rebooting the computer does not work, prompts new solution
				if (answer.equals("No") || answer.equals("no") || answer.equals("NO"))
				{
					System.out.println("Reboot the router and try to connect");
					System.out.println("Did that fix the problem?");
					answer = keyboard.nextLine();
					
					//if rebooting router does not work, prompts new solution
					if (answer.equals("No") || answer.equals("no") || answer.equals("NO"))
					{
						System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router.");
						System.out.println("Did that fix the problem?");
						answer = keyboard.nextLine();
						
						//if checking cable connection does not work, prompts new solution
						if (answer.equals("No") || answer.equals("no") || answer.equals("NO"))
						{
							System.out.println("Move the computer closer to the router and try to connect");
							System.out.println("Did that fix the problem?");
							answer = keyboard.nextLine();
							
							//if moving computer closer to router does not work, prompts a last resort solution
							if (answer.equals("No") || answer.equals("no") || answer.equals("NO"))
							{
								System.out.println("Contact your ISP");
							}
							else if (answer.equals("yes") || answer.equals("yes") || answer.equals("YES"))
							{
								System.out.println("Done");
							}
							else
								System.out.println("Invalid answer; Please try again");
							
							
							
						}
						else if (answer.equals("yes") || answer.equals("yes") || answer.equals("YES"))
						{
							System.out.println("Done");
						}
						else
							System.out.println("Invalid answer; Please try again");
						
						
					}
					else if (answer.equals("yes") || answer.equals("yes") || answer.equals("YES"))
					{
						System.out.println("Done");
					}
					else
						System.out.println("Invalid answer; Please try again");
					
				}
				else if (answer.equals("yes") || answer.equals("yes") || answer.equals("YES"))
				{
					System.out.println("Done");
				}
				else
					System.out.println("Invalid answer; Please try again");
			//
				
		}
		else if (answer.equals("yes") || answer.equals("yes") || answer.equals("YES"))
		{
			System.out.println("Done");
		}
		else
			System.out.println("Invalid answer; Please try again");
			
			
	}	

}
