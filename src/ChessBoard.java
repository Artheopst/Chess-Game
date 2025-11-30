public class ChessBoard {
    private Piece[][] board;
  
    public ChessBoard() {
        this.board = new Piece[8][8]; 
        setupPieces();
    }
  
    public Piece[][] getBoard() {
        return board;
    }
  
    public Piece getPiece(int row, int column) {
        return board[row][column];
    }
  
    public void setPiece(int row, int column, Piece piece) {
        board[row][column] = piece;
        if (piece != null) {
            piece.setPosition(new Position(row, column));
        }
    }
  
    private void setupPieces() {
        // Place Rooks
        board[0][0] = new Tour(PieceColor.BLACK, new Position(0, 0));
        board[0][7] = new Tour(PieceColor.BLACK, new Position(0, 7));
        board[7][0] = new Tour(PieceColor.WHITE, new Position(7, 0));
        board[7][7] = new Tour(PieceColor.WHITE, new Position(7, 7));
        // Place Knights
        board[0][1] = new Cavalier(PieceColor.BLACK, new Position(0, 1));
        board[0][6] = new Cavalier(PieceColor.BLACK, new Position(0, 6));
        board[7][1] = new Cavalier(PieceColor.WHITE, new Position(7, 1));
        board[7][6] = new Cavalier(PieceColor.WHITE, new Position(7, 6));
        // Place Bishops
        board[0][2] = new Fou(PieceColor.BLACK, new Position(0, 2));
        board[0][5] = new Fou(PieceColor.BLACK, new Position(0, 5));
        board[7][2] = new Fou(PieceColor.WHITE, new Position(7, 2));
        board[7][5] = new Fou(PieceColor.WHITE, new Position(7, 5));
        // Place Queens
        board[0][3] = new Reine(PieceColor.BLACK, new Position(0, 3));
        board[7][3] = new Reine(PieceColor.WHITE, new Position(7, 3));
        // Place Kings
        board[0][4] = new Roi(PieceColor.BLACK, new Position(0, 4));
        board[7][4] = new Roi(PieceColor.WHITE, new Position(7, 4));
        // Place Pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pion(PieceColor.BLACK, new Position(1, i));
            board[6][i] = new Pion(PieceColor.WHITE, new Position(6, i));
        }
    }
  
    public void movePiece(Position start, Position end) {
        if (board[start.getRow()][start.getColumn()] != null &&
                board[start.getRow()][start.getColumn()].isValidMove(end, board)) {
  
            board[end.getRow()][end.getColumn()] = board[start.getRow()][start.getColumn()];
            board[end.getRow()][end.getColumn()].setPosition(end);
            board[start.getRow()][start.getColumn()] = null;
        }
    }
  }