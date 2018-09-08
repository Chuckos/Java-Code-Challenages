package chessGame;

public class PawnTest extends junit.framework.TestCase {

	final String colourWhite = "white";
	final String colourBlack = "black";

	Pawn firstPawn = new Pawn(colourWhite);
	Pawn secondPawn = new Pawn(colourBlack);
	Pawn thirdPawn = new Pawn();

	public void testCreate() {

		assertEquals(colourWhite, firstPawn.getColourOfPawn());
		assertEquals(colourBlack, secondPawn.getColourOfPawn());
		assertEquals(colourWhite, thirdPawn.getColourOfPawn());
	}

	public void testBoard() {
		Board board = new Board();
		assertEquals(0, board.getNumberOfBoardPieces());
		// Pawn thirdPawn = new Pawn();

		// Add pawns to the board
		// Add black Pawn
		board.addPawn(secondPawn);
		// Check number of pieces on board is correct
		assertEquals(1, board.getNumberOfBoardPieces());
		// Obtain a list of pieces from board, ensure that it contains the expected pawn
		java.util.ArrayList<Pawn> allPieces = board.getAllPieces();
		assertEquals(1, allPieces.size());
		assertEquals(secondPawn, allPieces.get(0));
		assertEquals(colourBlack, allPieces.get(0).getColourOfPawn());
		// objects
		// Add white pawn
		board.addPawn(firstPawn);
		assertEquals(2, board.getNumberOfBoardPieces());
		assertEquals(2, allPieces.size());
		assertEquals(firstPawn, allPieces.get(1));
		assertEquals(secondPawn, allPieces.get(0));
		assertEquals(colourWhite, allPieces.get(1).getColourOfPawn());

	}

}
