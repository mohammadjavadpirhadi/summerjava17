import serviceTest.*;

public class Main 
{
	public static void main(String[] args)
	{
		CourseServiceTest CSTest = new CourseServiceTest();
		System.out.println("Get Course (Course Service): " + CSTest.testGet());
		System.out.println("Set Course (Course Service): " + CSTest.testSet());
		SchoolServiceTest SCSTest = new SchoolServiceTest();
		System.out.println("Get School (Course Service): " + SCSTest.testGet());
		System.out.println("Set School (Course Service): " + SCSTest.testSet());
		SchoolServiceTest STSTest = new SchoolServiceTest();
		System.out.println("Get Student (Course Service): " + STSTest.testGet());
		System.out.println("Set Student (Course Service): " + STSTest.testSet());
	}
}
