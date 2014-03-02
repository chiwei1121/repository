import java.util.Scanner;
import java.util.*;
public class Homework2_3_1
{
	public static void main(String args[])
	{
		ArrayList<Circle> round=new ArrayList<Circle>();
		Scanner stdIn=new Scanner(System.in);
		double r=0.0,angle=0.0;
		int count=0,id=0;
		while(true)
		{
			System.out.print("\n半徑(Exit -1):");
			r=stdIn.nextDouble();
			if(r==-1)
				break;
			Circle temp=new Circle(r);
			round.add(temp);
			round.get(count).show();
			count++;
		}
		while(true)
		{
			System.out.print("\n編號(Exit -1):");
			id=stdIn.nextInt();
			System.out.print("角度(Exit -1): ");
			angle=stdIn.nextDouble();
			if(id== -1 || angle== -1)
				break;
			if(id < count && id >= 0)
			{
				round.get(id).show();
				System.out.print("弧長:"+round.get(id).arc(angle)+"\n對應面積:"+round.get(id).pie(angle));
			}
		}
	}
}
class Circle 
{ 
	double r; 
	Circle(double r) 
	{ 
		this.r = r; 
	} 
	double area() 
	{ 
		return 3.14 * r * r; 
	}
	double arc(double angle) //弧長公式
	{
		return 2*3.14*r*(angle/360);
	}
	double pie(double angle)
	{
		return 3.14 * r * r*(angle/360); 
	}
	void show()
	{
		System.out.print("\n半徑:"+r+"  面積:"+area());
	}
 }