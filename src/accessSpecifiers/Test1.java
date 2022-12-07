package accessSpecifiers;

public class Test1 {

private	int a=10;
	int b=20;
protected	int c=30;
public	int d=40;
	
public static void main(String[] args)
	{
// method calling
	Test1 t1= new Test1();
	t1.demo1();
	t1.demo2();
	t1.demo3();
	t1.demo4();
	
	
	//calling varible
	System.out.println("calling private varible within the class" + t1.a);
	System.out.println("calling default varible within the class" + t1.b);
	System.out.println("calling protected variable within class" + t1.c);
	System.out.println("calling public variable within class" +t1.d);
	}
 private void demo1()
{
	System.out.println("hi i am demo1 private method ");
}
 void demo2()
{
	System.out.println("hi i am demo2 defaule method ");
}
 protected void demo3()
{
	System.out.println(" hi i am demo3 protected method");
}
 public void demo4()
{
	System.out.println("hi i am demo4 public method");
}
}