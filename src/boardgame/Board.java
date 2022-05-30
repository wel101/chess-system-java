package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns, Piece[][] pieces) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows] [columns];	
	}
			
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColums() {
		return columns;
	}
	public void setColums(int colums) {
		this.columns = colums;
	}
	
	
}
