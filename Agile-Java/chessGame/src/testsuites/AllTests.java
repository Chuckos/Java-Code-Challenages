package testsuites;

import junit.framework.Test;
import junit.framework.TestSuite;
import chess.BoardTest;
import pieces.PawnTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(PawnTest.class);
		suite.addTestSuite(BoardTest.class);
		// $JUnit-END$
		return suite;

	}

}
