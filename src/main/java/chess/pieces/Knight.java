package chess.pieces;
import util.ImageUtils;

import java.awt.Color;
import javax.swing.*;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // to do: de implementat logica pentru validarea mutării calului
        return false; // implementare temporară
    }

    @Override
    public Icon getIcon() {
        // Returneaza imaginea corespunzătoare pentru cal
        if (color == Color.WHITE) {
            return ImageUtils.resizeImage("images/white/1.png", 75, 75);
        } else {
            return ImageUtils.resizeImage("images/black/1.png", 75, 75);
        }
    }
}
