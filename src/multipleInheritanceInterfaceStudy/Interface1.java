package multipleInheritanceInterfaceStudy;

public interface Interface1
{
void m1();
void m2();

default void test()
{
	System.out.println("i am interface 1 test method");
}
}
