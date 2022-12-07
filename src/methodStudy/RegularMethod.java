package methodStudy;

public class RegularMethod 
{

	public static void main(String[] args) 
	{
		System.out.println("this is main method running");
		add();
		
		
	}
	
	
	public static void add()   // methods  name
	{
		int a= 10;
		int b=20;          // static regular method 
		int sum= a+b;       // method body     /// complete method
		System.out.println("sum is"+ sum );
	}
	//non static regular method
	 public void sub ()  //methods name
	 {
		int c= 50;
		int d=40;             // non static regular method
		int subs = c-d;
		System.out.println("subtraction is " + subs);
		
		//public static void test()  method has name but  not body
		
		
		
		 
		 
		 
	 }
	 
	 
	 
}	
		
	

