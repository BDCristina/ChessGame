package chess;

import chess.pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
public class ChessGame extends JFrame{
    private JPanel boardPanel;
    private JButton[][] squares = new JButton[8][8];
    private Piece[][] pieces = new Piece[8][8];

    private boolean pieceSelected = false;
    private int selectedPieceRow, selectedPieceCol;

    public ChessGame() {
        setTitle("Chess Game");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeBoard();

        add(boardPanel);
        setVisible(true);
    }

    private void initializeBoard() {
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(8, 8));

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JButton square = new JButton();
                square.setPreferredSize(new Dimension(75, 75));
                square.setBackground((row + col) % 2 == 0 ? Color.WHITE : Color.GRAY);
                square.setOpaque(true);
                square.setBorderPainted(false);
                square.addActionListener(new SquareListener(row, col));
                boardPanel.add(square);
                squares[row][col] = square;
            }
        }

        // Adăugam piesele inițiale pe tabla de șah
        initializePieces();
    }

    private void initializePieces() {
        // Adăugarea pieselor albe
        addPiece(new Rook(Color.WHITE), 0, 0);
        addPiece(new Knight(Color.WHITE), 0, 1);
        addPiece(new Bishop(Color.WHITE), 0, 2);
        addPiece(new Queen(Color.WHITE), 0, 3);
        addPiece(new King(Color.WHITE), 0, 4);
        addPiece(new Bishop(Color.WHITE), 0, 5);
        addPiece(new Knight(Color.WHITE), 0, 6);
        addPiece(new Rook(Color.WHITE), 0, 7);
        for (int col = 0; col < 8; col++) {
            addPiece(new Pawn(Color.WHITE), 1, col);
        }

        // Adăugarea pieselor negre
        addPiece(new Rook(Color.BLACK), 7, 0);
        addPiece(new Knight(Color.BLACK), 7, 1);
        addPiece(new Bishop(Color.BLACK), 7, 2);
        addPiece(new Queen(Color.BLACK), 7, 3);
        addPiece(new King(Color.BLACK), 7, 4);
        addPiece(new Bishop(Color.BLACK), 7, 5);
        addPiece(new Knight(Color.BLACK), 7, 6);
        addPiece(new Rook(Color.BLACK), 7, 7);
        for (int col = 0; col < 8; col++) {
            addPiece(new Pawn(Color.BLACK), 6, col);
        }
    }


    private void addPiece(Piece piece, int row, int col) {
        pieces[row][col] = piece;
        squares[row][col].setIcon(piece.getIcon());
    }

    private class SquareListener implements ActionListener {
        private int row, col;

        public SquareListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!pieceSelected) {
                // Selectați o piesă
                if (pieces[row][col] != null) {
                    selectedPieceRow = row;
                    selectedPieceCol = col;
                    pieceSelected = true;
                }
            } else {
                // Mutare piesă
                if (isValidMove(selectedPieceRow, selectedPieceCol, row, col)) {
                    movePiece(selectedPieceRow, selectedPieceCol, row, col);
                }
                pieceSelected = false;
            }
        }
    }

    private boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // Verificare dacă mutarea este validă
        return true; // to do: de implementaț logica specifică aici
    }

    private void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        pieces[toRow][toCol] = pieces[fromRow][fromCol];
        pieces[fromRow][fromCol] = null;
        squares[toRow][toCol].setIcon(pieces[toRow][toCol].getIcon());
        squares[fromRow][fromCol].setIcon(null);
    }
    //To do: de adaugat metode pentru alte funcționalități, cum ar fi verificarea șahului, șah-matului etc.,
}
