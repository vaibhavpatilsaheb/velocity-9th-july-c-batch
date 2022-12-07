package array;

public class Realtime {

	public static void main(String[] args) 
	{
		char [] grade = {'a','b','c','d'};
		
		int[] run= { 12,13,55,45,22};
		
		String name []= { "vaibhav","akash", "amol", "sham"};
		
		
		for(int i=0; i<=name.length-1; i++)
		 {
			 System.out.println(name[i]);
		 }
		System.out.println("****************************************");
		// reverser order
		 
		 for(int i= name.length-1; i>=0;i--)
		 {
			 System.out.println(name[i]);
		 }
		}

	}


