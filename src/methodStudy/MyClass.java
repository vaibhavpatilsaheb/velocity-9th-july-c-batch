package methodStudy;

public class MyClass {

	public static void main(String[] args) 
	{
    display();
    sub ();		//calling static method from same class
	July_9_C.wish(); //calling 	static method from anathor class
	}
//static regular method
	// complete method
	public static void display()
	{
	// body 
		System.out.println("hi i am static regular method from same class");
		
	}
		
			public static void sub() 
			{
			 	int a=90;
			 	int b=50;
			 	int sub = a-b;
			 	System.out.println("sub is " + sub);
			}
			
		
		
	}

