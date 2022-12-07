package controlstatement;

public class NestedIf {

	public static void main(String[] args) 
	{   //Enter user id if user id is correct then----> enter password 
		// if password is correct then ----> then welcome to home page , else incorrect password 
		// else incorrect userid
		
		
		String UID= "velocity";
		String PWD="pune@123";

		if(UID=="velocity")
		{
		System.out.println("correct UserID plese enter the password");
			
			
		if(PWD=="pune@123")
		{
		System.out.println("welcome to home page");
		}
		else
		{
			System.out.println("plese enter correct password");
			}
		}
		else 
		{
			System.out.println("plese enter valid user id");
		}	
		
	}

}
