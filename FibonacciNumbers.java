import java.util.Scanner;
class FibonacciNumbers
{
  public static void main(String[] args) 
  {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	num = sc.nextInt();
	int firstnum = 0, secondnum = 1;
    System.out.println("The Fibonacci Series till " + num + " terms : ");
	for (int i = 1; i <= num; ++i) 
	{
      System.out.print(firstnum + ", ");
      int nextnum = firstnum + secondnum;
      firstnum = secondnum;
      secondnum = nextnum;
    }
  }
}