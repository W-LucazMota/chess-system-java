package boardgame;

//TABULEIRO
public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		return pieces [position.getRow()][position.getColumn()];
	}
	//A MATRIZ DE PEÇAS SE REFERE A MATRIZ DECLARADA NESSA CLASSE(BOARD) INSTANCIADA NO CONSTRUTOR
	//PEGAR A MATRIZ NA POSIÇÃO DADA E ATRIBIUR A ELA A PEÇA QUE EU INFORMEI 
	public void placePiece (Piece piece, Position position) {
		 pieces[position.getRow()][position.getColumn()] = piece;
		 piece.position = position;
		 //PEÇA NÃO ESTÁ MAIS NULL
	}
}
