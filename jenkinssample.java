import java.util.Scanner;
class jenkinssample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n1 = sc.nextInt();
		System.out.println("enter next number");
		int n2 = sc.nextInt();
		System.out.println("addition"+(n1+n2)+"substraction"+(n1-n2)+"multiplication"+(n1*n2));
	}
}
