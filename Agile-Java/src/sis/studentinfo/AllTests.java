package sis.studentinfo;

import junit.framework.Test;
import junit.framework.TestSuite;
import sis.report.RosterReporterTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(CourseSessionTest.class);
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(RosterReporterTest.class);
		suite.addTestSuite(DateUtilTest.class);
		// $JUnit-END$
		return suite;
	}

}
