package chess;

import chess.pieces.Piece;

public class ChessBoard {

    private Piece[][] board;

    public ChessBoard() {
        initializeBoard();
    }

    private void initializeBoard() {
        board = new Piece[8][8];
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void placePiece(Piece piece, int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (board[row][col] != null) {
            throw new IllegalArgumentException("Position already occupied");
        }
        board[row][col] = piece;
    }

    public void removePiece(int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8) {
            throw new IllegalArgumentException("Invalid position");
        }
        board[row][col] = null;
    }


    // Alte metode pentru verificarea stării tablei de șah pot fi adăugate aici
}
