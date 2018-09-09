package chess;

import java.util.ArrayList;

import junit.framework.TestCase;
import pieces.Pawn;

public class BoardTest extends TestCase {

	final String white = "white";
	final String black = "black";

	Pawn whitePawn = new Pawn(white);
	Pawn blackPawn = new Pawn(black);
	Pawn thirdPawn = new Pawn();

	public void testBoard() {

		Board board = new Board();
		assertEquals(0, board.getNumberOfBoardPieces());

		board.addPawn(blackPawn);
		assertEquals(1, board.getNumberOfBoardPieces());

		ArrayList<Pawn> allPieces = board.getAllPieces();
		assertEquals(1, allPieces.size());
		assertEquals(blackPawn, allPieces.get(0));
		assertEquals(black, allPieces.get(0).getColourOfPawn());

		board.addPawn(whitePawn);
		assertEquals(2, board.getNumberOfBoardPieces());
		assertEquals(2, allPieces.size());
		assertEquals(whitePawn, allPieces.get(1));
		assertEquals(white, allPieces.get(1).getColourOfPawn());

	}

}
