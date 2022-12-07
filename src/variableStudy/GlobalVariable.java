package variableStudy;

public class GlobalVariable {
 int a=90;
 static int b=100;
	public static void main(String[] args) {
   test1();
   GlobalVariable glo= new GlobalVariable();
   glo.test();
   System.out.println(glo.a);
   int sum= 10+ glo.a;
   System.out.println("sum is " + sum);
   int sub= 210-b;
   System.out.println("sub is " + sub);
		
		
	}
public void test()
{ 
	int a;
	System.out.println("hi i am non static method");
	
}
public static void test1()
{
	System.out.println("hi i am static method");
}

}
