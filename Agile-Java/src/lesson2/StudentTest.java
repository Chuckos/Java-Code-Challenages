package lesson2;

public class StudentTest extends junit.framework.TestCase {
	public void testCreate() {
		final String firstStudentName = "Joe Doe";
		Student firststudent = new Student(firstStudentName);
		assertEquals(firstStudentName, firststudent.getName());
		
		final String secondStudentName = "Joe Blow";
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
		
	}

}

