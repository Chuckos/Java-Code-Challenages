package chessGame;

public class PawnTest extends junit.framework.TestCase {
	public void testCreate() {
		Pawn pawn = new Pawn();
		Pawn.askPawnColour();
		assertEquals("white", Pawn.askPawnColour());
	}

}
