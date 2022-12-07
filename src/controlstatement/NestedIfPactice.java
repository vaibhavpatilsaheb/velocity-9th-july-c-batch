package controlstatement;

public class NestedIfPactice {

	public static void main(String[] args) 
	{
        //plese insert card-----> plese enter pin
		// pin is correct transection is secces--->else transection is failed pin is incorrect 
	   //else-----> plese check your card 
		 String card ="sbi";
		  int pin= 1860;
		
		   if(card=="sbi")
		   {
			System.out.println("correct card  plese enter pin");
			if(pin== 1860)
			{
			System.out.println("pin is correct transection is succes");
			}
			else  
		{
		System.out.println("plese enter correct password");
		}
	
		   }
	else
	{
		System.out.println("plese inserd correct card");
	}
}
	}
