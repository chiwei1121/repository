import java.util.Scanner;
public class Homework2_2_4
{
	public static void main(String args[])
	{
		int opt=0;
		String []name;
		int [] grade={0};
		Scanner stdIn=new Scanner(System.in);
		do{
			System.out.print("請輸入學生姓名:");
			data=stdIn.nextInt();
		}while(opt!= -1);
		int year=0,i;
		System.out.print("請輸入年份(西元): ");
		year=stdIn.nextInt();
		System.out.println("閏年:");
		for(i = 0;i <= year;i ++)
		{
			if(i%4==0 && i%100!=0)
				System.out.println(i);
			else if(i%400==0)
				System.out.println(i);
			else
			;
		}
	}
}