package methodStudy;

public class MathOpration {

	public static void main(String[] args) {
add();
MathOpration mo= new MathOpration ();
mo.subtraction();
add(10, 10, 30);
add(100, 220, 110);
mo.subtraction(100, 40);
mo. subtraction(400, 100);

	}
public static void add()
{                                        // static method without parameter
	int a=50;
	int b=40;
	int sum=a+b;
	System.out.println("addition is " + sum) ;
}
public void subtraction()
{                                      // non static method without parasmeter
	int c=100;
	int d=40;
	int sub= c-d;
	System.out.println("subtraction is " + sub);
}
public static void add(int a,int b, int c)
{                                             //static method with parameter
	int sum=a+b+c;
	System.out.println("addition is " + sum);
}
public void subtraction(int a,int b)
{
	int sub= a-b;
	System.out.println("subtraction is " + sub);
}
}
