package array;

public class ArrayStringStudy {

	public static void main(String[] args)
	{

String name []= new String[5];

name[0]="vaibhav";
name[1]="akash";
name[2]="ganesh";
name[3]="sham";
name[4]="amol";

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
