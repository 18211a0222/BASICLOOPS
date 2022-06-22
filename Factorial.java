import java.util.Scanner;
class Factorial
{  
	public static void main(String args[])
	{  
		int i,fact=1,number;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a number : ");
		number = sc.nextInt();
		for(i=1;i<=number;i++)
		{    
			fact=fact*i;    
		}    
		System.out.println(" Factorial of the "+ number+ " is: " + fact);    
	}  
}  