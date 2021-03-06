package chess;

import java.util.*;

import pieces.Pawn;

/**
 * Provides a representation of a chess board and board pieces
 * 
 * @author charlesadeeko
 *
 */

public class Board {
	private int numberOfPieces = 0;
	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

	/**
	 * Method returns number of pawn pieces on chess board
	 */

	int getNumberOfBoardPieces() {
		return numberOfPieces;
	}

	/**
	 * Method to add a pawns to the chess board
	 */

	public void addPawn(Pawn pawn) {
		numberOfPieces = numberOfPieces + 1;
		pawns.add(pawn);
	}

	/**
	 * Method that returns list of pawn objects on the chess board
	 */

	ArrayList<Pawn> getAllPieces() {
		return pawns;
	}

}
