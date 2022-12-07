package methodStudy;

public class UnivercityInfo {

	public static void main(String[] args) {

		UnivercityInfo UI = new UnivercityInfo();
		UI.studentinfo("vaibhav", 12345,'M', 70.1f, "agri");
		
		
		
		
	}
public void studentinfo(String name, int PRN, char gender, float wight, String dep)
{
	System.out.println("student name is " + name);
	System.out.println("student PRN number " + PRN);
	System.out.println("student gender is " + gender);
	System.out.println("student wight is " + wight);
	System.out.println("student dep is " + dep);
}
}
