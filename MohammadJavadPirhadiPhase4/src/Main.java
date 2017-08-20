import serviceTest.*;

public class Main 
{
	public static void main(String[] args)
	{
		CourseServiceTest CSTest = new CourseServiceTest();
		System.out.println("Get Course (Course Service): " + CSTest.testGet());
		System.out.println("Set Course (Course Service): " + CSTest.testSet());
		HouseServiceTest HSTest = new HouseServiceTest();
		System.out.println("Get House (House Service): " + HSTest.testGet());
		System.out.println("Set House (House Service): " + HSTest.testSet());
		PersonServiceTest PESTest = new PersonServiceTest();
		System.out.println("Get Person (Person Service): " + PESTest.testGet());
		System.out.println("Set Person (Person Service): " + PESTest.testSet());
		ProfessorServiceTest PRSTest = new ProfessorServiceTest();
		System.out.println("Get Professor (Professor Service): " + PRSTest.testGet());
		System.out.println("Set Professor (Professor Service): " + PRSTest.testSet());
		SchoolServiceTest SCSTest = new SchoolServiceTest();
		System.out.println("Get School (Course Service): " + SCSTest.testGet());
		System.out.println("Set School (Course Service): " + SCSTest.testSet());
		StudentServiceTest STSTest = new StudentServiceTest();
		System.out.println("Get Student (Course Service): " + STSTest.testGet());
		System.out.println("Set Student (Course Service): " + STSTest.testSet());
	}
}
