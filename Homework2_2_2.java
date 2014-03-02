import java.util.Scanner;
public class Homework2_2_2
{
	public static void main(String args[])
	{
		Scanner stdIn=new Scanner(System.in);
		double	num=0.0,num2=0.0,result=0.0;
		int opt;
		System.out.print("The first number: ");
		num=stdIn.nextDouble();
		do
		{
			System.out.print("The second number: ");
			num2=stdIn.nextDouble();
			if(num2==0.0)
			{
				System.out.print("The second number isn't 0!\n");
			}
		}while(num2==0.0);
		do
		{
			System.out.print("1) + 2) - 3) * 4) / ?\n");
			opt=stdIn.nextInt();				
		}while(opt<0 || opt>5);
		switch(opt)
		{
			case 1:
				result=num+num2;
				break;
			case 2:
				result=num-num2;
				break;
			case 3:
				result=num*num2;
				break;
			case 4:
				result=num/num2;
				break;		
			default:
				System.out.print("Error!\n");
				break;
		}
		System.out.print("\n\nThe result:"+result);		
	}
}