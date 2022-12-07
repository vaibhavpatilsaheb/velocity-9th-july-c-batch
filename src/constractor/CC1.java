package constractor;

public class CC1 {


 public static void main(String[] args) {
 CC1 c1= new CC1();
 c1.add();
 c1.sub();
	}
 public void add()
{
	int sum = a+b;
	System.out.println("addition is" + sum);
}
 
 public void sub()
 {
	 int sub= a-b;
	 System.out.println("sub is  "+ sub);
 }
 int a;
 int b; //variable declaretion

 public CC1() //constractor of class
 {
   a = 40;
   b = 30;
 }
}
