package accessSpecifiers;

public class Test2 {

	public static void main(String[] args)
	{
Test1 t1 = new Test1();

// method calling
//t1.demo(); uneble to call private method in another class
t1.demo2();
t1.demo3();
t1.demo4();


// varible calling
// System.out.println("calling private varible in another class" + t1.a); uneble to call
System.out.println("calling default varible in another class " + t1.b);
System.out.println("calling protected varible in another class " + t1.c);
System.out.println("calling public varible in another class " +t1.d);
	}

}
