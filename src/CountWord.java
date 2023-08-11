import java.util.Scanner;

public class CountWord {
	
	public static void main(String[] args) {
		int sum=0;
		int a=0;
		Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the value");
		     int num = sc.nextInt();
		     int tem=num;
		     while(num>0)
		     {
		    	 a=num%10;
		    	 sum=sum+(a*a*a);
		    	 num=num/10;
		     }
		   if(tem==sum)
		   {
			   System.out.println("it is amstrong number="+sum);
		   }
		   else
		   {
			   System.out.println("it is not amstrong number");
		   }
	}
	

}
