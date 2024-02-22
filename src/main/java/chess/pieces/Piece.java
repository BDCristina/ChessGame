package chess.pieces;

import javax.swing.*;
import java.awt.Color;


public abstract class Piece {
    protected Color color;

    public Piece(Color color) {
        this.color = color;
    }



    // Metoda abstractă pt a verifica dacă o mutare este validă pentru piesă
    public abstract boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol);

    public abstract Icon getIcon();

    //
}
