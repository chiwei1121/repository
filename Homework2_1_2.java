public class Homework2_1_2 {
  public static void main(String args[])  { 
  
	int []array ={3,8,6,15,4}; 
	int sum = 0 ,count = 0;
	double avg = 0.0;
	for(int x:array){
	    sum +=x;
		count++;
	}
	avg = (double)sum / count ;
	System.out.print("\nSum: " + sum);
	System.out.print("\nAvg: " + avg);
	
  }
}