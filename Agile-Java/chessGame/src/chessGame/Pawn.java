package chessGame;

public class Pawn {
	private String colour;
	private static final String white = "white";

	public Pawn(String colour) {
		this.colour = colour;
	}

	String getColourOfPawn() {
		return colour;

	}

	public Pawn() {
		this.colour = white;
	}

}
