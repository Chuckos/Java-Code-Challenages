package chessGame;

public class PawnTest extends junit.framework.TestCase {
	public void testCreate() {

		final String chosenColourFirstPawn = "white";
		Pawn firstPawn = new Pawn(chosenColourFirstPawn);
		assertEquals(chosenColourFirstPawn, firstPawn.getColourOfPawn());

		final String chosenColourSecondPawn = "black";
		Pawn secondPawn = new Pawn(chosenColourSecondPawn);
		assertEquals(chosenColourSecondPawn, secondPawn.getColourOfPawn());

		Pawn thirdPawn = new Pawn();
		assertEquals(chosenColourFirstPawn, thirdPawn.getColourOfPawn());
	}

	public void testBoard() {
		Board board = new Board();
		assertEquals(0, board.getNumberOfBoardPieces());

	}

}
