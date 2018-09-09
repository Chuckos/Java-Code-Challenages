package pieces;

/**
 * @author charlesadeeko Class that creates chess pieces for a chess board game
 */

public class Pawn {
	private String colour;
	private static final String white = "white";

	/**
	 * Constructs the colour of the pawn pieces
	 */

	public Pawn(String colour) {
		this.colour = colour;
	}

	/**
	 * Method that returns the colour of pawn object
	 */

	public String getColourOfPawn() {
		return colour;

	}

	/**
	 * Constructs default pawn objects to colour white
	 */

	public Pawn() {
		this.colour = white;
	}

}
