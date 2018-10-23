package sis;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTest(sis.report.AllTests.suite());
		suite.addTest(sis.studentinfo.AllTests.suite());
		// $JUnit-END$
		return suite;
	}

}
