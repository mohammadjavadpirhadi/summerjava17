import tests.CourseTest;
import tests.HouseTest;
import tests.PersonTest;
import tests.ProfessorTest;
import tests.SchoolTest;
import tests.StudentsTest;

public class Main 
{
	public static void main(String[] args)
	{
		CourseTest CTest= new CourseTest();
		System.out.println(CTest.testGetName());
		HouseTest HTest= new HouseTest();
		System.out.println(HTest.testGetName());
		PersonTest PRTest= new PersonTest();
		System.out.println(PRTest.testGetName());
		ProfessorTest PETest= new ProfessorTest();
		System.out.println(PETest.testGetName());
		SchoolTest SCTest= new SchoolTest();
		System.out.println(SCTest.testGetName());
		StudentsTest STTest= new StudentsTest();
		System.out.println(STTest.testGetName());
	}
}
