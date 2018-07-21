package chessGame;

public class PawnTest extends junit.framework.TestCase {
	public void testCreate() {

		final String chosenColourFirstPawn = "white";
		Pawn firstPawn = new Pawn(chosenColourFirstPawn);
		assertEquals(chosenColourFirstPawn, firstPawn.getColourOfPawn());

		final String chosenColourSecondPawn = "black";
		Pawn secondPawn = new Pawn(chosenColourSecondPawn);
		assertEquals(chosenColourSecondPawn, secondPawn.getColourOfPawn());
	}

}
