package controlstatement;

public class ElseIfUse {

	public static void main(String[] args) 
	{
        // if marks is gether than or equal to 75----> i am in dist
		//else if marks is gether than or equal to 66----> i am in 1st class 
		//else if marks is gether than or equal to 50-----> i am in 2cd class
		//else if marks is gether than or equal to 40----> i am just pass
		// else i am fail
		//
		int marks =90;
		if(marks>=75)
		{
			System.out.println("i am in dist class");
			
		}
		else if (marks>=66)
		{
			System.out.println("i am in 1 st class");
		}
		
		else if (marks>=50)
		{
			System.out.println("i am 2cd class");
		}
		else if (marks>=40)
		{
		System.out.println("i am just pass");
		}
		else
		{
			System.out.println(" i am fail");
		}
	}

}
