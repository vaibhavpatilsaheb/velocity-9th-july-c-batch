package accessSpecifiers1;

import accessSpecifiers.Test1;

public class Test3 extends Test1 {

	public static void main(String[] args)
	{// method calling in another package
		Test1 t1= new Test1();
	//	t1.demo1();
	//	t1.demo2();
	//	t1.demo3();
		t1.demo4(); // we can call only public method boz scope of public is all poject
		
		//calling varible in another package
		//System.out.println("calling private varible within the class" + t1.a);
	 //	System.out.println("calling default varible within the class" + t1.b);
	//	System.out.println("calling protected variable within class" + t1.c);
		System.out.println("calling public variable within class" +t1.d); // we can  call only public varible boz scope of public is all poject
		
		
		Test3 t3= new Test3(); // create object of same class afther inheritance concept
		t3.demo3();   //calling protected is another package using object of sub class
		System.out.println("calling protected varible in another package " + t3.c); //calling protected oin another package using object of subclass
		
	}

}
