package chess.pieces;
import javax.swing.*;
import java.awt.Color;

import util.ImageUtils;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // to do: de implementat logica pentru validarea mutării turei
        return false; // implementare temporară
    }

    @Override
    public Icon getIcon() {
        // Returneaza imaginea corespunzătoare pentru tura
        if (color == Color.WHITE) {
            return ImageUtils.resizeImage("images/white/6.png", 75, 75);
        } else {
            return ImageUtils.resizeImage("images/black/6.png", 75, 75);
        }
    }
}
