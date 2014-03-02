import java.util.*;
public class Homework2_4_1
{
	public static void main(String args[])
	{		
		Scanner stdIn=new Scanner(System.in);
		ArrayList<Circle> round=new ArrayList<Circle>();
		double x=0.0,y=0.0;
		int count=0;
		Circle temp;
		while(true)
		{
			System.out.print("\n長軸長度(Exit -1): ");
			x=stdIn.nextDouble();
			System.out.print("\n短軸長度(Exit -1): ");
			y=stdIn.nextDouble();
			if(x==-1 || y==-1)
				break;
			temp=new Oval(x,y);
			round.add(temp);
			count++;
		}
		for(int i=0;i<count;i++)
		{
			round.get(i).show();
		}
	}
}
class Circle 
{ 
	double r=0.0; 
	Circle(double r) 
	{ 
		this.r = r; 
	} 
	double area() 
	{ 
		return 3.14 * r * r; 
	}
	void show()
	{
		System.out.print("\n\n半徑:"+r+"  面積:"+area());
	}
 }
 class Oval extends Circle
 {
	double r2;
	Oval(double x,double y)
	{
		super(x);
		this.r2=y;
	}
	double area() 
	{ 
		return 3.14 * r * r2; 
	}
	void show()
	{
		System.out.print("\n\n長軸長度="+r+"短軸長度="+r2+"  面積:"+area());
	}
 }
