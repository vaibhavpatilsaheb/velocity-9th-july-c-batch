package loopstudy;

public class ForLoopStudyPactice {

	public static void main(String[] args) {
// i want to print 40 teble 
		// strat with 40-----------end with 400 ----------update by 40
		for(int i=40; i<=400; i=i+40)
		{
			System.out.println(i);
		}
		// i want print 40 table in revers order
		// start with 400---------end with 40 ------update by 40
		System.out.println("******************************************");
		for(int i=400; i>=40; i=i-40)
		{
			System.out.println(i);
		}
	}

}
