package loopstudy;

public class DoWhileLoop {

	public static void main(String[] args)
	{
// i want print hello 5 time
		
		int i=1;
		do 
		{
		System.out.println("hello");	
		i++;
		}
		while(i<=5);
	//i want to print teble of 5
		//start at 5----------end with 50--------update by v=v+5
		
		int a=5;
		do
		{
			System.out.println(a);
			a=a+5;
		}
		while(a<=50);
		System.out.println("*************************");
		
		// i want to print table of 5 in rever order
		// start with -----50------end with 5 --------update by b=b-5
		int b=50;
		do
		{
			System.out.println(b);
			b=b-5;
		}
		while(b>=4);
		}
		
	}


