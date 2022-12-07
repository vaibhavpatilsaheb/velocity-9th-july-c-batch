package array;

public class ArrayIntStudy {

	public static void main(String[] args)
	{
// i want to store multiple roll no.
		// declaration
         int rn []= new int [5];     


// array initilazation
rn [0]=10;
rn [1]=11;
rn [2]=12;
rn [3]=13;


//array ussage
// static for loop
for(int i=0; i<=4;i++)
{
	System.out.println(rn[i]);
}
System.out.println("*********************");
// dyanamic for loop
for(int i=0; i<=rn.length-1; i++)
{
	System.out.println(rn[i]);
	
}
System.out.println("**********************");
		//dynamic for loop in reveres order
	
	for(int i=rn.length-1; i>=0;i--)
	{
		System.out.println(rn[i]);
	}
	
	}
}
